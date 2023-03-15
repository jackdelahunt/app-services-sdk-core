package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleBindingRequest implements AdditionalDataHolder, Parsable {
    /** The account_group_id property */
    private String accountGroupId;
    /** The account_id property */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The config_managed property */
    private Boolean configManaged;
    /** The managed_by property */
    private String managedBy;
    /** The organization_id property */
    private String organizationId;
    /** The role_id property */
    private String roleId;
    /** The subscription_id property */
    private String subscriptionId;
    /** The type property */
    private String type;
    /**
     * Instantiates a new RoleBindingRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleBindingRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleBindingRequest
     */
    @javax.annotation.Nonnull
    public static RoleBindingRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleBindingRequest();
    }
    /**
     * Gets the account_group_id property value. The account_group_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountGroupId() {
        return this.accountGroupId;
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
     * Gets the config_managed property value. The config_managed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigManaged() {
        return this.configManaged;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("account_group_id", (n) -> { this.setAccountGroupId(n.getStringValue()); });
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("config_managed", (n) -> { this.setConfigManaged(n.getBooleanValue()); });
        deserializerMap.put("managed_by", (n) -> { this.setManagedBy(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("role_id", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managed_by property value. The managed_by property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedBy() {
        return this.managedBy;
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
     * Gets the role_id property value. The role_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the subscription_id property value. The subscription_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_group_id", this.getAccountGroupId());
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeBooleanValue("config_managed", this.getConfigManaged());
        writer.writeStringValue("managed_by", this.getManagedBy());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("role_id", this.getRoleId());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_group_id property value. The account_group_id property
     * @param value Value to set for the accountGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountGroupId(@javax.annotation.Nullable final String value) {
        this.accountGroupId = value;
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
     * Sets the config_managed property value. The config_managed property
     * @param value Value to set for the configManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigManaged(@javax.annotation.Nullable final Boolean value) {
        this.configManaged = value;
    }
    /**
     * Sets the managed_by property value. The managed_by property
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBy(@javax.annotation.Nullable final String value) {
        this.managedBy = value;
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
     * Sets the role_id property value. The role_id property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the subscription_id property value. The subscription_id property
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}
