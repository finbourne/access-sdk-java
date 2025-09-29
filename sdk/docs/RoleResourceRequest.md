# com.finbourne.access.model.RoleResourceRequest
RoleResourceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nonTransitiveSupervisorRoleResource** | [**NonTransitiveSupervisorRoleResource**](NonTransitiveSupervisorRoleResource.md) |  | [optional] [default to NonTransitiveSupervisorRoleResource]
**policyIdRoleResource** | [**PolicyIdRoleResource**](PolicyIdRoleResource.md) |  | [optional] [default to PolicyIdRoleResource]

```java
import com.finbourne.access.model.RoleResourceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

NonTransitiveSupervisorRoleResource NonTransitiveSupervisorRoleResource = new NonTransitiveSupervisorRoleResource();
PolicyIdRoleResource PolicyIdRoleResource = new PolicyIdRoleResource();


RoleResourceRequest roleResourceRequestInstance = new RoleResourceRequest()
    .NonTransitiveSupervisorRoleResource(NonTransitiveSupervisorRoleResource)
    .PolicyIdRoleResource(PolicyIdRoleResource);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
