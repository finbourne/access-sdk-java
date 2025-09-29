# com.finbourne.access.model.GeneratePolicyFromTemplateRequest
Generate policy from template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateSelection** | [**List&lt;TemplateSelection&gt;**](TemplateSelection.md) | List of template selection, identifying policy templates to use for generation | [default to List<TemplateSelection>]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | List of additional selectors to be included in the policy | [optional] [default to List<SelectorDefinition>]

```java
import com.finbourne.access.model.GeneratePolicyFromTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TemplateSelection> TemplateSelection = new List<TemplateSelection>();
@jakarta.annotation.Nullable List<SelectorDefinition> Selectors = new List<SelectorDefinition>();


GeneratePolicyFromTemplateRequest generatePolicyFromTemplateRequestInstance = new GeneratePolicyFromTemplateRequest()
    .TemplateSelection(TemplateSelection)
    .Selectors(Selectors);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
