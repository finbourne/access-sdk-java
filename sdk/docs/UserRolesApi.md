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



## addPolicyCollectionToUserRole

> UserRoleResponse addPolicyCollectionToUserRole(userid, addPolicyCollectionToRoleRequest)

AddPolicyCollectionToUserRole: Add a policy collection to a user-role

Adds a policy collection to a user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the User Role to get
        AddPolicyCollectionToRoleRequest addPolicyCollectionToRoleRequest = new AddPolicyCollectionToRoleRequest(); // AddPolicyCollectionToRoleRequest | Dto of the policy collection to be added.
        try {
            // uncomment the below to set overrides at the request level
            // UserRoleResponse result = apiInstance.addPolicyCollectionToUserRole(userid, addPolicyCollectionToRoleRequest).execute(opts);

            UserRoleResponse result = apiInstance.addPolicyCollectionToUserRole(userid, addPolicyCollectionToRoleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#addPolicyCollectionToUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **addPolicyCollectionToRoleRequest** | [**AddPolicyCollectionToRoleRequest**](AddPolicyCollectionToRoleRequest.md)| Dto of the policy collection to be added. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role with added policy collection. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## addPolicyToUserRole

> UserRoleResponse addPolicyToUserRole(userid, addPolicyToRoleRequest)

AddPolicyToUserRole: Add a policy to a user-role

Adds a policy to a user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the User Role to get
        AddPolicyToRoleRequest addPolicyToRoleRequest = new AddPolicyToRoleRequest(); // AddPolicyToRoleRequest | Dto of the policy to be added.
        try {
            // uncomment the below to set overrides at the request level
            // UserRoleResponse result = apiInstance.addPolicyToUserRole(userid, addPolicyToRoleRequest).execute(opts);

            UserRoleResponse result = apiInstance.addPolicyToUserRole(userid, addPolicyToRoleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#addPolicyToUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **addPolicyToRoleRequest** | [**AddPolicyToRoleRequest**](AddPolicyToRoleRequest.md)| Dto of the policy to be added. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role with added policy collection. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createUserRole

> UserRoleResponse createUserRole(userRoleCreationRequest)

CreateUserRole: Create a user-role

Creates a new user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        UserRoleCreationRequest userRoleCreationRequest = new UserRoleCreationRequest(); // UserRoleCreationRequest | Definition of the user-role to create.
        try {
            // uncomment the below to set overrides at the request level
            // UserRoleResponse result = apiInstance.createUserRole(userRoleCreationRequest).execute(opts);

            UserRoleResponse result = apiInstance.createUserRole(userRoleCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#createUserRole");
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
| **userRoleCreationRequest** | [**UserRoleCreationRequest**](UserRoleCreationRequest.md)| Definition of the user-role to create. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role that has been created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteUserRole

> deleteUserRole(userid)

DeleteUserRole: Delete a user-role

Deletes an identified user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the user-role to delete.
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteUserRole(userid).execute(opts);

            apiInstance.deleteUserRole(userid).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#deleteUserRole");
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
| **userid** | **String**| Id of the user-role to delete. | |

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


## getUserRole

> UserRoleResponse getUserRole(userid)

GetUserRole: Get a user-role

Get an identified user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the user-role to get.
        try {
            // uncomment the below to set overrides at the request level
            // UserRoleResponse result = apiInstance.getUserRole(userid).execute(opts);

            UserRoleResponse result = apiInstance.getUserRole(userid).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#getUserRole");
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
| **userid** | **String**| Id of the user-role to get. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested user role. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listUserRoles

> ResourceListOfUserRoleResponse listUserRoles(filter, sortBy, limit, page)

ListUserRoles: List user-roles

Lists all user-roles and pages.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String page = "page_example"; // String | Optional. Encoded page string returned from a previous search result that will retrieve   the next page of data.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfUserRoleResponse result = apiInstance.listUserRoles(filter, sortBy, limit, page).execute(opts);

            ResourceListOfUserRoleResponse result = apiInstance.listUserRoles(filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#listUserRoles");
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
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **page** | **String**| Optional. Encoded page string returned from a previous search result that will retrieve   the next page of data. | [optional] |

### Return type

[**ResourceListOfUserRoleResponse**](ResourceListOfUserRoleResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removePolicyCollectionFromUserRole

> removePolicyCollectionFromUserRole(userid, policyCollectionScope, policyCollectionCode)

RemovePolicyCollectionFromUserRole: Remove a policy collection from a user-role

Removes a policy collection from a user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the User Role to get
        String policyCollectionScope = "policyCollectionScope_example"; // String | The scope of policy collection to remove from the User Role
        String policyCollectionCode = "policyCollectionCode_example"; // String | The code of the policy collection to remove from the User Role
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.removePolicyCollectionFromUserRole(userid, policyCollectionScope, policyCollectionCode).execute(opts);

            apiInstance.removePolicyCollectionFromUserRole(userid, policyCollectionScope, policyCollectionCode).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#removePolicyCollectionFromUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **policyCollectionScope** | **String**| The scope of policy collection to remove from the User Role | |
| **policyCollectionCode** | **String**| The code of the policy collection to remove from the User Role | |

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


## removePolicyFromUserRole

> removePolicyFromUserRole(userid, policyScope, policyCode)

RemovePolicyFromUserRole: Remove a policy from a user-role

Removes a policy from a user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the User Role to get
        String policyScope = "policyScope_example"; // String | The scope of the policy to remove from the User Role
        String policyCode = "policyCode_example"; // String | The code of the policy to remove from the User Role
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.removePolicyFromUserRole(userid, policyScope, policyCode).execute(opts);

            apiInstance.removePolicyFromUserRole(userid, policyScope, policyCode).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#removePolicyFromUserRole");
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
| **userid** | **String**| Id of the User Role to get | |
| **policyScope** | **String**| The scope of the policy to remove from the User Role | |
| **policyCode** | **String**| The code of the policy to remove from the User Role | |

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


## updateUserRole

> UserRoleResponse updateUserRole(userid, userRoleUpdateRequest)

UpdateUserRole: Update a user-role

Updates an identified user-role.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.UserRolesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class UserRolesApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // UserRolesApi apiInstance = apiFactory.build(UserRolesApi.class);

        UserRolesApi apiInstance = ApiFactoryBuilder.build(fileName).build(UserRolesApi.class);
        String userid = "userid_example"; // String | Id of the user-role to be updated.
        UserRoleUpdateRequest userRoleUpdateRequest = new UserRoleUpdateRequest(); // UserRoleUpdateRequest | Definition of the update to apply to the user-role.
        try {
            // uncomment the below to set overrides at the request level
            // UserRoleResponse result = apiInstance.updateUserRole(userid, userRoleUpdateRequest).execute(opts);

            UserRoleResponse result = apiInstance.updateUserRole(userid, userRoleUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRolesApi#updateUserRole");
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
| **userid** | **String**| Id of the user-role to be updated. | |
| **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| Definition of the update to apply to the user-role. | |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role that has been updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

