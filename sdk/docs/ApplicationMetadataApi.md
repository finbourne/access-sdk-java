# ApplicationMetadataApi

All URIs are relative to *https://fbn-prd.lusid.com/access*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAccessControlledResources**](ApplicationMetadataApi.md#listAccessControlledResources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control |



## listAccessControlledResources

> ResourceListOfAccessControlledResource listAccessControlledResources()

ListAccessControlledResources: Get resources available for access control

Get the comprehensive set of resources that are available for access control

### Example

```java
import com.finbourne.access.model.*;
import com.finbourne.access.api.ApplicationMetadataApi;
import com.finbourne.access.extensions.ApiConfigurationException;
import com.finbourne.access.extensions.ApiFactoryBuilder;
import com.finbourne.access.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ApplicationMetadataApiExample {

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
        // ApplicationMetadataApi apiInstance = apiFactory.build(ApplicationMetadataApi.class);

        ApplicationMetadataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ApplicationMetadataApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources().execute(opts);

            ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationMetadataApi#listAccessControlledResources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResourceListOfAccessControlledResource**](ResourceListOfAccessControlledResource.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

