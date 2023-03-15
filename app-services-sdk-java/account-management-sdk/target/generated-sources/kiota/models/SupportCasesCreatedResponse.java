package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SupportCasesCreatedResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The caseNumber property */
    private String caseNumber;
    /** The cluster_id property */
    private String clusterId;
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The description property */
    private String description;
    /** The severity property */
    private String severity;
    /** The status property */
    private String status;
    /** The subscription_id property */
    private String subscriptionId;
    /** The summary property */
    private String summary;
    /** The uri property */
    private String uri;
    /**
     * Instantiates a new SupportCasesCreatedResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SupportCasesCreatedResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SupportCasesCreatedResponse
     */
    @javax.annotation.Nonnull
    public static SupportCasesCreatedResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SupportCasesCreatedResponse();
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
     * Gets the caseNumber property value. The caseNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCaseNumber() {
        return this.caseNumber;
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
     * Gets the cluster_uuid property value. The cluster_uuid property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterUuid() {
        return this.clusterUuid;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("caseNumber", (n) -> { this.setCaseNumber(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
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
     * Gets the summary property value. The summary property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Gets the uri property value. The uri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUri() {
        return this.uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("caseNumber", this.getCaseNumber());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("severity", this.getSeverity());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeStringValue("uri", this.getUri());
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
     * Sets the caseNumber property value. The caseNumber property
     * @param value Value to set for the caseNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCaseNumber(@javax.annotation.Nullable final String value) {
        this.caseNumber = value;
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
     * Sets the cluster_uuid property value. The cluster_uuid property
     * @param value Value to set for the clusterUuid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterUuid(@javax.annotation.Nullable final String value) {
        this.clusterUuid = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final String value) {
        this.severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
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
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSummary(@javax.annotation.Nullable final String value) {
        this.summary = value;
    }
    /**
     * Sets the uri property value. The uri property
     * @param value Value to set for the uri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUri(@javax.annotation.Nullable final String value) {
        this.uri = value;
    }
}
