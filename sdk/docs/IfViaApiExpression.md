# com.finbourne.access.model.IfViaApiExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiFeatureCodes** | **List&lt;String&gt;** |  | [default to List<String>]
**operator** | **String** |  | [default to String]

```java
import com.finbourne.access.model.IfViaApiExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> ApiFeatureCodes = new List<String>();
String Operator = "example Operator";


IfViaApiExpression ifViaApiExpressionInstance = new IfViaApiExpression()
    .ApiFeatureCodes(ApiFeatureCodes)
    .Operator(Operator);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
