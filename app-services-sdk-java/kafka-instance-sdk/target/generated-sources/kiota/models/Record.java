package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Record extends ObjectReference implements Parsable {
    /** Record headers, key/value pairs */
    private Record_headers headers;
    /** Record key */
    private String key;
    /** The record's offset within the topic partition */
    private Long offset;
    /** The record's partition within the topic */
    private Integer partition;
    /** Timestamp associated with the record. The type is indicated by `timestampType`. When producing a record, this value will be used as the record's `CREATE_TIME`. */
    private OffsetDateTime timestamp;
    /** Type of timestamp associated with the record */
    private String timestampType;
    /** Record value */
    private String value;
    /**
     * Instantiates a new Record and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Record() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Record
     */
    @javax.annotation.Nonnull
    public static Record createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Record();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("headers", (n) -> { this.setHeaders(n.getObjectValue(Record_headers::createFromDiscriminatorValue)); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getLongValue()); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timestampType", (n) -> { this.setTimestampType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the headers property value. Record headers, key/value pairs
     * @return a Record_headers
     */
    @javax.annotation.Nullable
    public Record_headers getHeaders() {
        return this.headers;
    }
    /**
     * Gets the key property value. Record key
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the offset property value. The record's offset within the topic partition
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOffset() {
        return this.offset;
    }
    /**
     * Gets the partition property value. The record's partition within the topic
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the timestamp property value. Timestamp associated with the record. The type is indicated by `timestampType`. When producing a record, this value will be used as the record's `CREATE_TIME`.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the timestampType property value. Type of timestamp associated with the record
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimestampType() {
        return this.timestampType;
    }
    /**
     * Gets the value property value. Record value
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
        super.serialize(writer);
        writer.writeObjectValue("headers", this.getHeaders());
        writer.writeStringValue("key", this.getKey());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the headers property value. Record headers, key/value pairs
     * @param value Value to set for the headers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaders(@javax.annotation.Nullable final Record_headers value) {
        this.headers = value;
    }
    /**
     * Sets the key property value. Record key
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the offset property value. The record's offset within the topic partition
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final Long value) {
        this.offset = value;
    }
    /**
     * Sets the partition property value. The record's partition within the topic
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the timestamp property value. Timestamp associated with the record. The type is indicated by `timestampType`. When producing a record, this value will be used as the record's `CREATE_TIME`.
     * @param value Value to set for the timestamp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimestamp(@javax.annotation.Nullable final OffsetDateTime value) {
        this.timestamp = value;
    }
    /**
     * Sets the timestampType property value. Type of timestamp associated with the record
     * @param value Value to set for the timestampType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimestampType(@javax.annotation.Nullable final String value) {
        this.timestampType = value;
    }
    /**
     * Sets the value property value. Record value
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this.value = value;
    }
}
