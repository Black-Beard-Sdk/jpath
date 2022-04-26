using Bb.JPath.Parsers;

namespace TestAmsConfig.Parsers.Asts
{
    public class JSonPathObject : JPathBaseList<JSonPathProperty>
    {

        public JSonPathObject(TokenLocation location)
            : base(location)
        {


        }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitJSonPathObject(this);
        }

    }


}
