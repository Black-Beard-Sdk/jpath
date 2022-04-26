using Newtonsoft.Json.Linq;

namespace Bb.JPath.Parsers
{
    internal class Position
    {

        public Position(TokenLocation start, TokenLocation stop, JValue comment)
        {
            this.Start = start;
            this.Stop = stop;
            this.Value = comment;
        }

        public JValue Value { get; }

        public TokenLocation Start { get; }

        public TokenLocation Stop { get; }
    }

}
