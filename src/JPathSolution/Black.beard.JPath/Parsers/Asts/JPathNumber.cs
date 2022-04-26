using Bb.JPath.Parsers;
using System.Globalization;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{

    public class JPathBoolean : JPathToken<bool>
    {

        public JPathBoolean(TokenLocation location, bool identifier)
            : base(location, identifier)
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitBoolean(this);
        }

        internal override void ToString(StringBuilder sb)
        {
            var result = this.Text.ToString(CultureInfo.InvariantCulture).ToLowerInvariant();
            sb.Append(result);
        }

    }

    public class JPathNumber : JPathToken<decimal>
    {

        public JPathNumber(TokenLocation location, decimal identifier)
            : base(location, identifier)
        {

        }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitNumber(this);
        }

        internal override void ToString(StringBuilder sb)
        {
            var result = this.Text.ToString(CultureInfo.InvariantCulture);
            sb.Append(result);
        }

    }

}
