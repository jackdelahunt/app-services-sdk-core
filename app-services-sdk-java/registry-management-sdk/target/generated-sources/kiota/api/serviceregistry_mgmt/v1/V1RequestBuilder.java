package com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1.errors.ErrorsRequestBuilder;
import com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1.errors.item.ErrorsItemRequestBuilder;
import com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1.registries.item.RegistriesItemRequestBuilder;
import com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1.registries.RegistriesRequestBuilder;
import com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1.status.StatusRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/serviceregistry_mgmt/v1
 */
public class V1RequestBuilder {
    /** Get a list of error types that can be returned by this API. These are not instances of specific errors. */
    @javax.annotation.Nonnull
    public ErrorsRequestBuilder errors() {
        return new ErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Manage the list of all Registry instances */
    @javax.annotation.Nonnull
    public RegistriesRequestBuilder registries() {
        return new RegistriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Retrieves the status of resources e.g., whether we have reached maximum service capacity */
    @javax.annotation.Nonnull
    public StatusRequestBuilder status() {
        return new StatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new V1RequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public V1RequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/serviceregistry_mgmt/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new V1RequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public V1RequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/serviceregistry_mgmt/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get information about a type of error. This is not an instance of a specific error.
     * @param id Unique identifier of the item
     * @return a ErrorsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ErrorsItemRequestBuilder errors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ErrorsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Manage a specific Registry instance
     * @param id Unique identifier of the item
     * @return a RegistriesItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RegistriesItemRequestBuilder registries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new RegistriesItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
