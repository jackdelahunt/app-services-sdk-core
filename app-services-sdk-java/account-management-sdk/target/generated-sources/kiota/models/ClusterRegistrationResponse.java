package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterRegistrationResponse implements AdditionalDataHolder, Parsable {
    /** The account_id property */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The authorization_token property */
    private String authorizationToken;
    /** The cluster_id property */
    private String clusterId;
    /** Cluster Registration expiration in Unix time */
    private String expiresAt;
    /**
     * Instantiates a new ClusterRegistrationResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterRegistrationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterRegistrationResponse
     */
    @javax.annotation.Nonnull
    public static ClusterRegistrationResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterRegistrationResponse();
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
     * Gets the authorization_token property value. The authorization_token property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }
    /**
     * Gets the cluster_id property value. The cluster_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * Gets the expires_at property value. Cluster Registration expiration in Unix time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("authorization_token", (n) -> { this.setAuthorizationToken(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("authorization_token", this.getAuthorizationToken());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("expires_at", this.getExpiresAt());
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
     * Sets the authorization_token property value. The authorization_token property
     * @param value Value to set for the authorizationToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizationToken(@javax.annotation.Nullable final String value) {
        this.authorizationToken = value;
    }
    /**
     * Sets the cluster_id property value. The cluster_id property
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the expires_at property value. Cluster Registration expiration in Unix time
     * @param value Value to set for the expiresAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiresAt(@javax.annotation.Nullable final String value) {
        this.expiresAt = value;
    }
}
