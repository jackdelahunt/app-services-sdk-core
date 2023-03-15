package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Supported Kafka Size
 */
public class SupportedKafkaInstanceType_sizes implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Data plane cluster capacity consumed by this Kafka instance size. */
    private Integer capacityConsumed;
    /** Display name of this Kafka instance size. */
    private String displayName;
    /** The egress_throughput_per_sec property */
    private SupportedKafkaSizeBytesValueItem egressThroughputPerSec;
    /** Unique identifier of this Kafka instance size. */
    private String id;
    /** The ingress_throughput_per_sec property */
    private SupportedKafkaSizeBytesValueItem ingressThroughputPerSec;
    /** The limit lifespan of the kafka instance in seconds. If not specified then the instance never expires. */
    private Integer lifespanSeconds;
    /** Maturity level of the size. Can be "stable" or "preview". */
    private String maturityStatus;
    /** Maximium connection attempts per second available to this Kafka instance size. */
    private Integer maxConnectionAttemptsPerSec;
    /** Maximum data retention period available to this Kafka instance size. */
    private String maxDataRetentionPeriod;
    /** The max_data_retention_size property */
    private SupportedKafkaSizeBytesValueItem maxDataRetentionSize;
    /** The max_message_size property */
    private SupportedKafkaSizeBytesValueItem maxMessageSize;
    /** Maximum amount of total partitions available to this Kafka instance size. */
    private Integer maxPartitions;
    /** Minimum number of in-sync replicas. */
    private Integer minInSyncReplicas;
    /** Quota consumed by this Kafka instance size. */
    private Integer quotaConsumed;
    /** Quota type used by this Kafka instance size. This is now deprecated, please refer to supported_billing_models at instance-type level instead. */
    private String quotaType;
    /** Replication factor available to this Kafka instance size. */
    private Integer replicationFactor;
    /** List of Availability Zone modes that this Kafka instance size supports. The possible values are "single", "multi". */
    private java.util.List<String> supportedAzModes;
    /** Maximum amount of total connections available to this Kafka instance size. */
    private Integer totalMaxConnections;
    /**
     * Instantiates a new SupportedKafkaInstanceType_sizes and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SupportedKafkaInstanceType_sizes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SupportedKafkaInstanceType_sizes
     */
    @javax.annotation.Nonnull
    public static SupportedKafkaInstanceType_sizes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SupportedKafkaInstanceType_sizes();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the capacity_consumed property value. Data plane cluster capacity consumed by this Kafka instance size.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCapacityConsumed() {
        return this.capacityConsumed;
    }
    /**
     * Gets the display_name property value. Display name of this Kafka instance size.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the egress_throughput_per_sec property value. The egress_throughput_per_sec property
     * @return a SupportedKafkaSizeBytesValueItem
     */
    @javax.annotation.Nullable
    public SupportedKafkaSizeBytesValueItem getEgressThroughputPerSec() {
        return this.egressThroughputPerSec;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("capacity_consumed", (n) -> { this.setCapacityConsumed(n.getIntegerValue()); });
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("egress_throughput_per_sec", (n) -> { this.setEgressThroughputPerSec(n.getObjectValue(SupportedKafkaSizeBytesValueItem::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("ingress_throughput_per_sec", (n) -> { this.setIngressThroughputPerSec(n.getObjectValue(SupportedKafkaSizeBytesValueItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lifespan_seconds", (n) -> { this.setLifespanSeconds(n.getIntegerValue()); });
        deserializerMap.put("maturity_status", (n) -> { this.setMaturityStatus(n.getStringValue()); });
        deserializerMap.put("max_connection_attempts_per_sec", (n) -> { this.setMaxConnectionAttemptsPerSec(n.getIntegerValue()); });
        deserializerMap.put("max_data_retention_period", (n) -> { this.setMaxDataRetentionPeriod(n.getStringValue()); });
        deserializerMap.put("max_data_retention_size", (n) -> { this.setMaxDataRetentionSize(n.getObjectValue(SupportedKafkaSizeBytesValueItem::createFromDiscriminatorValue)); });
        deserializerMap.put("max_message_size", (n) -> { this.setMaxMessageSize(n.getObjectValue(SupportedKafkaSizeBytesValueItem::createFromDiscriminatorValue)); });
        deserializerMap.put("max_partitions", (n) -> { this.setMaxPartitions(n.getIntegerValue()); });
        deserializerMap.put("min_in_sync_replicas", (n) -> { this.setMinInSyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("quota_consumed", (n) -> { this.setQuotaConsumed(n.getIntegerValue()); });
        deserializerMap.put("quota_type", (n) -> { this.setQuotaType(n.getStringValue()); });
        deserializerMap.put("replication_factor", (n) -> { this.setReplicationFactor(n.getIntegerValue()); });
        deserializerMap.put("supported_az_modes", (n) -> { this.setSupportedAzModes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("total_max_connections", (n) -> { this.setTotalMaxConnections(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier of this Kafka instance size.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the ingress_throughput_per_sec property value. The ingress_throughput_per_sec property
     * @return a SupportedKafkaSizeBytesValueItem
     */
    @javax.annotation.Nullable
    public SupportedKafkaSizeBytesValueItem getIngressThroughputPerSec() {
        return this.ingressThroughputPerSec;
    }
    /**
     * Gets the lifespan_seconds property value. The limit lifespan of the kafka instance in seconds. If not specified then the instance never expires.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLifespanSeconds() {
        return this.lifespanSeconds;
    }
    /**
     * Gets the maturity_status property value. Maturity level of the size. Can be "stable" or "preview".
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaturityStatus() {
        return this.maturityStatus;
    }
    /**
     * Gets the max_connection_attempts_per_sec property value. Maximium connection attempts per second available to this Kafka instance size.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxConnectionAttemptsPerSec() {
        return this.maxConnectionAttemptsPerSec;
    }
    /**
     * Gets the max_data_retention_period property value. Maximum data retention period available to this Kafka instance size.
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
     * Gets the max_message_size property value. The max_message_size property
     * @return a SupportedKafkaSizeBytesValueItem
     */
    @javax.annotation.Nullable
    public SupportedKafkaSizeBytesValueItem getMaxMessageSize() {
        return this.maxMessageSize;
    }
    /**
     * Gets the max_partitions property value. Maximum amount of total partitions available to this Kafka instance size.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxPartitions() {
        return this.maxPartitions;
    }
    /**
     * Gets the min_in_sync_replicas property value. Minimum number of in-sync replicas.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinInSyncReplicas() {
        return this.minInSyncReplicas;
    }
    /**
     * Gets the quota_consumed property value. Quota consumed by this Kafka instance size.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQuotaConsumed() {
        return this.quotaConsumed;
    }
    /**
     * Gets the quota_type property value. Quota type used by this Kafka instance size. This is now deprecated, please refer to supported_billing_models at instance-type level instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuotaType() {
        return this.quotaType;
    }
    /**
     * Gets the replication_factor property value. Replication factor available to this Kafka instance size.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReplicationFactor() {
        return this.replicationFactor;
    }
    /**
     * Gets the supported_az_modes property value. List of Availability Zone modes that this Kafka instance size supports. The possible values are "single", "multi".
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedAzModes() {
        return this.supportedAzModes;
    }
    /**
     * Gets the total_max_connections property value. Maximum amount of total connections available to this Kafka instance size.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalMaxConnections() {
        return this.totalMaxConnections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("capacity_consumed", this.getCapacityConsumed());
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeObjectValue("egress_throughput_per_sec", this.getEgressThroughputPerSec());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("ingress_throughput_per_sec", this.getIngressThroughputPerSec());
        writer.writeIntegerValue("lifespan_seconds", this.getLifespanSeconds());
        writer.writeStringValue("maturity_status", this.getMaturityStatus());
        writer.writeIntegerValue("max_connection_attempts_per_sec", this.getMaxConnectionAttemptsPerSec());
        writer.writeStringValue("max_data_retention_period", this.getMaxDataRetentionPeriod());
        writer.writeObjectValue("max_data_retention_size", this.getMaxDataRetentionSize());
        writer.writeObjectValue("max_message_size", this.getMaxMessageSize());
        writer.writeIntegerValue("max_partitions", this.getMaxPartitions());
        writer.writeIntegerValue("min_in_sync_replicas", this.getMinInSyncReplicas());
        writer.writeIntegerValue("quota_consumed", this.getQuotaConsumed());
        writer.writeStringValue("quota_type", this.getQuotaType());
        writer.writeIntegerValue("replication_factor", this.getReplicationFactor());
        writer.writeCollectionOfPrimitiveValues("supported_az_modes", this.getSupportedAzModes());
        writer.writeIntegerValue("total_max_connections", this.getTotalMaxConnections());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the capacity_consumed property value. Data plane cluster capacity consumed by this Kafka instance size.
     * @param value Value to set for the capacityConsumed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapacityConsumed(@javax.annotation.Nullable final Integer value) {
        this.capacityConsumed = value;
    }
    /**
     * Sets the display_name property value. Display name of this Kafka instance size.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the egress_throughput_per_sec property value. The egress_throughput_per_sec property
     * @param value Value to set for the egressThroughputPerSec property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEgressThroughputPerSec(@javax.annotation.Nullable final SupportedKafkaSizeBytesValueItem value) {
        this.egressThroughputPerSec = value;
    }
    /**
     * Sets the id property value. Unique identifier of this Kafka instance size.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the ingress_throughput_per_sec property value. The ingress_throughput_per_sec property
     * @param value Value to set for the ingressThroughputPerSec property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIngressThroughputPerSec(@javax.annotation.Nullable final SupportedKafkaSizeBytesValueItem value) {
        this.ingressThroughputPerSec = value;
    }
    /**
     * Sets the lifespan_seconds property value. The limit lifespan of the kafka instance in seconds. If not specified then the instance never expires.
     * @param value Value to set for the lifespanSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLifespanSeconds(@javax.annotation.Nullable final Integer value) {
        this.lifespanSeconds = value;
    }
    /**
     * Sets the maturity_status property value. Maturity level of the size. Can be "stable" or "preview".
     * @param value Value to set for the maturityStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaturityStatus(@javax.annotation.Nullable final String value) {
        this.maturityStatus = value;
    }
    /**
     * Sets the max_connection_attempts_per_sec property value. Maximium connection attempts per second available to this Kafka instance size.
     * @param value Value to set for the maxConnectionAttemptsPerSec property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxConnectionAttemptsPerSec(@javax.annotation.Nullable final Integer value) {
        this.maxConnectionAttemptsPerSec = value;
    }
    /**
     * Sets the max_data_retention_period property value. Maximum data retention period available to this Kafka instance size.
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
     * Sets the max_message_size property value. The max_message_size property
     * @param value Value to set for the maxMessageSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxMessageSize(@javax.annotation.Nullable final SupportedKafkaSizeBytesValueItem value) {
        this.maxMessageSize = value;
    }
    /**
     * Sets the max_partitions property value. Maximum amount of total partitions available to this Kafka instance size.
     * @param value Value to set for the maxPartitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxPartitions(@javax.annotation.Nullable final Integer value) {
        this.maxPartitions = value;
    }
    /**
     * Sets the min_in_sync_replicas property value. Minimum number of in-sync replicas.
     * @param value Value to set for the minInSyncReplicas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinInSyncReplicas(@javax.annotation.Nullable final Integer value) {
        this.minInSyncReplicas = value;
    }
    /**
     * Sets the quota_consumed property value. Quota consumed by this Kafka instance size.
     * @param value Value to set for the quotaConsumed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuotaConsumed(@javax.annotation.Nullable final Integer value) {
        this.quotaConsumed = value;
    }
    /**
     * Sets the quota_type property value. Quota type used by this Kafka instance size. This is now deprecated, please refer to supported_billing_models at instance-type level instead.
     * @param value Value to set for the quotaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuotaType(@javax.annotation.Nullable final String value) {
        this.quotaType = value;
    }
    /**
     * Sets the replication_factor property value. Replication factor available to this Kafka instance size.
     * @param value Value to set for the replicationFactor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplicationFactor(@javax.annotation.Nullable final Integer value) {
        this.replicationFactor = value;
    }
    /**
     * Sets the supported_az_modes property value. List of Availability Zone modes that this Kafka instance size supports. The possible values are "single", "multi".
     * @param value Value to set for the supportedAzModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedAzModes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.supportedAzModes = value;
    }
    /**
     * Sets the total_max_connections property value. Maximum amount of total connections available to this Kafka instance size.
     * @param value Value to set for the totalMaxConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalMaxConnections(@javax.annotation.Nullable final Integer value) {
        this.totalMaxConnections = value;
    }
}
