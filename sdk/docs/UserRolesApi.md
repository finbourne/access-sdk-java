# UserRolesApi

All URIs are relative to *https://fbn-prd.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPolicyCollectionToUserRole**](UserRolesApi.md#addPolicyCollectionToUserRole) | **POST** /api/userroles/{userid}/policycollections | AddPolicyCollectionToUserRole: Add a policy collection to a user-role |
| [**addPolicyToUserRole**](UserRolesApi.md#addPolicyToUserRole) | **POST** /api/userroles/{userid}/policies | AddPolicyToUserRole: Add a policy to a user-role |
| [**createUserRole**](UserRolesApi.md#createUserRole) | **POST** /api/userroles | CreateUserRole: Create a user-role |
| [**deleteUserRole**](UserRolesApi.md#deleteUserRole) | **DELETE** /api/userroles/{userid} | DeleteUserRole: Delete a user-role |
| [**getUserRole**](UserRolesApi.md#getUserRole) | **GET** /api/userroles/{userid} | GetUserRole: Get a user-role |
| [**listUserRoles**](UserRolesApi.md#listUserRoles) | **GET** /api/userroles | ListUserRoles: List user-roles |
| [**removePolicyCollectionFromUserRole**](UserRolesApi.md#removePolicyCollectionFromUserRole) | **DELETE** /api/userroles/{userid}/policycollections/{policyCollectionScope}/{policyCollectionCode} | RemovePolicyCollectionFromUserRole: Remove a policy collection from a user-role |
| [**removePolicyFromUserRole**](UserRolesApi.md#removePolicyFromUserRole) | **DELETE** /api/userroles/{userid}/policies/{policyScope}/{policyCode} | RemovePolicyFromUserRole: Remove a policy from a user-role |
| [**updateUserRole**](UserRolesApi.md#updateUserRole) | **POST** /api/userroles/{userid}/update | UpdateUserRole: Update a user-role |


<a id="addPolicyCollectionToUserRole"></a>
# **addPolicyCollectionToUserRole**
> UserRoleResponse addPolicyCollectionToUserRole(userid, addPolicyCollectionToRoleRequest).execute();

AddPolicyCollectionToUserRole: Add a policy collection to a user-role

Adds a policy collection to a user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the User Role to get
    AddPolicyCollectionToRoleRequest addPolicyCollectionToRoleRequest = new AddPolicyCollectionToRoleRequest(); // AddPolicyCollectionToRoleRequest | Dto of the policy collection to be added.
    try {
      UserRoleResponse result = apiInstance.addPolicyCollectionToUserRole(userid, addPolicyCollectionToRoleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#addPolicyCollectionToUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **addPolicyCollectionToRoleRequest** | [**AddPolicyCollectionToRoleRequest**](AddPolicyCollectionToRoleRequest.md)| Dto of the policy collection to be added. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role with added policy collection. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="addPolicyToUserRole"></a>
# **addPolicyToUserRole**
> UserRoleResponse addPolicyToUserRole(userid, addPolicyToRoleRequest).execute();

AddPolicyToUserRole: Add a policy to a user-role

Adds a policy to a user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the User Role to get
    AddPolicyToRoleRequest addPolicyToRoleRequest = new AddPolicyToRoleRequest(); // AddPolicyToRoleRequest | Dto of the policy to be added.
    try {
      UserRoleResponse result = apiInstance.addPolicyToUserRole(userid, addPolicyToRoleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#addPolicyToUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **addPolicyToRoleRequest** | [**AddPolicyToRoleRequest**](AddPolicyToRoleRequest.md)| Dto of the policy to be added. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role with added policy collection. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createUserRole"></a>
# **createUserRole**
> UserRoleResponse createUserRole(userRoleCreationRequest).execute();

CreateUserRole: Create a user-role

Creates a new user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    UserRoleCreationRequest userRoleCreationRequest = new UserRoleCreationRequest(); // UserRoleCreationRequest | Definition of the user-role to create.
    try {
      UserRoleResponse result = apiInstance.createUserRole(userRoleCreationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#createUserRole");
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
| **userRoleCreationRequest** | [**UserRoleCreationRequest**](UserRoleCreationRequest.md)| Definition of the user-role to create. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role that has been created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteUserRole"></a>
# **deleteUserRole**
> deleteUserRole(userid).execute();

DeleteUserRole: Delete a user-role

Deletes an identified user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the user-role to delete.
    try {
      apiInstance.deleteUserRole(userid)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#deleteUserRole");
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
| **userid** | **String**| Id of the user-role to delete. | |

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

<a id="getUserRole"></a>
# **getUserRole**
> UserRoleResponse getUserRole(userid).execute();

GetUserRole: Get a user-role

Get an identified user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the user-role to get.
    try {
      UserRoleResponse result = apiInstance.getUserRole(userid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#getUserRole");
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
| **userid** | **String**| Id of the user-role to get. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested user role. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listUserRoles"></a>
# **listUserRoles**
> ResourceListOfUserRoleResponse listUserRoles().filter(filter).sortBy(sortBy).limit(limit).page(page).execute();

ListUserRoles: List user-roles

Lists all user-roles and pages.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String page = "page_example"; // String | Optional. Encoded page string returned from a previous search result that will retrieve   the next page of data.
    try {
      ResourceListOfUserRoleResponse result = apiInstance.listUserRoles()
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#listUserRoles");
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
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **page** | **String**| Optional. Encoded page string returned from a previous search result that will retrieve   the next page of data. | [optional] |

### Return type

[**ResourceListOfUserRoleResponse**](ResourceListOfUserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="removePolicyCollectionFromUserRole"></a>
# **removePolicyCollectionFromUserRole**
> removePolicyCollectionFromUserRole(userid, policyCollectionScope, policyCollectionCode).execute();

RemovePolicyCollectionFromUserRole: Remove a policy collection from a user-role

Removes a policy collection from a user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the User Role to get
    String policyCollectionScope = "policyCollectionScope_example"; // String | The scope of policy collection to remove from the User Role
    String policyCollectionCode = "policyCollectionCode_example"; // String | The code of the policy collection to remove from the User Role
    try {
      apiInstance.removePolicyCollectionFromUserRole(userid, policyCollectionScope, policyCollectionCode)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#removePolicyCollectionFromUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **policyCollectionScope** | **String**| The scope of policy collection to remove from the User Role | |
| **policyCollectionCode** | **String**| The code of the policy collection to remove from the User Role | |

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

<a id="removePolicyFromUserRole"></a>
# **removePolicyFromUserRole**
> removePolicyFromUserRole(userid, policyScope, policyCode).execute();

RemovePolicyFromUserRole: Remove a policy from a user-role

Removes a policy from a user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the User Role to get
    String policyScope = "policyScope_example"; // String | The scope of the policy to remove from the User Role
    String policyCode = "policyCode_example"; // String | The code of the policy to remove from the User Role
    try {
      apiInstance.removePolicyFromUserRole(userid, policyScope, policyCode)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#removePolicyFromUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **policyScope** | **String**| The scope of the policy to remove from the User Role | |
| **policyCode** | **String**| The code of the policy to remove from the User Role | |

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

<a id="updateUserRole"></a>
# **updateUserRole**
> UserRoleResponse updateUserRole(userid, userRoleUpdateRequest).execute();

UpdateUserRole: Update a user-role

Updates an identified user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the user-role to be updated.
    UserRoleUpdateRequest userRoleUpdateRequest = new UserRoleUpdateRequest(); // UserRoleUpdateRequest | Definition of the update to apply to the user-role.
    try {
      UserRoleResponse result = apiInstance.updateUserRole(userid, userRoleUpdateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#updateUserRole");
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
| **userid** | **String**| Id of the user-role to be updated. | |
| **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| Definition of the update to apply to the user-role. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role that has been updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

