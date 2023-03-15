package com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.access_token.Access_tokenRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.AccountsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item.AccountsItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.capabilities.CapabilitiesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.certificates.CertificatesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cloud_resources.Cloud_resourcesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cloud_resources.item.Cloud_resourcesItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cluster_authorizations.Cluster_authorizationsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cluster_registrations.Cluster_registrationsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cluster_transfers.Cluster_transfersRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cluster_transfers.item.Cluster_transfersItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.config.ConfigRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.current_account.Current_accountRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.default_capabilities.Default_capabilitiesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.default_capabilities.item.WithNameItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.deleted_subscriptions.Deleted_subscriptionsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.errors.ErrorsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.errors.item.ErrorsItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.feature_toggles.Feature_togglesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.feature_toggles.item.Feature_togglesItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.labels.LabelsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.landing_page.Landing_pageRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.metrics.MetricsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.notifyEscaped.NotifyRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.organizations.OrganizationsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.plans.item.PlansItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.plans.PlansRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.pull_secrets.item.WithExternalResourceItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.pull_secrets.Pull_secretsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.quota_cost.Quota_costRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.quota_rules.Quota_rulesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.quotas.item.QuotasItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.quotas.QuotasRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.registries.item.RegistriesItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.registries.RegistriesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.registry_credentials.item.Registry_credentialsItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.registry_credentials.Registry_credentialsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.reserved_resources.Reserved_resourcesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.resource_quota.Resource_quotaRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.role_bindings.item.Role_bindingsItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.role_bindings.Role_bindingsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.roles.item.RolesItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.roles.RolesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.self_entitlement.item.WithProductItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.self_entitlement.Self_entitlementRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.sku_rules.item.Sku_rulesItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.sku_rules.Sku_rulesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.skus.item.SkusItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.skus.SkusRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.subscriptions.SubscriptionsRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.support_cases.item.WithCaseItemRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.support_cases.Support_casesRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.token_authorization.Token_authorizationRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/accounts_mgmt/v1
 */
