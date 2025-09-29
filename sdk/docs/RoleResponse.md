# com.finbourne.access.model.RoleResponse
Response object from the role API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RoleId**](RoleId.md) |  | [default to RoleId]
**roleHierarchyIndex** | **Integer** | The hierarchical index of the role | [default to Integer]
**description** | **String** | The description of the role | [optional] [default to String]
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]
**permission** | **String** | The action key of the role | [default to String]
**limit** | **Map&lt;String, String&gt;** | The identifiers of the role with the maximum privileges that this role can have | [optional] [default to Map<String, String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.access.model.RoleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoleId Id = new RoleId();
Integer RoleHierarchyIndex = new Integer("100.00");
@jakarta.annotation.Nullable String Description = "example Description";
RoleResourceRequest Resource = new RoleResourceRequest();
WhenSpec When = new WhenSpec();
String Permission = "example Permission";
@jakarta.annotation.Nullable Map<String, String> Limit = new Map<String, String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RoleResponse roleResponseInstance = new RoleResponse()
    .Id(Id)
    .RoleHierarchyIndex(RoleHierarchyIndex)
    .Description(Description)
    .Resource(Resource)
    .When(When)
    .Permission(Permission)
    .Limit(Limit)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
