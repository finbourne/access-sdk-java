

# PolicyCollectionCreationRequest

Create a PolicyCollection, a logical group of Policies or other PolicyCollections

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The identifier for the PolicyCollection being created |  |
|**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | The identifiers of the Policies in this collection |  [optional] |
|**metadata** | **Map&lt;String, List&lt;EntitlementMetadata&gt;&gt;** | Any relevant metadata associated with this resource for controlling access to this resource |  [optional] |
|**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | The identifiers of the PolicyCollections in this collection |  [optional] |
|**description** | **String** | A description of this policy collection |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


