using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System.Globalization;
using System.Text;
using TestAmsConfig;
using TestAmsConfig.Parsers.Asts;

namespace Bb.JPath.Parsers
{

    public class ScriptBuilderVisitor : JsonPathParserBaseVisitor<object>
    {

        /// <summary>
        /// 
        /// </summary>
        /// <param name="culture"></param>
        public ScriptBuilderVisitor(JsonPathParser parser, Diagnostics diagnostics, string path)
        {
            this._parser = parser;
            this._diagnostics = diagnostics;
            this._scriptPath = path;

            if (!string.IsNullOrEmpty(path))
                this._scriptPathDirectory = new FileInfo(path).Directory.FullName;
            else
                this._scriptPathDirectory = AppDomain.CurrentDomain.BaseDirectory;

        }

        /// <summary>
        ///    : ROOT_VALUE subscript? EOF
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitJsonpath([NotNull] JsonPathParser.JsonpathContext context)
        {

            var result = new JPathRootValue(context.Start.ToLocation());

            var subscript = context.jsonpath_subscript();

            if (subscript != null)
                result.AppendEnd((JPathSubscript)VisitJsonpath_subscript(subscript));

            return result;

        }



        /// <summary>
        ///    : RECURSIVE_DESCENT (subscriptableBareword | subscriptables) subscript?
        ///    | SUBSCRIPT subscriptableBareword subscript?
        ///    | subscriptables subscript?
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitJsonpath_subscript([NotNull] JsonPathParser.Jsonpath_subscriptContext context)
        {

            JPathSubscript result = new JPathSubscript(context.Start.ToLocation());

            var recursive = context.RECURSIVE_DESCENT();
            if (recursive != null)
                result.Kind = SubscriptEnum.RecursiveDescent;

            else if (context.SUBSCRIPT() != null)
                result.Kind = SubscriptEnum.Subscript;

            var subscriptableBareword = context.subscriptableBareword();
            if (subscriptableBareword != null)
            {
                var o = (JPathBase)VisitSubscriptableBareword(subscriptableBareword);
                result.AppendEnd(o);
            }

            var subscriptables = context.subscriptables();
            if (subscriptables != null)
            {
                var o = (JPathSubscriptables)VisitSubscriptables(subscriptables);
                result.AppendEnd(o);
            }

            var subscriptChild = context.jsonpath_subscript();
            if (subscriptChild != null)
            {
                var c = (JPathSubscript)VisitJsonpath_subscript(subscriptChild);
                result.AppendEnd(c);
            }

            return result;

        }


        public override object VisitJsonPath_identifier([NotNull] JsonPathParser.JsonPath_identifierContext context)
        {

            var id = context.ID();
            if (id != null)
                return new JPathIdentifier(id.Symbol.ToLocation(), id.GetText());

            var txt = context.GetText();
            switch (txt.ToLower())
            {

                case "in":
                    var @in = context.IN();
                    return new JPathIdentifier(@in.Symbol.ToLocation(), @in.GetText());

                case "nin":
                    var nin = context.NIN();
                    return new JPathIdentifier(nin.Symbol.ToLocation(), nin.GetText());

                case "subsetof":
                    var subsetof = context.SUBSETOF();
                    return new JPathIdentifier(subsetof.Symbol.ToLocation(), subsetof.GetText());

                case "contains":
                    var contains = context.CONTAINS();
                    return new JPathIdentifier(contains.Symbol.ToLocation(), contains.GetText());

                case "size":
                    var size = context.SIZE();
                    return new JPathIdentifier(size.Symbol.ToLocation(), size.GetText());

                case "empty":
                    var empty = context.EMPTY();
                    return new JPathIdentifier(empty.Symbol.ToLocation(), empty.GetText());

                case "true":
                    var @true = context.TRUE();
                    return new JPathIdentifier(@true.Symbol.ToLocation(), @true.GetText());

                case "false":
                    var @false = context.FALSE();
                    return new JPathIdentifier(@false.Symbol.ToLocation(), @false.GetText());

                default:
                    break;

            }

            LocalDebug.Stop();
            return null;


        }

