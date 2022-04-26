using Bb.JPath.Parsers;
using System.Globalization;
using System.Text;

namespace TestAmsConfig.Parsers.Asts
{


    public abstract class JPathToken<T> : JPathBase
    {

        public JPathToken(TokenLocation location, T text)
            : base(location)
        {
            this.Text = text;
        }

        public T Text { get; }
     
        internal override void ToString(StringBuilder sb)
        {

            sb.Append(this.Text);

            if (this.Child != null)
                this.Child.ToString(sb);

        }

    }

}
