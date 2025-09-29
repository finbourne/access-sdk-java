# com.finbourne.access.model.SelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataSelectorDefinition** | [**MetadataSelectorDefinition**](MetadataSelectorDefinition.md) |  | [optional] [default to MetadataSelectorDefinition]
**idSelectorDefinition** | [**IdSelectorDefinition**](IdSelectorDefinition.md) |  | [optional] [default to IdSelectorDefinition]
**matchAllSelectorDefinition** | [**MatchAllSelectorDefinition**](MatchAllSelectorDefinition.md) |  | [optional] [default to MatchAllSelectorDefinition]
**policySelectorDefinition** | [**PolicySelectorDefinition**](PolicySelectorDefinition.md) |  | [optional] [default to PolicySelectorDefinition]

```java
import com.finbourne.access.model.SelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

MetadataSelectorDefinition MetadataSelectorDefinition = new MetadataSelectorDefinition();
IdSelectorDefinition IdSelectorDefinition = new IdSelectorDefinition();
MatchAllSelectorDefinition MatchAllSelectorDefinition = new MatchAllSelectorDefinition();
PolicySelectorDefinition PolicySelectorDefinition = new PolicySelectorDefinition();


SelectorDefinition selectorDefinitionInstance = new SelectorDefinition()
    .MetadataSelectorDefinition(MetadataSelectorDefinition)
    .IdSelectorDefinition(IdSelectorDefinition)
    .MatchAllSelectorDefinition(MatchAllSelectorDefinition)
    .PolicySelectorDefinition(PolicySelectorDefinition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
