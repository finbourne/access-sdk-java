# com.finbourne.access.model.RoleCreationRequest
Request to create a role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the role | [default to String]
**description** | **String** | The description of the role | [optional] [default to String]
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]

```java
import com.finbourne.access.model.RoleCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
RoleResourceRequest Resource = new RoleResourceRequest();
WhenSpec When = new WhenSpec();


RoleCreationRequest roleCreationRequestInstance = new RoleCreationRequest()
    .Code(Code)
    .Description(Description)
    .Resource(Resource)
    .When(When);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
