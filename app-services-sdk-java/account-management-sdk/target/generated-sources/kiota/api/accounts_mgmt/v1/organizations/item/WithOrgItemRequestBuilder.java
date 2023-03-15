package com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.account_group_assignments.Account_group_assignmentsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.account_group_assignments.item.WithAcctGrpAsgnItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.account_groups.Account_groupsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.account_groups.item.WithAcctGrpItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.consumed_quota.Consumed_quotaRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.quota_cost.Quota_costRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.resource_quota.item.WithQuotaItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.resource_quota.Resource_quotaRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/accounts_mgmt/v1/organizations/{orgId}
 */
public class WithOrgItemRequestBuilder {
    /** The account_group_assignments property */
    @javax.annotation.Nonnull
    public Account_group_assignmentsRequestBuilder account_group_assignments() {
        return new Account_group_assignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The account_groups property */
    @javax.annotation.Nonnull
    public Account_groupsRequestBuilder account_groups() {
        return new Account_groupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The consumed_quota property */
    @javax.annotation.Nonnull
    public Consumed_quotaRequestBuilder consumed_quota() {
        return new Consumed_quotaRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The quota_cost property */
    @javax.annotation.Nonnull
    public Quota_costRequestBuilder quota_cost() {
        return new Quota_costRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The resource_quota property */
    @javax.annotation.Nonnull
    public Resource_quotaRequestBuilder resource_quota() {
        return new Resource_quotaRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.account_group_assignments.item collection
     * @param id Unique identifier of the item
     * @return a WithAcctGrpAsgnItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithAcctGrpAsgnItemRequestBuilder account_group_assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("acctGrpAsgnId", id);
        return new WithAcctGrpAsgnItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.account_groups.item collection
     * @param id Unique identifier of the item
     * @return a WithAcctGrpItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithAcctGrpItemRequestBuilder account_groups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("acctGrpId", id);
        return new WithAcctGrpItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new WithOrgItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithOrgItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1/organizations/{orgId}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new WithOrgItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithOrgItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1/organizations/{orgId}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.item.resource_quota.item collection
     * @param id Unique identifier of the item
     * @return a WithQuotaItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithQuotaItemRequestBuilder resource_quota(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("quotaId", id);
        return new WithQuotaItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
