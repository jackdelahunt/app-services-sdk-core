package com.openshift.cloud.api.registry.instance.groups.item.artifacts;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.registry.instance.models.ArtifactMetaData;
import com.openshift.cloud.api.registry.instance.models.ArtifactSearchResults;
import com.openshift.cloud.api.registry.instance.models.ContentCreateRequest;
import com.openshift.cloud.api.registry.instance.models.Error;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Manage the collection of artifacts within a single group in the registry.
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
        this.urlTemplate = "{+baseurl}/groups/{groupId}/artifacts{?limit*,offset*,order*,orderby*,ifExists*,canonical*}";
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
        this.urlTemplate = "{+baseurl}/groups/{groupId}/artifacts{?limit*,offset*,order*,orderby*,ifExists*,canonical*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Deletes all of the artifacts that exist in a given group.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Deletes all of the artifacts that exist in a given group.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of all artifacts in the group.  This list is paged.
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
     * Returns a list of all artifacts in the group.  This list is paged.
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
     * Creates a new artifact by posting the artifact content.  The body of the request shouldbe the raw content of the artifact.  This is typically in JSON format for *most* of the supported types, but may be in another format for a few (for example, `PROTOBUF`).The registry attempts to figure out what kind of artifact is being added from thefollowing supported list:* Avro (`AVRO`)* Protobuf (`PROTOBUF`)* JSON Schema (`JSON`)* Kafka Connect (`KCONNECT`)* OpenAPI (`OPENAPI`)* AsyncAPI (`ASYNCAPI`)* GraphQL (`GRAPHQL`)* Web Services Description Language (`WSDL`)* XML Schema (`XSD`)Alternatively, you can specify the artifact type using the `X-Registry-ArtifactType` HTTP request header, or include a hint in the request's `Content-Type`.  For example:```Content-Type: application/json; artifactType=AVRO```An artifact is created using the content provided in the body of the request.  Thiscontent is created under a unique artifact ID that can be provided in the requestusing the `X-Registry-ArtifactId` request header.  If not provided in the request,the server generates a unique ID for the artifact.  It is typically recommendedthat callers provide the ID, because this is typically a meaningful identifier, and for most use cases should be supplied by the caller.If an artifact with the provided artifact ID already exists, the default behavioris for the server to reject the content with a 409 error.  However, the caller cansupply the `ifExists` query parameter to alter this default behavior. The `ifExists`query parameter can have one of the following values:* `FAIL` (*default*) - server rejects the content with a 409 error* `UPDATE` - server updates the existing artifact and returns the new metadata* `RETURN` - server does not create or add content to the server, but instead returns the metadata for the existing artifact* `RETURN_OR_UPDATE` - server returns an existing **version** that matches the provided content if such a version exists, otherwise a new version is createdThis operation may fail for one of the following reasons:* An invalid `ArtifactType` was indicated (HTTP error `400`)* No `ArtifactType` was indicated and the server could not determine one from the content (HTTP error `400`)* Provided content (request body) was empty (HTTP error `400`)* An artifact with the provided ID already exists (HTTP error `409`)* The content violates one of the configured global rules (HTTP error `409`)* A server error occurred (HTTP error `500`)
     * @param body The request body
     * @return a CompletableFuture of ArtifactMetaData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ArtifactMetaData> post(@javax.annotation.Nonnull final ContentCreateRequest body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ArtifactMetaData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ArtifactMetaData> executionException = new java.util.concurrent.CompletableFuture<ArtifactMetaData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Creates a new artifact by posting the artifact content.  The body of the request shouldbe the raw content of the artifact.  This is typically in JSON format for *most* of the supported types, but may be in another format for a few (for example, `PROTOBUF`).The registry attempts to figure out what kind of artifact is being added from thefollowing supported list:* Avro (`AVRO`)* Protobuf (`PROTOBUF`)* JSON Schema (`JSON`)* Kafka Connect (`KCONNECT`)* OpenAPI (`OPENAPI`)* AsyncAPI (`ASYNCAPI`)* GraphQL (`GRAPHQL`)* Web Services Description Language (`WSDL`)* XML Schema (`XSD`)Alternatively, you can specify the artifact type using the `X-Registry-ArtifactType` HTTP request header, or include a hint in the request's `Content-Type`.  For example:```Content-Type: application/json; artifactType=AVRO```An artifact is created using the content provided in the body of the request.  Thiscontent is created under a unique artifact ID that can be provided in the requestusing the `X-Registry-ArtifactId` request header.  If not provided in the request,the server generates a unique ID for the artifact.  It is typically recommendedthat callers provide the ID, because this is typically a meaningful identifier, and for most use cases should be supplied by the caller.If an artifact with the provided artifact ID already exists, the default behavioris for the server to reject the content with a 409 error.  However, the caller cansupply the `ifExists` query parameter to alter this default behavior. The `ifExists`query parameter can have one of the following values:* `FAIL` (*default*) - server rejects the content with a 409 error* `UPDATE` - server updates the existing artifact and returns the new metadata* `RETURN` - server does not create or add content to the server, but instead returns the metadata for the existing artifact* `RETURN_OR_UPDATE` - server returns an existing **version** that matches the provided content if such a version exists, otherwise a new version is createdThis operation may fail for one of the following reasons:* An invalid `ArtifactType` was indicated (HTTP error `400`)* No `ArtifactType` was indicated and the server could not determine one from the content (HTTP error `400`)* Provided content (request body) was empty (HTTP error `400`)* An artifact with the provided ID already exists (HTTP error `409`)* The content violates one of the configured global rules (HTTP error `409`)* A server error occurred (HTTP error `500`)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ArtifactMetaData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ArtifactMetaData> post(@javax.annotation.Nonnull final ContentCreateRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ArtifactMetaData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ArtifactMetaData> executionException = new java.util.concurrent.CompletableFuture<ArtifactMetaData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Deletes all of the artifacts that exist in a given group.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes all of the artifacts that exist in a given group.
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
     * Returns a list of all artifacts in the group.  This list is paged.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of all artifacts in the group.  This list is paged.
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
     * Creates a new artifact by posting the artifact content.  The body of the request shouldbe the raw content of the artifact.  This is typically in JSON format for *most* of the supported types, but may be in another format for a few (for example, `PROTOBUF`).The registry attempts to figure out what kind of artifact is being added from thefollowing supported list:* Avro (`AVRO`)* Protobuf (`PROTOBUF`)* JSON Schema (`JSON`)* Kafka Connect (`KCONNECT`)* OpenAPI (`OPENAPI`)* AsyncAPI (`ASYNCAPI`)* GraphQL (`GRAPHQL`)* Web Services Description Language (`WSDL`)* XML Schema (`XSD`)Alternatively, you can specify the artifact type using the `X-Registry-ArtifactType` HTTP request header, or include a hint in the request's `Content-Type`.  For example:```Content-Type: application/json; artifactType=AVRO```An artifact is created using the content provided in the body of the request.  Thiscontent is created under a unique artifact ID that can be provided in the requestusing the `X-Registry-ArtifactId` request header.  If not provided in the request,the server generates a unique ID for the artifact.  It is typically recommendedthat callers provide the ID, because this is typically a meaningful identifier, and for most use cases should be supplied by the caller.If an artifact with the provided artifact ID already exists, the default behavioris for the server to reject the content with a 409 error.  However, the caller cansupply the `ifExists` query parameter to alter this default behavior. The `ifExists`query parameter can have one of the following values:* `FAIL` (*default*) - server rejects the content with a 409 error* `UPDATE` - server updates the existing artifact and returns the new metadata* `RETURN` - server does not create or add content to the server, but instead returns the metadata for the existing artifact* `RETURN_OR_UPDATE` - server returns an existing **version** that matches the provided content if such a version exists, otherwise a new version is createdThis operation may fail for one of the following reasons:* An invalid `ArtifactType` was indicated (HTTP error `400`)* No `ArtifactType` was indicated and the server could not determine one from the content (HTTP error `400`)* Provided content (request body) was empty (HTTP error `400`)* An artifact with the provided ID already exists (HTTP error `409`)* The content violates one of the configured global rules (HTTP error `409`)* A server error occurred (HTTP error `500`)
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ContentCreateRequest body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new artifact by posting the artifact content.  The body of the request shouldbe the raw content of the artifact.  This is typically in JSON format for *most* of the supported types, but may be in another format for a few (for example, `PROTOBUF`).The registry attempts to figure out what kind of artifact is being added from thefollowing supported list:* Avro (`AVRO`)* Protobuf (`PROTOBUF`)* JSON Schema (`JSON`)* Kafka Connect (`KCONNECT`)* OpenAPI (`OPENAPI`)* AsyncAPI (`ASYNCAPI`)* GraphQL (`GRAPHQL`)* Web Services Description Language (`WSDL`)* XML Schema (`XSD`)Alternatively, you can specify the artifact type using the `X-Registry-ArtifactType` HTTP request header, or include a hint in the request's `Content-Type`.  For example:```Content-Type: application/json; artifactType=AVRO```An artifact is created using the content provided in the body of the request.  Thiscontent is created under a unique artifact ID that can be provided in the requestusing the `X-Registry-ArtifactId` request header.  If not provided in the request,the server generates a unique ID for the artifact.  It is typically recommendedthat callers provide the ID, because this is typically a meaningful identifier, and for most use cases should be supplied by the caller.If an artifact with the provided artifact ID already exists, the default behavioris for the server to reject the content with a 409 error.  However, the caller cansupply the `ifExists` query parameter to alter this default behavior. The `ifExists`query parameter can have one of the following values:* `FAIL` (*default*) - server rejects the content with a 409 error* `UPDATE` - server updates the existing artifact and returns the new metadata* `RETURN` - server does not create or add content to the server, but instead returns the metadata for the existing artifact* `RETURN_OR_UPDATE` - server returns an existing **version** that matches the provided content if such a version exists, otherwise a new version is createdThis operation may fail for one of the following reasons:* An invalid `ArtifactType` was indicated (HTTP error `400`)* No `ArtifactType` was indicated and the server could not determine one from the content (HTTP error `400`)* Provided content (request body) was empty (HTTP error `400`)* An artifact with the provided ID already exists (HTTP error `409`)* The content violates one of the configured global rules (HTTP error `409`)* A server error occurred (HTTP error `500`)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ContentCreateRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/create.extended+json", body);
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
     * Returns a list of all artifacts in the group.  This list is paged.
     */
    public class GetQueryParameters {
        /** The number of artifacts to return.  Defaults to 20. */
        @javax.annotation.Nullable
        public Integer limit;
        /** The number of artifacts to skip before starting the result set.  Defaults to 0. */
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
     * Creates a new artifact by posting the artifact content.  The body of the request shouldbe the raw content of the artifact.  This is typically in JSON format for *most* of the supported types, but may be in another format for a few (for example, `PROTOBUF`).The registry attempts to figure out what kind of artifact is being added from thefollowing supported list:* Avro (`AVRO`)* Protobuf (`PROTOBUF`)* JSON Schema (`JSON`)* Kafka Connect (`KCONNECT`)* OpenAPI (`OPENAPI`)* AsyncAPI (`ASYNCAPI`)* GraphQL (`GRAPHQL`)* Web Services Description Language (`WSDL`)* XML Schema (`XSD`)Alternatively, you can specify the artifact type using the `X-Registry-ArtifactType` HTTP request header, or include a hint in the request's `Content-Type`.  For example:```Content-Type: application/json; artifactType=AVRO```An artifact is created using the content provided in the body of the request.  Thiscontent is created under a unique artifact ID that can be provided in the requestusing the `X-Registry-ArtifactId` request header.  If not provided in the request,the server generates a unique ID for the artifact.  It is typically recommendedthat callers provide the ID, because this is typically a meaningful identifier, and for most use cases should be supplied by the caller.If an artifact with the provided artifact ID already exists, the default behavioris for the server to reject the content with a 409 error.  However, the caller cansupply the `ifExists` query parameter to alter this default behavior. The `ifExists`query parameter can have one of the following values:* `FAIL` (*default*) - server rejects the content with a 409 error* `UPDATE` - server updates the existing artifact and returns the new metadata* `RETURN` - server does not create or add content to the server, but instead returns the metadata for the existing artifact* `RETURN_OR_UPDATE` - server returns an existing **version** that matches the provided content if such a version exists, otherwise a new version is createdThis operation may fail for one of the following reasons:* An invalid `ArtifactType` was indicated (HTTP error `400`)* No `ArtifactType` was indicated and the server could not determine one from the content (HTTP error `400`)* Provided content (request body) was empty (HTTP error `400`)* An artifact with the provided ID already exists (HTTP error `409`)* The content violates one of the configured global rules (HTTP error `409`)* A server error occurred (HTTP error `500`)
     */
    public class PostQueryParameters {
        /** Used only when the `ifExists` query parameter is set to `RETURN_OR_UPDATE`, this parameter can be set to `true` to indicate that the server should "canonicalize" the content when searching for a matching version.  The canonicalization algorithm is unique to each artifact type, but typically involves removing extra whitespace and formatting the content in a consistent manner. */
        @javax.annotation.Nullable
        public Boolean canonical;
        /** Set this option to instruct the server on what to do if the artifact already exists. */
        @javax.annotation.Nullable
        public String ifExists;
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
