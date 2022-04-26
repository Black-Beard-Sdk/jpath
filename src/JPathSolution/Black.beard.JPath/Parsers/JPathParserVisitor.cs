//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from JPathParser.g4 by ANTLR 4.7

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace Bb.JPath.Parsers {
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="JPathParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7")]
[System.CLSCompliant(false)]
public interface IJPathParserVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.jsonpath"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitJsonpath([NotNull] JPathParser.JsonpathContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.jsonpath_"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitJsonpath_([NotNull] JPathParser.Jsonpath_Context context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.jsonpath__"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitJsonpath__([NotNull] JPathParser.Jsonpath__Context context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.jsonpath_subscript"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitJsonpath_subscript([NotNull] JPathParser.Jsonpath_subscriptContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.subscriptables"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSubscriptables([NotNull] JPathParser.SubscriptablesContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.subscriptableArguments"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSubscriptableArguments([NotNull] JPathParser.SubscriptableArgumentsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.subscriptableBareword"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSubscriptableBareword([NotNull] JPathParser.SubscriptableBarewordContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.jsonPath_identifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitJsonPath_identifier([NotNull] JPathParser.JsonPath_identifierContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.subscriptable"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSubscriptable([NotNull] JPathParser.SubscriptableContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.sliceable"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSliceable([NotNull] JPathParser.SliceableContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.sliceableLeft"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSliceableLeft([NotNull] JPathParser.SliceableLeftContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.sliceableRight"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSliceableRight([NotNull] JPathParser.SliceableRightContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.sliceableBinary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSliceableBinary([NotNull] JPathParser.SliceableBinaryContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] JPathParser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.binaryOperator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryOperator([NotNull] JPathParser.BinaryOperatorContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.json"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitJson([NotNull] JPathParser.JsonContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.obj"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObj([NotNull] JPathParser.ObjContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.pair"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPair([NotNull] JPathParser.PairContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.array"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArray([NotNull] JPathParser.ArrayContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="JPathParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitValue([NotNull] JPathParser.ValueContext context);
}
} // namespace Bb.JPath.Parsers
