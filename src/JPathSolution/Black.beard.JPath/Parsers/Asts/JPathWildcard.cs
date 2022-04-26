using Bb.JPath.Parsers;

namespace TestAmsConfig.Parsers.Asts
{

    public class JPathWildcard : JPathToken<string>
    {

        public JPathWildcard(TokenLocation location)
            : base(location, "*")
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitWildcard(this);
        }

    }

}
