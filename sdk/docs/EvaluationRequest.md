# com.finbourne.access.model.EvaluationRequest
Specification for a server side evaluation of entitlement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**RequestDetails**](RequestDetails.md) |  | [default to RequestDetails]
**resource** | [**ResourceDetails**](ResourceDetails.md) |  | [default to ResourceDetails]

```java
import com.finbourne.access.model.EvaluationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

RequestDetails Request = new RequestDetails();
ResourceDetails Resource = new ResourceDetails();


EvaluationRequest evaluationRequestInstance = new EvaluationRequest()
    .Request(Request)
    .Resource(Resource);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
