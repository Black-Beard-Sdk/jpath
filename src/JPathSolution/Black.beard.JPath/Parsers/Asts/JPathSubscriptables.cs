using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{


    public class SubscriptableArguments : JPathBaseList<JPathBase>
    {

        public SubscriptableArguments(TokenLocation location)
            : base(location)
        {

        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitSubscriptableArguments(this);
        }

        internal override void ToString(StringBuilder sb)
        {

            sb.Append("(");

            var last = this.Last();

            foreach (var item in this)
            {

                item.ToString(sb);

                if (item != last)
                    sb.Append(", ");

            }

            sb.Append(")");


            if (Child != null)
                Child.ToString(sb);

        }

    }


    public class JPathSubscriptables : JPathBaseList<JPathBase>
    {

        public JPathSubscriptables(TokenLocation location)
            : base(location)
        {

        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitSubscriptables(this);
        }

        internal override void ToString(StringBuilder sb)
        {

            sb.Append("[");

            var last = this.Last();

            foreach (var item in this)
            {
                
                item.ToString(sb);

                if (item != last)
                    sb.Append(", ");

            }

            sb.Append("]");

            if (Child != null)
                Child.ToString(sb);

        }

    }

}
