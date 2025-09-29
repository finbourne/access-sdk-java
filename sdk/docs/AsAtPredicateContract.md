# com.finbourne.access.model.AsAtPredicateContract

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | [optional] [default to String]
**dateTimeOffset** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.access.model.AsAtPredicateContract;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Value = "example Value";
@jakarta.annotation.Nullable OffsetDateTime DateTimeOffset = OffsetDateTime.now();


AsAtPredicateContract asAtPredicateContractInstance = new AsAtPredicateContract()
    .Value(Value)
    .DateTimeOffset(DateTimeOffset);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
