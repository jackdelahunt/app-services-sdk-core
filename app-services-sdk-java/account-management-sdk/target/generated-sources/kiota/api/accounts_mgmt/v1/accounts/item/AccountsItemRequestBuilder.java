package com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.labels.item.WithKeyItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.labels.LabelsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.pull_secret_rotation.item.WithRotationItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.pull_secret_rotation.Pull_secret_rotationRequestBuilder;
import com.openshift.cloud.api.accountmanagement.models.Account;
import com.openshift.cloud.api.accountmanagement.models.AccountPatchRequest;
import com.openshift.cloud.api.accountmanagement.models.Error;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/accounts_mgmt/v1/accounts/{id}
 */
public class AccountsItemRequestBuilder {
    /** The labels property */
    @javax.annotation.Nonnull
    public LabelsRequestBuilder labels() {
        return new LabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The pull_secret_rotation property */
    @javax.annotation.Nonnull
    public Pull_secret_rotationRequestBuilder pull_secret_rotation() {
        return new Pull_secret_rotationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new AccountsItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountsItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1/accounts/{id}{?fetchLabels*,fetchCapabilities*,fetchRhit*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AccountsItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountsItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1/accounts/{id}{?fetchLabels*,fetchCapabilities*,fetchRhit*}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get an account by id
     * @return a CompletableFuture of Account
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Account> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Account::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Account> executionException = new java.util.concurrent.CompletableFuture<Account>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get an account by id
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Account
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Account> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Account::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Account> executionException = new java.util.concurrent.CompletableFuture<Account>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.labels.item collection
     * @param id Unique identifier of the item
     * @return a WithKeyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithKeyItemRequestBuilder labels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("key", id);
        return new WithKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update an account
     * @param body The request body
     * @return a CompletableFuture of Account
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Account> patch(@javax.annotation.Nonnull final AccountPatchRequest body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Account::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Account> executionException = new java.util.concurrent.CompletableFuture<Account>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update an account
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Account
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Account> patch(@javax.annotation.Nonnull final AccountPatchRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", Error::createFromDiscriminatorValue);
            errorMapping.put("401", Error::createFromDiscriminatorValue);
            errorMapping.put("403", Error::createFromDiscriminatorValue);
            errorMapping.put("404", Error::createFromDiscriminatorValue);
            errorMapping.put("409", Error::createFromDiscriminatorValue);
            errorMapping.put("500", Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Account::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Account> executionException = new java.util.concurrent.CompletableFuture<Account>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.pull_secret_rotation.item collection
     * @param id Unique identifier of the item
     * @return a WithRotationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithRotationItemRequestBuilder pull_secret_rotation(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("rotationId", id);
        return new WithRotationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get an account by id
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get an account by id
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
     * Update an account
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AccountPatchRequest body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update an account
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AccountPatchRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get an account by id
     */
    public class GetQueryParameters {
        /** If true, includes the capabilities on a subscription in the output. Could slow request response time. */
        @javax.annotation.Nullable
        public Boolean fetchCapabilities;
        /** If true, includes the labels on a subscription/organization/account in the output. Could slow request response time. */
        @javax.annotation.Nullable
        public Boolean fetchLabels;
        /** If true, includes the RHIT account_id in the output. Could slow request response time. */
        @javax.annotation.Nullable
        public Boolean fetchRhit;
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
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
