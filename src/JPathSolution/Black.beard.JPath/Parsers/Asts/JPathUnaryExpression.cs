using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{
    public class JPathUnaryExpression : JPathBase
    {

        public JPathUnaryExpression(TokenLocation location)
            : base(location)
        {

        }

        public UnaryExpressionEnum Operator { get; internal set; }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitUnaryExpression(this);
        }

        internal override void ToString(StringBuilder sb)
        {

            if (Operator == UnaryExpressionEnum.Not)
                sb.Append("!");
            else
                sb.Append("(");

            if (Child != null)
            Child.ToString(sb);

            if (Operator == UnaryExpressionEnum.Parentheses)
                sb.Append(")");

        }

        internal override void AppendEnd(JPathBase item)
        {

            if (Child == null)
                Child = item;

        }

    }

}
