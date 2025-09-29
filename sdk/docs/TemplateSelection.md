# com.finbourne.access.model.TemplateSelection
A template selection, identifying a policy template to use for generation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | Scope identifying policy template to use for generation | [default to String]
**code** | **String** | Code identifying policy template to use for generation | [default to String]
**selectorTags** | **List&lt;String&gt;** | List of selector tags to optionally filter in the template generation  (Eg: Feature, Data, etc) | [optional] [default to List<String>]

```java
import com.finbourne.access.model.TemplateSelection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable List<String> SelectorTags = new List<String>();


TemplateSelection templateSelectionInstance = new TemplateSelection()
    .Scope(Scope)
    .Code(Code)
    .SelectorTags(SelectorTags);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
