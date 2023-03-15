package com.openshift.cloud.api.kas.api.kafkas_mgmt.v1;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.cloud_providers.Cloud_providersRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.cloud_providers.item.Cloud_providersItemRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.clusters.ClustersRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.clusters.item.ClustersItemRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.errors.ErrorsRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.errors.item.ErrorsItemRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.instance_types.Instance_typesRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.instance_types.item.WithCloud_providerItemRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.item.KafkasItemRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.KafkasRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.service_accounts.item.Service_accountsItemRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.service_accounts.Service_accountsRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.sso_providers.Sso_providersRequestBuilder;
import com.openshift.cloud.api.kas.models.VersionMetadata;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/kafkas_mgmt/v1
 */
public class V1RequestBuilder {
    /** The cloud_providers property */
    @javax.annotation.Nonnull
    public Cloud_providersRequestBuilder cloud_providers() {
        return new Cloud_providersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The clusters property */
    @javax.annotation.Nonnull
    public ClustersRequestBuilder clusters() {
        return new ClustersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The errors property */
    @javax.annotation.Nonnull
    public ErrorsRequestBuilder errors() {
        return new ErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The instance_types property */
    @javax.annotation.Nonnull
    public Instance_typesRequestBuilder instance_types() {
        return new Instance_typesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kafkas property */
    @javax.annotation.Nonnull
    public KafkasRequestBuilder kafkas() {
        return new KafkasRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The service_accounts property */
    @javax.annotation.Nonnull
    public Service_accountsRequestBuilder service_accounts() {
        return new Service_accountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sso_providers property */
    @javax.annotation.Nonnull
    public Sso_providersRequestBuilder sso_providers() {
        return new Sso_providersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.cloud_providers.item collection
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
     * Gets an item from the com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.clusters.item collection
     * @param id Unique identifier of the item
     * @return a ClustersItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ClustersItemRequestBuilder clusters(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ClustersItemRequestBuilder(urlTplParams, requestAdapter);
    }
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
        this.urlTemplate = "{+baseurl}/api/kafkas_mgmt/v1";
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
        this.urlTemplate = "{+baseurl}/api/kafkas_mgmt/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.errors.item collection
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
     * Returns the kafka Service Fleet Manager API version metadata
     * @return a CompletableFuture of VersionMetadata
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VersionMetadata> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, VersionMetadata::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VersionMetadata> executionException = new java.util.concurrent.CompletableFuture<VersionMetadata>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns the kafka Service Fleet Manager API version metadata
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of VersionMetadata
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VersionMetadata> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, VersionMetadata::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VersionMetadata> executionException = new java.util.concurrent.CompletableFuture<VersionMetadata>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Gets an item from the com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.instance_types.item collection
     * @param id Unique identifier of the item
     * @return a WithCloud_providerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithCloud_providerItemRequestBuilder instance_types(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloud_provider", id);
        return new WithCloud_providerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.item collection
     * @param id Unique identifier of the item
     * @return a KafkasItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public KafkasItemRequestBuilder kafkas(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new KafkasItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get the service account with the given id
     * @param id Unique identifier of the item
     * @return a Service_accountsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Service_accountsItemRequestBuilder service_accounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Service_accountsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Returns the kafka Service Fleet Manager API version metadata
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the kafka Service Fleet Manager API version metadata
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
}
