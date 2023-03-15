package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SkuRules extends ObjectReference implements Parsable {
    /** The allowed property */
    private Integer allowed;
    /** The quota_id property */
    private String quotaId;
    /** The sku property */
    private String sku;
    /**
     * Instantiates a new SkuRules and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SkuRules() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SkuRules
     */
    @javax.annotation.Nonnull
    public static SkuRules createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkuRules();
    }
    /**
     * Gets the allowed property value. The allowed property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAllowed() {
        return this.allowed;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowed", (n) -> { this.setAllowed(n.getIntegerValue()); });
        deserializerMap.put("quota_id", (n) -> { this.setQuotaId(n.getStringValue()); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the quota_id property value. The quota_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuotaId() {
        return this.quotaId;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("allowed", this.getAllowed());
        writer.writeStringValue("quota_id", this.getQuotaId());
        writer.writeStringValue("sku", this.getSku());
    }
    /**
     * Sets the allowed property value. The allowed property
     * @param value Value to set for the allowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowed(@javax.annotation.Nullable final Integer value) {
        this.allowed = value;
    }
    /**
     * Sets the quota_id property value. The quota_id property
     * @param value Value to set for the quotaId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuotaId(@javax.annotation.Nullable final String value) {
        this.quotaId = value;
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
}
