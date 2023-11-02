

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



