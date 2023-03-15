package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudProviderResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The display_name property */
    private String displayName;
    /** The enabled property */
    private Boolean enabled;
    /** The URL of this resource, without the protocol */
    private String href;
    /** The unique identifier of this resource */
    private String id;
    /** The kind (type) of this resource */
    private String kind;
    /** The name of this resource */
    private String name;
    /**
     * Instantiates a new CloudProviderResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudProviderResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudProviderResponse
     */
    @javax.annotation.Nonnull
    public static CloudProviderResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudProviderResponse();
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
     * Gets the display_name property value. The display_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enabled property value. The enabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URL of this resource, without the protocol
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the id property value. The unique identifier of this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the kind property value. The kind (type) of this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets the name property value. The name of this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("href", this.getHref());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("kind", this.getKind());
        writer.writeStringValue("name", this.getName());
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
     * Sets the display_name property value. The display_name property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the href property value. The URL of this resource, without the protocol
     * @param value Value to set for the href property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHref(@javax.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the id property value. The unique identifier of this resource
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the kind property value. The kind (type) of this resource
     * @param value Value to set for the kind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKind(@javax.annotation.Nullable final String value) {
        this.kind = value;
    }
    /**
     * Sets the name property value. The name of this resource
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
}
