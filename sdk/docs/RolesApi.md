# RolesApi

All URIs are relative to *https://fbn-prd.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPolicyCollectionToRole**](RolesApi.md#addPolicyCollectionToRole) | **POST** /api/roles/{scope}/{code}/policycollections | AddPolicyCollectionToRole: Add policy collections to a role |
| [**createRole**](RolesApi.md#createRole) | **POST** /api/roles | CreateRole: Create Role |
| [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /api/roles/{code} | DeleteRole: Delete Role |
| [**getRole**](RolesApi.md#getRole) | **GET** /api/roles/{code} | GetRole: Get Role |
| [**listRoles**](RolesApi.md#listRoles) | **GET** /api/roles | ListRoles: List Roles |
| [**removePolicyCollectionFromRole**](RolesApi.md#removePolicyCollectionFromRole) | **DELETE** /api/roles/{scope}/{code}/policycollections/{policycollectionscope}/{policycollectioncode} | RemovePolicyCollectionFromRole: Remove policy collection from role |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** /api/roles/{code} | UpdateRole: Update Role |



## addPolicyCollectionToRole

> RoleResponse addPolicyCollectionToRole(scope, code, addPolicyCollectionToRoleRequest)

AddPolicyCollectionToRole: Add policy collections to a role

Assigns policy collections to a role

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        String scope = "scope_example"; // String | The scope of the Role
        String code = "code_example"; // String | The code of the Role
        AddPolicyCollectionToRoleRequest addPolicyCollectionToRoleRequest = new AddPolicyCollectionToRoleRequest(); // AddPolicyCollectionToRoleRequest | The policy collections to add
        try {
            RoleResponse result = apiInstance.addPolicyCollectionToRole(scope, code, addPolicyCollectionToRoleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#addPolicyCollectionToRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AddPolicyCollectionToRole |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createRole

> RoleResponse createRole(roleCreationRequest)

CreateRole: Create Role

Creates a Role

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        RoleCreationRequest roleCreationRequest = new RoleCreationRequest(); // RoleCreationRequest | The definition of the Role
        try {
            RoleResponse result = apiInstance.createRole(roleCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteRole

> deleteRole(code, scope)

DeleteRole: Delete Role

Deletes an identified Role

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        String code = "code_example"; // String | The code of the Role
        String scope = "scope_example"; // String | >Optional. Will use default scope if not supplied. The scope of the Role
        try {
            apiInstance.deleteRole(code, scope).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#deleteRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRole

> RoleResponse getRole(code, asAt, scope)

GetRole: Get Role

Gets an identified Role

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        String code = "code_example"; // String | The code of the Role
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        String scope = "scope_example"; // String | Optional. Will use default scope if not supplied. The scope of the Role
        try {
            RoleResponse result = apiInstance.getRole(code, asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested Role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRoles

> List&lt;RoleResponse&gt; listRoles(scope, asAt, sortBy, start, limit, filter)

ListRoles: List Roles

Gets all Roles in a scope

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        String scope = "scope_example"; // String | Optional. Will use all scopes if not supplied. The requested scope
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer start = 56; // Integer | Optional. When paginating, skip this number of results
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        try {
            List<RoleResponse> result = apiInstance.listRoles(scope, asAt, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#listRoles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Roles |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removePolicyCollectionFromRole

> RoleResponse removePolicyCollectionFromRole(scope, code, policycollectionscope, policycollectioncode)

RemovePolicyCollectionFromRole: Remove policy collection from role

Removes a policy collection from a role

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        String scope = "scope_example"; // String | The scope of the Role
        String code = "code_example"; // String | The code of the Role
        String policycollectionscope = "policycollectionscope_example"; // String | The scope of policy collection to remove from the Role
        String policycollectioncode = "policycollectioncode_example"; // String | The code of the policy collection to remove from the Role
        try {
            RoleResponse result = apiInstance.removePolicyCollectionFromRole(scope, code, policycollectionscope, policycollectioncode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#removePolicyCollectionFromRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | RemovePolicyCollectionFromRole |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateRole

> RoleResponse updateRole(code, roleUpdateRequest, scope, beforeScope, beforeCode, afterScope, afterCode)

UpdateRole: Update Role

Updates a Role

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.RolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RolesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"accessUrl\": \"https://<your-domain>.lusid.com/access\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        RolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(RolesApi.class);
        String code = "code_example"; // String | The code of the Role
        RoleUpdateRequest roleUpdateRequest = new RoleUpdateRequest(); // RoleUpdateRequest | The updated definition of the Role
        String scope = "scope_example"; // String | >Optional. Will use default scope if not supplied. The scope of the Role
        String beforeScope = "beforeScope_example"; // String | Optional. The scope of the Role. Will use default scope if not supplied.
        String beforeCode = "beforeCode_example"; // String | Optional. The code of the Role
        String afterScope = "afterScope_example"; // String | Optional. The scope of the Role. Will use default scope if not supplied.
        String afterCode = "afterCode_example"; // String | Optional. The code of the Role
        try {
            RoleResponse result = apiInstance.updateRole(code, roleUpdateRequest, scope, beforeScope, beforeCode, afterScope, afterCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#updateRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

