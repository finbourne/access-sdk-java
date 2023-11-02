# RolesApi

All URIs are relative to *https://fbn-ci.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPolicyCollectionToRole**](RolesApi.md#addPolicyCollectionToRole) | **POST** /api/roles/{scope}/{code}/policycollections | [EARLY ACCESS] AddPolicyCollectionToRole: Add policy collections to a role |
| [**createRole**](RolesApi.md#createRole) | **POST** /api/roles | [EARLY ACCESS] CreateRole: Create Role |
| [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /api/roles/{code} | [EARLY ACCESS] DeleteRole: Delete Role |
| [**getRole**](RolesApi.md#getRole) | **GET** /api/roles/{code} | [EARLY ACCESS] GetRole: Get Role |
| [**listRoles**](RolesApi.md#listRoles) | **GET** /api/roles | [EARLY ACCESS] ListRoles: List Roles |
| [**removePolicyCollectionFromRole**](RolesApi.md#removePolicyCollectionFromRole) | **DELETE** /api/roles/{scope}/{code}/policycollections/{policycollectionscope}/{policycollectioncode} | [EARLY ACCESS] RemovePolicyCollectionFromRole: Remove policy collection from role |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** /api/roles/{code} | [EARLY ACCESS] UpdateRole: Update Role |


<a id="addPolicyCollectionToRole"></a>
# **addPolicyCollectionToRole**
> RoleResponse addPolicyCollectionToRole(scope, code, addPolicyCollectionToRoleRequest).execute();

[EARLY ACCESS] AddPolicyCollectionToRole: Add policy collections to a role

Assigns policy collections to a role

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Role
    String code = "code_example"; // String | The code of the Role
    AddPolicyCollectionToRoleRequest addPolicyCollectionToRoleRequest = new AddPolicyCollectionToRoleRequest(); // AddPolicyCollectionToRoleRequest | The policy collections to add
    try {
      RoleResponse result = apiInstance.addPolicyCollectionToRole(scope, code, addPolicyCollectionToRoleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#addPolicyCollectionToRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Role | |
| **code** | **String**| The code of the Role | |
| **addPolicyCollectionToRoleRequest** | [**AddPolicyCollectionToRoleRequest**](AddPolicyCollectionToRoleRequest.md)| The policy collections to add | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AddPolicyCollectionToRole |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createRole"></a>
# **createRole**
> RoleResponse createRole(roleCreationRequest).execute();

[EARLY ACCESS] CreateRole: Create Role

Creates a Role

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    RoleCreationRequest roleCreationRequest = new RoleCreationRequest(); // RoleCreationRequest | The definition of the Role
    try {
      RoleResponse result = apiInstance.createRole(roleCreationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#createRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleCreationRequest** | [**RoleCreationRequest**](RoleCreationRequest.md)| The definition of the Role | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(code).scope(scope).execute();

[EARLY ACCESS] DeleteRole: Delete Role

Deletes an identified Role

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String code = "code_example"; // String | The code of the Role
    String scope = "scope_example"; // String | >Optional. Will use default scope if not supplied. The scope of the Role
    try {
      apiInstance.deleteRole(code)
            .scope(scope)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#deleteRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| The code of the Role | |
| **scope** | **String**| &gt;Optional. Will use default scope if not supplied. The scope of the Role | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRole"></a>
# **getRole**
> RoleResponse getRole(code).asAt(asAt).scope(scope).execute();

[EARLY ACCESS] GetRole: Get Role

Gets an identified Role

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String code = "code_example"; // String | The code of the Role
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    String scope = "scope_example"; // String | Optional. Will use default scope if not supplied. The scope of the Role
    try {
      RoleResponse result = apiInstance.getRole(code)
            .asAt(asAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| The code of the Role | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **scope** | **String**| Optional. Will use default scope if not supplied. The scope of the Role | [optional] |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested Role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRoles"></a>
# **listRoles**
> List&lt;RoleResponse&gt; listRoles().scope(scope).asAt(asAt).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EARLY ACCESS] ListRoles: List Roles

Gets all Roles in a scope

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String scope = "scope_example"; // String | Optional. Will use all scopes if not supplied. The requested scope
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      List<RoleResponse> result = apiInstance.listRoles()
            .scope(scope)
            .asAt(asAt)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| Optional. Will use all scopes if not supplied. The requested scope | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;RoleResponse&gt;**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Roles |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="removePolicyCollectionFromRole"></a>
# **removePolicyCollectionFromRole**
> RoleResponse removePolicyCollectionFromRole(scope, code, policycollectionscope, policycollectioncode).execute();

[EARLY ACCESS] RemovePolicyCollectionFromRole: Remove policy collection from role

Removes a policy collection from a role

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Role
    String code = "code_example"; // String | The code of the Role
    String policycollectionscope = "policycollectionscope_example"; // String | The scope of policy collection to remove from the Role
    String policycollectioncode = "policycollectioncode_example"; // String | The code of the policy collection to remove from the Role
    try {
      RoleResponse result = apiInstance.removePolicyCollectionFromRole(scope, code, policycollectionscope, policycollectioncode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#removePolicyCollectionFromRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Role | |
| **code** | **String**| The code of the Role | |
| **policycollectionscope** | **String**| The scope of policy collection to remove from the Role | |
| **policycollectioncode** | **String**| The code of the policy collection to remove from the Role | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | RemovePolicyCollectionFromRole |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateRole"></a>
# **updateRole**
> RoleResponse updateRole(code, roleUpdateRequest).scope(scope).beforeScope(beforeScope).beforeCode(beforeCode).afterScope(afterScope).afterCode(afterCode).execute();

[EARLY ACCESS] UpdateRole: Update Role

Updates a Role

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String code = "code_example"; // String | The code of the Role
    RoleUpdateRequest roleUpdateRequest = new RoleUpdateRequest(); // RoleUpdateRequest | The updated definition of the Role
    String scope = "scope_example"; // String | >Optional. Will use default scope if not supplied. The scope of the Role
    String beforeScope = "beforeScope_example"; // String | Optional. The scope of the Role. Will use default scope if not supplied.
    String beforeCode = "beforeCode_example"; // String | Optional. The code of the Role
    String afterScope = "afterScope_example"; // String | Optional. The scope of the Role. Will use default scope if not supplied.
    String afterCode = "afterCode_example"; // String | Optional. The code of the Role
    try {
      RoleResponse result = apiInstance.updateRole(code, roleUpdateRequest)
            .scope(scope)
            .beforeScope(beforeScope)
            .beforeCode(beforeCode)
            .afterScope(afterScope)
            .afterCode(afterCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#updateRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| The code of the Role | |
| **roleUpdateRequest** | [**RoleUpdateRequest**](RoleUpdateRequest.md)| The updated definition of the Role | |
| **scope** | **String**| &gt;Optional. Will use default scope if not supplied. The scope of the Role | [optional] |
| **beforeScope** | **String**| Optional. The scope of the Role. Will use default scope if not supplied. | [optional] |
| **beforeCode** | **String**| Optional. The code of the Role | [optional] |
| **afterScope** | **String**| Optional. The scope of the Role. Will use default scope if not supplied. | [optional] |
| **afterCode** | **String**| Optional. The code of the Role | [optional] |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

