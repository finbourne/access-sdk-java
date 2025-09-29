# com.finbourne.access.model.PolicySelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityRestriction** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**restrictionSelectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) |  | [optional] [default to List<SelectorDefinition>]
**actions** | [**List&lt;ActionId&gt;**](ActionId.md) |  | [default to List<ActionId>]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.access.model.PolicySelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> IdentityRestriction = new Map<String, String>();
@jakarta.annotation.Nullable List<SelectorDefinition> RestrictionSelectors = new List<SelectorDefinition>();
List<ActionId> Actions = new List<ActionId>();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";


PolicySelectorDefinition policySelectorDefinitionInstance = new PolicySelectorDefinition()
    .IdentityRestriction(IdentityRestriction)
    .RestrictionSelectors(RestrictionSelectors)
    .Actions(Actions)
    .Name(Name)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
