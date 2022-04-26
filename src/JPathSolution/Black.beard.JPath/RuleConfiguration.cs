using Newtonsoft.Json.Linq;
using System;

namespace TestAmsConfig
{


    public class RuleConfiguration
    {

        public RuleConfiguration()
        {
        }

        public string Name { get; set; }

        public int Priority { get; set; }

        public string TargetNodeToInject { get; set; }

        public JValue TargetValue { get; set; }

        public RuleConfigurationFilter RuleToMatch { get; set; }

        public bool Filter(JToken model)
        {

            if (model == null)
                throw new ArgumentNullException(nameof(model));

            return RuleToMatch.Filter(model);

        }

        public bool Apply(JToken config)
        {

            // Inject new value
            var token = config.SelectToken(this.TargetNodeToInject);
            if (token != null)
            {
                if (token is JProperty property)
                {
                    property.Value = this.TargetValue;
                    return true;
                }
                else
                {

                }
            }
            else
            {

                System.Diagnostics.Debug.WriteLine($"rule '{this.Name}' : the target property can't be matched. the value will be injected", "Verbose");

            }

            return false;

        }
    }
}