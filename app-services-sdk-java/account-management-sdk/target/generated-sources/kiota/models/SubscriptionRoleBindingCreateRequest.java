package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubscriptionRoleBindingCreateRequest implements AdditionalDataHolder, Parsable {
    /** The account_username property */
    private String accountUsername;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The role_id property */
    private String roleId;
    /**
     * Instantiates a new SubscriptionRoleBindingCreateRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubscriptionRoleBindingCreateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubscriptionRoleBindingCreateRequest
     */
    @javax.annotation.Nonnull
    public static SubscriptionRoleBindingCreateRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionRoleBindingCreateRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("account_username", (n) -> { this.setAccountUsername(n.getStringValue()); });
        deserializerMap.put("role_id", (n) -> { this.setRoleId(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_username", this.getAccountUsername());
        writer.writeStringValue("role_id", this.getRoleId());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
}
