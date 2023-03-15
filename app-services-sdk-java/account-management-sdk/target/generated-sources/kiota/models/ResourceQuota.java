package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceQuota extends ObjectReference implements Parsable {
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The organization_id property */
    private String organizationId;
    /** The sku property */
    private String sku;
    /** The sku_count property */
    private Integer skuCount;
    /** The type property */
    private ResourceQuota_type type;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new ResourceQuota and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceQuota() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResourceQuota
     */
    @javax.annotation.Nonnull
    public static ResourceQuota createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceQuota();
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("sku_count", (n) -> { this.setSkuCount(n.getIntegerValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ResourceQuota_type.class)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the organization_id property value. The organization_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the sku property value. The sku property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Gets the sku_count property value. The sku_count property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkuCount() {
        return this.skuCount;
    }
    /**
     * Gets the type property value. The type property
     * @return a ResourceQuota_type
     */
    @javax.annotation.Nullable
    public ResourceQuota_type getType() {
        return this.type;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
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
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("sku", this.getSku());
        writer.writeIntegerValue("sku_count", this.getSkuCount());
        writer.writeEnumValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the organization_id property value. The organization_id property
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the sku property value. The sku property
     * @param value Value to set for the sku property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSku(@javax.annotation.Nullable final String value) {
        this.sku = value;
    }
    /**
     * Sets the sku_count property value. The sku_count property
     * @param value Value to set for the skuCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuCount(@javax.annotation.Nullable final Integer value) {
        this.skuCount = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final ResourceQuota_type value) {
        this.type = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
