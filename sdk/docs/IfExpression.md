# com.finbourne.access.model.IfExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ifRequestHeaderExpression** | [**IfRequestHeaderExpression**](IfRequestHeaderExpression.md) |  | [optional] [default to IfRequestHeaderExpression]
**ifIdentityClaimExpression** | [**IfIdentityClaimExpression**](IfIdentityClaimExpression.md) |  | [optional] [default to IfIdentityClaimExpression]
**ifIdentityScopeExpression** | [**IfIdentityScopeExpression**](IfIdentityScopeExpression.md) |  | [optional] [default to IfIdentityScopeExpression]
**ifFeatureChainExpression** | [**IfFeatureChainExpression**](IfFeatureChainExpression.md) |  | [optional] [default to IfFeatureChainExpression]

```java
import com.finbourne.access.model.IfExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

IfRequestHeaderExpression IfRequestHeaderExpression = new IfRequestHeaderExpression();
IfIdentityClaimExpression IfIdentityClaimExpression = new IfIdentityClaimExpression();
IfIdentityScopeExpression IfIdentityScopeExpression = new IfIdentityScopeExpression();
IfFeatureChainExpression IfFeatureChainExpression = new IfFeatureChainExpression();


IfExpression ifExpressionInstance = new IfExpression()
    .IfRequestHeaderExpression(IfRequestHeaderExpression)
    .IfIdentityClaimExpression(IfIdentityClaimExpression)
    .IfIdentityScopeExpression(IfIdentityScopeExpression)
    .IfFeatureChainExpression(IfFeatureChainExpression);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
