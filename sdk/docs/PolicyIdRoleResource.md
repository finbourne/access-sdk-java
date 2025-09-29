# com.finbourne.access.model.PolicyIdRoleResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) |  | [optional] [default to List<PolicyId>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) |  | [optional] [default to List<PolicyCollectionId>]

```java
import com.finbourne.access.model.PolicyIdRoleResource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<PolicyId> Policies = new List<PolicyId>();
@jakarta.annotation.Nullable List<PolicyCollectionId> PolicyCollections = new List<PolicyCollectionId>();


PolicyIdRoleResource policyIdRoleResourceInstance = new PolicyIdRoleResource()
    .Policies(Policies)
    .PolicyCollections(PolicyCollections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
