using Bb.JPath.Parsers;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{

    public class JPathIdentifier : JPathToken<string>
    {

        public JPathIdentifier(TokenLocation location, string identifier)
            : base(location, identifier)
        {

        }

        public bool Quoted { get; internal set; }

        public override T Accept<T>(IJPathVisitor<T> visitor)
        {
            return visitor.VisitIdentifier(this);
        }

        internal override void ToString(StringBuilder sb)
        {

            if (Quoted)
                sb.Append($"'{this.Text}'");
            else
                sb.Append(this.Text);

            if (this.Child != null)
                this.Child.ToString(sb);

        }


    }

}
