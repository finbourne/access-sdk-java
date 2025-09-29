# com.finbourne.access.model.GeneratedPolicyComponents
Response object for policy generated from template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications** | **List&lt;String&gt;** | Applications to which the policy applies | [optional] [default to List<String>]
**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  | [optional] [default to TemplateMetadata]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that this policy will be applied to | [optional] [default to List<SelectorDefinition>]

```java
import com.finbourne.access.model.GeneratedPolicyComponents;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> Applications = new List<String>();
TemplateMetadata TemplateMetadata = new TemplateMetadata();
@jakarta.annotation.Nullable List<SelectorDefinition> Selectors = new List<SelectorDefinition>();


GeneratedPolicyComponents generatedPolicyComponentsInstance = new GeneratedPolicyComponents()
    .Applications(Applications)
    .TemplateMetadata(TemplateMetadata)
    .Selectors(Selectors);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
