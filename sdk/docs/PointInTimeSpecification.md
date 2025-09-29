# com.finbourne.access.model.PointInTimeSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PointInTimeSpecification** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.access.model.PointInTimeSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of PointInTimeSpecification:
PointInTimeSpecification method = PointInTimeSpecification.UNDEFINED;
PointInTimeSpecification method = PointInTimeSpecification.NOW;
PointInTimeSpecification method = PointInTimeSpecification.FIRSTOFMONTH;
PointInTimeSpecification method = PointInTimeSpecification.FIRSTBUSINESSDAYOFTHEMONTH;
PointInTimeSpecification method = PointInTimeSpecification.LASTDAYOFTHEMONTH;
PointInTimeSpecification method = PointInTimeSpecification.LASTBUSINESSDAYOFMONTH;
PointInTimeSpecification method = PointInTimeSpecification.FIRSTDAYOFYEAR;
PointInTimeSpecification method = PointInTimeSpecification.LASTDAYOFYEAR;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
