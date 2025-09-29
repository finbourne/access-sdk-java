# com.finbourne.access.model.PolicyCreationRequest
Request to create a policy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the policy being created | [default to String]
**description** | **String** | Description of what the policy will be used for | [optional] [default to String]
**applications** | **List&lt;String&gt;** | Applications this policy is used with | [optional] [default to List<String>]
**grant** | [**Grant**](Grant.md) |  | [default to Grant]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that identify what resources this policy qualifies for | [default to List<SelectorDefinition>]
**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) | \&quot;For Specification\&quot; for when the policy is to be applied | [optional] [default to List<ForSpec>]
**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) | \&quot;If Specification\&quot; for when the policy is to be applied | [optional] [default to List<IfExpression>]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]
**how** | [**HowSpec**](HowSpec.md) |  | [optional] [default to HowSpec]
**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  | [optional] [default to TemplateMetadata]

```java
import com.finbourne.access.model.PolicyCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> Applications = new List<String>();
Grant List<SelectorDefinition> Selectors = new List<SelectorDefinition>();
@jakarta.annotation.Nullable List<ForSpec> For = new List<ForSpec>();
@jakarta.annotation.Nullable List<IfExpression> If = new List<IfExpression>();
WhenSpec When = new WhenSpec();
HowSpec How = new HowSpec();
TemplateMetadata TemplateMetadata = new TemplateMetadata();


PolicyCreationRequest policyCreationRequestInstance = new PolicyCreationRequest()
    .Code(Code)
    .Description(Description)
    .Applications(Applications)
    .Grant(Grant)
    .Selectors(Selectors)
    .For(For)
    .If(If)
    .When(When)
    .How(How)
    .TemplateMetadata(TemplateMetadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
