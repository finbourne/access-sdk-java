# com.finbourne.access.model.AsAtRelative

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**PointInTimeSpecification**](PointInTimeSpecification.md) |  | [optional] [default to PointInTimeSpecification]
**adjustment** | **Integer** |  | [optional] [default to Integer]
**unit** | [**DateUnit**](DateUnit.md) |  | [optional] [default to DateUnit]
**relativeToDateTime** | [**RelativeToDateTime**](RelativeToDateTime.md) |  | [optional] [default to RelativeToDateTime]

```java
import com.finbourne.access.model.AsAtRelative;
import java.util.*;
import java.lang.System;
import java.net.URI;

PointInTimeSpecification Integer Adjustment = new Integer("100.00");
DateUnit RelativeToDateTime 

AsAtRelative asAtRelativeInstance = new AsAtRelative()
    .Date(Date)
    .Adjustment(Adjustment)
    .Unit(Unit)
    .RelativeToDateTime(RelativeToDateTime);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
