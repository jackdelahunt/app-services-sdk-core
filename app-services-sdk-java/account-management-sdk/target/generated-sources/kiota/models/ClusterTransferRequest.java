package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterTransferRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The owner property */
    private String owner;
    /** The recipient property */
    private String recipient;
    /**
     * Instantiates a new ClusterTransferRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterTransferRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterTransferRequest
     */
    @javax.annotation.Nonnull
    public static ClusterTransferRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterTransferRequest();
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
     * Gets the cluster_uuid property value. The cluster_uuid property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterUuid() {
        return this.clusterUuid;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getStringValue()); });
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
     * Gets the recipient property value. The recipient property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipient() {
        return this.recipient;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("recipient", this.getRecipient());
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
     * Sets the cluster_uuid property value. The cluster_uuid property
     * @param value Value to set for the clusterUuid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterUuid(@javax.annotation.Nullable final String value) {
        this.clusterUuid = value;
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
     * Sets the recipient property value. The recipient property
     * @param value Value to set for the recipient property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipient(@javax.annotation.Nullable final String value) {
        this.recipient = value;
    }
}
