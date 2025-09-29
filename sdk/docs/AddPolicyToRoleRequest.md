# com.finbourne.access.model.AddPolicyToRoleRequest
Request body used to add Policies to a Role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | Identifiers of policies to add to a role | [default to List<PolicyId>]

```java
import com.finbourne.access.model.AddPolicyToRoleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PolicyId> Policies = new List<PolicyId>();


AddPolicyToRoleRequest addPolicyToRoleRequestInstance = new AddPolicyToRoleRequest()
    .Policies(Policies);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
