package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryCredentialPatchRequest implements AdditionalDataHolder, Parsable {
    /** The account_id property */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The external_resource_id property */
    private String externalResourceId;
    /** The registry_id property */
    private String registryId;
    /** The token property */
    private String token;
    /** The username property */
    private String username;
    /**
     * Instantiates a new RegistryCredentialPatchRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistryCredentialPatchRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryCredentialPatchRequest
     */
    @javax.annotation.Nonnull
    public static RegistryCredentialPatchRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryCredentialPatchRequest();
    }
    /**
     * Gets the account_id property value. The account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("external_resource_id", (n) -> { this.setExternalResourceId(n.getStringValue()); });
        deserializerMap.put("registry_id", (n) -> { this.setRegistryId(n.getStringValue()); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registry_id property value. The registry_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryId() {
        return this.registryId;
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
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("external_resource_id", this.getExternalResourceId());
        writer.writeStringValue("registry_id", this.getRegistryId());
        writer.writeStringValue("token", this.getToken());
        writer.writeStringValue("username", this.getUsername());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. The account_id property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
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
     * Sets the external_resource_id property value. The external_resource_id property
     * @param value Value to set for the externalResourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalResourceId(@javax.annotation.Nullable final String value) {
        this.externalResourceId = value;
    }
    /**
     * Sets the registry_id property value. The registry_id property
     * @param value Value to set for the registryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryId(@javax.annotation.Nullable final String value) {
        this.registryId = value;
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
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsername(@javax.annotation.Nullable final String value) {
        this.username = value;
    }
}
