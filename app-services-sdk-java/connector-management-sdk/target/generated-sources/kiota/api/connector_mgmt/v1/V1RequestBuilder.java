package com.openshift.cloud.api.connector.api.connector_mgmt.v1;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_clusters.item.WithConnector_cluster_ItemRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_clusters.Kafka_connector_clustersRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_namespaces.item.WithConnector_namespace_ItemRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_namespaces.Kafka_connector_namespacesRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_types.item.WithConnector_type_ItemRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_types.Kafka_connector_typesRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connectors.item.Kafka_connectorsItemRequestBuilder;
import com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connectors.Kafka_connectorsRequestBuilder;
import com.openshift.cloud.api.connector.models.VersionMetadata;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/connector_mgmt/v1
 */
public class V1RequestBuilder {
    /** The kafka_connector_clusters property */
    @javax.annotation.Nonnull
    public Kafka_connector_clustersRequestBuilder kafka_connector_clusters() {
        return new Kafka_connector_clustersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kafka_connector_namespaces property */
    @javax.annotation.Nonnull
    public Kafka_connector_namespacesRequestBuilder kafka_connector_namespaces() {
        return new Kafka_connector_namespacesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kafka_connector_types property */
    @javax.annotation.Nonnull
    public Kafka_connector_typesRequestBuilder kafka_connector_types() {
        return new Kafka_connector_typesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kafka_connectors property */
    @javax.annotation.Nonnull
    public Kafka_connectorsRequestBuilder kafka_connectors() {
        return new Kafka_connectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
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
        this.urlTemplate = "{+baseurl}/api/connector_mgmt/v1";
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
        this.urlTemplate = "{+baseurl}/api/connector_mgmt/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Returns the version metadata
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
     * Returns the version metadata
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
     * Gets an item from the com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_clusters.item collection
     * @param id Unique identifier of the item
     * @return a WithConnector_cluster_ItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithConnector_cluster_ItemRequestBuilder kafka_connector_clusters(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connector_cluster_id", id);
        return new WithConnector_cluster_ItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_namespaces.item collection
     * @param id Unique identifier of the item
     * @return a WithConnector_namespace_ItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithConnector_namespace_ItemRequestBuilder kafka_connector_namespaces(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connector_namespace_id", id);
        return new WithConnector_namespace_ItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_types.item collection
     * @param id Unique identifier of the item
     * @return a WithConnector_type_ItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithConnector_type_ItemRequestBuilder kafka_connector_types(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connector_type_id", id);
        return new WithConnector_type_ItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connectors.item collection
     * @param id Unique identifier of the item
     * @return a Kafka_connectorsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Kafka_connectorsItemRequestBuilder kafka_connectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Kafka_connectorsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Returns the version metadata
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the version metadata
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
