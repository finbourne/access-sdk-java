# PoliciesApi

All URIs are relative to *https://fbn-prd.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToPolicyCollection**](PoliciesApi.md#addToPolicyCollection) | **POST** /api/policycollections/{code}/add | AddToPolicyCollection: Add To PolicyCollection |
| [**createPolicy**](PoliciesApi.md#createPolicy) | **POST** /api/policies | CreatePolicy: Create Policy |
| [**createPolicyCollection**](PoliciesApi.md#createPolicyCollection) | **POST** /api/policycollections | CreatePolicyCollection: Create PolicyCollection |
| [**deletePolicy**](PoliciesApi.md#deletePolicy) | **DELETE** /api/policies/{code} | DeletePolicy: Delete Policy |
| [**deletePolicyCollection**](PoliciesApi.md#deletePolicyCollection) | **DELETE** /api/policycollections/{code} | DeletePolicyCollection: Delete PolicyCollection |
| [**evaluate**](PoliciesApi.md#evaluate) | **POST** /api/me | Evaluate: Run one or more evaluations |
| [**getOwnPolicies**](PoliciesApi.md#getOwnPolicies) | **GET** /api/me | GetOwnPolicies: Get policies of requesting user |
| [**getPolicy**](PoliciesApi.md#getPolicy) | **GET** /api/policies/{code} | GetPolicy: Get Policy |
| [**getPolicyCollection**](PoliciesApi.md#getPolicyCollection) | **GET** /api/policycollections/{code} | GetPolicyCollection: Get PolicyCollection |
| [**listPolicies**](PoliciesApi.md#listPolicies) | **GET** /api/policies | [EARLY ACCESS] ListPolicies: List Policies |
| [**listPolicyCollections**](PoliciesApi.md#listPolicyCollections) | **GET** /api/policycollections | ListPolicyCollections: List PolicyCollections |
| [**pagePolicies**](PoliciesApi.md#pagePolicies) | **GET** /api/policies/page | [EARLY ACCESS] PagePolicies: Page Policies |
| [**pagePolicyCollections**](PoliciesApi.md#pagePolicyCollections) | **GET** /api/policycollections/page | PagePolicyCollections: Page PolicyCollections |
| [**removeFromPolicyCollection**](PoliciesApi.md#removeFromPolicyCollection) | **POST** /api/policycollections/{code}/remove | RemoveFromPolicyCollection: Remove From PolicyCollection |
| [**updatePolicy**](PoliciesApi.md#updatePolicy) | **PUT** /api/policies/{code} | UpdatePolicy: Update Policy |
| [**updatePolicyCollection**](PoliciesApi.md#updatePolicyCollection) | **PUT** /api/policycollections/{code} | UpdatePolicyCollection: Update PolicyCollection |



## addToPolicyCollection

> PolicyCollectionResponse addToPolicyCollection(code, addToPolicyCollectionRequest, scope)

AddToPolicyCollection: Add To PolicyCollection

Add Policies and/or PolicyCollections to a PolicyCollection

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the PolicyCollection
        AddToPolicyCollectionRequest addToPolicyCollectionRequest = new AddToPolicyCollectionRequest(); // AddToPolicyCollectionRequest | Ids of the PolicyCollections and/or Policies to add to the PolicyCollection
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
        try {
            PolicyCollectionResponse result = apiInstance.addToPolicyCollection(code, addToPolicyCollectionRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#addToPolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **addToPolicyCollectionRequest** | [**AddToPolicyCollectionRequest**](AddToPolicyCollectionRequest.md)| Ids of the PolicyCollections and/or Policies to add to the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createPolicy

> PolicyResponse createPolicy(policyCreationRequest)

CreatePolicy: Create Policy

Creates a Policy

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        PolicyCreationRequest policyCreationRequest = new PolicyCreationRequest(); // PolicyCreationRequest | The definition of the Policy
        try {
            PolicyResponse result = apiInstance.createPolicy(policyCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#createPolicy");
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
| **policyCreationRequest** | [**PolicyCreationRequest**](PolicyCreationRequest.md)| The definition of the Policy | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createPolicyCollection

> PolicyCollectionResponse createPolicyCollection(policyCollectionCreationRequest)

CreatePolicyCollection: Create PolicyCollection

Creates a PolicyCollection

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        PolicyCollectionCreationRequest policyCollectionCreationRequest = new PolicyCollectionCreationRequest(); // PolicyCollectionCreationRequest | The definition of the PolicyCollection
        try {
            PolicyCollectionResponse result = apiInstance.createPolicyCollection(policyCollectionCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#createPolicyCollection");
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
| **policyCollectionCreationRequest** | [**PolicyCollectionCreationRequest**](PolicyCollectionCreationRequest.md)| The definition of the PolicyCollection | |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePolicy

> deletePolicy(code, scope)

DeletePolicy: Delete Policy

Deletes an identified Policy

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the Policy
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy
        try {
            apiInstance.deletePolicy(code, scope).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#deletePolicy");
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
| **code** | **String**| The code of the Policy | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy | [optional] |

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


## deletePolicyCollection

> deletePolicyCollection(code, scope)

DeletePolicyCollection: Delete PolicyCollection

Deletes an identified PolicyCollection

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the PolicyCollection
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
        try {
            apiInstance.deletePolicyCollection(code, scope).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#deletePolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

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


## evaluate

> Map&lt;String, EvaluationResponse&gt; evaluate(requestBody, applications, asAt)

Evaluate: Run one or more evaluations

Given a dictionary of evaluation requests (keyed by any arbitrary correlation identifier), each will be evaluated according to the current user&#39;s policies (deduced from the provided OAuth token).

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        Map<String, EvaluationRequest> requestBody = new HashMap(); // Map<String, EvaluationRequest> | A dictionary of evaluations, keyed using any arbitrary correlation id (it will be returned with the response for that evaluation).
        List<String> applications = Arrays.asList(); // List<String> | Optional. The application type of the roles and policies to use when evaluating.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The requested AsAt date of the entitlements
        try {
            Map<String, EvaluationResponse> result = apiInstance.evaluate(requestBody, applications, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#evaluate");
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
| **requestBody** | [**Map&lt;String, EvaluationRequest&gt;**](EvaluationRequest.md)| A dictionary of evaluations, keyed using any arbitrary correlation id (it will be returned with the response for that evaluation). | |
| **applications** | [**List&lt;String&gt;**](String.md)| Optional. The application type of the roles and policies to use when evaluating. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The requested AsAt date of the entitlements | [optional] |

### Return type

[**Map&lt;String, EvaluationResponse&gt;**](EvaluationResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Run an evaluation against the current user&#39;s entitlements |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getOwnPolicies

> List&lt;AttachedPolicyDefinitionResponse&gt; getOwnPolicies(applications, asAt, sortBy, start, limit, filter)

GetOwnPolicies: Get policies of requesting user

Gets all Policies for the current user

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        List<String> applications = Arrays.asList(); // List<String> | Optional. Filter on the applications that the policies apply to
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer start = 56; // Integer | Optional. When paginating, skip this number of results
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        try {
            List<AttachedPolicyDefinitionResponse> result = apiInstance.getOwnPolicies(applications, asAt, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#getOwnPolicies");
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
| **applications** | [**List&lt;String&gt;**](String.md)| Optional. Filter on the applications that the policies apply to | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;AttachedPolicyDefinitionResponse&gt;**](AttachedPolicyDefinitionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get policies and licences of current user |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPolicy

> PolicyResponse getPolicy(code, asAt, scope)

GetPolicy: Get Policy

Gets an identified Policy

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the Policy
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy
        try {
            PolicyResponse result = apiInstance.getPolicy(code, asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#getPolicy");
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
| **code** | **String**| The code of the Policy | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy | [optional] |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a specific Policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPolicyCollection

> PolicyCollectionResponse getPolicyCollection(code, asAt, scope)

GetPolicyCollection: Get PolicyCollection

Gets an identified PolicyCollection

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the PolicyCollection
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
        try {
            PolicyCollectionResponse result = apiInstance.getPolicyCollection(code, asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#getPolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPolicies

> List&lt;PolicyResponse&gt; listPolicies(scope, asAt, sortBy, start, limit, filter)

[EARLY ACCESS] ListPolicies: List Policies

Gets all Policies in a scope. For pagination support, use PagePolicies.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The requested scope
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer start = 56; // Integer | Optional. When paginating, skip this number of results
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        try {
            List<PolicyResponse> result = apiInstance.listPolicies(scope, asAt, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#listPolicies");
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
| **scope** | **String**| Optional. Will use the default scope if not provided. The requested scope | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;PolicyResponse&gt;**](PolicyResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Policies |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPolicyCollections

> List&lt;PolicyCollectionResponse&gt; listPolicyCollections(scope, asAt, sortBy, start, limit, filter)

ListPolicyCollections: List PolicyCollections

Gets all PolicyCollections in a scope. For pagination support, use PagePolicyCollections

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The requested scope
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer start = 56; // Integer | Optional. When paginating, skip this number of results
        Integer limit = 56; // Integer | Optional. 2000 if not provided. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        try {
            List<PolicyCollectionResponse> result = apiInstance.listPolicyCollections(scope, asAt, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#listPolicyCollections");
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
| **scope** | **String**| Optional. Will use the default scope if not provided. The requested scope | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. 2000 if not provided. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;PolicyCollectionResponse&gt;**](PolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested list of PolicyCollections |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## pagePolicies

> ResourceListOfPolicyResponse pagePolicies(asAt, sortBy, limit, filter, page)

[EARLY ACCESS] PagePolicies: Page Policies

Gets all Policies with pagination support.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Not currently used. The AsAt date time of the data
        String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. 2000 if not provided. When paginating, limit the number of returned results to this many
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        String page = "page_example"; // String | Optional. Paging token returned from a previous result
        try {
            ResourceListOfPolicyResponse result = apiInstance.pagePolicies(asAt, sortBy, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#pagePolicies");
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
| **asAt** | **OffsetDateTime**| Optional. Not currently used. The AsAt date time of the data | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. 2000 if not provided. When paginating, limit the number of returned results to this many | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **page** | **String**| Optional. Paging token returned from a previous result | [optional] |

### Return type

[**ResourceListOfPolicyResponse**](ResourceListOfPolicyResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested list of Policies |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## pagePolicyCollections

> ResourceListOfPolicyCollectionResponse pagePolicyCollections(asAt, sortBy, limit, filter, page)

PagePolicyCollections: Page PolicyCollections

Gets all PolicyCollections with pagination support.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Not currently used. The AsAt date time of the data
        String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. 2000 if not provided. When paginating, limit the number of returned results to this many
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        String page = "page_example"; // String | Optional. Paging token returned from a previous result
        try {
            ResourceListOfPolicyCollectionResponse result = apiInstance.pagePolicyCollections(asAt, sortBy, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#pagePolicyCollections");
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
| **asAt** | **OffsetDateTime**| Optional. Not currently used. The AsAt date time of the data | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. 2000 if not provided. When paginating, limit the number of returned results to this many | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **page** | **String**| Optional. Paging token returned from a previous result | [optional] |

### Return type

[**ResourceListOfPolicyCollectionResponse**](ResourceListOfPolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested list of PolicyCollections |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removeFromPolicyCollection

> PolicyCollectionResponse removeFromPolicyCollection(code, removeFromPolicyCollectionRequest, scope)

RemoveFromPolicyCollection: Remove From PolicyCollection

Remove Policies and/or PolicyCollections from a PolicyCollection

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the PolicyCollection
        RemoveFromPolicyCollectionRequest removeFromPolicyCollectionRequest = new RemoveFromPolicyCollectionRequest(); // RemoveFromPolicyCollectionRequest | Ids of the PolicyCollections and/or Policies to remove from the PolicyCollection
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
        try {
            PolicyCollectionResponse result = apiInstance.removeFromPolicyCollection(code, removeFromPolicyCollectionRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#removeFromPolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **removeFromPolicyCollectionRequest** | [**RemoveFromPolicyCollectionRequest**](RemoveFromPolicyCollectionRequest.md)| Ids of the PolicyCollections and/or Policies to remove from the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePolicy

> PolicyResponse updatePolicy(code, policyUpdateRequest, scope)

UpdatePolicy: Update Policy

Updates a Policy

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the Policy
        PolicyUpdateRequest policyUpdateRequest = new PolicyUpdateRequest(); // PolicyUpdateRequest | The updated definition of the Policy
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy
        try {
            PolicyResponse result = apiInstance.updatePolicy(code, policyUpdateRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#updatePolicy");
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
| **code** | **String**| The code of the Policy | |
| **policyUpdateRequest** | [**PolicyUpdateRequest**](PolicyUpdateRequest.md)| The updated definition of the Policy | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy | [optional] |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePolicyCollection

> PolicyCollectionResponse updatePolicyCollection(code, policyCollectionUpdateRequest, scope)

UpdatePolicyCollection: Update PolicyCollection

Updates a PolicyCollection

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PoliciesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PoliciesApiExample {

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

        PoliciesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PoliciesApi.class);
        String code = "code_example"; // String | The code of the PolicyCollection
        PolicyCollectionUpdateRequest policyCollectionUpdateRequest = new PolicyCollectionUpdateRequest(); // PolicyCollectionUpdateRequest | The updated definition of the PolicyCollection
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
        try {
            PolicyCollectionResponse result = apiInstance.updatePolicyCollection(code, policyCollectionUpdateRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PoliciesApi#updatePolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **policyCollectionUpdateRequest** | [**PolicyCollectionUpdateRequest**](PolicyCollectionUpdateRequest.md)| The updated definition of the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

