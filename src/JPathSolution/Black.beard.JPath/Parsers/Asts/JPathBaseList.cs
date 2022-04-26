using Bb.JPath.Parsers;
using System.Collections;

namespace TestAmsConfig.Parsers.Asts
{


    public abstract class JPathBaseList<T> : JPathBase, IEnumerable<T>
        where T : JPathBase
    {

        public JPathBaseList(TokenLocation location) 
            : base(location)
        {
            this._list = new List<T>();
        }

        public IEnumerator<T> GetEnumerator()
        {
            return this._list.GetEnumerator();
        }

     
        IEnumerator IEnumerable.GetEnumerator()
        {
            return this._list.GetEnumerator();
        }


        public T? Last()
        {
            return _list.Count > 0 ? _list[_list.Count - 1] : default(T);
        }

        internal override void AppendEnd(JPathBase item)
        {
            _list.Add((T)item);
        }


        private readonly List<T> _list;

    }

}