        /// <summary>
        ///    : ID subscriptableArguments?
        ///    | WILDCARD_SUBSCRIPT
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSubscriptableBareword([NotNull] JsonPathParser.SubscriptableBarewordContext context)
        {


            var id = context.jsonPath_identifier();
            if (id != null)
            {
                var result = (JPathIdentifier)VisitJsonPath_identifier(id);

                var subscriptableArguments = context.subscriptableArguments();
                if (subscriptableArguments != null)
                    result.AppendEnd((JPathBase)VisitSubscriptableArguments(subscriptableArguments));

                return result;
            }
            else
            {

                var wildcard = context.WILDCARD_SUBSCRIPT();
                if (wildcard != null)
                    return new JPathWildcard(wildcard.Symbol.ToLocation());

                else
                {

                    LocalDebug.Stop();

                }
            }

            LocalDebug.Stop();
            return base.VisitSubscriptableBareword(context);

        }

        /// <summary>
        /// : BRACKET_LEFT subscriptable ( COMMA subscriptable )* BRACKET_RIGHT
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSubscriptables([NotNull] JsonPathParser.SubscriptablesContext context)
        {

            var result = new JPathSubscriptables(context.Start.ToLocation());

            var items = context.subscriptable();

            if (items != null)
                foreach (var item in items)
                    result.AppendEnd((JPathBase)VisitSubscriptable(item));

            return result;

        }

        /// <summary>
        /// : STRING
        /// | sliceable
        /// | WILDCARD_SUBSCRIPT
        /// | QUESTION PAREN_LEFT expression PAREN_RIGHT
        /// | jsonpath_
        /// | IDQUOTED subscriptableArguments
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSubscriptable([NotNull] JsonPathParser.SubscriptableContext context)
        {

            var text = context.STRING();
            if (text != null)
                return new JPathText(text.Symbol.ToLocation(), text.GetText());

            var sliceable = context.sliceable();
            if (sliceable != null)
                return VisitSliceable(sliceable);

            var wildcard = context.WILDCARD_SUBSCRIPT();
            if (wildcard != null)
                return new JPathWildcard(wildcard.Symbol.ToLocation());

            var q = context.QUESTION();
            if (q != null)
            {
                var r = new JPathSubscriptable(q.Symbol.ToLocation());
                var condition = context.expression();
                if (condition != null)
                {
                    var c = (JPathBase)VisitExpression(condition);
                    r.Child = c;
                }
                return r;
            }

            var jsonpath_ = context.jsonpath_();
            if (jsonpath_ != null)
                return VisitJsonpath_(jsonpath_);

            var id = context.IDQUOTED();
            if (id != null)
            {
                var result = new JPathIdentifier(id.Symbol.ToLocation(), id.GetText().Trim('\'')) { Quoted = true };
                var subscriptableArguments = context.subscriptableArguments();
                if (subscriptableArguments != null)
                {
                    var r = VisitSubscriptableArguments(subscriptableArguments);
                    if (r != null)
                        result.AppendEnd((JPathBase)r);
                }
                return result;

            }

            LocalDebug.Stop();
            return null;

        }

        private static decimal GetNumberValue(ITerminalNode number)
        {
            var txt = number.GetText();
            return decimal.Parse(txt, NumberStyles.AllowDecimalPoint | NumberStyles.AllowLeadingSign, CultureInfo.InvariantCulture);
        }

        /// <summary>
        ///    : NUMBER
        ///    | sliceableLeft
        ///    | sliceableRight
        ///    | NUMBER COLON NUMBER
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSliceable([NotNull] JsonPathParser.SliceableContext context)
        {

            var l = context.sliceableLeft();
            if (l != null)
                return VisitSliceableLeft(l);

            var r = context.sliceableRight();
            if (r != null)
                return VisitSliceableRight(r);

            var b = context.sliceableBinary();
            if (b != null)
                return VisitSliceableBinary(b);

            var number = context.NUMBER();
            var n = new JPathNumber(number.Symbol.ToLocation(), GetNumberValue(number));
            return n;

        }

