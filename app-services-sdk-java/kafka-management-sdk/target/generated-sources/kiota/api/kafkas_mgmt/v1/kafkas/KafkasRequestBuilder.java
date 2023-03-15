package com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.kas.models.Error;
import com.openshift.cloud.api.kas.models.KafkaRequest;
import com.openshift.cloud.api.kas.models.KafkaRequestList;
import com.openshift.cloud.api.kas.models.KafkaRequestPayload;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/kafkas_mgmt/v1/kafkas
 */
public class KafkasRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new KafkasRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkasRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/kafkas_mgmt/v1/kafkas{?async*,page*,size*,orderBy*,search*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new KafkasRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkasRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/kafkas_mgmt/v1/kafkas{?async*,page*,size*,orderBy*,search*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Returns a list of Kafka requests
     * @return a CompletableFuture of KafkaRequestList
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<KafkaRequestList> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, KafkaRequestList::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<KafkaRequestList> executionException = new java.util.concurrent.CompletableFuture<KafkaRequestList>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of Kafka requests
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of KafkaRequestList
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<KafkaRequestList> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, KafkaRequestList::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<KafkaRequestList> executionException = new java.util.concurrent.CompletableFuture<KafkaRequestList>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Creates a Kafka request
     * @param body Schema for the request body sent to /kafkas POST
     * @return a CompletableFuture of KafkaRequest
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<KafkaRequest> post(@javax.annotation.Nonnull final KafkaRequestPayload body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, KafkaRequest::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<KafkaRequest> executionException = new java.util.concurrent.CompletableFuture<KafkaRequest>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Creates a Kafka request
     * @param body Schema for the request body sent to /kafkas POST
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of KafkaRequest
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<KafkaRequest> post(@javax.annotation.Nonnull final KafkaRequestPayload body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, KafkaRequest::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<KafkaRequest> executionException = new java.util.concurrent.CompletableFuture<KafkaRequest>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of Kafka requests
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of Kafka requests
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
     * Creates a Kafka request
     * @param body Schema for the request body sent to /kafkas POST
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final KafkaRequestPayload body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a Kafka request
     * @param body Schema for the request body sent to /kafkas POST
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final KafkaRequestPayload body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Returns a list of Kafka requests
     */
    public class GetQueryParameters {
        /** Specifies the order by criteria. The syntax of this parameter issimilar to the syntax of the `order by` clause of an SQL statement.Each query can be ordered by any of the following `kafkaRequests` fields:* bootstrap_server_host* admin_api_server_url* cloud_provider* cluster_id* created_at* href* id* instance_type* multi_az* name* organisation_id* owner* reauthentication_enabled* region* status* updated_at* versionFor example, to return all Kafka instances ordered by their name, use the following syntax:```sqlname asc```To return all Kafka instances ordered by their name _and_ created date, use the following syntax:```sqlname asc, created_at asc```If the parameter isn't provided, or if the value is empty, thenthe results are ordered by name. */
        @javax.annotation.Nullable
        public String orderBy;
        /** Page index */
        @javax.annotation.Nullable
        public String page;
        /** Search criteria.The syntax of this parameter is similar to the syntax of the `where` clause of anSQL statement. Allowed fields in the search are `cloud_provider`, `name`, `owner`, `region`, `status` and `cluster_id`. Allowed comparators are `<>`, `=`, `IN`, `NOT IN`, `LIKE`, or `ILIKE`.Allowed joins are `AND` and `OR`. However, you can use a maximum of 10 joins in a search query.Examples:To return a Kafka instance with the name `my-kafka` and the region `aws`, use the following syntax:```name = my-kafka and cloud_provider = aws```To return a Kafka instance with a name that starts with `my`, use the following syntax:```name like my%25```To return a Kafka instance with a name containing `test` matching any character case combinations, use the following syntax:```name ilike %25test%25```If the parameter isn't provided, or if the value is empty, then all the Kafka instancesthat the user has permission to see are returned.Note. If the query is invalid, an error is returned. */
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
     * Creates a Kafka request
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
