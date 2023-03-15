package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryCredential extends ObjectReference implements Parsable {
    /** The account property */
    private ObjectReference account;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The external_resource_id property */
    private String externalResourceId;
    /** The registry property */
    private ObjectReference registry;
    /** The token property */
    private String token;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /** The username property */
    private String username;
    /**
     * Instantiates a new RegistryCredential and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistryCredential() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryCredential
     */
    @javax.annotation.Nonnull
    public static RegistryCredential createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryCredential();
    }
    /**
     * Gets the account property value. The account property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getAccount() {
        return this.account;
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
     * Gets the external_resource_id property value. The external_resource_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalResourceId() {
        return this.externalResourceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("external_resource_id", (n) -> { this.setExternalResourceId(n.getStringValue()); });
        deserializerMap.put("registry", (n) -> { this.setRegistry(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registry property value. The registry property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getRegistry() {
        return this.registry;
    }
    /**
     * Gets the token property value. The token property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getToken() {
        return this.token;
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
     * Gets the username property value. The username property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsername() {
        return this.username;
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
        writer.writeObjectValue("account", this.getAccount());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("external_resource_id", this.getExternalResourceId());
        writer.writeObjectValue("registry", this.getRegistry());
        writer.writeStringValue("token", this.getToken());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccount(@javax.annotation.Nullable final ObjectReference value) {
        this.account = value;
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
     * Sets the external_resource_id property value. The external_resource_id property
     * @param value Value to set for the externalResourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalResourceId(@javax.annotation.Nullable final String value) {
        this.externalResourceId = value;
    }
    /**
     * Sets the registry property value. The registry property
     * @param value Value to set for the registry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistry(@javax.annotation.Nullable final ObjectReference value) {
        this.registry = value;
    }
    /**
     * Sets the token property value. The token property
     * @param value Value to set for the token property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToken(@javax.annotation.Nullable final String value) {
        this.token = value;
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
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsername(@javax.annotation.Nullable final String value) {
        this.username = value;
    }
}
