package com.openshift.cloud.api.accountmanagement.api.authorizations.v1.self_resource_review;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.accountmanagement.models.Error;
import com.openshift.cloud.api.accountmanagement.models.SelfResourceReview;
import com.openshift.cloud.api.accountmanagement.models.SelfResourceReviewRequest;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/authorizations/v1/self_resource_review
 */
public class Self_resource_reviewRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new Self_resource_reviewRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public Self_resource_reviewRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/authorizations/v1/self_resource_review{?reduceClusterList*,excludeSubscriptionStatuses*,includeSubscriptionStatuses*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new Self_resource_reviewRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public Self_resource_reviewRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/authorizations/v1/self_resource_review{?reduceClusterList*,excludeSubscriptionStatuses*,includeSubscriptionStatuses*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Obtain resource ids for resources you may perform the specified action upon. Resource ids returned as ["*"] is shorthand for all ids.
     * @param body The request body
     * @return a CompletableFuture of SelfResourceReview
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SelfResourceReview> post(@javax.annotation.Nonnull final SelfResourceReviewRequest body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("422", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SelfResourceReview::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SelfResourceReview> executionException = new java.util.concurrent.CompletableFuture<SelfResourceReview>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Obtain resource ids for resources you may perform the specified action upon. Resource ids returned as ["*"] is shorthand for all ids.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SelfResourceReview
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SelfResourceReview> post(@javax.annotation.Nonnull final SelfResourceReviewRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("422", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SelfResourceReview::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SelfResourceReview> executionException = new java.util.concurrent.CompletableFuture<SelfResourceReview>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Obtain resource ids for resources you may perform the specified action upon. Resource ids returned as ["*"] is shorthand for all ids.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final SelfResourceReviewRequest body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Obtain resource ids for resources you may perform the specified action upon. Resource ids returned as ["*"] is shorthand for all ids.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final SelfResourceReviewRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Obtain resource ids for resources you may perform the specified action upon. Resource ids returned as ["*"] is shorthand for all ids.
     */
    public class PostQueryParameters {
        /** A comma-separated list of subscription statuses. Subscriptions with these statuses will be excluded from results. This options is mutually exclusive with includeSubscriptionStatuses. */
        @javax.annotation.Nullable
        public String excludeSubscriptionStatuses;
        /** A comma-separated list of subscription statuses. Only subscriptions with these statuses will be included into results. This options is mutually exclusive with excludeSubscriptionStatuses. */
        @javax.annotation.Nullable
        public String includeSubscriptionStatuses;
        /** If true, When returning a list of cluster_ids/cluster_uuids/subscription_ids, if those are already included in one of the organizations provided in organization_ids, do not include it in the list. */
        @javax.annotation.Nullable
        public Boolean reduceClusterList;
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
