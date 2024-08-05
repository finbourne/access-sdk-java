

# RequestDetails

The details of the requested evaluation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**RequestedActionKey**](RequestedActionKey.md) |  |  |
|**fromEffectiveDate** | **OffsetDateTime** | The start date for the requested effective date range for the resource (if null, UtcNow) |  [optional] |
|**toEffectiveDate** | **OffsetDateTime** | The end date for the requested effective date range for the resource (if null, same as from date) |  [optional] |
|**fromAsAt** | **OffsetDateTime** | The requested AsAt date for the resource (if null, Latest). If specifying a range of AsAt dates, this is the lower bounds. |  [optional] |
|**toAsAt** | **OffsetDateTime** | Upper bound if specifying a request that requires a range of AsAt dates. This is used if specifying the desire to grant access for a user between an AsAt range. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


