using Bb.JPath.Parsers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAmsConfig.Parsers.Asts
{




    public abstract class JPathBase
    {

        public JPathBase(TokenLocation location)
        {
            this.Start = location;
        }

        public TokenLocation Start { get; }

        public abstract T1 Accept<T1>(IJPathVisitor<T1> visitor);

        public override string ToString()
        {
            var sb = new StringBuilder();
            this.ToString(sb);
            return sb.ToString();
        }

        public JPathBase? Child { get; internal set; }

        internal virtual void ToString(StringBuilder sb)
        {

        }

        internal virtual void AppendEnd(JPathBase item)
        {

            if (item == this)
                throw new ArgumentException("Cyclic redondancy detected");

            if (Child == null)
                Child = item;

            else
                Child.AppendEnd(item);

        }

    }

}
