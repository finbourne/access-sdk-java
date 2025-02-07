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



## createPolicyTemplate

> PolicyTemplateResponse createPolicyTemplate(policyTemplateCreationRequest)

[EXPERIMENTAL] CreatePolicyTemplate: Create a Policy Template

Creates a Policy Template

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PolicyTemplatesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PolicyTemplatesApiExample {

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
        // PolicyTemplatesApi apiInstance = apiFactory.build(PolicyTemplatesApi.class);

        PolicyTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PolicyTemplatesApi.class);
        PolicyTemplateCreationRequest policyTemplateCreationRequest = new PolicyTemplateCreationRequest(); // PolicyTemplateCreationRequest | The definition of the policy template
        try {
            // uncomment the below to set overrides at the request level
            // PolicyTemplateResponse result = apiInstance.createPolicyTemplate(policyTemplateCreationRequest).execute(opts);

            PolicyTemplateResponse result = apiInstance.createPolicyTemplate(policyTemplateCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyTemplatesApi#createPolicyTemplate");
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
| **policyTemplateCreationRequest** | [**PolicyTemplateCreationRequest**](PolicyTemplateCreationRequest.md)| The definition of the policy template | |

### Return type

[**PolicyTemplateResponse**](PolicyTemplateResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Policy Template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePolicyTemplate

> deletePolicyTemplate(code, scope)

[EXPERIMENTAL] DeletePolicyTemplate: Deleting a policy template

Deletes an identified Policy Template

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PolicyTemplatesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PolicyTemplatesApiExample {

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
        // PolicyTemplatesApi apiInstance = apiFactory.build(PolicyTemplatesApi.class);

        PolicyTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PolicyTemplatesApi.class);
        String code = "code_example"; // String | The code of the Policy Template
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy Template
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deletePolicyTemplate(code, scope).execute(opts);

            apiInstance.deletePolicyTemplate(code, scope).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyTemplatesApi#deletePolicyTemplate");
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
| **code** | **String**| The code of the Policy Template | |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy Template | [optional] |

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


## generatePolicyFromTemplate

> GeneratedPolicyComponents generatePolicyFromTemplate(generatePolicyFromTemplateRequest, asAt)

[EXPERIMENTAL] GeneratePolicyFromTemplate: Generate policy from template

Generates policies from templates

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PolicyTemplatesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PolicyTemplatesApiExample {

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
        // PolicyTemplatesApi apiInstance = apiFactory.build(PolicyTemplatesApi.class);

        PolicyTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PolicyTemplatesApi.class);
        GeneratePolicyFromTemplateRequest generatePolicyFromTemplateRequest = new GeneratePolicyFromTemplateRequest(); // GeneratePolicyFromTemplateRequest | Definition of the generate request
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        try {
            // uncomment the below to set overrides at the request level
            // GeneratedPolicyComponents result = apiInstance.generatePolicyFromTemplate(generatePolicyFromTemplateRequest, asAt).execute(opts);

            GeneratedPolicyComponents result = apiInstance.generatePolicyFromTemplate(generatePolicyFromTemplateRequest, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyTemplatesApi#generatePolicyFromTemplate");
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
| **generatePolicyFromTemplateRequest** | [**GeneratePolicyFromTemplateRequest**](GeneratePolicyFromTemplateRequest.md)| Definition of the generate request | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |

### Return type

[**GeneratedPolicyComponents**](GeneratedPolicyComponents.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPolicyTemplate

> PolicyTemplateResponse getPolicyTemplate(code, asAt, scope)

[EXPERIMENTAL] GetPolicyTemplate: Retrieving one Policy Template

Gets an identified Policy Template

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PolicyTemplatesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PolicyTemplatesApiExample {

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
        // PolicyTemplatesApi apiInstance = apiFactory.build(PolicyTemplatesApi.class);

        PolicyTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PolicyTemplatesApi.class);
        String code = "code_example"; // String | The code of the Policy Template
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data. If not specified defaults to current time
        String scope = "scope_example"; // String | Optional. Will use the default scope if not provided. The scope of the Policy Template
        try {
            // uncomment the below to set overrides at the request level
            // PolicyTemplateResponse result = apiInstance.getPolicyTemplate(code, asAt, scope).execute(opts);

            PolicyTemplateResponse result = apiInstance.getPolicyTemplate(code, asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyTemplatesApi#getPolicyTemplate");
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
| **code** | **String**| The code of the Policy Template | |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data. If not specified defaults to current time | [optional] |
| **scope** | **String**| Optional. Will use the default scope if not provided. The scope of the Policy Template | [optional] |

### Return type

[**PolicyTemplateResponse**](PolicyTemplateResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a specific Policy Template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPolicyTemplates

> ResourceListOfPolicyTemplateResponse listPolicyTemplates(asAt, sortBy, limit, filter, page)

[EXPERIMENTAL] ListPolicyTemplates: List Policy Templates

Gets all Policy Templates with pagination support.

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PolicyTemplatesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PolicyTemplatesApiExample {

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
        // PolicyTemplatesApi apiInstance = apiFactory.build(PolicyTemplatesApi.class);

        PolicyTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PolicyTemplatesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date time of the data
        String sortBy = "sortBy_example"; // String | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set
        String page = "page_example"; // String | Optional. Paging token returned from a previous result
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPolicyTemplateResponse result = apiInstance.listPolicyTemplates(asAt, sortBy, limit, filter, page).execute(opts);

            ResourceListOfPolicyTemplateResponse result = apiInstance.listPolicyTemplates(asAt, sortBy, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyTemplatesApi#listPolicyTemplates");
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
| **asAt** | **OffsetDateTime**| Optional. The AsAt date time of the data | [optional] |
| **sortBy** | **String**| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set | [optional] |
| **page** | **String**| Optional. Paging token returned from a previous result | [optional] |

### Return type

[**ResourceListOfPolicyTemplateResponse**](ResourceListOfPolicyTemplateResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Policy Templates |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePolicyTemplate

> PolicyTemplateResponse updatePolicyTemplate(code, policyTemplateUpdateRequest)

[EXPERIMENTAL] UpdatePolicyTemplate: Update a Policy Template

Updates an identified Policy Template

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.PolicyTemplatesApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PolicyTemplatesApiExample {

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
        // PolicyTemplatesApi apiInstance = apiFactory.build(PolicyTemplatesApi.class);

        PolicyTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(PolicyTemplatesApi.class);
        String code = "code_example"; // String | Code of the policy template to update
        PolicyTemplateUpdateRequest policyTemplateUpdateRequest = new PolicyTemplateUpdateRequest(); // PolicyTemplateUpdateRequest | Definition of the updated policy template
        try {
            // uncomment the below to set overrides at the request level
            // PolicyTemplateResponse result = apiInstance.updatePolicyTemplate(code, policyTemplateUpdateRequest).execute(opts);

            PolicyTemplateResponse result = apiInstance.updatePolicyTemplate(code, policyTemplateUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyTemplatesApi#updatePolicyTemplate");
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
| **code** | **String**| Code of the policy template to update | |
| **policyTemplateUpdateRequest** | [**PolicyTemplateUpdateRequest**](PolicyTemplateUpdateRequest.md)| Definition of the updated policy template | [optional] |

### Return type

[**PolicyTemplateResponse**](PolicyTemplateResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Policy Template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

