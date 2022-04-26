using Newtonsoft.Json.Linq;
using System;
using TestAmsConfig;

namespace Bb.JPath.Parsers
{
    public static class JsontHelper
    {

        #region Operators

        public static JToken EvaluateUnaryOperator(JToken leftToken, OperationEnum @operator)
        {

            if (leftToken is JValue v)
            {
                if (v.Value is bool value)
                {
                    switch (@operator)
                    {
                        case OperationEnum.Not:
                            return new JValue(!value);

                        case OperationEnum.Equal:
                        case OperationEnum.GreaterThanOrEqual:
                        case OperationEnum.GreaterThan:
                        case OperationEnum.LessThanOrEqual:
                        case OperationEnum.LessThan:
                        case OperationEnum.NotEqual:
                        case OperationEnum.And:
                        case OperationEnum.AndExclusive:
                        case OperationEnum.Or:
                        case OperationEnum.OrExclusive:

                        default:
                            LocalDebug.Stop();
                            break;
                    }
                }
            }

            return leftToken;

        }

        public static JToken EvaluateBinaryOperator(object leftToken, OperationEnum @operator, object rightToken)
        {

            JToken result = null;

            object l = null;
            object r = null;

            if (leftToken == null)
                l = null;

            else if (leftToken is JToken tokenLeft)
                l = GetValue(tokenLeft);

            else
                l = leftToken;

            if (rightToken == null)
                r = null;

            else if (rightToken is JToken tokenRight)
                r = GetValue(tokenRight);

            else
                r = rightToken;

            try
            {

                switch (@operator)
                {

                    case OperationEnum.Equal:
                        result = new JValue(Equal(l, r));
                        break;

                    case OperationEnum.GreaterThanOrEqual:
                        result = new JValue(GreaterThanOrEqual(l, r));
                        break;

                    case OperationEnum.GreaterThan:
                        result = new JValue(GreaterThan(l, r));
                        break;

                    case OperationEnum.LessThanOrEqual:
                        result = new JValue(LessThanOrEqual(l, r));
                        break;

                    case OperationEnum.LessThan:
                        result = new JValue(LessThan(l, r));
                        break;

                    case OperationEnum.NotEqual:
                        result = new JValue(NotEqual(l, r));
                        break;

                    case OperationEnum.And:
                        result = new JValue(And(l, r));
                        break;

                    case OperationEnum.AndExclusive:
                        result = new JValue(AndExclusive(l, r));
                        break;

                    case OperationEnum.Or:
                        result = new JValue(Or(l, r));
                        break;

                    case OperationEnum.OrExclusive:
                        result = new JValue(OrExclusive(l, r));
                        break;

                    default:
                        break;
                }

            }
            catch (Exception)
            {
                throw;
            }

            return result ?? JValue.CreateNull();

        }

