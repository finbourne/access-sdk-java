# ApplicationMetadataApi

All URIs are relative to *https://fbn-prd.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAccessControlledResources**](ApplicationMetadataApi.md#listAccessControlledResources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control |


<a id="listAccessControlledResources"></a>
# **listAccessControlledResources**
> ResourceListOfAccessControlledResource listAccessControlledResources().execute();

ListAccessControlledResources: Get resources available for access control

Get the comprehensive set of resources that are available for access control

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.ApplicationMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationMetadataApi apiInstance = new ApplicationMetadataApi(defaultClient);
    try {
      ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationMetadataApi#listAccessControlledResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfAccessControlledResource**](ResourceListOfAccessControlledResource.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

