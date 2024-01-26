# PolicyTemplatesApi

All URIs are relative to *https://fbn-prd.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPolicyTemplate**](PolicyTemplatesApi.md#createPolicyTemplate) | **POST** /api/policytemplates | [EXPERIMENTAL] CreatePolicyTemplate: Create a Policy Template |
| [**deletePolicyTemplate**](PolicyTemplatesApi.md#deletePolicyTemplate) | **DELETE** /api/policytemplates/{code} | [EXPERIMENTAL] DeletePolicyTemplate: Deleting a policy template |
| [**generatePolicyFromTemplate**](PolicyTemplatesApi.md#generatePolicyFromTemplate) | **POST** /api/policytemplates/$generatepolicy | [EXPERIMENTAL] GeneratePolicyFromTemplate: Generate policy from template |
| [**getPolicyTemplate**](PolicyTemplatesApi.md#getPolicyTemplate) | **GET** /api/policytemplates/{code} | [EXPERIMENTAL] GetPolicyTemplate: Retrieving one Policy Template |
| [**listPolicyTemplates**](PolicyTemplatesApi.md#listPolicyTemplates) | **GET** /api/policytemplates | [EXPERIMENTAL] ListPolicyTemplates: List Policy Templates |
| [**updatePolicyTemplate**](PolicyTemplatesApi.md#updatePolicyTemplate) | **PUT** /api/policytemplates/{code} | [EXPERIMENTAL] UpdatePolicyTemplate: Update a Policy Template |


<a id="createPolicyTemplate"></a>
# **createPolicyTemplate**
> PolicyTemplateResponse createPolicyTemplate(policyTemplateCreationRequest).execute();

[EXPERIMENTAL] CreatePolicyTemplate: Create a Policy Template

Creates a Policy Template

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PolicyTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PolicyTemplatesApi apiInstance = new PolicyTemplatesApi(defaultClient);
    PolicyTemplateCreationRequest policyTemplateCreationRequest = new PolicyTemplateCreationRequest(); // PolicyTemplateCreationRequest | The definition of the policy template
    try {
      PolicyTemplateResponse result = apiInstance.createPolicyTemplate(policyTemplateCreationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyTemplatesApi#createPolicyTemplate");
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
| **policyTemplateCreationRequest** | [**PolicyTemplateCreationRequest**](PolicyTemplateCreationRequest.md)| The definition of the policy template | |

### Return type

[**PolicyTemplateResponse**](PolicyTemplateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Policy Template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePolicyTemplate"></a>
# **deletePolicyTemplate**
> deletePolicyTemplate(code).scope(scope).execute();

[EXPERIMENTAL] DeletePolicyTemplate: Deleting a policy template

Deletes an identified Policy Template

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PolicyTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PolicyTemplatesApi apiInstance = new PolicyTemplatesApi(defaultClient);
    String code = "code_example"; // String | The code of the Policy Template
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy Template
    try {
      apiInstance.deletePolicyTemplate(code)
            .scope(scope)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyTemplatesApi#deletePolicyTemplate");
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
| **code** | **String**| The code of the Policy Template | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy Template | [optional] |

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

<a id="generatePolicyFromTemplate"></a>
# **generatePolicyFromTemplate**
> GeneratedPolicyComponents generatePolicyFromTemplate(generatePolicyFromTemplateRequest).asAt(asAt).execute();

[EXPERIMENTAL] GeneratePolicyFromTemplate: Generate policy from template

Generates policies from templates

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PolicyTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PolicyTemplatesApi apiInstance = new PolicyTemplatesApi(defaultClient);
    GeneratePolicyFromTemplateRequest generatePolicyFromTemplateRequest = new GeneratePolicyFromTemplateRequest(); // GeneratePolicyFromTemplateRequest | Definition of the generate request
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    try {
      GeneratedPolicyComponents result = apiInstance.generatePolicyFromTemplate(generatePolicyFromTemplateRequest)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyTemplatesApi#generatePolicyFromTemplate");
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
| **generatePolicyFromTemplateRequest** | [**GeneratePolicyFromTemplateRequest**](GeneratePolicyFromTemplateRequest.md)| Definition of the generate request | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |

### Return type

[**GeneratedPolicyComponents**](GeneratedPolicyComponents.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPolicyTemplate"></a>
# **getPolicyTemplate**
> PolicyTemplateResponse getPolicyTemplate(code).asAt(asAt).scope(scope).execute();

[EXPERIMENTAL] GetPolicyTemplate: Retrieving one Policy Template

Gets an identified Policy Template

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PolicyTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PolicyTemplatesApi apiInstance = new PolicyTemplatesApi(defaultClient);
    String code = "code_example"; // String | The code of the Policy Template
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data. If not specified defaults to current time
    String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy Template
    try {
      PolicyTemplateResponse result = apiInstance.getPolicyTemplate(code)
            .asAt(asAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyTemplatesApi#getPolicyTemplate");
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
| **code** | **String**| The code of the Policy Template | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data. If not specified defaults to current time | [optional] |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy Template | [optional] |

### Return type

[**PolicyTemplateResponse**](PolicyTemplateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a specific Policy Template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPolicyTemplates"></a>
# **listPolicyTemplates**
> ResourceListOfPolicyTemplateResponse listPolicyTemplates().asAt(asAt).sortBy(sortBy).limit(limit).filter(filter).page(page).execute();

[EXPERIMENTAL] ListPolicyTemplates: List Policy Templates

Gets all Policy Templates with pagination support.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PolicyTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PolicyTemplatesApi apiInstance = new PolicyTemplatesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
    String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    String page = "page_example"; // String | Optional. Paging token returned from a previous result
    try {
      ResourceListOfPolicyTemplateResponse result = apiInstance.listPolicyTemplates()
            .asAt(asAt)
            .sortBy(sortBy)
            .limit(limit)
            .filter(filter)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyTemplatesApi#listPolicyTemplates");
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
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **page** | **String**| Optional. Paging token returned from a previous result | [optional] |

### Return type

[**ResourceListOfPolicyTemplateResponse**](ResourceListOfPolicyTemplateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Policy Templates |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updatePolicyTemplate"></a>
# **updatePolicyTemplate**
> PolicyTemplateResponse updatePolicyTemplate(code).policyTemplateUpdateRequest(policyTemplateUpdateRequest).execute();

[EXPERIMENTAL] UpdatePolicyTemplate: Update a Policy Template

Updates an identified Policy Template

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.PolicyTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PolicyTemplatesApi apiInstance = new PolicyTemplatesApi(defaultClient);
    String code = "code_example"; // String | Code of the policy template to update
    PolicyTemplateUpdateRequest policyTemplateUpdateRequest = new PolicyTemplateUpdateRequest(); // PolicyTemplateUpdateRequest | Definition of the updated policy template
    try {
      PolicyTemplateResponse result = apiInstance.updatePolicyTemplate(code)
            .policyTemplateUpdateRequest(policyTemplateUpdateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyTemplatesApi#updatePolicyTemplate");
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
| **code** | **String**| Code of the policy template to update | |
| **policyTemplateUpdateRequest** | [**PolicyTemplateUpdateRequest**](PolicyTemplateUpdateRequest.md)| Definition of the updated policy template | [optional] |

### Return type

[**PolicyTemplateResponse**](PolicyTemplateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Policy Template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

