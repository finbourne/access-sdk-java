# PoliciesApi

All URIs are relative to *https://fbn-ci.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToPolicyCollection**](PoliciesApi.md#addToPolicyCollection) | **POST** /api/policycollections/{code}/add | [EARLY ACCESS] AddToPolicyCollection: Add To PolicyCollection |
| [**createPolicy**](PoliciesApi.md#createPolicy) | **POST** /api/policies | [EARLY ACCESS] CreatePolicy: Create Policy |
| [**createPolicyCollection**](PoliciesApi.md#createPolicyCollection) | **POST** /api/policycollections | [EARLY ACCESS] CreatePolicyCollection: Create PolicyCollection |
| [**deletePolicy**](PoliciesApi.md#deletePolicy) | **DELETE** /api/policies/{code} | [EARLY ACCESS] DeletePolicy: Delete Policy |
| [**deletePolicyCollection**](PoliciesApi.md#deletePolicyCollection) | **DELETE** /api/policycollections/{code} | [EARLY ACCESS] DeletePolicyCollection: Delete PolicyCollection |
| [**evaluate**](PoliciesApi.md#evaluate) | **POST** /api/me | [EARLY ACCESS] Evaluate: Run one or more evaluations |
| [**getOwnPolicies**](PoliciesApi.md#getOwnPolicies) | **GET** /api/me | GetOwnPolicies: Get policies of requesting user |
| [**getPolicy**](PoliciesApi.md#getPolicy) | **GET** /api/policies/{code} | [EARLY ACCESS] GetPolicy: Get Policy |
| [**getPolicyCollection**](PoliciesApi.md#getPolicyCollection) | **GET** /api/policycollections/{code} | [EARLY ACCESS] GetPolicyCollection: Get PolicyCollection |
| [**listPolicies**](PoliciesApi.md#listPolicies) | **GET** /api/policies | [EARLY ACCESS] ListPolicies: List Policies |
| [**listPolicyCollections**](PoliciesApi.md#listPolicyCollections) | **GET** /api/policycollections | [EARLY ACCESS] ListPolicyCollections: List PolicyCollections |
| [**pagePolicies**](PoliciesApi.md#pagePolicies) | **GET** /api/policies/page | [EARLY ACCESS] PagePolicies: Page Policies |
| [**pagePolicyCollections**](PoliciesApi.md#pagePolicyCollections) | **GET** /api/policycollections/page | [EARLY ACCESS] PagePolicyCollections: Page PolicyCollections |
| [**removeFromPolicyCollection**](PoliciesApi.md#removeFromPolicyCollection) | **POST** /api/policycollections/{code}/remove | [EARLY ACCESS] RemoveFromPolicyCollection: Remove From PolicyCollection |
| [**updatePolicy**](PoliciesApi.md#updatePolicy) | **PUT** /api/policies/{code} | [EARLY ACCESS] UpdatePolicy: Update Policy |
| [**updatePolicyCollection**](PoliciesApi.md#updatePolicyCollection) | **PUT** /api/policycollections/{code} | [EARLY ACCESS] UpdatePolicyCollection: Update PolicyCollection |


<a id="addToPolicyCollection"></a>
# **addToPolicyCollection**
> PolicyCollectionResponse addToPolicyCollection(code, addToPolicyCollectionRequest).scope(scope).execute();

[EARLY ACCESS] AddToPolicyCollection: Add To PolicyCollection

Add Policies and/or PolicyCollections to a PolicyCollection

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the PolicyCollection
    AddToPolicyCollectionRequest addToPolicyCollectionRequest = new AddToPolicyCollectionRequest(); // AddToPolicyCollectionRequest | Ids of the PolicyCollections and/or Policies to add to the PolicyCollection
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
    try {
      PolicyCollectionResponse result = apiInstance.addToPolicyCollection(code, addToPolicyCollectionRequest)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#addToPolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **addToPolicyCollectionRequest** | [**AddToPolicyCollectionRequest**](AddToPolicyCollectionRequest.md)| Ids of the PolicyCollections and/or Policies to add to the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createPolicy"></a>
# **createPolicy**
> PolicyResponse createPolicy(policyCreationRequest).execute();

[EARLY ACCESS] CreatePolicy: Create Policy

Creates a Policy

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    PolicyCreationRequest policyCreationRequest = new PolicyCreationRequest(); // PolicyCreationRequest | The definition of the Policy
    try {
      PolicyResponse result = apiInstance.createPolicy(policyCreationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#createPolicy");
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
| **policyCreationRequest** | [**PolicyCreationRequest**](PolicyCreationRequest.md)| The definition of the Policy | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createPolicyCollection"></a>
# **createPolicyCollection**
> PolicyCollectionResponse createPolicyCollection(policyCollectionCreationRequest).execute();

[EARLY ACCESS] CreatePolicyCollection: Create PolicyCollection

Creates a PolicyCollection

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    PolicyCollectionCreationRequest policyCollectionCreationRequest = new PolicyCollectionCreationRequest(); // PolicyCollectionCreationRequest | The definition of the PolicyCollection
    try {
      PolicyCollectionResponse result = apiInstance.createPolicyCollection(policyCollectionCreationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#createPolicyCollection");
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
| **policyCollectionCreationRequest** | [**PolicyCollectionCreationRequest**](PolicyCollectionCreationRequest.md)| The definition of the PolicyCollection | |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(code).scope(scope).execute();

[EARLY ACCESS] DeletePolicy: Delete Policy

Deletes an identified Policy

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the Policy
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy
    try {
      apiInstance.deletePolicy(code)
            .scope(scope)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#deletePolicy");
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
| **code** | **String**| The code of the Policy | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy | [optional] |

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

<a id="deletePolicyCollection"></a>
# **deletePolicyCollection**
> deletePolicyCollection(code).scope(scope).execute();

[EARLY ACCESS] DeletePolicyCollection: Delete PolicyCollection

Deletes an identified PolicyCollection

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the PolicyCollection
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
    try {
      apiInstance.deletePolicyCollection(code)
            .scope(scope)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#deletePolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

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

<a id="evaluate"></a>
# **evaluate**
> Map&lt;String, EvaluationResponse&gt; evaluate(requestBody).applications(applications).asAt(asAt).execute();

[EARLY ACCESS] Evaluate: Run one or more evaluations

Given a dictionary of evaluation requests (keyed by any arbitrary correlation identifier), each will be evaluated according to the current user&#39;s policies (deduced from the provided OAuth token).

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    Map<String, EvaluationRequest> requestBody = new HashMap(); // Map<String, EvaluationRequest> | A dictionary of evaluations, keyed using any arbitrary correlation id (it will be returned with the response for that evaluation).
    List<String> applications = Arrays.asList(); // List<String> | Optional. The application type of the roles and policies to use when evaluating.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The requested AsAt date of the entitlements
    try {
      Map<String, EvaluationResponse> result = apiInstance.evaluate(requestBody)
            .applications(applications)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#evaluate");
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
| **requestBody** | [**Map&lt;String, EvaluationRequest&gt;**](EvaluationRequest.md)| A dictionary of evaluations, keyed using any arbitrary correlation id (it will be returned with the response for that evaluation). | |
| **applications** | [**List&lt;String&gt;**](String.md)| Optional. The application type of the roles and policies to use when evaluating. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The requested AsAt date of the entitlements | [optional] |

### Return type

[**Map&lt;String, EvaluationResponse&gt;**](EvaluationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Run an evaluation against the current user&#39;s entitlements |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getOwnPolicies"></a>
# **getOwnPolicies**
> List&lt;AttachedPolicyDefinitionResponse&gt; getOwnPolicies().applications(applications).asAt(asAt).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

GetOwnPolicies: Get policies of requesting user

Gets all Policies for the current user

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    List<String> applications = Arrays.asList(); // List<String> | Optional. Filter on the applications that the policies apply to
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      List<AttachedPolicyDefinitionResponse> result = apiInstance.getOwnPolicies()
            .applications(applications)
            .asAt(asAt)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#getOwnPolicies");
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
| **applications** | [**List&lt;String&gt;**](String.md)| Optional. Filter on the applications that the policies apply to | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;AttachedPolicyDefinitionResponse&gt;**](AttachedPolicyDefinitionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get policies and licences of current user |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPolicy"></a>
# **getPolicy**
> PolicyResponse getPolicy(code).asAt(asAt).scope(scope).execute();

[EARLY ACCESS] GetPolicy: Get Policy

Gets an identified Policy

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the Policy
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy
    try {
      PolicyResponse result = apiInstance.getPolicy(code)
            .asAt(asAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#getPolicy");
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
| **code** | **String**| The code of the Policy | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy | [optional] |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a specific Policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPolicyCollection"></a>
# **getPolicyCollection**
> PolicyCollectionResponse getPolicyCollection(code).asAt(asAt).scope(scope).execute();

[EARLY ACCESS] GetPolicyCollection: Get PolicyCollection

Gets an identified PolicyCollection

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the PolicyCollection
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
    try {
      PolicyCollectionResponse result = apiInstance.getPolicyCollection(code)
            .asAt(asAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#getPolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPolicies"></a>
# **listPolicies**
> List&lt;PolicyResponse&gt; listPolicies().scope(scope).asAt(asAt).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EARLY ACCESS] ListPolicies: List Policies

Gets all Policies in a scope. For pagination support, use PagePolicies.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The requested scope
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      List<PolicyResponse> result = apiInstance.listPolicies()
            .scope(scope)
            .asAt(asAt)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#listPolicies");
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
| **scope** | **String**| Optional. Will use the default scope if not provided. The requested scope | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;PolicyResponse&gt;**](PolicyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Policies |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPolicyCollections"></a>
# **listPolicyCollections**
> List&lt;PolicyCollectionResponse&gt; listPolicyCollections().scope(scope).asAt(asAt).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EARLY ACCESS] ListPolicyCollections: List PolicyCollections

Gets all PolicyCollections in a scope. For pagination support, use PagePolicyCollections

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The requested scope
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. 2000 if not provided. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      List<PolicyCollectionResponse> result = apiInstance.listPolicyCollections()
            .scope(scope)
            .asAt(asAt)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#listPolicyCollections");
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
| **scope** | **String**| Optional. Will use the default scope if not provided. The requested scope | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. 2000 if not provided. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |

### Return type

[**List&lt;PolicyCollectionResponse&gt;**](PolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested list of PolicyCollections |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="pagePolicies"></a>
# **pagePolicies**
> ResourceListOfPolicyResponse pagePolicies().asAt(asAt).sortBy(sortBy).limit(limit).filter(filter).page(page).execute();

[EARLY ACCESS] PagePolicies: Page Policies

Gets all Policies with pagination support.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Not currently used. The AsAt date time of the data
    String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
    Integer limit = 56; // Integer | Optional. 2000 if not provided. When paginating, limit the number of returned results to this many
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    String page = "page_example"; // String | Optional. Paging token returned from a previous result
    try {
      ResourceListOfPolicyResponse result = apiInstance.pagePolicies()
            .asAt(asAt)
            .sortBy(sortBy)
            .limit(limit)
            .filter(filter)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#pagePolicies");
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
| **asAt** | **OffsetDateTime**| Optional. Not currently used. The AsAt date time of the data | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. 2000 if not provided. When paginating, limit the number of returned results to this many | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **page** | **String**| Optional. Paging token returned from a previous result | [optional] |

### Return type

[**ResourceListOfPolicyResponse**](ResourceListOfPolicyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested list of Policies |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="pagePolicyCollections"></a>
# **pagePolicyCollections**
> ResourceListOfPolicyCollectionResponse pagePolicyCollections().asAt(asAt).sortBy(sortBy).limit(limit).filter(filter).page(page).execute();

[EARLY ACCESS] PagePolicyCollections: Page PolicyCollections

Gets all PolicyCollections with pagination support.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Not currently used. The AsAt date time of the data
    String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
    Integer limit = 56; // Integer | Optional. 2000 if not provided. When paginating, limit the number of returned results to this many
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    String page = "page_example"; // String | Optional. Paging token returned from a previous result
    try {
      ResourceListOfPolicyCollectionResponse result = apiInstance.pagePolicyCollections()
            .asAt(asAt)
            .sortBy(sortBy)
            .limit(limit)
            .filter(filter)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#pagePolicyCollections");
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
| **asAt** | **OffsetDateTime**| Optional. Not currently used. The AsAt date time of the data | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. 2000 if not provided. When paginating, limit the number of returned results to this many | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **page** | **String**| Optional. Paging token returned from a previous result | [optional] |

### Return type

[**ResourceListOfPolicyCollectionResponse**](ResourceListOfPolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested list of PolicyCollections |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="removeFromPolicyCollection"></a>
# **removeFromPolicyCollection**
> PolicyCollectionResponse removeFromPolicyCollection(code, removeFromPolicyCollectionRequest).scope(scope).execute();

[EARLY ACCESS] RemoveFromPolicyCollection: Remove From PolicyCollection

Remove Policies and/or PolicyCollections from a PolicyCollection

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the PolicyCollection
    RemoveFromPolicyCollectionRequest removeFromPolicyCollectionRequest = new RemoveFromPolicyCollectionRequest(); // RemoveFromPolicyCollectionRequest | Ids of the PolicyCollections and/or Policies to remove from the PolicyCollection
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
    try {
      PolicyCollectionResponse result = apiInstance.removeFromPolicyCollection(code, removeFromPolicyCollectionRequest)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#removeFromPolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **removeFromPolicyCollectionRequest** | [**RemoveFromPolicyCollectionRequest**](RemoveFromPolicyCollectionRequest.md)| Ids of the PolicyCollections and/or Policies to remove from the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updatePolicy"></a>
# **updatePolicy**
> PolicyResponse updatePolicy(code, policyUpdateRequest).scope(scope).execute();

[EARLY ACCESS] UpdatePolicy: Update Policy

Updates a Policy

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the Policy
    PolicyUpdateRequest policyUpdateRequest = new PolicyUpdateRequest(); // PolicyUpdateRequest | The updated definition of the Policy
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy
    try {
      PolicyResponse result = apiInstance.updatePolicy(code, policyUpdateRequest)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#updatePolicy");
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
| **code** | **String**| The code of the Policy | |
| **policyUpdateRequest** | [**PolicyUpdateRequest**](PolicyUpdateRequest.md)| The updated definition of the Policy | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy | [optional] |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updatePolicyCollection"></a>
# **updatePolicyCollection**
> PolicyCollectionResponse updatePolicyCollection(code, policyCollectionUpdateRequest).scope(scope).execute();

[EARLY ACCESS] UpdatePolicyCollection: Update PolicyCollection

Updates a PolicyCollection

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String code = "code_example"; // String | The code of the PolicyCollection
    PolicyCollectionUpdateRequest policyCollectionUpdateRequest = new PolicyCollectionUpdateRequest(); // PolicyCollectionUpdateRequest | The updated definition of the PolicyCollection
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the PolicyCollection
    try {
      PolicyCollectionResponse result = apiInstance.updatePolicyCollection(code, policyCollectionUpdateRequest)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#updatePolicyCollection");
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
| **code** | **String**| The code of the PolicyCollection | |
| **policyCollectionUpdateRequest** | [**PolicyCollectionUpdateRequest**](PolicyCollectionUpdateRequest.md)| The updated definition of the PolicyCollection | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the PolicyCollection | [optional] |

### Return type

[**PolicyCollectionResponse**](PolicyCollectionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated PolicyCollection |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

