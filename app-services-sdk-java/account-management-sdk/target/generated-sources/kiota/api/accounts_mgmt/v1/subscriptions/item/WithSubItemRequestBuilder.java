package com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.notification_contacts.item.WithAccountItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.notification_contacts.Notification_contactsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.reserved_resources.item.WithReservedResourceItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.reserved_resources.Reserved_resourcesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.role_bindings.item.Role_bindingsItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.role_bindings.Role_bindingsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/accounts_mgmt/v1/subscriptions/{subId}
 */
public class WithSubItemRequestBuilder {
    /** The notification_contacts property */
    @javax.annotation.Nonnull
    public Notification_contactsRequestBuilder notification_contacts() {
        return new Notification_contactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The reserved_resources property */
    @javax.annotation.Nonnull
    public Reserved_resourcesRequestBuilder reserved_resources() {
        return new Reserved_resourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The role_bindings property */
    @javax.annotation.Nonnull
    public Role_bindingsRequestBuilder role_bindings() {
        return new Role_bindingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new WithSubItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithSubItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1/subscriptions/{subId}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new WithSubItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithSubItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1/subscriptions/{subId}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.notification_contacts.item collection
     * @param id Unique identifier of the item
     * @return a WithAccountItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithAccountItemRequestBuilder notification_contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accountId", id);
        return new WithAccountItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.reserved_resources.item collection
     * @param id Unique identifier of the item
     * @return a WithReservedResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithReservedResourceItemRequestBuilder reserved_resources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("reservedResourceId", id);
        return new WithReservedResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.item.role_bindings.item collection
     * @param id Unique identifier of the item
     * @return a Role_bindingsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Role_bindingsItemRequestBuilder role_bindings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Role_bindingsItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
