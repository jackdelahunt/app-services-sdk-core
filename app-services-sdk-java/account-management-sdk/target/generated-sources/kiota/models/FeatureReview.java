package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FeatureReview implements AdditionalDataHolder, Parsable {
    /** The account_username property */
    private String accountUsername;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The feature property */
    private String feature;
    /** The organization_id property */
    private String organizationId;
    /**
     * Instantiates a new FeatureReview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FeatureReview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FeatureReview
     */
    @javax.annotation.Nonnull
    public static FeatureReview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureReview();
    }
    /**
     * Gets the account_username property value. The account_username property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountUsername() {
        return this.accountUsername;
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
     * Gets the feature property value. The feature property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeature() {
        return this.feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("account_username", (n) -> { this.setAccountUsername(n.getStringValue()); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_username", this.getAccountUsername());
        writer.writeStringValue("feature", this.getFeature());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_username property value. The account_username property
     * @param value Value to set for the accountUsername property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountUsername(@javax.annotation.Nullable final String value) {
        this.accountUsername = value;
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
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeature(@javax.annotation.Nullable final String value) {
        this.feature = value;
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
}