public class V1RequestBuilder {
    /** The access_token property */
    @javax.annotation.Nonnull
    public Access_tokenRequestBuilder access_token() {
        return new Access_tokenRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accounts property */
    @javax.annotation.Nonnull
    public AccountsRequestBuilder accounts() {
        return new AccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The capabilities property */
    @javax.annotation.Nonnull
    public CapabilitiesRequestBuilder capabilities() {
        return new CapabilitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The certificates property */
    @javax.annotation.Nonnull
    public CertificatesRequestBuilder certificates() {
        return new CertificatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloud_resources property */
    @javax.annotation.Nonnull
    public Cloud_resourcesRequestBuilder cloud_resources() {
        return new Cloud_resourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cluster_authorizations property */
    @javax.annotation.Nonnull
    public Cluster_authorizationsRequestBuilder cluster_authorizations() {
        return new Cluster_authorizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cluster_registrations property */
    @javax.annotation.Nonnull
    public Cluster_registrationsRequestBuilder cluster_registrations() {
        return new Cluster_registrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cluster_transfers property */
    @javax.annotation.Nonnull
    public Cluster_transfersRequestBuilder cluster_transfers() {
        return new Cluster_transfersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The config property */
    @javax.annotation.Nonnull
    public ConfigRequestBuilder config() {
        return new ConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /** The current_account property */
    @javax.annotation.Nonnull
    public Current_accountRequestBuilder current_account() {
        return new Current_accountRequestBuilder(pathParameters, requestAdapter);
    }
    /** The default_capabilities property */
    @javax.annotation.Nonnull
    public Default_capabilitiesRequestBuilder default_capabilities() {
        return new Default_capabilitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deleted_subscriptions property */
    @javax.annotation.Nonnull
    public Deleted_subscriptionsRequestBuilder deleted_subscriptions() {
        return new Deleted_subscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The errors property */
    @javax.annotation.Nonnull
    public ErrorsRequestBuilder errors() {
        return new ErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The feature_toggles property */
    @javax.annotation.Nonnull
    public Feature_togglesRequestBuilder feature_toggles() {
        return new Feature_togglesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The labels property */
    @javax.annotation.Nonnull
    public LabelsRequestBuilder labels() {
        return new LabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The landing_page property */
    @javax.annotation.Nonnull
    public Landing_pageRequestBuilder landing_page() {
        return new Landing_pageRequestBuilder(pathParameters, requestAdapter);
    }
    /** The metrics property */
    @javax.annotation.Nonnull
    public MetricsRequestBuilder metrics() {
        return new MetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The notify property */
    @javax.annotation.Nonnull
    public NotifyRequestBuilder notifyEscaped() {
        return new NotifyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The organizations property */
    @javax.annotation.Nonnull
    public OrganizationsRequestBuilder organizations() {
        return new OrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The plans property */
    @javax.annotation.Nonnull
    public PlansRequestBuilder plans() {
        return new PlansRequestBuilder(pathParameters, requestAdapter);
    }
    /** The pull_secrets property */
    @javax.annotation.Nonnull
    public Pull_secretsRequestBuilder pull_secrets() {
        return new Pull_secretsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The quota_cost property */
    @javax.annotation.Nonnull
    public Quota_costRequestBuilder quota_cost() {
        return new Quota_costRequestBuilder(pathParameters, requestAdapter);
    }
    /** The quota_rules property */
    @javax.annotation.Nonnull
    public Quota_rulesRequestBuilder quota_rules() {
        return new Quota_rulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The quotas property */
    @javax.annotation.Nonnull
    public QuotasRequestBuilder quotas() {
        return new QuotasRequestBuilder(pathParameters, requestAdapter);
    }
    /** The registries property */
    @javax.annotation.Nonnull
    public RegistriesRequestBuilder registries() {
        return new RegistriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The registry_credentials property */
    @javax.annotation.Nonnull
    public Registry_credentialsRequestBuilder registry_credentials() {
        return new Registry_credentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The reserved_resources property */
    @javax.annotation.Nonnull
    public Reserved_resourcesRequestBuilder reserved_resources() {
        return new Reserved_resourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The resource_quota property */
    @javax.annotation.Nonnull
    public Resource_quotaRequestBuilder resource_quota() {
        return new Resource_quotaRequestBuilder(pathParameters, requestAdapter);
    }
    /** The role_bindings property */
    @javax.annotation.Nonnull
    public Role_bindingsRequestBuilder role_bindings() {
        return new Role_bindingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roles property */
    @javax.annotation.Nonnull
    public RolesRequestBuilder roles() {
        return new RolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The self_entitlement property */
    @javax.annotation.Nonnull
    public Self_entitlementRequestBuilder self_entitlement() {
        return new Self_entitlementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sku_rules property */
    @javax.annotation.Nonnull
    public Sku_rulesRequestBuilder sku_rules() {
        return new Sku_rulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The skus property */
    @javax.annotation.Nonnull
    public SkusRequestBuilder skus() {
        return new SkusRequestBuilder(pathParameters, requestAdapter);
    }
    /** The subscriptions property */
    @javax.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The support_cases property */
    @javax.annotation.Nonnull
    public Support_casesRequestBuilder support_cases() {
        return new Support_casesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The token_authorization property */
    @javax.annotation.Nonnull
    public Token_authorizationRequestBuilder token_authorization() {
        return new Token_authorizationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.accounts.item collection
     * @param id Unique identifier of the item
     * @return a AccountsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccountsItemRequestBuilder accounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new AccountsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cloud_resources.item collection
     * @param id Unique identifier of the item
     * @return a Cloud_resourcesItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Cloud_resourcesItemRequestBuilder cloud_resources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Cloud_resourcesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.cluster_transfers.item collection
     * @param id Unique identifier of the item
     * @return a Cluster_transfersItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Cluster_transfersItemRequestBuilder cluster_transfers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Cluster_transfersItemRequestBuilder(urlTplParams, requestAdapter);
    }
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
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1";
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
        this.urlTemplate = "{+baseurl}/api/accounts_mgmt/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.default_capabilities.item collection
     * @param id Unique identifier of the item
     * @return a WithNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithNameItemRequestBuilder default_capabilities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("name", id);
        return new WithNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.errors.item collection
     * @param id Unique identifier of the item
     * @return a ErrorsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ErrorsItemRequestBuilder errors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ErrorsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.feature_toggles.item collection
     * @param id Unique identifier of the item
     * @return a Feature_togglesItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Feature_togglesItemRequestBuilder feature_toggles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Feature_togglesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.plans.item collection
     * @param id Unique identifier of the item
     * @return a PlansItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PlansItemRequestBuilder plans(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new PlansItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.pull_secrets.item collection
     * @param id Unique identifier of the item
     * @return a WithExternalResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithExternalResourceItemRequestBuilder pull_secrets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("externalResourceId", id);
        return new WithExternalResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.quotas.item collection
     * @param id Unique identifier of the item
     * @return a QuotasItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public QuotasItemRequestBuilder quotas(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new QuotasItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.registries.item collection
     * @param id Unique identifier of the item
     * @return a RegistriesItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RegistriesItemRequestBuilder registries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new RegistriesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.registry_credentials.item collection
     * @param id Unique identifier of the item
     * @return a Registry_credentialsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Registry_credentialsItemRequestBuilder registry_credentials(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Registry_credentialsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.role_bindings.item collection
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
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.roles.item collection
     * @param id Unique identifier of the item
     * @return a RolesItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RolesItemRequestBuilder roles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new RolesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.self_entitlement.item collection
     * @param id Unique identifier of the item
     * @return a WithProductItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithProductItemRequestBuilder self_entitlement(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("product", id);
        return new WithProductItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.sku_rules.item collection
     * @param id Unique identifier of the item
     * @return a Sku_rulesItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Sku_rulesItemRequestBuilder sku_rules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new Sku_rulesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.skus.item collection
     * @param id Unique identifier of the item
     * @return a SkusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SkusItemRequestBuilder skus(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SkusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.accountmanagement.api.accounts_mgmt.v1.support_cases.item collection
     * @param id Unique identifier of the item
     * @return a WithCaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithCaseItemRequestBuilder support_cases(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("caseId", id);
        return new WithCaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
