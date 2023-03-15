package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SelfAccessReview_resource_type implements ValuedEnum {
    AddOn("AddOn"),
    Flavour("Flavour"),
    Account("Account"),
    AccountPool("AccountPool"),
    Cluster("Cluster"),
    Plan("Plan"),
    Subscription("Subscription"),
    Organization("Organization"),
    Role("Role"),
    Permission("Permission"),
    RoleBinding("RoleBinding"),
    Registry("Registry"),
    RegistryCredential("RegistryCredential"),
    CurrentAccount("CurrentAccount"),
    AccessReview("AccessReview"),
    SelfAcccessReview("SelfAcccessReview"),
    ResourceReview("ResourceReview"),
    SelfResourceReview("SelfResourceReview"),
    ClusterRegistration("ClusterRegistration"),
    AccessToken("AccessToken"),
    ClusterAuthorization("ClusterAuthorization"),
    SelfManagedCluster("SelfManagedCluster"),
    RedhatManagedCluster("RedhatManagedCluster"),
    ExportControlReview("ExportControlReview"),
    ClusterLog("ClusterLog"),
    ClusterCredential("ClusterCredential"),
    ClusterMetric("ClusterMetric"),
    ResourceQuota("ResourceQuota"),
    ReservedResource("ReservedResource"),
    Dashboard("Dashboard"),
    ClusterProviderAndRegion("ClusterProviderAndRegion"),
    ServiceLog("ServiceLog"),
    InternalServiceLog("InternalServiceLog"),
    CSLogs("CSLogs"),
    SubscriptionLabel("SubscriptionLabel"),
    OrganizationLabel("OrganizationLabel"),
    SubscriptionLabelInternal("SubscriptionLabelInternal"),
    SelfAccessReview("SelfAccessReview"),
    SubscriptionInternal("SubscriptionInternal"),
    SubscriptionRoleBinding("SubscriptionRoleBinding");
    public final String value;
    SelfAccessReview_resource_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SelfAccessReview_resource_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AddOn": return AddOn;
            case "Flavour": return Flavour;
            case "Account": return Account;
            case "AccountPool": return AccountPool;
            case "Cluster": return Cluster;
            case "Plan": return Plan;
            case "Subscription": return Subscription;
            case "Organization": return Organization;
            case "Role": return Role;
            case "Permission": return Permission;
            case "RoleBinding": return RoleBinding;
            case "Registry": return Registry;
            case "RegistryCredential": return RegistryCredential;
            case "CurrentAccount": return CurrentAccount;
            case "AccessReview": return AccessReview;
            case "SelfAcccessReview": return SelfAcccessReview;
            case "ResourceReview": return ResourceReview;
            case "SelfResourceReview": return SelfResourceReview;
            case "ClusterRegistration": return ClusterRegistration;
            case "AccessToken": return AccessToken;
            case "ClusterAuthorization": return ClusterAuthorization;
            case "SelfManagedCluster": return SelfManagedCluster;
            case "RedhatManagedCluster": return RedhatManagedCluster;
            case "ExportControlReview": return ExportControlReview;
            case "ClusterLog": return ClusterLog;
            case "ClusterCredential": return ClusterCredential;
            case "ClusterMetric": return ClusterMetric;
            case "ResourceQuota": return ResourceQuota;
            case "ReservedResource": return ReservedResource;
            case "Dashboard": return Dashboard;
            case "ClusterProviderAndRegion": return ClusterProviderAndRegion;
            case "ServiceLog": return ServiceLog;
            case "InternalServiceLog": return InternalServiceLog;
            case "CSLogs": return CSLogs;
            case "SubscriptionLabel": return SubscriptionLabel;
            case "OrganizationLabel": return OrganizationLabel;
            case "SubscriptionLabelInternal": return SubscriptionLabelInternal;
            case "SelfAccessReview": return SelfAccessReview;
            case "SubscriptionInternal": return SubscriptionInternal;
            case "SubscriptionRoleBinding": return SubscriptionRoleBinding;
            default: return null;
        }
    }
}
