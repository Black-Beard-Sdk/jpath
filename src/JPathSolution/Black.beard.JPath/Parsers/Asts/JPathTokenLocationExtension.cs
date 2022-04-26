using Antlr4.Runtime;
using Bb.JPath.Parsers;

namespace TestAmsConfig.Parsers.Asts
{
    public static class JPathTokenLocationExtension
    {

        public static TokenLocation ToLocation(this IToken self)
        {
            return new TokenLocation(self);
        }


    }


}
