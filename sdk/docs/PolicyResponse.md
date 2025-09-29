# com.finbourne.access.model.PolicyResponse
Response object from the policy API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**PolicyId**](PolicyId.md) |  | [optional] [default to PolicyId]
**description** | **String** | Description of what the policy is entitling | [optional] [default to String]
**applications** | **List&lt;String&gt;** | Applications to which the policy applies | [optional] [default to List<String>]
**grant** | [**Grant**](Grant.md) |  | [optional] [default to Grant]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that this policy will be applied to | [optional] [default to List<SelectorDefinition>]
**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) | \&quot;For Specification\&quot; for when the policy is to be applied | [optional] [default to List<ForSpec>]
**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) | \&quot;If Specification\&quot; for when the policy is to be applied | [optional] [default to List<IfExpression>]
**when** | [**WhenSpec**](WhenSpec.md) |  | [optional] [default to WhenSpec]
**how** | [**HowSpec**](HowSpec.md) |  | [optional] [default to HowSpec]
**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  | [optional] [default to TemplateMetadata]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.access.model.PolicyResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

PolicyId Id = new PolicyId();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> Applications = new List<String>();
Grant @jakarta.annotation.Nullable List<SelectorDefinition> Selectors = new List<SelectorDefinition>();
@jakarta.annotation.Nullable List<ForSpec> For = new List<ForSpec>();
@jakarta.annotation.Nullable List<IfExpression> If = new List<IfExpression>();
WhenSpec When = new WhenSpec();
HowSpec How = new HowSpec();
TemplateMetadata TemplateMetadata = new TemplateMetadata();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PolicyResponse policyResponseInstance = new PolicyResponse()
    .Id(Id)
    .Description(Description)
    .Applications(Applications)
    .Grant(Grant)
    .Selectors(Selectors)
    .For(For)
    .If(If)
    .When(When)
    .How(How)
    .TemplateMetadata(TemplateMetadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
