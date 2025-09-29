# com.finbourne.access.model.ResourceListOfPolicyCollectionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;PolicyCollectionResponse&gt;**](PolicyCollectionResponse.md) |  | [default to List<PolicyCollectionResponse>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.access.model.ResourceListOfPolicyCollectionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PolicyCollectionResponse> Values = new List<PolicyCollectionResponse>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";


ResourceListOfPolicyCollectionResponse resourceListOfPolicyCollectionResponseInstance = new ResourceListOfPolicyCollectionResponse()
    .Values(Values)
    .Href(Href)
    .Links(Links)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
