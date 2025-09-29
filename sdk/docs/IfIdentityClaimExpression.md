# com.finbourne.access.model.IfIdentityClaimExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claimType** | **String** |  | [default to String]
**claimValueType** | **String** |  | [optional] [default to String]
**claimIssuer** | **String** |  | [optional] [default to String]
**claimOriginalIssuer** | **String** |  | [optional] [default to String]
**operator** | [**TextOperator**](TextOperator.md) |  | [default to TextOperator]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.access.model.IfIdentityClaimExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ClaimType = "example ClaimType";
@jakarta.annotation.Nullable String ClaimValueType = "example ClaimValueType";
@jakarta.annotation.Nullable String ClaimIssuer = "example ClaimIssuer";
@jakarta.annotation.Nullable String ClaimOriginalIssuer = "example ClaimOriginalIssuer";
TextOperator @jakarta.annotation.Nullable String Value = "example Value";


IfIdentityClaimExpression ifIdentityClaimExpressionInstance = new IfIdentityClaimExpression()
    .ClaimType(ClaimType)
    .ClaimValueType(ClaimValueType)
    .ClaimIssuer(ClaimIssuer)
    .ClaimOriginalIssuer(ClaimOriginalIssuer)
    .Operator(Operator)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
