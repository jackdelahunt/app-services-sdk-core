package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConsumerGroup extends ObjectReference implements Parsable {
    /** The list of consumers associated with this consumer group */
    private java.util.List<Consumer> consumers;
    /** Unique identifier for the consumer group */
    private String groupId;
    /** The metrics property */
    private ConsumerGroupMetrics metrics;
    /** The state property */
    private ConsumerGroupState state;
    /**
     * Instantiates a new ConsumerGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConsumerGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConsumerGroup
     */
    @javax.annotation.Nonnull
    public static ConsumerGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConsumerGroup();
    }
    /**
     * Gets the consumers property value. The list of consumers associated with this consumer group
     * @return a Consumer
     */
    @javax.annotation.Nullable
    public java.util.List<Consumer> getConsumers() {
        return this.consumers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("consumers", (n) -> { this.setConsumers(n.getCollectionOfObjectValues(Consumer::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getObjectValue(ConsumerGroupMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConsumerGroupState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. Unique identifier for the consumer group
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the metrics property value. The metrics property
     * @return a ConsumerGroupMetrics
     */
    @javax.annotation.Nullable
    public ConsumerGroupMetrics getMetrics() {
        return this.metrics;
    }
    /**
     * Gets the state property value. The state property
     * @return a ConsumerGroupState
     */
    @javax.annotation.Nullable
    public ConsumerGroupState getState() {
        return this.state;
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
        writer.writeCollectionOfObjectValues("consumers", this.getConsumers());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeObjectValue("metrics", this.getMetrics());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the consumers property value. The list of consumers associated with this consumer group
     * @param value Value to set for the consumers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsumers(@javax.annotation.Nullable final java.util.List<Consumer> value) {
        this.consumers = value;
    }
    /**
     * Sets the groupId property value. Unique identifier for the consumer group
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the metrics property value. The metrics property
     * @param value Value to set for the metrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetrics(@javax.annotation.Nullable final ConsumerGroupMetrics value) {
        this.metrics = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ConsumerGroupState value) {
        this.state = value;
    }
}
