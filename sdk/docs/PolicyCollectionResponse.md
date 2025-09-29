# com.finbourne.access.model.PolicyCollectionResponse
A PolicyCollection encapsulating one or more Policies and PolicyCollections

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**PolicyCollectionId**](PolicyCollectionId.md) |  | [optional] [default to PolicyCollectionId]
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | The identifiers of the Policies in this collection | [optional] [default to List<PolicyId>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | The identifiers of the PolicyCollections in this collection | [optional] [default to List<PolicyCollectionId>]
**description** | **String** | A description of this policy collection | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.access.model.PolicyCollectionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

PolicyCollectionId Id = new PolicyCollectionId();
@jakarta.annotation.Nullable List<PolicyId> Policies = new List<PolicyId>();
@jakarta.annotation.Nullable List<PolicyCollectionId> PolicyCollections = new List<PolicyCollectionId>();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PolicyCollectionResponse policyCollectionResponseInstance = new PolicyCollectionResponse()
    .Id(Id)
    .Policies(Policies)
    .PolicyCollections(PolicyCollections)
    .Description(Description)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
