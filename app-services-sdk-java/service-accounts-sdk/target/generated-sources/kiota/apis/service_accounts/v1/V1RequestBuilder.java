package com.openshift.cloud.api.serviceaccounts.apis.service_accounts.v1;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.serviceaccounts.models.Error;
import com.openshift.cloud.api.serviceaccounts.models.RedHatErrorRepresentation;
import com.openshift.cloud.api.serviceaccounts.models.ServiceAccountCreateRequestData;
import com.openshift.cloud.api.serviceaccounts.models.ServiceAccountData;
import com.openshift.cloud.api.serviceaccounts.models.ValidationExceptionData;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apis/service_accounts/v1
 */
public class V1RequestBuilder {
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
        this.urlTemplate = "{+baseurl}/apis/service_accounts/v1{?first*,max*,clientId*}";
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
        this.urlTemplate = "{+baseurl}/apis/service_accounts/v1{?first*,max*,clientId*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as 'first' and page size as 'max'.
     * @return a CompletableFuture of ServiceAccountData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<java.util.List<ServiceAccountData>> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ValidationExceptionData::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendCollectionAsync(requestInfo, ServiceAccountData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<java.util.List<ServiceAccountData>> executionException = new java.util.concurrent.CompletableFuture<java.util.List<ServiceAccountData>>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as 'first' and page size as 'max'.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceAccountData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<java.util.List<ServiceAccountData>> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ValidationExceptionData::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendCollectionAsync(requestInfo, ServiceAccountData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<java.util.List<ServiceAccountData>> executionException = new java.util.concurrent.CompletableFuture<java.util.List<ServiceAccountData>>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a service account. Created service account is associated with the user defined in the bearer token.
     * @param body The request body
     * @return a CompletableFuture of ServiceAccountData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAccountData> post(@javax.annotation.Nonnull final ServiceAccountCreateRequestData body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ValidationExceptionData::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", RedHatErrorRepresentation::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ServiceAccountData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceAccountData> executionException = new java.util.concurrent.CompletableFuture<ServiceAccountData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a service account. Created service account is associated with the user defined in the bearer token.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceAccountData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAccountData> post(@javax.annotation.Nonnull final ServiceAccountCreateRequestData body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ValidationExceptionData::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", RedHatErrorRepresentation::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ServiceAccountData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceAccountData> executionException = new java.util.concurrent.CompletableFuture<ServiceAccountData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as 'first' and page size as 'max'.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as 'first' and page size as 'max'.
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
     * Create a service account. Created service account is associated with the user defined in the bearer token.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceAccountCreateRequestData body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a service account. Created service account is associated with the user defined in the bearer token.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceAccountCreateRequestData body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as 'first' and page size as 'max'.
     */
    public class GetQueryParameters {
        @javax.annotation.Nullable
        public String[] clientId;
        @javax.annotation.Nullable
        public Integer first;
        @javax.annotation.Nullable
        public Integer max;
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PostRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PostRequestConfiguration() {
        }
    }
}
