package com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.processors.item.WithProcessorItemRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.processors.ProcessorsRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.sinks.item.WithSinkItemRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.sinks.SinksRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.sources.item.WithSourceItemRequestBuilder;
import com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.sources.SourcesRequestBuilder;
import com.openshift.cloud.api.smartevents.models.BridgeResponse;
import com.openshift.cloud.api.smartevents.models.ErrorsList;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/smartevents_mgmt/v2/bridges/{bridgeId}
 */
public class WithBridgeItemRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The processors property */
    @javax.annotation.Nonnull
    public ProcessorsRequestBuilder processors() {
        return new ProcessorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The sinks property */
    @javax.annotation.Nonnull
    public SinksRequestBuilder sinks() {
        return new SinksRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sources property */
    @javax.annotation.Nonnull
    public SourcesRequestBuilder sources() {
        return new SourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new WithBridgeItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithBridgeItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/smartevents_mgmt/v2/bridges/{bridgeId}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new WithBridgeItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithBridgeItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/smartevents_mgmt/v2/bridges/{bridgeId}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete a Bridge instance of the authenticated user by ID.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("404", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("500", ErrorsList::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a Bridge instance of the authenticated user by ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("404", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("500", ErrorsList::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a Bridge instance of the authenticated user by ID.
     * @return a CompletableFuture of BridgeResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BridgeResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("404", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("500", ErrorsList::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, BridgeResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BridgeResponse> executionException = new java.util.concurrent.CompletableFuture<BridgeResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a Bridge instance of the authenticated user by ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of BridgeResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BridgeResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("404", ErrorsList::createFromDiscriminatorValue);
            errorMapping.put("500", ErrorsList::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, BridgeResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BridgeResponse> executionException = new java.util.concurrent.CompletableFuture<BridgeResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Gets an item from the com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.processors.item collection
     * @param id Unique identifier of the item
     * @return a WithProcessorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithProcessorItemRequestBuilder processors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("processorId", id);
        return new WithProcessorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.sinks.item collection
     * @param id Unique identifier of the item
     * @return a WithSinkItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithSinkItemRequestBuilder sinks(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sinkId", id);
        return new WithSinkItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.smartevents.api.smartevents_mgmt.v2.bridges.item.sources.item collection
     * @param id Unique identifier of the item
     * @return a WithSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithSourceItemRequestBuilder sources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sourceId", id);
        return new WithSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete a Bridge instance of the authenticated user by ID.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a Bridge instance of the authenticated user by ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get a Bridge instance of the authenticated user by ID.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a Bridge instance of the authenticated user by ID.
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
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
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
