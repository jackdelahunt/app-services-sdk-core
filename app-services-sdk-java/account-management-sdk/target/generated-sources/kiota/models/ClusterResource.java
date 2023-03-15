package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterResource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The total property */
    private ClusterResource_total total;
    /** The updated_timestamp property */
    private OffsetDateTime updatedTimestamp;
    /** The used property */
    private ClusterResource_used used;
    /**
     * Instantiates a new ClusterResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterResource
     */
    @javax.annotation.Nonnull
    public static ClusterResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterResource();
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
        deserializerMap.put("total", (n) -> { this.setTotal(n.getObjectValue(ClusterResource_total::createFromDiscriminatorValue)); });
        deserializerMap.put("updated_timestamp", (n) -> { this.setUpdatedTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("used", (n) -> { this.setUsed(n.getObjectValue(ClusterResource_used::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the total property value. The total property
     * @return a ClusterResource_total
     */
    @javax.annotation.Nullable
    public ClusterResource_total getTotal() {
        return this.total;
    }
    /**
     * Gets the updated_timestamp property value. The updated_timestamp property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    /**
     * Gets the used property value. The used property
     * @return a ClusterResource_used
     */
    @javax.annotation.Nullable
    public ClusterResource_used getUsed() {
        return this.used;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("total", this.getTotal());
        writer.writeOffsetDateTimeValue("updated_timestamp", this.getUpdatedTimestamp());
        writer.writeObjectValue("used", this.getUsed());
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
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotal(@javax.annotation.Nullable final ClusterResource_total value) {
        this.total = value;
    }
    /**
     * Sets the updated_timestamp property value. The updated_timestamp property
     * @param value Value to set for the updatedTimestamp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedTimestamp(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedTimestamp = value;
    }
    /**
     * Sets the used property value. The used property
     * @param value Value to set for the used property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsed(@javax.annotation.Nullable final ClusterResource_used value) {
        this.used = value;
    }
}
