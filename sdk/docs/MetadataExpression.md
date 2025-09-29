# com.finbourne.access.model.MetadataExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataKey** | **String** |  | [default to String]
**operator** | [**Operator**](Operator.md) |  | [default to Operator]
**textValue** | **String** |  | [optional] [default to String]

```java
import com.finbourne.access.model.MetadataExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MetadataKey = "example MetadataKey";
Operator @jakarta.annotation.Nullable String TextValue = "example TextValue";


MetadataExpression metadataExpressionInstance = new MetadataExpression()
    .MetadataKey(MetadataKey)
    .Operator(Operator)
    .TextValue(TextValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
