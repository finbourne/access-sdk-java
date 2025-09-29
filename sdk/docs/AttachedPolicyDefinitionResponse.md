# com.finbourne.access.model.AttachedPolicyDefinitionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceRole** | [**RoleId**](RoleId.md) |  | [optional] [default to RoleId]
**roleHierarchyIndex** | **Integer** |  | [optional] [default to Integer]
**description** | **String** |  | [optional] [default to String]
**applications** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**policyType** | [**PolicyType**](PolicyType.md) |  | [optional] [default to PolicyType]
**id** | [**PolicyId**](PolicyId.md) |  | [optional] [default to PolicyId]
**grant** | [**Grant**](Grant.md) |  | [optional] [default to Grant]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) |  | [optional] [default to List<SelectorDefinition>]
**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) |  | [optional] [default to List<ForSpec>]
**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) |  | [optional] [default to List<IfExpression>]
**when** | [**WhenSpec**](WhenSpec.md) |  | [optional] [default to WhenSpec]
**how** | [**HowSpec**](HowSpec.md) |  | [optional] [default to HowSpec]

```java
import com.finbourne.access.model.AttachedPolicyDefinitionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoleId SourceRole = new RoleId();
Integer RoleHierarchyIndex = new Integer("100.00");
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> Applications = new List<String>();
PolicyType PolicyId Id = new PolicyId();
Grant @jakarta.annotation.Nullable List<SelectorDefinition> Selectors = new List<SelectorDefinition>();
@jakarta.annotation.Nullable List<ForSpec> For = new List<ForSpec>();
@jakarta.annotation.Nullable List<IfExpression> If = new List<IfExpression>();
WhenSpec When = new WhenSpec();
HowSpec How = new HowSpec();


AttachedPolicyDefinitionResponse attachedPolicyDefinitionResponseInstance = new AttachedPolicyDefinitionResponse()
    .SourceRole(SourceRole)
    .RoleHierarchyIndex(RoleHierarchyIndex)
    .Description(Description)
    .Applications(Applications)
    .PolicyType(PolicyType)
    .Id(Id)
    .Grant(Grant)
    .Selectors(Selectors)
    .For(For)
    .If(If)
    .When(When)
    .How(How);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
