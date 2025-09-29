# com.finbourne.access.model.UserRoleCreationRequest
Dto used to request creating a user's role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The Id of the user for whom to create the role. | [default to String]
**resource** | [**PolicyIdRoleResource**](PolicyIdRoleResource.md) |  | [default to PolicyIdRoleResource]

```java
import com.finbourne.access.model.UserRoleCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String UserId = "example UserId";
PolicyIdRoleResource Resource = new PolicyIdRoleResource();


UserRoleCreationRequest userRoleCreationRequestInstance = new UserRoleCreationRequest()
    .UserId(UserId)
    .Resource(Resource);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