        private static bool Equal(object l, object r)
        {

            if (l == null)
                return r == null;

            else if (l is string str)
                return str == (r?.ToString() ?? string.Empty);

            else if (l is bool bo)
                return bo == Convert.ToBoolean(r);

            else if (l is decimal left_deci)
                return left_deci == Convert.ToDecimal(r);

            else if (l is float left_float)
                return left_float == Convert.ToSingle(r);

            else if (l is double left_double)
                return left_double == Convert.ToDouble(r);

            else if (l is Int16 left_int16)
                return left_int16 == Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 == Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 == Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 == Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int == Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long == Convert.ToInt64(r);

            else if (l is DateTime dateTime)
                return dateTime == Convert.ToDateTime(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static bool NotEqual(object l, object r)
        {

            if (l == null)
                return r != l;

            else if (l is bool bo)
                return bo != Convert.ToBoolean(r);

            else if (l is string str)
                return str != (r?.ToString() ?? string.Empty);

            else if (l is decimal left_deci)
                return left_deci != Convert.ToDecimal(r);

            else if (l is float left_float)
                return left_float != Convert.ToSingle(r);

            else if (l is double left_double)
                return left_double != Convert.ToDouble(r);

            else if (l is Int16 left_int16)
                return left_int16 != Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 != Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 != Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 != Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int != Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long != Convert.ToInt64(r);

            else if (l is DateTime dateTime)
                return dateTime != Convert.ToDateTime(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static bool GreaterThanOrEqual(object l, object r)
        {

            if (l is decimal left_deci)
                return left_deci >= Convert.ToDecimal(r);

            else if (l is float left_float)
                return left_float >= Convert.ToSingle(r);

            else if (l is double left_double)
                return left_double >= Convert.ToDouble(r);

            else if (l is Int16 left_int16)
                return left_int16 >= Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 >= Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 >= Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 >= Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int >= Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long >= Convert.ToInt64(r);

            else if (l is DateTime dateTime)
                return dateTime >= Convert.ToDateTime(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static object And(object l, object r)
        {

            if (l is Int16 left_int16)
                return left_int16 & Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 & Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 & Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 & Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int & Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long & Convert.ToInt64(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static object AndExclusive(object l, object r)
        {

            if (l is bool left_int16)
                return left_int16 && Convert.ToBoolean(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static object OrExclusive(object l, object r)
        {

            if (l is bool left_int16)
                return left_int16 && Convert.ToBoolean(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static object Or(object l, object r)
        {

            if (l is Int16 left_int16)
                return left_int16 | Convert.ToInt16(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 | Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 | Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 | Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int | Convert.ToInt32(r);

            else if (l is long left_long)
                return left_long | Convert.ToInt64(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static bool LessThanOrEqual(object l, object r)
        {

            if (l is decimal left_deci)
                return left_deci <= Convert.ToDecimal(r);

            else if (l is float left_float)
                return left_float <= Convert.ToSingle(r);

            else if (l is double left_double)
                return left_double <= Convert.ToDouble(r);

            else if (l is Int16 left_int16)
                return left_int16 <= Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 <= Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 <= Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 <= Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int <= Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long <= Convert.ToInt64(r);

            else if (l is DateTime dateTime)
                return dateTime <= Convert.ToDateTime(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static bool GreaterThan(object l, object r)
        {

            if (l is decimal left_deci)
                return left_deci > Convert.ToDecimal(r);

            else if (l is float left_float)
                return left_float > Convert.ToSingle(r);

            else if (l is double left_double)
                return left_double > Convert.ToDouble(r);

            else if (l is Int16 left_int16)
                return left_int16 > Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 > Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 > Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 > Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int > Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long > Convert.ToInt64(r);

            else if (l is DateTime dateTime)
                return dateTime > Convert.ToDateTime(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        private static bool LessThan(object l, object r)
        {

            if (l is decimal left_deci)
                return left_deci < Convert.ToDecimal(r);

            else if (l is float left_float)
                return left_float < Convert.ToSingle(r);

            else if (l is double left_double)
                return left_double < Convert.ToDouble(r);

            else if (l is Int16 left_int16)
                return left_int16 < Convert.ToInt64(r);

            else if (l is UInt16 left_uint16)
                return left_uint16 < Convert.ToUInt64(r);

            else if (l is UInt32 left_uint32)
                return left_uint32 < Convert.ToUInt64(r);

            else if (l is UInt64 left_uint64)
                return left_uint64 < Convert.ToUInt64(r);

            else if (l is int left_int)
                return left_int < Convert.ToInt64(r);

            else if (l is long left_long)
                return left_long < Convert.ToInt64(r);

            else if (l is DateTime dateTime)
                return dateTime < Convert.ToDateTime(r);

            else
            {
                LocalDebug.Stop();

            }

            return false;

        }

        #endregion Operators

        public static object GetValue(JToken token)
        {
            if (token is JValue v)
                return v.Value;

            return null;

        }

        public static bool ConvertToBool(JToken token)
        {

            if (token is JValue v)
                return (object.Equals(v.Value, true));

            return false;

        }
    }
}