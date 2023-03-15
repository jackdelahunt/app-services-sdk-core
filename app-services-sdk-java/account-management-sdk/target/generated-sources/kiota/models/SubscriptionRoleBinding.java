package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubscriptionRoleBinding extends ObjectReference implements Parsable {
    /** The account property */
    private AccountReference account;
    /** The account_email property */
    private String accountEmail;
    /** The account_username property */
    private String accountUsername;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The role property */
    private ObjectReference role;
    /** The subscription property */
    private ObjectReference subscription;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new SubscriptionRoleBinding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubscriptionRoleBinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubscriptionRoleBinding
     */
    @javax.annotation.Nonnull
    public static SubscriptionRoleBinding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionRoleBinding();
    }
    /**
     * Gets the account property value. The account property
     * @return a AccountReference
     */
    @javax.annotation.Nullable
    public AccountReference getAccount() {
        return this.account;
    }
    /**
     * Gets the account_email property value. The account_email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountEmail() {
        return this.accountEmail;
    }
    /**
     * Gets the account_username property value. The account_username property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountUsername() {
        return this.accountUsername;
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
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(AccountReference::createFromDiscriminatorValue)); });
        deserializerMap.put("account_email", (n) -> { this.setAccountEmail(n.getStringValue()); });
        deserializerMap.put("account_username", (n) -> { this.setAccountUsername(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("subscription", (n) -> { this.setSubscription(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
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
        writer.writeStringValue("account_email", this.getAccountEmail());
        writer.writeStringValue("account_username", this.getAccountUsername());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeObjectValue("role", this.getRole());
        writer.writeObjectValue("subscription", this.getSubscription());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccount(@javax.annotation.Nullable final AccountReference value) {
        this.account = value;
    }
    /**
     * Sets the account_email property value. The account_email property
     * @param value Value to set for the accountEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountEmail(@javax.annotation.Nullable final String value) {
        this.accountEmail = value;
    }
    /**
     * Sets the account_username property value. The account_username property
     * @param value Value to set for the accountUsername property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountUsername(@javax.annotation.Nullable final String value) {
        this.accountUsername = value;
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
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
