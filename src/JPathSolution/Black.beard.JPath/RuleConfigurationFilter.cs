using Bb.JPath.Parsers;
using Newtonsoft.Json.Linq;

namespace TestAmsConfig
{


    public class RuleConfigurationFilter
    {

        public string FilterLeft { get; set; }

        public string FilterRight { get; set; }

        public OperationEnum Operator { get; set; }


        internal bool Filter(JToken model)
        {
            var left = GetValue(model, this.FilterLeft);
            var right = GetValue(model, this.FilterRight);
            return JsontHelper.ConvertToBool(JsontHelper.EvaluateBinaryOperator(left, this.Operator, right));
        }

        private static object GetValue(JToken token, string match)
        {

            if (match.StartsWith("$"))
                return token.SelectToken(match);

            return match;

        }

 


    }
}