        /// <summary>
        ///  : NUMBER COLON
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSliceableLeft([NotNull] JsonPathParser.SliceableLeftContext context)
        {

            var result = new JPathSliceable(context.Start.ToLocation());

            var number = context.NUMBER();

            var n = new JPathNumber(number.Symbol.ToLocation(), GetNumberValue(number));
            result.Child = n;

            return result;

        }

        /// <summary>
        /// : COLON NUMBER
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSliceableRight([NotNull] JsonPathParser.SliceableRightContext context)
        {

            var result = new JPathSliceable(context.Start.ToLocation());

            var number = context.NUMBER();

            var n = new JPathNumber(number.Symbol.ToLocation(), GetNumberValue(number));
            result.Child2 = n;

            return result;
        }

        /// <summary>
        /// : NUMBER COLON NUMBER
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSliceableBinary([NotNull] JsonPathParser.SliceableBinaryContext context)
        {

            var result = new JPathSliceable(context.Start.ToLocation());

            var numbers = context.NUMBER();
            foreach (var item in numbers)
            {
                var n = new JPathNumber(item.Symbol.ToLocation(), GetNumberValue(item));
                result.AppendEnd(n);
            }

            return result;

        }

        /// <summary>
        /// : ( ROOT_VALUE | CURRENT_VALUE ) subscript?
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitJsonpath_([NotNull] JsonPathParser.Jsonpath_Context context)
        {

            JPathBase result = null;
            var v1 = context.ROOT_VALUE();
            if (v1 != null)
                result = new JPathRootValue(v1.Symbol.ToLocation());

            else
            {
                var v2 = context.CURRENT_VALUE();
                result = new JPathCurrentValue(v2.Symbol.ToLocation());
            }

            var v3 = context.jsonpath_subscript();
            if (v3 != null)
                result.AppendEnd((JPathBase)VisitJsonpath_subscript(v3));

            return result;

        }
     
        /// <summary>
        ///    : jsonpath__
        ///    | NOT
        ///    | PAREN_LEFT expression PAREN_RIGHT
        ///    | binaryOperator
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitExpression([NotNull] JsonPathParser.ExpressionContext context)
        {


            var jsonpath__ = context.jsonpath__();
            if (jsonpath__ != null)
                return (JPathBase)VisitJsonpath__(jsonpath__);

            var e = context.expression();
            var e1 = (JPathBase)VisitExpression(e[0]);

            var n1 = context.NOT();
            if (n1 != null)
                return new JPathUnaryExpression(n1.Symbol.ToLocation())
                {
                    Operator = UnaryExpressionEnum.Not,
                    Child = e1
                };

            var n2 = context.PAREN_LEFT();
            if (n2 != null)
                return new JPathUnaryExpression(n2.Symbol.ToLocation())
                {
                    Operator = UnaryExpressionEnum.Parentheses,
                    Child = e1
                };

            var n3 = context.binaryOperator();
            if (n3 != null)
            {

                var right = (JPathBase)VisitExpression(e[1]);

                if (right is JPathBinaryExpression b1 && !((e1 is JPathBinaryExpression) || e1 is JPathUnaryExpression))
                {

                    if (b1.Child is JPathBinaryExpression b2 && b2.Operator == BinaryOperatorEnum.Undefined && b2.Child == null)
                    {
                        b2.Operator = (BinaryOperatorEnum)VisitBinaryOperator(n3[0]);
                        b2.Child = e1;

                        return right;

                    }
                    else
                    {

                        var result = new JPathBinaryExpression(e[0].Start.ToLocation())
                        {
                            Child = new JPathBinaryExpression(e[0].Start.ToLocation())
                            {
                                Child = null,
                                Operator = BinaryOperatorEnum.Undefined,
                                Child2 = e1
                            },
                            Operator = (BinaryOperatorEnum)VisitBinaryOperator(n3[0]),
                            Child2 = right
                        };

                        return result;

                    }

                }
                else
                {

                    var result = new JPathBinaryExpression(e[0].Start.ToLocation())
                    {
                        Child = e1,
                        Operator = (BinaryOperatorEnum)VisitBinaryOperator(n3[0]),
                        Child2 = right
                    };

                    return result;

                }


            }

            LocalDebug.Stop();
            return null;

        }

