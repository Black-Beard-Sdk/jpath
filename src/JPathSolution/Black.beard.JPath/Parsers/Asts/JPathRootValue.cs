using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{


    public class JPathRootValue : JPathToken<string>
    {

        public JPathRootValue(TokenLocation location)
            : base(location, "$")
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitRootValue(this);
        }

    }

}
