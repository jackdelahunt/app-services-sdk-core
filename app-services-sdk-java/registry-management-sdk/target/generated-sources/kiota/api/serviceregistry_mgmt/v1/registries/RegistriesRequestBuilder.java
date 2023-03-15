package com.openshift.cloud.api.srs.api.serviceregistry_mgmt.v1.registries;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.srs.models.Error;
import com.openshift.cloud.api.srs.models.RegistryCreate;
import com.openshift.cloud.api.srs.models.RegistryList;
import com.openshift.cloud.api.srs.models.RootTypeForRegistry;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Manage the list of all Registry instances
 */
public class RegistriesRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new RegistriesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistriesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/serviceregistry_mgmt/v1/registries{?page*,size*,orderBy*,search*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new RegistriesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistriesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/serviceregistry_mgmt/v1/registries{?page*,size*,orderBy*,search*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get the list of all Registry instances
     * @return a CompletableFuture of RegistryList
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RegistryList> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RegistryList::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RegistryList> executionException = new java.util.concurrent.CompletableFuture<RegistryList>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the list of all Registry instances
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of RegistryList
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RegistryList> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RegistryList::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RegistryList> executionException = new java.util.concurrent.CompletableFuture<RegistryList>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new Registry instance
     * @param body Information used to create a new Service Registry instance in a multi-tenant deployment.
     * @return a CompletableFuture of RootTypeForRegistry
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RootTypeForRegistry> post(@javax.annotation.Nonnull final RegistryCreate body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("415", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            errorMapping.put("503", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RootTypeForRegistry::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RootTypeForRegistry> executionException = new java.util.concurrent.CompletableFuture<RootTypeForRegistry>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new Registry instance
     * @param body Information used to create a new Service Registry instance in a multi-tenant deployment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of RootTypeForRegistry
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RootTypeForRegistry> post(@javax.annotation.Nonnull final RegistryCreate body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("415", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            errorMapping.put("503", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RootTypeForRegistry::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RootTypeForRegistry> executionException = new java.util.concurrent.CompletableFuture<RootTypeForRegistry>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the list of all Registry instances
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of all Registry instances
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
     * Create a new Registry instance
     * @param body Information used to create a new Service Registry instance in a multi-tenant deployment.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final RegistryCreate body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new Registry instance
     * @param body Information used to create a new Service Registry instance in a multi-tenant deployment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final RegistryCreate body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get the list of all Registry instances
     */
    public class GetQueryParameters {
        /** Specifies the order by criteria. The syntax of this parameter issimilar to the syntax of the _order by_ clause of an SQL statement.Each query can be ordered by any of the request fields.For example, to retrieve all Registry instances ordered by their name:```sqlname asc```Or to retrieve all Registry instances ordered by their name _and_ created date:```sqlname asc, created_at asc```If the parameter isn't provided, or if the value is empty, the results are ordered by name. */
        @javax.annotation.Nullable
        public String orderBy;
        /** Page index. */
        @javax.annotation.Nullable
        public Integer page;
        /** Search criteria.The syntax of this parameter is similar to the syntax of the _where_ clause of anSQL statement. Allowed fields in the search are: `name`, `status`. Allowed comparators are `=` or `LIKE`.Allowed joins are `AND` and `OR`, however there is a limit of max 10 joins in the search query.Examples:To retrieve a request with name equal `my-registry`, the value should be:```name = my-registry ```To retrieve a request with its name starting with `my`, the value should be:```name like my%25```If the parameter isn't provided, or if the value is empty, all the Registry instancesthat the user has permission to see are returned.Note: If the query is invalid, an error is returned. */
        @javax.annotation.Nullable
        public String search;
        /** Number of items in each page. */
        @javax.annotation.Nullable
        public Integer size;
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
