using Antlr4.Runtime;

namespace Bb.JPath.Parsers
{

    [System.Diagnostics.DebuggerDisplay("{StartIndex}, {StopIndex} : ({Line},{Column})")]
    public class TokenLocation
    {

        public TokenLocation()
        {

        }

        public TokenLocation(int start, int end)
        {
            this.StartIndex = start;
            this.StopIndex = end;
        }

        public TokenLocation(int start, int end, int line, int column)
        {
            this.StartIndex = start;
            this.StopIndex = end;
            this.Line = line;
            this.Column = column;
        }

        public TokenLocation(Antlr4.Runtime.IToken token)
        {
            this.Line = token.Line;
            this.Column = token.Column;
            this.StartIndex = token.StartIndex;
            this.StopIndex = token.StopIndex;
        }     

        public int Line { get; internal set; }

        public int Column { get; internal set; }

        public int StartIndex { get; internal set; }

        public int StopIndex { get; internal set; }

        public TokenLocation Clone()
        {
            return new TokenLocation(this.StartIndex, this.StopIndex);
        }

    }

    public static class TokenLocationExtension
    {

        public static TokenLocation ToLocation(this IToken self)
        {
            return new TokenLocation(self);
        }

    }

}
