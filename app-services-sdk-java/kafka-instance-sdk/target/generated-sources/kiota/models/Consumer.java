package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A Kafka consumer is responsible for reading records from one or more topics and one or more partitions of a topic.
 */
public class Consumer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Unique identifier for the consumer group to which this consumer belongs. */
    private String groupId;
    /** Offset Lag is the delta between the last produced message and the last consumer's committed offset. */
    private Long lag;
    /** The log end offset is the offset of the last message written to a log. */
    private Long logEndOffset;
    /** The member ID is a unique identifier given to a consumer by the coordinator upon initially joining the group. */
    private String memberId;
    /** Offset denotes the position of the consumer in a partition. */
    private Long offset;
    /** The partition number to which this consumer group is assigned to. */
    private Integer partition;
    /** The unique topic name to which this consumer belongs */
    private String topic;
    /**
     * Instantiates a new Consumer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Consumer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Consumer
     */
    @javax.annotation.Nonnull
    public static Consumer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Consumer();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("lag", (n) -> { this.setLag(n.getLongValue()); });
        deserializerMap.put("logEndOffset", (n) -> { this.setLogEndOffset(n.getLongValue()); });
        deserializerMap.put("memberId", (n) -> { this.setMemberId(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getLongValue()); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. Unique identifier for the consumer group to which this consumer belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the lag property value. Offset Lag is the delta between the last produced message and the last consumer's committed offset.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getLag() {
        return this.lag;
    }
    /**
     * Gets the logEndOffset property value. The log end offset is the offset of the last message written to a log.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getLogEndOffset() {
        return this.logEndOffset;
    }
    /**
     * Gets the memberId property value. The member ID is a unique identifier given to a consumer by the coordinator upon initially joining the group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberId() {
        return this.memberId;
    }
    /**
     * Gets the offset property value. Offset denotes the position of the consumer in a partition.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffset() {
        return this.offset;
    }
    /**
     * Gets the partition property value. The partition number to which this consumer group is assigned to.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the topic property value. The unique topic name to which this consumer belongs
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
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeLongValue("lag", this.getLag());
        writer.writeLongValue("logEndOffset", this.getLogEndOffset());
        writer.writeStringValue("memberId", this.getMemberId());
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
     * Sets the groupId property value. Unique identifier for the consumer group to which this consumer belongs.
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the lag property value. Offset Lag is the delta between the last produced message and the last consumer's committed offset.
     * @param value Value to set for the lag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLag(@javax.annotation.Nullable final Long value) {
        this.lag = value;
    }
    /**
     * Sets the logEndOffset property value. The log end offset is the offset of the last message written to a log.
     * @param value Value to set for the logEndOffset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogEndOffset(@javax.annotation.Nullable final Long value) {
        this.logEndOffset = value;
    }
    /**
     * Sets the memberId property value. The member ID is a unique identifier given to a consumer by the coordinator upon initially joining the group.
     * @param value Value to set for the memberId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberId(@javax.annotation.Nullable final String value) {
        this.memberId = value;
    }
    /**
     * Sets the offset property value. Offset denotes the position of the consumer in a partition.
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final Long value) {
        this.offset = value;
    }
    /**
     * Sets the partition property value. The partition number to which this consumer group is assigned to.
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the topic property value. The unique topic name to which this consumer belongs
     * @param value Value to set for the topic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopic(@javax.annotation.Nullable final String value) {
        this.topic = value;
    }
}
