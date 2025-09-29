# com.finbourne.access.model.ResourceDetails
Details about the resource being requested that may be pertinent to the entitlement evaluation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Map&lt;String, String&gt;** | The identifier of the resource being evaluated | [default to Map<String, String>]
**metadata** | [**Map&lt;String, List&lt;EntitlementMetadata&gt;&gt;**](List.md) | Any metadata associated with the resource being requested | [optional] [default to Map<String, List<EntitlementMetadata>>]

```java
import com.finbourne.access.model.ResourceDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> Id = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, List<EntitlementMetadata>> Metadata = new Map<String, List<EntitlementMetadata>>();


ResourceDetails resourceDetailsInstance = new ResourceDetails()
    .Id(Id)
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
