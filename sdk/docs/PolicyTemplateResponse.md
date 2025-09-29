# com.finbourne.access.model.PolicyTemplateResponse
Response object for a policy template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Display name of the policy template being created | [optional] [default to String]
**scope** | **String** | The Scope of the policy template being created | [optional] [default to String]
**code** | **String** | The Code of the policy template being created | [optional] [default to String]
**description** | **String** | Description of the policy template being created | [optional] [default to String]
**applications** | **List&lt;String&gt;** | List of applications that this policy template covers | [optional] [default to List<String>]
**tags** | **List&lt;String&gt;** | List of policy types that this policy template covers | [optional] [default to List<String>]
**templatedSelectors** | [**List&lt;PolicyTemplatedSelector&gt;**](PolicyTemplatedSelector.md) | The selector definitions of policies included in this policy template | [optional] [default to List<PolicyTemplatedSelector>]

```java
import com.finbourne.access.model.PolicyTemplateResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> Applications = new List<String>();
@jakarta.annotation.Nullable List<String> Tags = new List<String>();
@jakarta.annotation.Nullable List<PolicyTemplatedSelector> TemplatedSelectors = new List<PolicyTemplatedSelector>();


PolicyTemplateResponse policyTemplateResponseInstance = new PolicyTemplateResponse()
    .DisplayName(DisplayName)
    .Scope(Scope)
    .Code(Code)
    .Description(Description)
    .Applications(Applications)
    .Tags(Tags)
    .TemplatedSelectors(TemplatedSelectors);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
