# com.finbourne.access.model.EvaluationResponse
The result of an evaluation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**EvaluationResult**](EvaluationResult.md) |  | [default to EvaluationResult]
**detailedMessage** | **String** | In the case of the evaluation being denied a message may be returned | [optional] [default to String]

```java
import com.finbourne.access.model.EvaluationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

EvaluationResult @jakarta.annotation.Nullable String DetailedMessage = "example DetailedMessage";


EvaluationResponse evaluationResponseInstance = new EvaluationResponse()
    .Result(Result)
    .DetailedMessage(DetailedMessage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
