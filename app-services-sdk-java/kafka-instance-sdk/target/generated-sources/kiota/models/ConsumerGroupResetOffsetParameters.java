package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConsumerGroupResetOffsetParameters implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The offset property */
    private OffsetType offset;
    /** The topics property */
    private java.util.List<TopicsToResetOffset> topics;
    /** Value associated with the given `offset`. Not used for `offset` values `earliest` and `latest`. When `offset` is `timestamp` then `value` must be a valid timestamp representing the point in time to reset the consumer group. When `offset` is `absolute` then `value` must be the integer offset to which the consumer group will be reset. */
    private String value;
    /**
     * Instantiates a new ConsumerGroupResetOffsetParameters and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConsumerGroupResetOffsetParameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConsumerGroupResetOffsetParameters
     */
    @javax.annotation.Nonnull
    public static ConsumerGroupResetOffsetParameters createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConsumerGroupResetOffsetParameters();
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
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getEnumValue(OffsetType.class)); });
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfObjectValues(TopicsToResetOffset::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offset property value. The offset property
     * @return a OffsetType
     */
    @javax.annotation.Nullable
    public OffsetType getOffset() {
        return this.offset;
    }
    /**
     * Gets the topics property value. The topics property
     * @return a TopicsToResetOffset
     */
    @javax.annotation.Nullable
    public java.util.List<TopicsToResetOffset> getTopics() {
        return this.topics;
    }
    /**
     * Gets the value property value. Value associated with the given `offset`. Not used for `offset` values `earliest` and `latest`. When `offset` is `timestamp` then `value` must be a valid timestamp representing the point in time to reset the consumer group. When `offset` is `absolute` then `value` must be the integer offset to which the consumer group will be reset.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("offset", this.getOffset());
        writer.writeCollectionOfObjectValues("topics", this.getTopics());
        writer.writeStringValue("value", this.getValue());
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
    public void setOffset(@javax.annotation.Nullable final OffsetType value) {
        this.offset = value;
    }
    /**
     * Sets the topics property value. The topics property
     * @param value Value to set for the topics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopics(@javax.annotation.Nullable final java.util.List<TopicsToResetOffset> value) {
        this.topics = value;
    }
    /**
     * Sets the value property value. Value associated with the given `offset`. Not used for `offset` values `earliest` and `latest`. When `offset` is `timestamp` then `value` must be a valid timestamp representing the point in time to reset the consumer group. When `offset` is `absolute` then `value` must be the integer offset to which the consumer group will be reset.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this.value = value;
    }
}
