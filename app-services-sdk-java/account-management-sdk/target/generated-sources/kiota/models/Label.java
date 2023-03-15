package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Label extends ObjectReference implements Parsable {
    /** The account_id property */
    private String accountId;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The internal property */
    private Boolean internal;
    /** The key property */
    private String key;
    /** The managed_by property */
    private Label_managed_by managedBy;
    /** The organization_id property */
    private String organizationId;
    /** The subscription_id property */
    private String subscriptionId;
    /** The type property */
    private String type;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /** The value property */
    private String value;
    /**
     * Instantiates a new Label and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Label() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Label
     */
    @javax.annotation.Nonnull
    public static Label createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Label();
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
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("internal", (n) -> { this.setInternal(n.getBooleanValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("managed_by", (n) -> { this.setManagedBy(n.getEnumValue(Label_managed_by.class)); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internal property value. The internal property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInternal() {
        return this.internal;
    }
    /**
     * Gets the key property value. The key property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the managed_by property value. The managed_by property
     * @return a Label_managed_by
     */
    @javax.annotation.Nullable
    public Label_managed_by getManagedBy() {
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
     * Gets the updated_at property value. The updated_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the value property value. The value property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this.value;
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
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("internal", this.getInternal());
        writer.writeStringValue("key", this.getKey());
        writer.writeEnumValue("managed_by", this.getManagedBy());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
        writer.writeStringValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the internal property value. The internal property
     * @param value Value to set for the internal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternal(@javax.annotation.Nullable final Boolean value) {
        this.internal = value;
    }
    /**
     * Sets the key property value. The key property
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the managed_by property value. The managed_by property
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBy(@javax.annotation.Nullable final Label_managed_by value) {
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
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this.value = value;
    }
}
