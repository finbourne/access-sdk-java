

# PolicyResponse

Response object from the policy API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**PolicyId**](PolicyId.md) |  |  [optional] |
|**description** | **String** | Description of what the policy is entitling |  [optional] |
|**applications** | **List&lt;String&gt;** | Applications to which the policy applies |  [optional] |
|**grant** | **Grant** |  |  [optional] |
|**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that this policy will be applied to |  [optional] |
|**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) | \&quot;For Specification\&quot; for when the policy is to be applied |  [optional] |
|**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) | \&quot;If Specification\&quot; for when the policy is to be applied |  [optional] |
|**when** | [**WhenSpec**](WhenSpec.md) |  |  [optional] |
|**how** | [**HowSpec**](HowSpec.md) |  |  [optional] |
|**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



