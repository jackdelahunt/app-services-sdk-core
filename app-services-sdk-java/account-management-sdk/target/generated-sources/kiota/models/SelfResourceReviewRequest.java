package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SelfResourceReviewRequest implements AdditionalDataHolder, Parsable {
    /** The action property */
    private SelfResourceReviewRequest_action action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The resource_type property */
    private SelfResourceReviewRequest_resource_type resourceType;
    /**
     * Instantiates a new SelfResourceReviewRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SelfResourceReviewRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SelfResourceReviewRequest
     */
    @javax.annotation.Nonnull
    public static SelfResourceReviewRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfResourceReviewRequest();
    }
    /**
     * Gets the action property value. The action property
     * @return a SelfResourceReviewRequest_action
     */
    @javax.annotation.Nullable
    public SelfResourceReviewRequest_action getAction() {
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(SelfResourceReviewRequest_action.class)); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(SelfResourceReviewRequest_resource_type.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a SelfResourceReviewRequest_resource_type
     */
    @javax.annotation.Nullable
    public SelfResourceReviewRequest_resource_type getResourceType() {
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
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("resource_type", this.getResourceType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final SelfResourceReviewRequest_action value) {
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
    public void setResourceType(@javax.annotation.Nullable final SelfResourceReviewRequest_resource_type value) {
        this.resourceType = value;
    }
}
