package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterTransfer extends ObjectReference implements Parsable {
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The expiration_date property */
    private OffsetDateTime expirationDate;
    /** The owner property */
    private String owner;
    /** The pull_secret_rotation_id property */
    private String pullSecretRotationId;
    /** The recipient property */
    private String recipient;
    /** The secret property */
    private String secret;
    /** The status property */
    private ClusterTransfer_status status;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new ClusterTransfer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterTransfer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterTransfer
     */
    @javax.annotation.Nonnull
    public static ClusterTransfer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterTransfer();
    }
    /**
     * Gets the cluster_uuid property value. The cluster_uuid property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterUuid() {
        return this.clusterUuid;
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
     * Gets the expiration_date property value. The expiration_date property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expiration_date", (n) -> { this.setExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("pull_secret_rotation_id", (n) -> { this.setPullSecretRotationId(n.getStringValue()); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getStringValue()); });
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ClusterTransfer_status.class)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the owner property value. The owner property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the pull_secret_rotation_id property value. The pull_secret_rotation_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPullSecretRotationId() {
        return this.pullSecretRotationId;
    }
    /**
     * Gets the recipient property value. The recipient property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipient() {
        return this.recipient;
    }
    /**
     * Gets the secret property value. The secret property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Gets the status property value. The status property
     * @return a ClusterTransfer_status
     */
    @javax.annotation.Nullable
    public ClusterTransfer_status getStatus() {
        return this.status;
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
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("expiration_date", this.getExpirationDate());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("pull_secret_rotation_id", this.getPullSecretRotationId());
        writer.writeStringValue("recipient", this.getRecipient());
        writer.writeStringValue("secret", this.getSecret());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the cluster_uuid property value. The cluster_uuid property
     * @param value Value to set for the clusterUuid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterUuid(@javax.annotation.Nullable final String value) {
        this.clusterUuid = value;
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
     * Sets the expiration_date property value. The expiration_date property
     * @param value Value to set for the expirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDate = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the pull_secret_rotation_id property value. The pull_secret_rotation_id property
     * @param value Value to set for the pullSecretRotationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPullSecretRotationId(@javax.annotation.Nullable final String value) {
        this.pullSecretRotationId = value;
    }
    /**
     * Sets the recipient property value. The recipient property
     * @param value Value to set for the recipient property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipient(@javax.annotation.Nullable final String value) {
        this.recipient = value;
    }
    /**
     * Sets the secret property value. The secret property
     * @param value Value to set for the secret property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecret(@javax.annotation.Nullable final String value) {
        this.secret = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ClusterTransfer_status value) {
        this.status = value;
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
