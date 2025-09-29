# com.finbourne.access.model.PolicyTemplatedSelector
Templated selector for a policy template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** | The application that this selector definition applies to | [default to String]
**tag** | **String** | The type of policy that this selector definition applies to | [default to String]
**selector** | [**SelectorDefinition**](SelectorDefinition.md) |  | [default to SelectorDefinition]

```java
import com.finbourne.access.model.PolicyTemplatedSelector;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Application = "example Application";
String Tag = "example Tag";
SelectorDefinition Selector = new SelectorDefinition();


PolicyTemplatedSelector policyTemplatedSelectorInstance = new PolicyTemplatedSelector()
    .Application(Application)
    .Tag(Tag)
    .Selector(Selector);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
