# com.finbourne.access.model.RequestedActionKey
A fully qualified action identifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityCode** | **String** | The type of the resource on which the activity would be performed | [default to String]
**scope** | **String** | The scope/provider/vendor of the activity | [default to String]
**activity** | **String** | The identifier of the action to be performed on the resource | [default to String]

```java
import com.finbourne.access.model.RequestedActionKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityCode = "example EntityCode";
String Scope = "example Scope";
String Activity = "example Activity";


RequestedActionKey requestedActionKeyInstance = new RequestedActionKey()
    .EntityCode(EntityCode)
    .Scope(Scope)
    .Activity(Activity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
