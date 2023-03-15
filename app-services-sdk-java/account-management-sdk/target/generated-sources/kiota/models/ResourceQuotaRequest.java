package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceQuotaRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The sku property */
    private String sku;
    /** The sku_count property */
    private Integer skuCount;
    /** The type property */
    private ResourceQuotaRequest_type type;
    /**
     * Instantiates a new ResourceQuotaRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceQuotaRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResourceQuotaRequest
     */
    @javax.annotation.Nonnull
    public static ResourceQuotaRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceQuotaRequest();
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
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("sku_count", (n) -> { this.setSkuCount(n.getIntegerValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ResourceQuotaRequest_type.class)); });
        return deserializerMap;
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
     * @return a ResourceQuotaRequest_type
     */
    @javax.annotation.Nullable
    public ResourceQuotaRequest_type getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("sku", this.getSku());
        writer.writeIntegerValue("sku_count", this.getSkuCount());
        writer.writeEnumValue("type", this.getType());
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
    public void setType(@javax.annotation.Nullable final ResourceQuotaRequest_type value) {
        this.type = value;
    }
}
