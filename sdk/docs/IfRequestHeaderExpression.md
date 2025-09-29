# com.finbourne.access.model.IfRequestHeaderExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headerName** | **String** |  | [default to String]
**operator** | [**TextOperator**](TextOperator.md) |  | [default to TextOperator]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.access.model.IfRequestHeaderExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

String HeaderName = "example HeaderName";
TextOperator @jakarta.annotation.Nullable String Value = "example Value";


IfRequestHeaderExpression ifRequestHeaderExpressionInstance = new IfRequestHeaderExpression()
    .HeaderName(HeaderName)
    .Operator(Operator)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
