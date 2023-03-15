package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterAuthorizationResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The allowed property */
    private Boolean allowed;
    /** The excess_resources property */
    private java.util.List<ExcessResource> excessResources;
    /** The organization_id property */
    private String organizationId;
    /** The subscription property */
    private ObjectReference subscription;
    /**
     * Instantiates a new ClusterAuthorizationResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterAuthorizationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterAuthorizationResponse
     */
    @javax.annotation.Nonnull
    public static ClusterAuthorizationResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterAuthorizationResponse();
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
     * Gets the allowed property value. The allowed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowed() {
        return this.allowed;
    }
    /**
     * Gets the excess_resources property value. The excess_resources property
     * @return a ExcessResource
     */
    @javax.annotation.Nullable
    public java.util.List<ExcessResource> getExcessResources() {
        return this.excessResources;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowed", (n) -> { this.setAllowed(n.getBooleanValue()); });
        deserializerMap.put("excess_resources", (n) -> { this.setExcessResources(n.getCollectionOfObjectValues(ExcessResource::createFromDiscriminatorValue)); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("subscription", (n) -> { this.setSubscription(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
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
     * Gets the subscription property value. The subscription property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getSubscription() {
        return this.subscription;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowed", this.getAllowed());
        writer.writeCollectionOfObjectValues("excess_resources", this.getExcessResources());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeObjectValue("subscription", this.getSubscription());
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
     * Sets the allowed property value. The allowed property
     * @param value Value to set for the allowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowed(@javax.annotation.Nullable final Boolean value) {
        this.allowed = value;
    }
    /**
     * Sets the excess_resources property value. The excess_resources property
     * @param value Value to set for the excessResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcessResources(@javax.annotation.Nullable final java.util.List<ExcessResource> value) {
        this.excessResources = value;
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
     * Sets the subscription property value. The subscription property
     * @param value Value to set for the subscription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscription(@javax.annotation.Nullable final ObjectReference value) {
        this.subscription = value;
    }
}
