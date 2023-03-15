package com.openshift.cloud.api.serviceaccounts.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AcsClientRequestData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The name property */
    private String name;
    /** The orgId property */
    private String orgId;
    /** The redirectUris property */
    private java.util.List<String> redirectUris;
    /**
     * Instantiates a new AcsClientRequestData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AcsClientRequestData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AcsClientRequestData
     */
    @javax.annotation.Nonnull
    public static AcsClientRequestData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AcsClientRequestData();
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
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("redirectUris", (n) -> { this.setRedirectUris(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the redirectUris property value. The redirectUris property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRedirectUris() {
        return this.redirectUris;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeCollectionOfPrimitiveValues("redirectUris", this.getRedirectUris());
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
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrgId(@javax.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the redirectUris property value. The redirectUris property
     * @param value Value to set for the redirectUris property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectUris(@javax.annotation.Nullable final java.util.List<String> value) {
        this.redirectUris = value;
    }
}
