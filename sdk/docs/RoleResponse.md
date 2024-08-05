

# RoleResponse

Response object from the role API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**RoleId**](RoleId.md) |  |  |
|**roleHierarchyIndex** | **Integer** | The hierarchical index of the role |  |
|**description** | **String** | The description of the role |  [optional] |
|**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  |  |
|**when** | [**WhenSpec**](WhenSpec.md) |  |  |
|**permission** | **String** | The action key of the role |  |
|**limit** | **Map&lt;String, String&gt;** | The identifiers of the role with the maximum privileges that this role can have |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


