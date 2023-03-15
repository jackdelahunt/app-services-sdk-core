package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceReviewRequest implements AdditionalDataHolder, Parsable {
    /** The account_username property */
    private String accountUsername;
    /** The action property */
    private ResourceReviewRequest_action action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The resource_type property */
    private ResourceReviewRequest_resource_type resourceType;
    /**
     * Instantiates a new ResourceReviewRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceReviewRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResourceReviewRequest
     */
    @javax.annotation.Nonnull
    public static ResourceReviewRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceReviewRequest();
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
     * Gets the action property value. The action property
     * @return a ResourceReviewRequest_action
     */
    @javax.annotation.Nullable
    public ResourceReviewRequest_action getAction() {
        return this.action;
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
        deserializerMap.put("account_username", (n) -> { this.setAccountUsername(n.getStringValue()); });
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ResourceReviewRequest_action.class)); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(ResourceReviewRequest_resource_type.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a ResourceReviewRequest_resource_type
     */
    @javax.annotation.Nullable
    public ResourceReviewRequest_resource_type getResourceType() {
        return this.resourceType;
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
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("resource_type", this.getResourceType());
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
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final ResourceReviewRequest_action value) {
        this.action = value;
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
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final ResourceReviewRequest_resource_type value) {
        this.resourceType = value;
    }
}