        public override object VisitBinaryOperator([NotNull] JsonPathParser.BinaryOperatorContext context)
        {

            if (context.AND() != null)
                return BinaryOperatorEnum.AND;

            if (context.OR() != null)
                return BinaryOperatorEnum.OR;

            if (context.EQ() != null)
                return BinaryOperatorEnum.EQ;

            if (context.NE() != null)
                return BinaryOperatorEnum.NE;

            if (context.LT() != null)
                return BinaryOperatorEnum.LT;

            if (context.LE() != null)
                return BinaryOperatorEnum.LE;

            if (context.GT() != null)
                return BinaryOperatorEnum.GT;

            if (context.GE() != null)
                return BinaryOperatorEnum.GE;

            if (context.IN() != null)
                return BinaryOperatorEnum.IN;

            if (context.NIN() != null)
                return BinaryOperatorEnum.NIN;

            if (context.SUBSETOF() != null)
                return BinaryOperatorEnum.SUBSETOF;

            if (context.CONTAINS() != null)
                return BinaryOperatorEnum.CONTAINS;

            if (context.SIZE() != null)
                return BinaryOperatorEnum.SIZE;

            if (context.EMPTY() != null)
                return BinaryOperatorEnum.EMPTY;

            return BinaryOperatorEnum.Undefined;

        }


        /// <summary>
        /// : PAREN_LEFT ( jsonpath__ ( COMMA jsonpath__ )* )? PAREN_RIGHT
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitSubscriptableArguments([NotNull] JsonPathParser.SubscriptableArgumentsContext context)
        {

            if (context.PAREN_LEFT() != null)
            {

                var result = new SubscriptableArguments(context.Start.ToLocation());

                var items = context.jsonpath__();
                if (items != null)
                    foreach (var item in items)
                        result.AppendEnd((JPathBase)VisitJsonpath__(item));

                return result;
            }

            return null;

        }

        /// <summary>
        ///    : jsonpath_
        ///    | value
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitJsonpath__([NotNull] JsonPathParser.Jsonpath__Context context)
        {

            var value = context.value();
            if (value != null)
                return VisitValue(value);

            var jsonpath_ = context.jsonpath_();
            if (jsonpath_ != null)
                return VisitJsonpath_(jsonpath_);

            LocalDebug.Stop();

            return null;

        }

        /// <summary>
        ///    : value
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitJson([NotNull] JsonPathParser.JsonContext context)
        {
            LocalDebug.Stop();
            return base.VisitJson(context);
        }

        /// <summary>
        /// : BRACKET_LEFT (value ( COMMA value )*)? BRACKET_RIGHT
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitArray([NotNull] JsonPathParser.ArrayContext context)
        {

            var result = new JSonPathArray(context.Start.ToLocation());

            var values = context.value();
            if (values != null)
                foreach (var item in values)
                {
                    var r = (JPathBase)VisitValue(item);
                    if (r != null)
                        result.AppendEnd(r);
                }

            return result;

        }

        /// <summary>
        /// : BRACE_LEFT (pair (COMMA pair)*)? BRACE_RIGHT   
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitObj([NotNull] JsonPathParser.ObjContext context)
        {

            var result = new JSonPathObject(context.Start.ToLocation());

            var pairs = context.pair();
            if (pairs != null)
                foreach (var item in pairs)
                {
                    var r = (JPathBase)VisitPair(item);
                    if (r != null)
                        result.AppendEnd(r);
                }

            return result;

        }

        /// <summary>
        /// : STRING COLON value
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitPair([NotNull] JsonPathParser.PairContext context)
        {

            var result = new JSonPathProperty(context.Start.ToLocation());

            result.Name = context.STRING().GetText();

            var value = context.value();
            if (value != null)
                result.Child = (JPathBase)VisitValue(value);

            return result;

        }

