package com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.BridgesRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.WithBridgeItemRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.cloud_providers.Cloud_providersRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.cloud_providers.item.Cloud_providersItemRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.errors.ErrorsRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.errors.item.ErrorsItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/smartevents_mgmt/v2
 */
public class V2RequestBuilder {
    /** The bridges property */
    @javax.annotation.Nonnull
    public BridgesRequestBuilder bridges() {
        return new BridgesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloud_providers property */
    @javax.annotation.Nonnull
    public Cloud_providersRequestBuilder cloud_providers() {
        return new Cloud_providersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The errors property */
    @javax.annotation.Nonnull
    public ErrorsRequestBuilder errors() {
        return new ErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item collection
     * @param id Unique identifier of the item
     * @return a WithBridgeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithBridgeItemRequestBuilder bridges(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bridgeId", id);
        return new WithBridgeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.cloud_providers.item collection
     * @param id Unique identifier of the item
     * @return a Cloud_providersItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Cloud_providersItemRequestBuilder cloud_providers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Cloud_providersItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new V2RequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public V2RequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/smartevents_mgmt/v2";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new V2RequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public V2RequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/smartevents_mgmt/v2";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.errors.item collection
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
}
