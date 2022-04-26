using Bb.JPath.Parsers;

namespace TestAmsConfig.Parsers.Asts
{
    public class JSonPathProperty : JPathBaseList<JPathBase>
    {

        public JSonPathProperty(TokenLocation location)
            : base(location)
        {


        }

        public string Name { get;set; }

        public override T1 Accept<T1>(IJPathVisitor<T1> visitor)
        {
            return visitor.VisitJSonPathProperty(this);
        }

    }


}
