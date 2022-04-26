using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Runtime.CompilerServices;
using System.Text;

namespace Bb.JPath.Parsers
{

    public class ScriptParser
    {

        private ScriptParser(TextWriter output, TextWriter outputError)
        {

            this.Output = output ?? Console.Out;
            this.OutputError = outputError ?? Console.Error;
            this._includes = new HashSet<string>();
        }

        public static ScriptParser ParseString(string source, string sourceFile = "", TextWriter output = null, TextWriter outputError = null)
        {
            ICharStream stream = CharStreams.fromString(source);

            var parser = new ScriptParser(output, outputError)
            {
                File = sourceFile ?? string.Empty,
                Content = new StringBuilder(source),
            };
            parser.ParseCharStream(stream);
            return parser;

        }


        public static ScriptParser ParseString(StringBuilder source, string sourceFile = "", TextWriter output = null, TextWriter outputError = null)
        {
            ICharStream stream = CharStreams.fromString(source.ToString());

            var parser = new ScriptParser(output, outputError)
            {
                File = sourceFile ?? string.Empty,
                Content = source,
            };
            parser.ParseCharStream(stream);
            return parser;

        }

        /// <summary>
        /// Load specified document in a dedicated parser
        /// </summary>
        /// <param name="source"></param>
        /// <param name="output"></param>
        /// <param name="outputError"></param>
        /// <returns></returns>
        public static ScriptParser ParsePath(string source, string payload, TextWriter output = null, TextWriter outputError = null)
        {
            
            ICharStream stream = CharStreams.fromString(payload.ToString());

            var parser = new ScriptParser(output, outputError)
            {
                File = source,
                Content = new StringBuilder(payload),
            };

            parser.ParseCharStream(stream);

            return parser;

        }

        public static bool Trace { get; set; }

        public JsonPathParser.JsonpathContext Tree { get { return this._context; } }

        public IEnumerable<string> Includes { get => this._includes; }

        public string File { get; set; }

        public StringBuilder Content { get; private set; }

        public TextWriter Output { get; private set; }

        public TextWriter OutputError { get; private set; }

        private readonly HashSet<string> _includes;

        [MethodImpl(MethodImplOptions.AggressiveInlining)]
        public object Visit<Result>(IParseTreeVisitor<Result> visitor)
        {

            if (visitor is IFile f)
                f.Filename = this.File;

            if (System.Diagnostics.Debugger.IsAttached)
                System.Diagnostics.Trace.WriteLine(this.File);

            var context = this._context;
            return visitor.Visit(context);

        }

        public bool InError { get => this._parser.ErrorListeners.Count > 0; }

        [MethodImpl(MethodImplOptions.AggressiveInlining)]
        private void ParseCharStream(ICharStream stream)
        {

            var lexer = new JsonPathLexer(stream, this.Output, this.OutputError);
            var token = new CommonTokenStream(lexer);
            this._parser = new JsonPathParser(token)
            {
                BuildParseTree = true,
                //Trace = ScriptParser.Trace, // Ca plante sur un null, pourquoi ?
            };
            
            _context = _parser.jsonpath();

        }

        public JsonPathParser Parser { get => this._parser; }

        private JsonPathParser _parser;
        private JsonPathParser.JsonpathContext _context;

    }

}
