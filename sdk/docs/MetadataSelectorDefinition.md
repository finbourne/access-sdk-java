# com.finbourne.access.model.MetadataSelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expressions** | [**List&lt;MetadataExpression&gt;**](MetadataExpression.md) |  | [default to List<MetadataExpression>]
**actions** | [**List&lt;ActionId&gt;**](ActionId.md) |  | [default to List<ActionId>]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.access.model.MetadataSelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<MetadataExpression> Expressions = new List<MetadataExpression>();
List<ActionId> Actions = new List<ActionId>();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";


MetadataSelectorDefinition metadataSelectorDefinitionInstance = new MetadataSelectorDefinition()
    .Expressions(Expressions)
    .Actions(Actions)
    .Name(Name)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
