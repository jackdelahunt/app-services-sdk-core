package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudAccount implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cloud_account_id property */
    private String cloudAccountId;
    /** The cloud_provider_id property */
    private String cloudProviderId;
    /**
     * Instantiates a new CloudAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudAccount
     */
    @javax.annotation.Nonnull
    public static CloudAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudAccount();
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
     * Gets the cloud_account_id property value. The cloud_account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }
    /**
     * Gets the cloud_provider_id property value. The cloud_provider_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProviderId() {
        return this.cloudProviderId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cloud_account_id", (n) -> { this.setCloudAccountId(n.getStringValue()); });
        deserializerMap.put("cloud_provider_id", (n) -> { this.setCloudProviderId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_account_id", this.getCloudAccountId());
        writer.writeStringValue("cloud_provider_id", this.getCloudProviderId());
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
     * Sets the cloud_account_id property value. The cloud_account_id property
     * @param value Value to set for the cloudAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAccountId(@javax.annotation.Nullable final String value) {
        this.cloudAccountId = value;
    }
    /**
     * Sets the cloud_provider_id property value. The cloud_provider_id property
     * @param value Value to set for the cloudProviderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProviderId(@javax.annotation.Nullable final String value) {
        this.cloudProviderId = value;
    }
}
