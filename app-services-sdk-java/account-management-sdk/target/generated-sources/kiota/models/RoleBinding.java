package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleBinding extends ObjectReference implements Parsable {
    /** The account property */
    private ObjectReference account;
    /** The account_group property */
    private ObjectReference accountGroup;
    /** The config_managed property */
    private Boolean configManaged;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The managed_by property */
    private RoleBinding_managed_by managedBy;
    /** The organization property */
    private ObjectReference organization;
    /** The role property */
    private ObjectReference role;
    /** The subscription property */
    private ObjectReference subscription;
    /** The type property */
    private RoleBinding_type type;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new RoleBinding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleBinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleBinding
     */
    @javax.annotation.Nonnull
    public static RoleBinding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleBinding();
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
     * Gets the account_group property value. The account_group property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getAccountGroup() {
        return this.accountGroup;
    }
    /**
     * Gets the config_managed property value. The config_managed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigManaged() {
        return this.configManaged;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("account_group", (n) -> { this.setAccountGroup(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("config_managed", (n) -> { this.setConfigManaged(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managed_by", (n) -> { this.setManagedBy(n.getEnumValue(RoleBinding_managed_by.class)); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("subscription", (n) -> { this.setSubscription(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RoleBinding_type.class)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managed_by property value. The managed_by property
     * @return a RoleBinding_managed_by
     */
    @javax.annotation.Nullable
    public RoleBinding_managed_by getManagedBy() {
        return this.managedBy;
    }
    /**
     * Gets the organization property value. The organization property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getOrganization() {
        return this.organization;
    }
    /**
     * Gets the role property value. The role property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getRole() {
        return this.role;
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
     * Gets the type property value. The type property
     * @return a RoleBinding_type
     */
    @javax.annotation.Nullable
    public RoleBinding_type getType() {
        return this.type;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeObjectValue("account_group", this.getAccountGroup());
        writer.writeBooleanValue("config_managed", this.getConfigManaged());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeEnumValue("managed_by", this.getManagedBy());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeObjectValue("role", this.getRole());
        writer.writeObjectValue("subscription", this.getSubscription());
        writer.writeEnumValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
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
     * Sets the account_group property value. The account_group property
     * @param value Value to set for the accountGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountGroup(@javax.annotation.Nullable final ObjectReference value) {
        this.accountGroup = value;
    }
    /**
     * Sets the config_managed property value. The config_managed property
     * @param value Value to set for the configManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigManaged(@javax.annotation.Nullable final Boolean value) {
        this.configManaged = value;
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
     * Sets the managed_by property value. The managed_by property
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBy(@javax.annotation.Nullable final RoleBinding_managed_by value) {
        this.managedBy = value;
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganization(@javax.annotation.Nullable final ObjectReference value) {
        this.organization = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final ObjectReference value) {
        this.role = value;
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
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final RoleBinding_type value) {
        this.type = value;
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
}
