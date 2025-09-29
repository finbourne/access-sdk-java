# com.finbourne.access.model.TemplateMetadata
Extra policy template metadata information, used during a generation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateSelection** | [**List&lt;TemplateSelection&gt;**](TemplateSelection.md) | List of policy templates used for a generation request | [optional] [default to List<TemplateSelection>]
**buildAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Policy template build AsAt time used for a generation request | [optional] [default to OffsetDateTime]

```java
import com.finbourne.access.model.TemplateMetadata;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<TemplateSelection> TemplateSelection = new List<TemplateSelection>();
OffsetDateTime BuildAsAt = OffsetDateTime.now();


TemplateMetadata templateMetadataInstance = new TemplateMetadata()
    .TemplateSelection(TemplateSelection)
    .BuildAsAt(BuildAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
