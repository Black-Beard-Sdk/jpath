using Bb.JPath.Parsers;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TestAmsConfig;
using TestAmsConfig.Parsers.Asts;

namespace JPath.Tests
{
    [TestClass]
    public class UnitTest1
    {

        [TestMethod]
        public void Test1()
        {
            string[] tests = new string[]
            {
                "$.test",
                "$.test.test2",
                "$.test[*]",
                "$.test[0]",
                "$.test[1]",
                "$.test[1.2]",
                "$.test[-1.2]",
                "$['test']",
                "$['test']['book'][0].title",
                "$..property",
                "$[1:2]",
                "$[-1:2]",
                "$[-1:-2]",
                "$[-1.06:-2.03]",
                "$[1:]",
                "$[:2]",
                "$[-2:]",
                "$.store.book[?(@.price < 10)]",
                "$.store.book[?(@.price == 10)]",
                "$.store.book[?(@.price != 10)]",
                                //"$.store.book[?(@.price =~ /cat.*/i)]",
                "$.store.book[?(!@.isbn)]",
                "$.store.book[?(@.category == 'fiction' && @.price < 10)]",
                "$.store.book[?(@.category == 'fiction' || @.price < 10)]",
                "$.store.book[?(@.size in ['M', 'L'])]",
                "$.store.book[?('S' in @.sizes)]",
                "$.store.book[?(@.size nin ['M', 'L'])]",
                "$.store.book[?('S' nin @.sizes)]",
                "$.store.book[?(@.sizes subsetof ['M', 'L'])]",
                "$.store.book[?(['M', 'L'] subsetof @.sizes)]",
                "$.store.book[?(@.name contains 'Alex')]",
                "$.store.book[?(@.numbers contains 7)]",
                "$.store.book[?('ABCDEF' contains @.character)]",
                "$.store.book[?(@.name size 4)]",
                "$.store.book[?(@.name empty true)]",
                "$.store.book[?(@.name empty false)]",

            };

            foreach (var test in tests)
            {
                var script = ScriptParser.ParseString(test);
                var visitor = new ScriptBuilderVisitor(script.Parser, new Diagnostics(), string.Empty);
                var result = (JPathBase)script.Visit(visitor);

                var resultTxt = result.ToString();
                if (resultTxt != test)
                    LocalDebug.Stop();
                Assert.AreEqual(resultTxt, test);

            }

        }


    }
}