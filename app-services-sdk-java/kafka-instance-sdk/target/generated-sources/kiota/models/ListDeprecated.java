package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListDeprecated extends List implements Parsable {
    /** Total number of entries in the full result set */
    private Integer count;
    /** Maximum number of records to return, from request */
    private Integer limit;
    /** Offset of the first record returned, zero-based */
    private Integer offset;
    /**
     * Instantiates a new ListDeprecated and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListDeprecated() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListDeprecated
     */
    @javax.annotation.Nonnull
    public static ListDeprecated createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListDeprecated();
    }
    /**
     * Gets the count property value. Total number of entries in the full result set
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Maximum number of records to return, from request
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. Offset of the first record returned, zero-based
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
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
        writer.writeIntegerValue("count", this.getCount());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
    }
    /**
     * Sets the count property value. Total number of entries in the full result set
     * @param value Value to set for the count property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this.count = value;
    }
    /**
     * Sets the limit property value. Maximum number of records to return, from request
     * @param value Value to set for the limit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLimit(@javax.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. Offset of the first record returned, zero-based
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final Integer value) {
        this.offset = value;
    }
}
