# com.finbourne.access.model.EffectiveRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**to** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.access.model.EffectiveRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime From = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime To = OffsetDateTime.now();


EffectiveRange effectiveRangeInstance = new EffectiveRange()
    .From(From)
    .To(To);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
