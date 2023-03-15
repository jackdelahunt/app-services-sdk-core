package com.openshift.cloud.api.registry.instance.search.artifacts;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.registry.instance.models.ArtifactSearchResults;
import com.openshift.cloud.api.registry.instance.models.Error;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Search for artifacts in the registry.
 */
public class ArtifactsRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new ArtifactsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ArtifactsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/search/artifacts{?name*,offset*,limit*,order*,orderby*,labels*,properties*,description*,group*,globalId*,contentId*,canonical*,artifactType*,offset*,limit*,order*,orderby*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ArtifactsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ArtifactsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/search/artifacts{?name*,offset*,limit*,order*,orderby*,labels*,properties*,description*,group*,globalId*,contentId*,canonical*,artifactType*,offset*,limit*,order*,orderby*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Returns a paginated list of all artifacts that match the provided filter criteria.
     * @return a CompletableFuture of ArtifactSearchResults
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ArtifactSearchResults> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ArtifactSearchResults::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ArtifactSearchResults> executionException = new java.util.concurrent.CompletableFuture<ArtifactSearchResults>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a paginated list of all artifacts that match the provided filter criteria.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ArtifactSearchResults
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ArtifactSearchResults> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ArtifactSearchResults::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ArtifactSearchResults> executionException = new java.util.concurrent.CompletableFuture<ArtifactSearchResults>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a paginated list of all artifacts with at least one version that matches theposted content.
     * @param body Binary request body
     * @return a CompletableFuture of ArtifactSearchResults
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ArtifactSearchResults> post(@javax.annotation.Nonnull final InputStream body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ArtifactSearchResults::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ArtifactSearchResults> executionException = new java.util.concurrent.CompletableFuture<ArtifactSearchResults>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a paginated list of all artifacts with at least one version that matches theposted content.
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ArtifactSearchResults
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ArtifactSearchResults> post(@javax.annotation.Nonnull final InputStream body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ArtifactSearchResults::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ArtifactSearchResults> executionException = new java.util.concurrent.CompletableFuture<ArtifactSearchResults>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a paginated list of all artifacts that match the provided filter criteria.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a paginated list of all artifacts that match the provided filter criteria.
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
     * Returns a paginated list of all artifacts with at least one version that matches theposted content.
     * @param body Binary request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final InputStream body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Returns a paginated list of all artifacts with at least one version that matches theposted content.
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final InputStream body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setStreamContent(body);
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
     * Returns a paginated list of all artifacts that match the provided filter criteria.
     */
    public class GetQueryParameters {
        /** Filter by contentId. */
        @javax.annotation.Nullable
        public Long contentId;
        /** Filter by description. */
        @javax.annotation.Nullable
        public String description;
        /** Filter by globalId. */
        @javax.annotation.Nullable
        public Long globalId;
        /** Filter by artifact group. */
        @javax.annotation.Nullable
        public String group;
        /** Filter by label.  Include one or more label to only return artifacts containing all of thespecified labels. */
        @javax.annotation.Nullable
        public String[] labels;
        /** The number of artifacts to return.  Defaults to 20. */
        @javax.annotation.Nullable
        public Integer limit;
        /** Filter by artifact name. */
        @javax.annotation.Nullable
        public String name;
        /** The number of artifacts to skip before starting to collect the result set.  Defaults to 0. */
        @javax.annotation.Nullable
        public Integer offset;
        /** Sort order, ascending (`asc`) or descending (`desc`). */
        @javax.annotation.Nullable
        public String order;
        /** The field to sort by.  Can be one of:* `name`* `createdOn` */
        @javax.annotation.Nullable
        public String orderby;
        /** Filter by one or more name/value property.  Separate each name/value pair using a colon.  Forexample `properties=foo:bar` will return only artifacts with a custom property named `foo`and value `bar`. */
        @javax.annotation.Nullable
        public String[] properties;
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
     * Returns a paginated list of all artifacts with at least one version that matches theposted content.
     */
    public class PostQueryParameters {
        /** Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the `canonical` query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts. */
        @javax.annotation.Nullable
        public String artifactType;
        /** Parameter that can be set to `true` to indicate that the server should "canonicalize" the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the `artifactType` query parameter. */
        @javax.annotation.Nullable
        public Boolean canonical;
        /** The number of artifacts to return.  Defaults to 20. */
        @javax.annotation.Nullable
        public Integer limit;
        /** The number of artifacts to skip before starting to collect the result set.  Defaults to 0. */
        @javax.annotation.Nullable
        public Integer offset;
        /** Sort order, ascending (`asc`) or descending (`desc`). */
        @javax.annotation.Nullable
        public String order;
        /** The field to sort by.  Can be one of:* `name`* `createdOn` */
        @javax.annotation.Nullable
        public String orderby;
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
