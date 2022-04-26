using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{
    public class JPathCondition : JPathBase
    {

        public JPathCondition(TokenLocation location)
            : base(location)
        {

        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitCondition(this);
        }

        internal override void ToString(StringBuilder sb)
        {

            sb.Append("?");

            if (Child != null)
                Child.ToString(sb);

        }

    }

}
