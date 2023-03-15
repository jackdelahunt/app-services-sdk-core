package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccountPatchRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The ban_code property */
    private String banCode;
    /** The ban_description property */
    private String banDescription;
    /** The banned property */
    private Boolean banned;
    /** The email property */
    private String email;
    /** The first_name property */
    private String firstName;
    /** The last_name property */
    private String lastName;
    /** The organization_id property */
    private String organizationId;
    /** The service_account property */
    private Boolean serviceAccount;
    /**
     * Instantiates a new AccountPatchRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountPatchRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountPatchRequest
     */
    @javax.annotation.Nonnull
    public static AccountPatchRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountPatchRequest();
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
     * Gets the ban_code property value. The ban_code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBanCode() {
        return this.banCode;
    }
    /**
     * Gets the ban_description property value. The ban_description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBanDescription() {
        return this.banDescription;
    }
    /**
     * Gets the banned property value. The banned property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBanned() {
        return this.banned;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("ban_code", (n) -> { this.setBanCode(n.getStringValue()); });
        deserializerMap.put("ban_description", (n) -> { this.setBanDescription(n.getStringValue()); });
        deserializerMap.put("banned", (n) -> { this.setBanned(n.getBooleanValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("service_account", (n) -> { this.setServiceAccount(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_name property value. The first_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the last_name property value. The last_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastName() {
        return this.lastName;
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
     * Gets the service_account property value. The service_account property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ban_code", this.getBanCode());
        writer.writeStringValue("ban_description", this.getBanDescription());
        writer.writeBooleanValue("banned", this.getBanned());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeBooleanValue("service_account", this.getServiceAccount());
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
     * Sets the ban_code property value. The ban_code property
     * @param value Value to set for the banCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBanCode(@javax.annotation.Nullable final String value) {
        this.banCode = value;
    }
    /**
     * Sets the ban_description property value. The ban_description property
     * @param value Value to set for the banDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBanDescription(@javax.annotation.Nullable final String value) {
        this.banDescription = value;
    }
    /**
     * Sets the banned property value. The banned property
     * @param value Value to set for the banned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBanned(@javax.annotation.Nullable final Boolean value) {
        this.banned = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the first_name property value. The first_name property
     * @param value Value to set for the firstName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstName(@javax.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the lastName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastName(@javax.annotation.Nullable final String value) {
        this.lastName = value;
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
     * Sets the service_account property value. The service_account property
     * @param value Value to set for the serviceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceAccount(@javax.annotation.Nullable final Boolean value) {
        this.serviceAccount = value;
    }
}
