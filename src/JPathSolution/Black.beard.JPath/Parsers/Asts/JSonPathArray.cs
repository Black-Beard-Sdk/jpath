using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{


    public class JSonPathArray : JPathBaseList<JPathBase>
    {

        public JSonPathArray(TokenLocation location)
            : base(location)
        {


        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitJSonPathArray(this);
        }

        internal override void ToString(StringBuilder sb)
        {

            sb.Append("[");

            var last = this.Last();

            foreach (JPathBase item in this)
            {
                item.ToString(sb);
                if (item != last)
                    sb.Append(", ");
            }

            sb.Append("]");

        }

    }
        
}
