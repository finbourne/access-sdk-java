package com.finbourne.access.extensions;

import com.finbourne.access.ApiClient;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
* Utility class that builds pre-configured lusidAccess API instances to access lusidAccess.
*
*/
public class ApiFactory {


    /**
    * The unique package that hosts all the lusidAccess API classes
    */
    public static final String API_PACKAGE = "com.finbourne.lusid-access.api";

    private final ApiClient apiClient;
    private final Map<Class, Object> initialisedApis;

    /**
    * Create a API factory based on an {@link ApiClient}
    *
    * @param apiClient configured to a specific application
    */
    public ApiFactory(ApiClient apiClient) {
        this.apiClient = apiClient;
        initialisedApis = new HashMap<>();
    }

    /**
    * Builds an instance of a lusidAccess API 
    *
    * For each instance of an {@link ApiFactory} only a singleton instance of each lusidAccess API class exist. The APIs
    * are lazily initialised on request.
    *
    *
    * @param apiClass - class of the lusidAccess API to create
    * @param <T> lusidAccess API type
    * @return instance of the lusidAccess API type configured as per the {@link ApiClient}
    *
    * @throws UnsupportedOperationException is the apiClass does not belong to the import com.finbourne.lusid-access.api package or
    * if the class has no constructor that accepts an {@link ApiClient} parameter.
    */
    public synchronized <T> T build(Class<T> apiClass) {
        @SuppressWarnings (value="unchecked")
        T apiInstance = (T) initialisedApis.get(apiClass);
        if (apiInstance == null) {
            checkIsSupportedApiClass(apiClass);
            Constructor<T> constructor = getApiConstructor(apiClass);
            apiInstance = createInstance(constructor);
            initialisedApis.put(apiClass, apiInstance);
        }
        return apiInstance;
    };

    /*
    * Create an instance of a lusidAccess API configured by an {@link ApiClient}
    *
    * @throws UnsupportedOperationException on any reflection related issues on constructing the lusidAccess API object
    */
    private <T> T createInstance(Constructor<T> constructor){
        try {
            return constructor.newInstance(apiClient);
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException("Construction of " + constructor.getClass().getName() + " failed " +
                    "due to an invalid instantiation call.",e);
        }
    }

    /*
    * Retrieves the constructor for the lusidAccess API that accepts an {@link ApiClient}
    *
    * @throws UnsupportedOperationException if the class doesn't have a valid constructor that takes
    * an {@link ApiClient} as an argument to ensure proper construction of a lusidAccess API instance.
    */
    private <T> Constructor<T> getApiConstructor(Class<T> apiClass){
        try {
            return apiClass.getDeclaredConstructor(ApiClient.class);
        } catch (NoSuchMethodException e) {
            throw new UnsupportedOperationException(apiClass.getName() + " has no single argument constructor taking " +
                    "in " + ApiClient.class.getName());
        }
    }

    /*
    * Checks the class lives in the set package for lusidAccess API classes.
    *
    * @throws UnsupportedOperationException if API class does not live in lusidAccess API package
    */
    private void checkIsSupportedApiClass(Class apiClass){
        if (!isInApiPackage(apiClass)) {
            throw new UnsupportedOperationException(apiClass.getName() + " class is not a supported API class. " +
                    "Supported API classes live in the " + ApiFactory.API_PACKAGE + " package.");
        }
    }

    private boolean isInApiPackage(Class clazz){
        return API_PACKAGE.equals(clazz.getPackage().getName());
    }


}
