package com.openshift.cloud.api.connector.api.connector_mgmt.v1.kafka_connector_clusters;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.connector.models.ConnectorClusterList;
import com.openshift.cloud.api.connector.models.ConnectorClusterRequestMeta;
import com.openshift.cloud.api.connector.models.ConnectorClusterStatus;
import com.openshift.cloud.api.connector.models.Error;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/connector_mgmt/v1/kafka_connector_clusters
 */
public class Kafka_connector_clustersRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new Kafka_connector_clustersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public Kafka_connector_clustersRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/connector_mgmt/v1/kafka_connector_clusters{?async*,page*,size*,orderBy*,search*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new Kafka_connector_clustersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public Kafka_connector_clustersRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/connector_mgmt/v1/kafka_connector_clusters{?async*,page*,size*,orderBy*,search*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Returns a list of connector clusters
     * @return a CompletableFuture of ConnectorClusterList
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConnectorClusterList> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ConnectorClusterList::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ConnectorClusterList> executionException = new java.util.concurrent.CompletableFuture<ConnectorClusterList>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of connector clusters
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ConnectorClusterList
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConnectorClusterList> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ConnectorClusterList::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ConnectorClusterList> executionException = new java.util.concurrent.CompletableFuture<ConnectorClusterList>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new connector cluster
     * @param body Schema for the request to update a data plane cluster's name
     * @return a CompletableFuture of ConnectorClusterStatus
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConnectorClusterStatus> post(@javax.annotation.Nonnull final ConnectorClusterRequestMeta body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ConnectorClusterStatus::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ConnectorClusterStatus> executionException = new java.util.concurrent.CompletableFuture<ConnectorClusterStatus>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new connector cluster
     * @param body Schema for the request to update a data plane cluster's name
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ConnectorClusterStatus
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConnectorClusterStatus> post(@javax.annotation.Nonnull final ConnectorClusterRequestMeta body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ConnectorClusterStatus::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ConnectorClusterStatus> executionException = new java.util.concurrent.CompletableFuture<ConnectorClusterStatus>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of connector clusters
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of connector clusters
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
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create a new connector cluster
     * @param body Schema for the request to update a data plane cluster's name
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ConnectorClusterRequestMeta body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new connector cluster
     * @param body Schema for the request to update a data plane cluster's name
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ConnectorClusterRequestMeta body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a list of connector clusters
     */
    public class GetQueryParameters {
        /** Specifies the order by criteria. The syntax of this parameter issimilar to the syntax of the `order by` clause of an SQL statement.Each query can be ordered by any of the underlying resource fields supported in the search parameter.For example, to return all Connector types ordered by their name, use the following syntax:```sqlname asc```To return all Connector types ordered by their name _and_ version, use the following syntax:```sqlname asc, version asc```To return connector types with labels `category-featured` AND `source`, use the following syntax:```label like %25category-featured%25source%```NOTE: The AND operator does not work for multiple labels. Instead use an alphabetically ascending order pattern with the LIKE operator to matchan aggregated list of ',' separated label names.If the parameter isn't provided, or if the value is empty, thenthe results are ordered by name. */
        @javax.annotation.Nullable
        public String orderBy;
        /** Page index */
        @javax.annotation.Nullable
        public String page;
        /** Search criteria.The syntax of this parameter is similar to the syntax of the `where` clause of aSQL statement.Allowed fields in the search depend on the resource type:* Cluster: id, created_at, updated_at, owner, organisation_id, name, state, client_id* Namespace: id, created_at, updated_at, name, cluster_id, owner, expiration, tenant_user_id, tenant_organisation_id, state* Connector Types: id, created_at, updated_at, version, name, description, label, channel, featured_rank, pricing_tier* Connectors: id, created_at, updated_at, name, owner, organisation_id, connector_type_id, desired_state, state, channel, namespace_id, kafka_id, kafka_bootstrap_server, service_account_client_id, schema_registry_id, schema_registry_urlAllowed operators are `<>`, `=`, `IN`, `NOT IN`, `LIKE`, or `ILIKE`.Allowed conjunctive operators are `AND` and `OR`. However, you can use a maximum of 10 conjunctions in a search query.Examples:To return a Connector Type with the name `aws-sqs-source` and the channel `stable`, use the following syntax:```name = aws-sqs-source and channel = stable```To return a connector instance with a name that starts with `aws`, use the following syntax:```name like aws%25```To return a connector type with a name containing `aws` matching any character case combination, use the following syntax:```name ilike %25aws%25```To return connector types with labels `category-featured` AND `source`, use the following syntax:```label like %25category-featured%25source%```NOTE: The AND operator does not work for multiple labels. Instead use an alphabetically ascending order pattern with the LIKE operator to matchan aggregated list of ',' separated label names.If the parameter isn't provided, or if the value is empty, then all the resourcesthat the user has permission to see are returned.Note. If the query is invalid, an error is returned. */
        @javax.annotation.Nullable
        public String search;
        /** Number of items in each page */
        @javax.annotation.Nullable
        public String size;
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
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /**
     * Create a new connector cluster
     */
    public class PostQueryParameters {
        /** Perform the action in an asynchronous manner */
        @javax.annotation.Nullable
        public Boolean async;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
        /**
         * Instantiates a new PostRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PostRequestConfiguration() {
        }
    }
}
