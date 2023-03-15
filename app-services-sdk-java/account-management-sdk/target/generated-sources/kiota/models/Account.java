package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Account extends ObjectReference implements Parsable {
    /** The ban_code property */
    private String banCode;
    /** The ban_description property */
    private String banDescription;
    /** The banned property */
    private Boolean banned;
    /** The capabilities property */
    private java.util.List<Capability> capabilities;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The email property */
    private String email;
    /** The first_name property */
    private String firstName;
    /** The labels property */
    private java.util.List<Label> labels;
    /** The last_name property */
    private String lastName;
    /** The organization property */
    private Organization organization;
    /** The organization_id property */
    private String organizationId;
    /** The rhit_account_id property */
    private String rhitAccountId;
    /** The rhit_web_user_id property */
    private String rhitWebUserId;
    /** The service_account property */
    private Boolean serviceAccount;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /** The username property */
    private String username;
    /**
     * Instantiates a new Account and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Account() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Account
     */
    @javax.annotation.Nonnull
    public static Account createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Account();
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
     * Gets the capabilities property value. The capabilities property
     * @return a Capability
     */
    @javax.annotation.Nullable
    public java.util.List<Capability> getCapabilities() {
        return this.capabilities;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ban_code", (n) -> { this.setBanCode(n.getStringValue()); });
        deserializerMap.put("ban_description", (n) -> { this.setBanDescription(n.getStringValue()); });
        deserializerMap.put("banned", (n) -> { this.setBanned(n.getBooleanValue()); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getCollectionOfObjectValues(Capability::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfObjectValues(Label::createFromDiscriminatorValue)); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(Organization::createFromDiscriminatorValue)); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("rhit_account_id", (n) -> { this.setRhitAccountId(n.getStringValue()); });
        deserializerMap.put("rhit_web_user_id", (n) -> { this.setRhitWebUserId(n.getStringValue()); });
        deserializerMap.put("service_account", (n) -> { this.setServiceAccount(n.getBooleanValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
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
     * Gets the labels property value. The labels property
     * @return a Label
     */
    @javax.annotation.Nullable
    public java.util.List<Label> getLabels() {
        return this.labels;
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
     * Gets the organization property value. The organization property
     * @return a Organization
     */
    @javax.annotation.Nullable
    public Organization getOrganization() {
        return this.organization;
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
     * Gets the rhit_account_id property value. The rhit_account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRhitAccountId() {
        return this.rhitAccountId;
    }
    /**
     * Gets the rhit_web_user_id property value. The rhit_web_user_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRhitWebUserId() {
        return this.rhitWebUserId;
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
        writer.writeStringValue("ban_code", this.getBanCode());
        writer.writeStringValue("ban_description", this.getBanDescription());
        writer.writeBooleanValue("banned", this.getBanned());
        writer.writeCollectionOfObjectValues("capabilities", this.getCapabilities());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("rhit_account_id", this.getRhitAccountId());
        writer.writeStringValue("rhit_web_user_id", this.getRhitWebUserId());
        writer.writeBooleanValue("service_account", this.getServiceAccount());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final java.util.List<Capability> value) {
        this.capabilities = value;
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
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final java.util.List<Label> value) {
        this.labels = value;
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
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganization(@javax.annotation.Nullable final Organization value) {
        this.organization = value;
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
     * Sets the rhit_account_id property value. The rhit_account_id property
     * @param value Value to set for the rhitAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRhitAccountId(@javax.annotation.Nullable final String value) {
        this.rhitAccountId = value;
    }
    /**
     * Sets the rhit_web_user_id property value. The rhit_web_user_id property
     * @param value Value to set for the rhitWebUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRhitWebUserId(@javax.annotation.Nullable final String value) {
        this.rhitWebUserId = value;
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
