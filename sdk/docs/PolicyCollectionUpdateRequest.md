# com.finbourne.access.model.PolicyCollectionUpdateRequest
Update an existing PolicyCollection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | The identifiers of the Policies in this collection | [optional] [default to List<PolicyId>]
**metadata** | [**Map&lt;String, List&lt;EntitlementMetadata&gt;&gt;**](List.md) | Any relevant metadata associated with this resource for controlling access to this resource | [optional] [default to Map<String, List<EntitlementMetadata>>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | The identifiers of the PolicyCollections in this collection | [optional] [default to List<PolicyCollectionId>]
**description** | **String** | A description of this policy collection | [optional] [default to String]

```java
import com.finbourne.access.model.PolicyCollectionUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<PolicyId> Policies = new List<PolicyId>();
@jakarta.annotation.Nullable Map<String, List<EntitlementMetadata>> Metadata = new Map<String, List<EntitlementMetadata>>();
@jakarta.annotation.Nullable List<PolicyCollectionId> PolicyCollections = new List<PolicyCollectionId>();
@jakarta.annotation.Nullable String Description = "example Description";


PolicyCollectionUpdateRequest policyCollectionUpdateRequestInstance = new PolicyCollectionUpdateRequest()
    .Policies(Policies)
    .Metadata(Metadata)
    .PolicyCollections(PolicyCollections)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
