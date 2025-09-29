# com.finbourne.access.model.UserRoleResponse
Response object from the user role API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**id** | [**RoleId**](RoleId.md) |  | [default to RoleId]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.access.model.UserRoleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoleResourceRequest Resource = new RoleResourceRequest();
RoleId Id = new RoleId();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UserRoleResponse userRoleResponseInstance = new UserRoleResponse()
    .Resource(Resource)
    .Id(Id)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
