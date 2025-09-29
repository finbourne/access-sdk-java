# com.finbourne.access.model.ForSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtRangeForSpec** | [**AsAtRangeForSpec**](AsAtRangeForSpec.md) |  | [optional] [default to AsAtRangeForSpec]
**asAtRelative** | [**AsAtRelative**](AsAtRelative.md) |  | [optional] [default to AsAtRelative]
**effectiveDateHasQuality** | [**EffectiveDateHasQuality**](EffectiveDateHasQuality.md) |  | [optional] [default to EffectiveDateHasQuality]
**effectiveDateRelative** | [**EffectiveDateRelative**](EffectiveDateRelative.md) |  | [optional] [default to EffectiveDateRelative]
**effectiveRange** | [**EffectiveRange**](EffectiveRange.md) |  | [optional] [default to EffectiveRange]

```java
import com.finbourne.access.model.ForSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

AsAtRangeForSpec AsAtRangeForSpec = new AsAtRangeForSpec();
AsAtRelative AsAtRelative = new AsAtRelative();
EffectiveDateHasQuality EffectiveDateHasQuality = new EffectiveDateHasQuality();
EffectiveDateRelative EffectiveDateRelative = new EffectiveDateRelative();
EffectiveRange EffectiveRange = new EffectiveRange();


ForSpec forSpecInstance = new ForSpec()
    .AsAtRangeForSpec(AsAtRangeForSpec)
    .AsAtRelative(AsAtRelative)
    .EffectiveDateHasQuality(EffectiveDateHasQuality)
    .EffectiveDateRelative(EffectiveDateRelative)
    .EffectiveRange(EffectiveRange);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