        /// <summary>
        ///  : STRING
        ///  | NUMBER
        ///  | TRUE
        ///  | FALSE
        ///  | NULL
        ///  | array
        ///  | obj
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitValue([NotNull] JsonPathParser.ValueContext context)
        {

            var s = context.STRING();
            if (s != null)
                return new JPathText(s.Symbol.ToLocation(), s.GetText());

            var idq = context.IDQUOTED();
            if (idq != null)
                return new JPathIdentifier(idq.Symbol.ToLocation(), idq.GetText().Trim('\'')) { Quoted = true };

            var n = context.NUMBER();
            if (n != null)
                return new JPathNumber(n.Symbol.ToLocation(), GetNumberValue(n));

            var t = context.TRUE();
            if (t != null)
                return new JPathBoolean(t.Symbol.ToLocation(), true);

            var f = context.FALSE();
            if (f != null)
                return new JPathBoolean(f.Symbol.ToLocation(), false);

            var nu = context.NULL();
            if (nu != null)
                return new JPathNull(nu.Symbol.ToLocation());

            var array = context.array();
            if (array != null)
                return VisitArray(array);

            var obj = context.obj();
            if (array != null)
                return VisitObj(obj);

            LocalDebug.Stop();
            return base.VisitValue(context);
        }

        public void EvaluateErrors(IParseTree item)
        {

            if (item != null)
            {

                if (item is ErrorNodeImpl e)
                    AddError(e);

                else if (item is ParserRuleContext r)
                {

                    if (r.exception != null)
                    {
                        AddError(r);
                    }

                }

                int c = item.ChildCount;
                for (int i = 0; i < c; i++)
                {
                    IParseTree child = item.GetChild(i);
                    EvaluateErrors(child);
                }

            }

        }

        public override object Visit(IParseTree tree)
        {
            EvaluateErrors(tree);
            //if (this._diagnostics.Count > 0)
            //    LocalDebug.Stop();
            var result = base.Visit(tree);

            return result;

        }

        public IEnumerable<ErrorModel> Errors { get => this._diagnostics; }

        public string Filename { get; set; }

        public CultureInfo Culture { get => _currentCulture; }

        void AddError(TokenLocation start, string txt, string message, string path = null)
        {
            this._diagnostics
                .AddError(
                    path ?? Filename,
                    start.Line,
                    start.StartIndex,
                    start.Column,
                    txt,
                    message
            );
        }

        void AddWarning(TokenLocation start, string txt, string message, string path = null)
        {
            this._diagnostics
                .AddWarning(
                    path ?? Filename,
                    start.Line,
                    start.StartIndex,
                    start.Column,
                    txt,
                    message
            );

        }

        void AddError(ParserRuleContext r)
        {

            int stateId = r.invokingState;

            if (stateId == -1)
                stateId = r.exception.OffendingState;

            ATNState state = this._parser.Atn.states[stateId];
            string o0 = this._parser.RuleNames[state.ruleIndex];
            string o1 = this._parser.RuleNames[r.RuleIndex];

            this._diagnostics
                .AddError
                (
                    Filename,
                    r.Start.Line,
                    r.Start.StartIndex,
                    r.Start.Column,
                    r.Start.Text,
                    $"Failed to parse script. '{o0}' expect '{o1}'"
                );

        }

        void AddError(ErrorNodeImpl e)
        {
            this._diagnostics
                .AddError(
                    Filename,
                    e.Symbol.Line,
                    e.Symbol.StartIndex,
                    e.Symbol.Column,
                    e.Symbol.Text,
                    $"Failed to parse script at position {e.Symbol.StartIndex}, line {e.Symbol.Line}, col {e.Symbol.Column} '{e.Symbol.Text}'"
            );
        }

        private StringBuilder _initialSource;
        private readonly JsonPathParser _parser;
        private Diagnostics _diagnostics;
        private readonly string _scriptPath;
        private readonly string _scriptPathDirectory;
        private CultureInfo _currentCulture;

    }

}


