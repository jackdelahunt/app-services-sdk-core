package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KafkaRequest extends VersionMetadata_collections implements Parsable {
    /** The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a 'ready' state */
    private String adminApiServerUrl;
    /** The billing_cloud_account_id property */
    private String billingCloudAccountId;
    /** The billing_model property */
    private String billingModel;
    /** The bootstrap_server_host property */
    private String bootstrapServerHost;
    /** The browser_url property */
    private String browserUrl;
    /** Name of Cloud used to deploy. For example AWS */
    private String cloudProvider;
    /** The ID of the data plane where Kafka is deployed on. This information is only returned for kafka whose billing model is enterprise */
    private String clusterId;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private String egressThroughputPerSec;
    /** The expires_at property */
    private OffsetDateTime expiresAt;
    /** The failed_reason property */
    private String failedReason;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private String ingressThroughputPerSec;
    /** The instance_type property */
    private String instanceType;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private String instanceTypeName;
    /** The marketplace property */
    private String marketplace;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private Integer maxConnectionAttemptsPerSec;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private String maxDataRetentionPeriod;
    /** The max_data_retention_size property */
    private SupportedKafkaSizeBytesValueItem maxDataRetentionSize;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private Integer maxPartitions;
    /** The multi_az property */
    private Boolean multiAz;
    /** The name property */
    private String name;
    /** The owner property */
    private String owner;
    /** Details of the Kafka request promotion. It can be set when a Kafka request promotion is in progress or has failed */
    private String promotionDetails;
    /** Status of the Kafka request promotion. Possible values: ['promoting', 'failed']. If unset it means no promotion is in progress. */
    private String promotionStatus;
    /** The reauthentication_enabled property */
    private Boolean reauthenticationEnabled;
    /** Values will be regions of specific cloud provider. For example: us-east-1 for AWS */
    private String region;
    /** The size_id property */
    private String sizeId;
    /** Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting, suspending, suspended, resuming]  */
    private String status;
    /** This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead. */
    private Integer totalMaxConnections;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /** The version property */
    private String version;
    /**
     * Instantiates a new KafkaRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkaRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KafkaRequest
     */
    @javax.annotation.Nonnull
    public static KafkaRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KafkaRequest();
    }
    /**
     * Gets the admin_api_server_url property value. The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a 'ready' state
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdminApiServerUrl() {
        return this.adminApiServerUrl;
    }
    /**
     * Gets the billing_cloud_account_id property value. The billing_cloud_account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingCloudAccountId() {
        return this.billingCloudAccountId;
    }
    /**
     * Gets the billing_model property value. The billing_model property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingModel() {
        return this.billingModel;
    }
    /**
     * Gets the bootstrap_server_host property value. The bootstrap_server_host property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBootstrapServerHost() {
        return this.bootstrapServerHost;
    }
    /**
     * Gets the browser_url property value. The browser_url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserUrl() {
        return this.browserUrl;
    }
    /**
     * Gets the cloud_provider property value. Name of Cloud used to deploy. For example AWS
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Gets the cluster_id property value. The ID of the data plane where Kafka is deployed on. This information is only returned for kafka whose billing model is enterprise
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the egress_throughput_per_sec property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEgressThroughputPerSec() {
        return this.egressThroughputPerSec;
    }
    /**
     * Gets the expires_at property value. The expires_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * Gets the failed_reason property value. The failed_reason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailedReason() {
        return this.failedReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("admin_api_server_url", (n) -> { this.setAdminApiServerUrl(n.getStringValue()); });
        deserializerMap.put("billing_cloud_account_id", (n) -> { this.setBillingCloudAccountId(n.getStringValue()); });
        deserializerMap.put("billing_model", (n) -> { this.setBillingModel(n.getStringValue()); });
        deserializerMap.put("bootstrap_server_host", (n) -> { this.setBootstrapServerHost(n.getStringValue()); });
        deserializerMap.put("browser_url", (n) -> { this.setBrowserUrl(n.getStringValue()); });
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("egress_throughput_per_sec", (n) -> { this.setEgressThroughputPerSec(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failed_reason", (n) -> { this.setFailedReason(n.getStringValue()); });
        deserializerMap.put("ingress_throughput_per_sec", (n) -> { this.setIngressThroughputPerSec(n.getStringValue()); });
        deserializerMap.put("instance_type", (n) -> { this.setInstanceType(n.getStringValue()); });
        deserializerMap.put("instance_type_name", (n) -> { this.setInstanceTypeName(n.getStringValue()); });
        deserializerMap.put("marketplace", (n) -> { this.setMarketplace(n.getStringValue()); });
        deserializerMap.put("max_connection_attempts_per_sec", (n) -> { this.setMaxConnectionAttemptsPerSec(n.getIntegerValue()); });
        deserializerMap.put("max_data_retention_period", (n) -> { this.setMaxDataRetentionPeriod(n.getStringValue()); });
        deserializerMap.put("max_data_retention_size", (n) -> { this.setMaxDataRetentionSize(n.getObjectValue(SupportedKafkaSizeBytesValueItem::createFromDiscriminatorValue)); });
        deserializerMap.put("max_partitions", (n) -> { this.setMaxPartitions(n.getIntegerValue()); });
        deserializerMap.put("multi_az", (n) -> { this.setMultiAz(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("promotion_details", (n) -> { this.setPromotionDetails(n.getStringValue()); });
        deserializerMap.put("promotion_status", (n) -> { this.setPromotionStatus(n.getStringValue()); });
        deserializerMap.put("reauthentication_enabled", (n) -> { this.setReauthenticationEnabled(n.getBooleanValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("size_id", (n) -> { this.setSizeId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("total_max_connections", (n) -> { this.setTotalMaxConnections(n.getIntegerValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ingress_throughput_per_sec property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIngressThroughputPerSec() {
        return this.ingressThroughputPerSec;
    }
    /**
     * Gets the instance_type property value. The instance_type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets the instance_type_name property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceTypeName() {
        return this.instanceTypeName;
    }
    /**
     * Gets the marketplace property value. The marketplace property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMarketplace() {
        return this.marketplace;
    }
    /**
     * Gets the max_connection_attempts_per_sec property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxConnectionAttemptsPerSec() {
        return this.maxConnectionAttemptsPerSec;
    }
    /**
     * Gets the max_data_retention_period property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaxDataRetentionPeriod() {
        return this.maxDataRetentionPeriod;
    }
    /**
     * Gets the max_data_retention_size property value. The max_data_retention_size property
     * @return a SupportedKafkaSizeBytesValueItem
     */
    @javax.annotation.Nullable
    public SupportedKafkaSizeBytesValueItem getMaxDataRetentionSize() {
        return this.maxDataRetentionSize;
    }
    /**
     * Gets the max_partitions property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxPartitions() {
        return this.maxPartitions;
    }
    /**
     * Gets the multi_az property value. The multi_az property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMultiAz() {
        return this.multiAz;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the owner property value. The owner property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the promotion_details property value. Details of the Kafka request promotion. It can be set when a Kafka request promotion is in progress or has failed
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPromotionDetails() {
        return this.promotionDetails;
    }
    /**
     * Gets the promotion_status property value. Status of the Kafka request promotion. Possible values: ['promoting', 'failed']. If unset it means no promotion is in progress.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPromotionStatus() {
        return this.promotionStatus;
    }
    /**
     * Gets the reauthentication_enabled property value. The reauthentication_enabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReauthenticationEnabled() {
        return this.reauthenticationEnabled;
    }
    /**
     * Gets the region property value. Values will be regions of specific cloud provider. For example: us-east-1 for AWS
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the size_id property value. The size_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSizeId() {
        return this.sizeId;
    }
    /**
     * Gets the status property value. Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting, suspending, suspended, resuming] 
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the total_max_connections property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalMaxConnections() {
        return this.totalMaxConnections;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeStringValue("admin_api_server_url", this.getAdminApiServerUrl());
        writer.writeStringValue("billing_cloud_account_id", this.getBillingCloudAccountId());
        writer.writeStringValue("billing_model", this.getBillingModel());
        writer.writeStringValue("bootstrap_server_host", this.getBootstrapServerHost());
        writer.writeStringValue("browser_url", this.getBrowserUrl());
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("egress_throughput_per_sec", this.getEgressThroughputPerSec());
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("failed_reason", this.getFailedReason());
        writer.writeStringValue("ingress_throughput_per_sec", this.getIngressThroughputPerSec());
        writer.writeStringValue("instance_type", this.getInstanceType());
        writer.writeStringValue("instance_type_name", this.getInstanceTypeName());
        writer.writeStringValue("marketplace", this.getMarketplace());
        writer.writeIntegerValue("max_connection_attempts_per_sec", this.getMaxConnectionAttemptsPerSec());
        writer.writeStringValue("max_data_retention_period", this.getMaxDataRetentionPeriod());
        writer.writeObjectValue("max_data_retention_size", this.getMaxDataRetentionSize());
        writer.writeIntegerValue("max_partitions", this.getMaxPartitions());
        writer.writeBooleanValue("multi_az", this.getMultiAz());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("promotion_details", this.getPromotionDetails());
        writer.writeStringValue("promotion_status", this.getPromotionStatus());
        writer.writeBooleanValue("reauthentication_enabled", this.getReauthenticationEnabled());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("size_id", this.getSizeId());
        writer.writeStringValue("status", this.getStatus());
        writer.writeIntegerValue("total_max_connections", this.getTotalMaxConnections());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the admin_api_server_url property value. The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a 'ready' state
     * @param value Value to set for the adminApiServerUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminApiServerUrl(@javax.annotation.Nullable final String value) {
        this.adminApiServerUrl = value;
    }
    /**
     * Sets the billing_cloud_account_id property value. The billing_cloud_account_id property
     * @param value Value to set for the billingCloudAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingCloudAccountId(@javax.annotation.Nullable final String value) {
        this.billingCloudAccountId = value;
    }
    /**
     * Sets the billing_model property value. The billing_model property
     * @param value Value to set for the billingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingModel(@javax.annotation.Nullable final String value) {
        this.billingModel = value;
    }
    /**
     * Sets the bootstrap_server_host property value. The bootstrap_server_host property
     * @param value Value to set for the bootstrapServerHost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootstrapServerHost(@javax.annotation.Nullable final String value) {
        this.bootstrapServerHost = value;
    }
    /**
     * Sets the browser_url property value. The browser_url property
     * @param value Value to set for the browserUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserUrl(@javax.annotation.Nullable final String value) {
        this.browserUrl = value;
    }
    /**
     * Sets the cloud_provider property value. Name of Cloud used to deploy. For example AWS
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the cluster_id property value. The ID of the data plane where Kafka is deployed on. This information is only returned for kafka whose billing model is enterprise
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the egress_throughput_per_sec property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the egressThroughputPerSec property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEgressThroughputPerSec(@javax.annotation.Nullable final String value) {
        this.egressThroughputPerSec = value;
    }
    /**
     * Sets the expires_at property value. The expires_at property
     * @param value Value to set for the expiresAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiresAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the failed_reason property value. The failed_reason property
     * @param value Value to set for the failedReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedReason(@javax.annotation.Nullable final String value) {
        this.failedReason = value;
    }
    /**
     * Sets the ingress_throughput_per_sec property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the ingressThroughputPerSec property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIngressThroughputPerSec(@javax.annotation.Nullable final String value) {
        this.ingressThroughputPerSec = value;
    }
    /**
     * Sets the instance_type property value. The instance_type property
     * @param value Value to set for the instanceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceType(@javax.annotation.Nullable final String value) {
        this.instanceType = value;
    }
    /**
     * Sets the instance_type_name property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the instanceTypeName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceTypeName(@javax.annotation.Nullable final String value) {
        this.instanceTypeName = value;
    }
    /**
     * Sets the marketplace property value. The marketplace property
     * @param value Value to set for the marketplace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMarketplace(@javax.annotation.Nullable final String value) {
        this.marketplace = value;
    }
    /**
     * Sets the max_connection_attempts_per_sec property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the maxConnectionAttemptsPerSec property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxConnectionAttemptsPerSec(@javax.annotation.Nullable final Integer value) {
        this.maxConnectionAttemptsPerSec = value;
    }
    /**
     * Sets the max_data_retention_period property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the maxDataRetentionPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxDataRetentionPeriod(@javax.annotation.Nullable final String value) {
        this.maxDataRetentionPeriod = value;
    }
    /**
     * Sets the max_data_retention_size property value. The max_data_retention_size property
     * @param value Value to set for the maxDataRetentionSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxDataRetentionSize(@javax.annotation.Nullable final SupportedKafkaSizeBytesValueItem value) {
        this.maxDataRetentionSize = value;
    }
    /**
     * Sets the max_partitions property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the maxPartitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxPartitions(@javax.annotation.Nullable final Integer value) {
        this.maxPartitions = value;
    }
    /**
     * Sets the multi_az property value. The multi_az property
     * @param value Value to set for the multiAz property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiAz(@javax.annotation.Nullable final Boolean value) {
        this.multiAz = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the promotion_details property value. Details of the Kafka request promotion. It can be set when a Kafka request promotion is in progress or has failed
     * @param value Value to set for the promotionDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPromotionDetails(@javax.annotation.Nullable final String value) {
        this.promotionDetails = value;
    }
    /**
     * Sets the promotion_status property value. Status of the Kafka request promotion. Possible values: ['promoting', 'failed']. If unset it means no promotion is in progress.
     * @param value Value to set for the promotionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPromotionStatus(@javax.annotation.Nullable final String value) {
        this.promotionStatus = value;
    }
    /**
     * Sets the reauthentication_enabled property value. The reauthentication_enabled property
     * @param value Value to set for the reauthenticationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReauthenticationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.reauthenticationEnabled = value;
    }
    /**
     * Sets the region property value. Values will be regions of specific cloud provider. For example: us-east-1 for AWS
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the size_id property value. The size_id property
     * @param value Value to set for the sizeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizeId(@javax.annotation.Nullable final String value) {
        this.sizeId = value;
    }
    /**
     * Sets the status property value. Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting, suspending, suspended, resuming] 
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the total_max_connections property value. This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
     * @param value Value to set for the totalMaxConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalMaxConnections(@javax.annotation.Nullable final Integer value) {
        this.totalMaxConnections = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
