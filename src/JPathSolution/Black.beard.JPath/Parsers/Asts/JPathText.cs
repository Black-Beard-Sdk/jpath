using Bb.JPath.Parsers;

namespace TestAmsConfig.Parsers.Asts
{
    public class JPathText : JPathToken<string>
    {

        public JPathText(TokenLocation location, string identifier)
            : base(location, identifier)
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitText(this);
        }


    }

}
