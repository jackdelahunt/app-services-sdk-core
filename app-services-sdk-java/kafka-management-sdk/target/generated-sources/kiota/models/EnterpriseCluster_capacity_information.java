package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Returns the capacity related information
 */
public class EnterpriseCluster_capacity_information implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The number of Kafka streaming units that have been consumed on this cluster */
    private Integer consumedKafkaStreamingUnits;
    /** The kafka machine pool node count provided during cluster registration */
    private Integer kafkaMachinePoolNodeCount;
    /** The maximum number of Kafka streaming units that can be created on this cluster */
    private Integer maximumKafkaStreamingUnits;
    /** The remaining number of Kafka streaming units that can be still be created on this cluster */
    private Integer remainingKafkaStreamingUnits;
    /**
     * Instantiates a new EnterpriseCluster_capacity_information and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnterpriseCluster_capacity_information() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnterpriseCluster_capacity_information
     */
    @javax.annotation.Nonnull
    public static EnterpriseCluster_capacity_information createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseCluster_capacity_information();
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
     * Gets the consumed_kafka_streaming_units property value. The number of Kafka streaming units that have been consumed on this cluster
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConsumedKafkaStreamingUnits() {
        return this.consumedKafkaStreamingUnits;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("consumed_kafka_streaming_units", (n) -> { this.setConsumedKafkaStreamingUnits(n.getIntegerValue()); });
        deserializerMap.put("kafka_machine_pool_node_count", (n) -> { this.setKafkaMachinePoolNodeCount(n.getIntegerValue()); });
        deserializerMap.put("maximum_kafka_streaming_units", (n) -> { this.setMaximumKafkaStreamingUnits(n.getIntegerValue()); });
        deserializerMap.put("remaining_kafka_streaming_units", (n) -> { this.setRemainingKafkaStreamingUnits(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kafka_machine_pool_node_count property value. The kafka machine pool node count provided during cluster registration
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKafkaMachinePoolNodeCount() {
        return this.kafkaMachinePoolNodeCount;
    }
    /**
     * Gets the maximum_kafka_streaming_units property value. The maximum number of Kafka streaming units that can be created on this cluster
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumKafkaStreamingUnits() {
        return this.maximumKafkaStreamingUnits;
    }
    /**
     * Gets the remaining_kafka_streaming_units property value. The remaining number of Kafka streaming units that can be still be created on this cluster
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemainingKafkaStreamingUnits() {
        return this.remainingKafkaStreamingUnits;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("consumed_kafka_streaming_units", this.getConsumedKafkaStreamingUnits());
        writer.writeIntegerValue("kafka_machine_pool_node_count", this.getKafkaMachinePoolNodeCount());
        writer.writeIntegerValue("maximum_kafka_streaming_units", this.getMaximumKafkaStreamingUnits());
        writer.writeIntegerValue("remaining_kafka_streaming_units", this.getRemainingKafkaStreamingUnits());
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
     * Sets the consumed_kafka_streaming_units property value. The number of Kafka streaming units that have been consumed on this cluster
     * @param value Value to set for the consumedKafkaStreamingUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsumedKafkaStreamingUnits(@javax.annotation.Nullable final Integer value) {
        this.consumedKafkaStreamingUnits = value;
    }
    /**
     * Sets the kafka_machine_pool_node_count property value. The kafka machine pool node count provided during cluster registration
     * @param value Value to set for the kafkaMachinePoolNodeCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKafkaMachinePoolNodeCount(@javax.annotation.Nullable final Integer value) {
        this.kafkaMachinePoolNodeCount = value;
    }
    /**
     * Sets the maximum_kafka_streaming_units property value. The maximum number of Kafka streaming units that can be created on this cluster
     * @param value Value to set for the maximumKafkaStreamingUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumKafkaStreamingUnits(@javax.annotation.Nullable final Integer value) {
        this.maximumKafkaStreamingUnits = value;
    }
    /**
     * Sets the remaining_kafka_streaming_units property value. The remaining number of Kafka streaming units that can be still be created on this cluster
     * @param value Value to set for the remainingKafkaStreamingUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemainingKafkaStreamingUnits(@javax.annotation.Nullable final Integer value) {
        this.remainingKafkaStreamingUnits = value;
    }
}
