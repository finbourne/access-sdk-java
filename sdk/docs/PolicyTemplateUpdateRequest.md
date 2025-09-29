# com.finbourne.access.model.PolicyTemplateUpdateRequest
Update policy template request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the policy template being created | [default to String]
**description** | **String** | Description of the policy template being craeted | [default to String]
**templatedSelectors** | [**List&lt;PolicyTemplatedSelector&gt;**](PolicyTemplatedSelector.md) | The selector definitions of policies included in this policy template | [default to List<PolicyTemplatedSelector>]

```java
import com.finbourne.access.model.PolicyTemplateUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String Description = "example Description";
List<PolicyTemplatedSelector> TemplatedSelectors = new List<PolicyTemplatedSelector>();


PolicyTemplateUpdateRequest policyTemplateUpdateRequestInstance = new PolicyTemplateUpdateRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .TemplatedSelectors(TemplatedSelectors);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
