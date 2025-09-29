# com.finbourne.access.model.RoleUpdateRequest
Role update does not allow the changing of the id

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the role | [optional] [default to String]
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]

```java
import com.finbourne.access.model.RoleUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Description = "example Description";
RoleResourceRequest Resource = new RoleResourceRequest();
WhenSpec When = new WhenSpec();


RoleUpdateRequest roleUpdateRequestInstance = new RoleUpdateRequest()
    .Description(Description)
    .Resource(Resource)
    .When(When);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
