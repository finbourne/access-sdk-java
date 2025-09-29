# com.finbourne.access.model.RequestDetails
The details of the requested evaluation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**RequestedActionKey**](RequestedActionKey.md) |  | [default to RequestedActionKey]
**fromEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date for the requested effective date range for the resource (if null, UtcNow) | [optional] [default to OffsetDateTime]
**toEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date for the requested effective date range for the resource (if null, same as from date) | [optional] [default to OffsetDateTime]
**fromAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The requested AsAt date for the resource (if null, Latest). If specifying a range of AsAt dates, this is the lower bounds. | [optional] [default to OffsetDateTime]
**toAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Upper bound if specifying a request that requires a range of AsAt dates. This is used if specifying the desire to grant access for a user between an AsAt range. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.access.model.RequestDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

RequestedActionKey Action = new RequestedActionKey();
@jakarta.annotation.Nullable OffsetDateTime FromEffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ToEffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime FromAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ToAsAt = OffsetDateTime.now();


RequestDetails requestDetailsInstance = new RequestDetails()
    .Action(Action)
    .FromEffectiveDate(FromEffectiveDate)
    .ToEffectiveDate(ToEffectiveDate)
    .FromAsAt(FromAsAt)
    .ToAsAt(ToAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
