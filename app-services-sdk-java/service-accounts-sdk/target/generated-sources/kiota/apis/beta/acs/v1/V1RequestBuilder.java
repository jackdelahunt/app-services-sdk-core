package com.openshift.cloud.api.serviceaccounts.apis.beta.acs.v1;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.serviceaccounts.models.AcsClientRequestData;
import com.openshift.cloud.api.serviceaccounts.models.AcsClientResponseData;
import com.openshift.cloud.api.serviceaccounts.models.Error;
import com.openshift.cloud.api.serviceaccounts.models.RedHatErrorRepresentation;
import com.openshift.cloud.api.serviceaccounts.models.ValidationExceptionData;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apis/beta/acs/v1
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
        this.urlTemplate = "{+baseurl}/apis/beta/acs/v1";
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
        this.urlTemplate = "{+baseurl}/apis/beta/acs/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Create an ACS managed central client. Created ACS managed central clients are associated with the supplied organization id.
     * @param body The request body
     * @return a CompletableFuture of AcsClientResponseData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AcsClientResponseData> post(@javax.annotation.Nonnull final AcsClientRequestData body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ValidationExceptionData::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", RedHatErrorRepresentation::createFromDiscriminatorValue);
            errorMapping.put("405", RedHatErrorRepresentation::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AcsClientResponseData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AcsClientResponseData> executionException = new java.util.concurrent.CompletableFuture<AcsClientResponseData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create an ACS managed central client. Created ACS managed central clients are associated with the supplied organization id.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AcsClientResponseData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AcsClientResponseData> post(@javax.annotation.Nonnull final AcsClientRequestData body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", ValidationExceptionData::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", RedHatErrorRepresentation::createFromDiscriminatorValue);
            errorMapping.put("405", RedHatErrorRepresentation::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AcsClientResponseData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AcsClientResponseData> executionException = new java.util.concurrent.CompletableFuture<AcsClientResponseData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create an ACS managed central client. Created ACS managed central clients are associated with the supplied organization id.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AcsClientRequestData body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an ACS managed central client. Created ACS managed central clients are associated with the supplied organization id.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AcsClientRequestData body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
