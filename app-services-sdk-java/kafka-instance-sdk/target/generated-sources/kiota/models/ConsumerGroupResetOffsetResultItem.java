package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConsumerGroupResetOffsetResultItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The offset property */
    private Long offset;
    /** The partition property */
    private Integer partition;
    /** The topic property */
    private String topic;
    /**
     * Instantiates a new ConsumerGroupResetOffsetResultItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConsumerGroupResetOffsetResultItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConsumerGroupResetOffsetResultItem
     */
    @javax.annotation.Nonnull
    public static ConsumerGroupResetOffsetResultItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConsumerGroupResetOffsetResultItem();
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
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getLongValue()); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offset property value. The offset property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffset() {
        return this.offset;
    }
    /**
     * Gets the partition property value. The partition property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the topic property value. The topic property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopic() {
        return this.topic;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("offset", this.getOffset());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeStringValue("topic", this.getTopic());
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
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final Long value) {
        this.offset = value;
    }
    /**
     * Sets the partition property value. The partition property
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the topic property value. The topic property
     * @param value Value to set for the topic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopic(@javax.annotation.Nullable final String value) {
        this.topic = value;
    }
}
