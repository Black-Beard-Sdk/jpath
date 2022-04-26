using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{


    public class JPathSubscript : JPathBase
    {

        public JPathSubscript(TokenLocation location)
            : base(location)
        {

        }

        public SubscriptEnum Kind { get; set; }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitSubscript(this);
        }

        public JPathBase? Child2 { get; internal set; }

        internal override void AppendEnd(JPathBase item)
        {

            if (item == this)
                throw new ArgumentException("Cyclic redondancy detected");

            if (Child == null)
                Child = item;

            else
                Child2 = item;

        }

        internal override void ToString(StringBuilder sb)
        {

            if (Child != null)
            {

                if (Child is JPathIdentifier)
                {
                    if (Kind == SubscriptEnum.Subscript)
                        sb.Append(".");

                    else if (Kind == SubscriptEnum.RecursiveDescent)
                        sb.Append("..");
                }

                Child.ToString(sb);
            }

            if (Child2 != null)
            {

                if (Child2 is JPathIdentifier)
                {
                    if (Kind == SubscriptEnum.Subscript)
                        sb.Append(".");

                    else if (Kind == SubscriptEnum.RecursiveDescent)
                        sb.Append("..");
                }

                Child2.ToString(sb);

            }

        }
        
    }

}
