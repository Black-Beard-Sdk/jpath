using Bb.JPath.Parsers;

namespace TestAmsConfig.Parsers.Asts
{
    public class JPathCurrentValue : JPathToken<string>
    {

        public JPathCurrentValue(TokenLocation location)
            : base(location, "@")
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitCurrentValue(this);
        }

    }

}
