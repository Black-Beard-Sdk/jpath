using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{
    public class JPathNull : JPathToken<object>
    {

        public JPathNull(TokenLocation location)
            : base(location, null)
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitNull(this);
        }

        internal override void ToString(StringBuilder sb)
        {
            sb.Append("null");
        }

    }

}
