# com.finbourne.access.model.WhenSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**deactivate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.access.model.WhenSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Activate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime Deactivate = OffsetDateTime.now();


WhenSpec whenSpecInstance = new WhenSpec()
    .Activate(Activate)
    .Deactivate(Deactivate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
