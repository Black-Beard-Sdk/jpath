using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{

    public class JPathSubscriptable : JPathBase
    {

        public JPathSubscriptable(TokenLocation location)
            : base(location)
        {

        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitJPathSubscriptables(this);
        }


        internal override void ToString(StringBuilder sb)
        {

            sb.Append("?(");

            if (Child != null)
                Child.ToString(sb);

            sb.Append(")");

        }

        internal override void AppendEnd(JPathBase item)
        {

            if (Child == null)
                Child = item;
           
        }

    }

    public class JPathSliceable : JPathBase
    {

        public JPathSliceable(TokenLocation location)
            : base(location)
        {

        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitSliceable(this);
        }

        public JPathBase? Child2 { get; set; }

        internal override void ToString(StringBuilder sb)
        {

            if (Child != null)
                Child.ToString(sb);

            sb.Append(":");

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
