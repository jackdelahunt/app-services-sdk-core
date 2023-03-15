package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubscriptionCommonFields extends ObjectReference implements Parsable {
    /** If set, the date the subscription expires based on the billing model */
    private OffsetDateTime billingExpirationDate;
    /** The billing_marketplace_account property */
    private String billingMarketplaceAccount;
    /** The cloud_account_id property */
    private String cloudAccountId;
    /** The cloud_provider_id property */
    private String cloudProviderId;
    /** The cluster_billing_model property */
    private String clusterBillingModel;
    /** The cluster_id property */
    private String clusterId;
    /** The console_url property */
    private String consoleUrl;
    /** The consumer_uuid property */
    private String consumerUuid;
    /** The cpu_total property */
    private Integer cpuTotal;
    /** The creator_id property */
    private String creatorId;
    /** The display_name property */
    private String displayName;
    /** The external_cluster_id property */
    private String externalClusterId;
    /** Last time this subscription were reconciled about cluster usage */
    private OffsetDateTime lastReconcileDate;
    /** Last time status was set to Released for this cluster/subscription in Unix time */
    private OffsetDateTime lastReleasedAt;
    /** Last telemetry authorization request for this cluster/subscription in Unix time */
    private OffsetDateTime lastTelemetryDate;
    /** The managed property */
    private Boolean managed;
    /** The organization_id property */
    private String organizationId;
    /** The plan_id property */
    private String planId;
    /** The product_bundle property */
    private SubscriptionCommonFields_product_bundle productBundle;
    /** The provenance property */
    private String provenance;
    /** The region_id property */
    private String regionId;
    /** The released property */
    private Boolean released;
    /** The service_level property */
    private SubscriptionCommonFields_service_level serviceLevel;
    /** The socket_total property */
    private Integer socketTotal;
    /** The status property */
    private String status;
    /** The support_level property */
    private SubscriptionCommonFields_support_level supportLevel;
    /** The system_units property */
    private SubscriptionCommonFields_system_units systemUnits;
    /** If the subscription is a trial, date the trial ends */
    private OffsetDateTime trialEndDate;
    /** The usage property */
    private SubscriptionCommonFields_usage usage;
    /**
     * Instantiates a new SubscriptionCommonFields and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubscriptionCommonFields() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubscriptionCommonFields
     */
    @javax.annotation.Nonnull
    public static SubscriptionCommonFields createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionCommonFields();
    }
    /**
     * Gets the billing_expiration_date property value. If set, the date the subscription expires based on the billing model
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBillingExpirationDate() {
        return this.billingExpirationDate;
    }
    /**
     * Gets the billing_marketplace_account property value. The billing_marketplace_account property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingMarketplaceAccount() {
        return this.billingMarketplaceAccount;
    }
    /**
     * Gets the cloud_account_id property value. The cloud_account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }
    /**
     * Gets the cloud_provider_id property value. The cloud_provider_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProviderId() {
        return this.cloudProviderId;
    }
    /**
     * Gets the cluster_billing_model property value. The cluster_billing_model property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterBillingModel() {
        return this.clusterBillingModel;
    }
    /**
     * Gets the cluster_id property value. The cluster_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * Gets the console_url property value. The console_url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConsoleUrl() {
        return this.consoleUrl;
    }
    /**
     * Gets the consumer_uuid property value. The consumer_uuid property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConsumerUuid() {
        return this.consumerUuid;
    }
    /**
     * Gets the cpu_total property value. The cpu_total property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCpuTotal() {
        return this.cpuTotal;
    }
    /**
     * Gets the creator_id property value. The creator_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatorId() {
        return this.creatorId;
    }
    /**
     * Gets the display_name property value. The display_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the external_cluster_id property value. The external_cluster_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalClusterId() {
        return this.externalClusterId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billing_expiration_date", (n) -> { this.setBillingExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("billing_marketplace_account", (n) -> { this.setBillingMarketplaceAccount(n.getStringValue()); });
        deserializerMap.put("cloud_account_id", (n) -> { this.setCloudAccountId(n.getStringValue()); });
        deserializerMap.put("cloud_provider_id", (n) -> { this.setCloudProviderId(n.getStringValue()); });
        deserializerMap.put("cluster_billing_model", (n) -> { this.setClusterBillingModel(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("console_url", (n) -> { this.setConsoleUrl(n.getStringValue()); });
        deserializerMap.put("consumer_uuid", (n) -> { this.setConsumerUuid(n.getStringValue()); });
        deserializerMap.put("cpu_total", (n) -> { this.setCpuTotal(n.getIntegerValue()); });
        deserializerMap.put("creator_id", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("external_cluster_id", (n) -> { this.setExternalClusterId(n.getStringValue()); });
        deserializerMap.put("last_reconcile_date", (n) -> { this.setLastReconcileDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("last_released_at", (n) -> { this.setLastReleasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("last_telemetry_date", (n) -> { this.setLastTelemetryDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managed", (n) -> { this.setManaged(n.getBooleanValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("product_bundle", (n) -> { this.setProductBundle(n.getEnumValue(SubscriptionCommonFields_product_bundle.class)); });
        deserializerMap.put("provenance", (n) -> { this.setProvenance(n.getStringValue()); });
        deserializerMap.put("region_id", (n) -> { this.setRegionId(n.getStringValue()); });
        deserializerMap.put("released", (n) -> { this.setReleased(n.getBooleanValue()); });
        deserializerMap.put("service_level", (n) -> { this.setServiceLevel(n.getEnumValue(SubscriptionCommonFields_service_level.class)); });
        deserializerMap.put("socket_total", (n) -> { this.setSocketTotal(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("support_level", (n) -> { this.setSupportLevel(n.getEnumValue(SubscriptionCommonFields_support_level.class)); });
        deserializerMap.put("system_units", (n) -> { this.setSystemUnits(n.getEnumValue(SubscriptionCommonFields_system_units.class)); });
        deserializerMap.put("trial_end_date", (n) -> { this.setTrialEndDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getEnumValue(SubscriptionCommonFields_usage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the last_reconcile_date property value. Last time this subscription were reconciled about cluster usage
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReconcileDate() {
        return this.lastReconcileDate;
    }
    /**
     * Gets the last_released_at property value. Last time status was set to Released for this cluster/subscription in Unix time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReleasedAt() {
        return this.lastReleasedAt;
    }
    /**
     * Gets the last_telemetry_date property value. Last telemetry authorization request for this cluster/subscription in Unix time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastTelemetryDate() {
        return this.lastTelemetryDate;
    }
    /**
     * Gets the managed property value. The managed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManaged() {
        return this.managed;
    }
    /**
     * Gets the organization_id property value. The organization_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the plan_id property value. The plan_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the product_bundle property value. The product_bundle property
     * @return a SubscriptionCommonFields_product_bundle
     */
    @javax.annotation.Nullable
    public SubscriptionCommonFields_product_bundle getProductBundle() {
        return this.productBundle;
    }
    /**
     * Gets the provenance property value. The provenance property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvenance() {
        return this.provenance;
    }
    /**
     * Gets the region_id property value. The region_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegionId() {
        return this.regionId;
    }
    /**
     * Gets the released property value. The released property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReleased() {
        return this.released;
    }
    /**
     * Gets the service_level property value. The service_level property
     * @return a SubscriptionCommonFields_service_level
     */
    @javax.annotation.Nullable
    public SubscriptionCommonFields_service_level getServiceLevel() {
        return this.serviceLevel;
    }
    /**
     * Gets the socket_total property value. The socket_total property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSocketTotal() {
        return this.socketTotal;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the support_level property value. The support_level property
     * @return a SubscriptionCommonFields_support_level
     */
    @javax.annotation.Nullable
    public SubscriptionCommonFields_support_level getSupportLevel() {
        return this.supportLevel;
    }
    /**
     * Gets the system_units property value. The system_units property
     * @return a SubscriptionCommonFields_system_units
     */
    @javax.annotation.Nullable
    public SubscriptionCommonFields_system_units getSystemUnits() {
        return this.systemUnits;
    }
    /**
     * Gets the trial_end_date property value. If the subscription is a trial, date the trial ends
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTrialEndDate() {
        return this.trialEndDate;
    }
    /**
     * Gets the usage property value. The usage property
     * @return a SubscriptionCommonFields_usage
     */
    @javax.annotation.Nullable
    public SubscriptionCommonFields_usage getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("billing_expiration_date", this.getBillingExpirationDate());
        writer.writeStringValue("billing_marketplace_account", this.getBillingMarketplaceAccount());
        writer.writeStringValue("cloud_account_id", this.getCloudAccountId());
        writer.writeStringValue("cloud_provider_id", this.getCloudProviderId());
        writer.writeStringValue("cluster_billing_model", this.getClusterBillingModel());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("console_url", this.getConsoleUrl());
        writer.writeStringValue("consumer_uuid", this.getConsumerUuid());
        writer.writeIntegerValue("cpu_total", this.getCpuTotal());
        writer.writeStringValue("creator_id", this.getCreatorId());
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeStringValue("external_cluster_id", this.getExternalClusterId());
        writer.writeOffsetDateTimeValue("last_reconcile_date", this.getLastReconcileDate());
        writer.writeOffsetDateTimeValue("last_released_at", this.getLastReleasedAt());
        writer.writeOffsetDateTimeValue("last_telemetry_date", this.getLastTelemetryDate());
        writer.writeBooleanValue("managed", this.getManaged());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeEnumValue("product_bundle", this.getProductBundle());
        writer.writeStringValue("provenance", this.getProvenance());
        writer.writeStringValue("region_id", this.getRegionId());
        writer.writeBooleanValue("released", this.getReleased());
        writer.writeEnumValue("service_level", this.getServiceLevel());
        writer.writeIntegerValue("socket_total", this.getSocketTotal());
        writer.writeStringValue("status", this.getStatus());
        writer.writeEnumValue("support_level", this.getSupportLevel());
        writer.writeEnumValue("system_units", this.getSystemUnits());
        writer.writeOffsetDateTimeValue("trial_end_date", this.getTrialEndDate());
        writer.writeEnumValue("usage", this.getUsage());
    }
    /**
     * Sets the billing_expiration_date property value. If set, the date the subscription expires based on the billing model
     * @param value Value to set for the billingExpirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingExpirationDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.billingExpirationDate = value;
    }
    /**
     * Sets the billing_marketplace_account property value. The billing_marketplace_account property
     * @param value Value to set for the billingMarketplaceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingMarketplaceAccount(@javax.annotation.Nullable final String value) {
        this.billingMarketplaceAccount = value;
    }
    /**
     * Sets the cloud_account_id property value. The cloud_account_id property
     * @param value Value to set for the cloudAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAccountId(@javax.annotation.Nullable final String value) {
        this.cloudAccountId = value;
    }
    /**
     * Sets the cloud_provider_id property value. The cloud_provider_id property
     * @param value Value to set for the cloudProviderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProviderId(@javax.annotation.Nullable final String value) {
        this.cloudProviderId = value;
    }
    /**
     * Sets the cluster_billing_model property value. The cluster_billing_model property
     * @param value Value to set for the clusterBillingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterBillingModel(@javax.annotation.Nullable final String value) {
        this.clusterBillingModel = value;
    }
    /**
     * Sets the cluster_id property value. The cluster_id property
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the console_url property value. The console_url property
     * @param value Value to set for the consoleUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsoleUrl(@javax.annotation.Nullable final String value) {
        this.consoleUrl = value;
    }
    /**
     * Sets the consumer_uuid property value. The consumer_uuid property
     * @param value Value to set for the consumerUuid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsumerUuid(@javax.annotation.Nullable final String value) {
        this.consumerUuid = value;
    }
    /**
     * Sets the cpu_total property value. The cpu_total property
     * @param value Value to set for the cpuTotal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCpuTotal(@javax.annotation.Nullable final Integer value) {
        this.cpuTotal = value;
    }
    /**
     * Sets the creator_id property value. The creator_id property
     * @param value Value to set for the creatorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatorId(@javax.annotation.Nullable final String value) {
        this.creatorId = value;
    }
    /**
     * Sets the display_name property value. The display_name property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the external_cluster_id property value. The external_cluster_id property
     * @param value Value to set for the externalClusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalClusterId(@javax.annotation.Nullable final String value) {
        this.externalClusterId = value;
    }
    /**
     * Sets the last_reconcile_date property value. Last time this subscription were reconciled about cluster usage
     * @param value Value to set for the lastReconcileDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReconcileDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastReconcileDate = value;
    }
    /**
     * Sets the last_released_at property value. Last time status was set to Released for this cluster/subscription in Unix time
     * @param value Value to set for the lastReleasedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReleasedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastReleasedAt = value;
    }
    /**
     * Sets the last_telemetry_date property value. Last telemetry authorization request for this cluster/subscription in Unix time
     * @param value Value to set for the lastTelemetryDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastTelemetryDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastTelemetryDate = value;
    }
    /**
     * Sets the managed property value. The managed property
     * @param value Value to set for the managed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManaged(@javax.annotation.Nullable final Boolean value) {
        this.managed = value;
    }
    /**
     * Sets the organization_id property value. The organization_id property
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the plan_id property value. The plan_id property
     * @param value Value to set for the planId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanId(@javax.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the product_bundle property value. The product_bundle property
     * @param value Value to set for the productBundle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductBundle(@javax.annotation.Nullable final SubscriptionCommonFields_product_bundle value) {
        this.productBundle = value;
    }
    /**
     * Sets the provenance property value. The provenance property
     * @param value Value to set for the provenance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvenance(@javax.annotation.Nullable final String value) {
        this.provenance = value;
    }
    /**
     * Sets the region_id property value. The region_id property
     * @param value Value to set for the regionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegionId(@javax.annotation.Nullable final String value) {
        this.regionId = value;
    }
    /**
     * Sets the released property value. The released property
     * @param value Value to set for the released property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReleased(@javax.annotation.Nullable final Boolean value) {
        this.released = value;
    }
    /**
     * Sets the service_level property value. The service_level property
     * @param value Value to set for the serviceLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceLevel(@javax.annotation.Nullable final SubscriptionCommonFields_service_level value) {
        this.serviceLevel = value;
    }
    /**
     * Sets the socket_total property value. The socket_total property
     * @param value Value to set for the socketTotal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSocketTotal(@javax.annotation.Nullable final Integer value) {
        this.socketTotal = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the support_level property value. The support_level property
     * @param value Value to set for the supportLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportLevel(@javax.annotation.Nullable final SubscriptionCommonFields_support_level value) {
        this.supportLevel = value;
    }
    /**
     * Sets the system_units property value. The system_units property
     * @param value Value to set for the systemUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUnits(@javax.annotation.Nullable final SubscriptionCommonFields_system_units value) {
        this.systemUnits = value;
    }
    /**
     * Sets the trial_end_date property value. If the subscription is a trial, date the trial ends
     * @param value Value to set for the trialEndDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrialEndDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.trialEndDate = value;
    }
    /**
     * Sets the usage property value. The usage property
     * @param value Value to set for the usage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsage(@javax.annotation.Nullable final SubscriptionCommonFields_usage value) {
        this.usage = value;
    }
}
