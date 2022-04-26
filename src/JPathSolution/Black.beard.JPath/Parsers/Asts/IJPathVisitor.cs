namespace TestAmsConfig.Parsers.Asts
{
    public interface IJPathVisitor<T>
    {

        T VisitRootValue(JPathRootValue node);
        T VisitSubscript(JPathSubscript subscript);
        T VisitWildcard(JPathWildcard wildcard);
        T VisitIdentifier(JPathIdentifier identifier);
        T VisitSubscriptables(JPathSubscriptables subscriptables);
        T VisitJSonPathArray(JSonPathArray jSonPathArray);
        T VisitJPathSubscriptables(JPathSubscriptable jPathSubscriptable);
        T VisitCurrentValue(JPathCurrentValue currentValue);
        T VisitNull(JPathNull jPathNull);
        T VisitSubscriptableArguments(SubscriptableArguments subscriptableArguments);
        T VisitBoolean(JPathBoolean boolean);
        T VisitText(JPathText text);
        T VisitBinaryExpression(JPathBinaryExpression binaryExpression);
        T VisitCondition(JPathCondition condition);
        T VisitSliceable(JPathSliceable sliceable);
        T VisitNumber(JPathNumber number);
        T VisitJSonPathObject(JSonPathObject jSonPathObject);
        T VisitUnaryExpression(JPathUnaryExpression unaryExpression);
        T VisitJSonPathProperty(JSonPathProperty jSonPathProperty);
    }


}
