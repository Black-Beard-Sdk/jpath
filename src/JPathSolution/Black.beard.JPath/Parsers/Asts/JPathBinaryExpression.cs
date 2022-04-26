using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{
    public class JPathBinaryExpression : JPathBase
    {

        public JPathBinaryExpression(TokenLocation location)
            : base(location)
        {

        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitBinaryExpression(this);
        }

        public JPathBase? Child2 { get; set; }

        public BinaryOperatorEnum Operator { get; set; }

        internal override void ToString(StringBuilder sb)
        {

            if (Child != null)
                Child.ToString(sb);

            switch (Operator)
            {
                case BinaryOperatorEnum.AND:
                    sb.Append(" && ");
                    break;

                case BinaryOperatorEnum.OR:
                    sb.Append(" || ");
                    break;

                case BinaryOperatorEnum.EQ:
                    sb.Append(" == ");
                    break;

                case BinaryOperatorEnum.NE:
                    sb.Append(" != ");
                    break;

                case BinaryOperatorEnum.LT:
                    sb.Append(" < ");
                    break;

                case BinaryOperatorEnum.LE:
                    sb.Append(" <= ");
                    break;

                case BinaryOperatorEnum.GT:
                    sb.Append(" > ");
                    break;

                case BinaryOperatorEnum.GE:
                    sb.Append(" >= ");
                    break;

                case BinaryOperatorEnum.IN:
                    sb.Append(" in ");
                    break;

                case BinaryOperatorEnum.NIN:
                    sb.Append(" nin ");
                    break;

                case BinaryOperatorEnum.SUBSETOF:
                    sb.Append(" subsetof ");
                    break;

                case BinaryOperatorEnum.CONTAINS:
                    sb.Append(" contains ");
                    break;

                case BinaryOperatorEnum.SIZE:
                    sb.Append(" size ");
                    break;

                case BinaryOperatorEnum.EMPTY:
                    sb.Append(" empty ");
                    break;


                default:
                    LocalDebug.Stop();
                    break;
            }

            if (Child2 != null)
                Child2.ToString(sb);

        }

        internal override void AppendEnd(JPathBase item)
        {

            if (Child == null)
                Child = item;

            else
                Child2 = item;

        }

    }

}
