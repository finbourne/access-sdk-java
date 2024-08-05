

# PolicyUpdateRequest

Update policy request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of what the policy will be used for |  [optional] |
|**applications** | **List&lt;String&gt;** | Applications this policy is used with |  [optional] |
|**grant** | **Grant** |  |  |
|**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that identify what resources this policy qualifies for |  |
|**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) | \&quot;For Specification\&quot; for when the policy is to be applied |  [optional] |
|**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) | \&quot;If Specification\&quot; for when the policy is to be applied |  [optional] |
|**when** | [**WhenSpec**](WhenSpec.md) |  |  |
|**how** | [**HowSpec**](HowSpec.md) |  |  [optional] |
|**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


