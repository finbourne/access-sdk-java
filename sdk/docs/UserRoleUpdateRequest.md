# com.finbourne.access.model.UserRoleUpdateRequest
Dto used to request updating a user's role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | [**PolicyIdRoleResource**](PolicyIdRoleResource.md) |  | [default to PolicyIdRoleResource]

```java
import com.finbourne.access.model.UserRoleUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

PolicyIdRoleResource Resource = new PolicyIdRoleResource();


UserRoleUpdateRequest userRoleUpdateRequestInstance = new UserRoleUpdateRequest()
    .Resource(Resource);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
