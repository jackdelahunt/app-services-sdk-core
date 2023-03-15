package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConsumerGroupMetrics implements AdditionalDataHolder, Parsable {
    /** The activeConsumers property */
    private Integer activeConsumers;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The laggingPartitions property */
    private Integer laggingPartitions;
    /** The unassignedPartitions property */
    private Integer unassignedPartitions;
    /**
     * Instantiates a new ConsumerGroupMetrics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConsumerGroupMetrics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConsumerGroupMetrics
     */
    @javax.annotation.Nonnull
    public static ConsumerGroupMetrics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConsumerGroupMetrics();
    }
    /**
     * Gets the activeConsumers property value. The activeConsumers property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveConsumers() {
        return this.activeConsumers;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("activeConsumers", (n) -> { this.setActiveConsumers(n.getIntegerValue()); });
        deserializerMap.put("laggingPartitions", (n) -> { this.setLaggingPartitions(n.getIntegerValue()); });
        deserializerMap.put("unassignedPartitions", (n) -> { this.setUnassignedPartitions(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the laggingPartitions property value. The laggingPartitions property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLaggingPartitions() {
        return this.laggingPartitions;
    }
    /**
     * Gets the unassignedPartitions property value. The unassignedPartitions property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnassignedPartitions() {
        return this.unassignedPartitions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("activeConsumers", this.getActiveConsumers());
        writer.writeIntegerValue("laggingPartitions", this.getLaggingPartitions());
        writer.writeIntegerValue("unassignedPartitions", this.getUnassignedPartitions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activeConsumers property value. The activeConsumers property
     * @param value Value to set for the activeConsumers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveConsumers(@javax.annotation.Nullable final Integer value) {
        this.activeConsumers = value;
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
     * Sets the laggingPartitions property value. The laggingPartitions property
     * @param value Value to set for the laggingPartitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLaggingPartitions(@javax.annotation.Nullable final Integer value) {
        this.laggingPartitions = value;
    }
    /**
     * Sets the unassignedPartitions property value. The unassignedPartitions property
     * @param value Value to set for the unassignedPartitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnassignedPartitions(@javax.annotation.Nullable final Integer value) {
        this.unassignedPartitions = value;
    }
}
