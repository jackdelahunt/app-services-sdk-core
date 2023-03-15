package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SupportCasesRequest implements AdditionalDataHolder, Parsable {
    /** The account_number property */
    private String accountNumber;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The case_language property */
    private String caseLanguage;
    /** The cluster_id property */
    private String clusterId;
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The contact_sso_name property */
    private String contactSsoName;
    /** The description property */
    private String description;
    /** The event_stream_id property */
    private String eventStreamId;
    /** The openshift_cluster_id property */
    private String openshiftClusterId;
    /** The product property */
    private String product;
    /** The severity property */
    private SupportCasesRequest_severity severity;
    /** The subscription_id property */
    private String subscriptionId;
    /** The summary property */
    private String summary;
    /** The version property */
    private String version;
    /**
     * Instantiates a new SupportCasesRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SupportCasesRequest() {
        this.setAdditionalData(new HashMap<>());
        this.setProduct("OpenShift Container Platform");
        this.setVersion("4.10");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SupportCasesRequest
     */
    @javax.annotation.Nonnull
    public static SupportCasesRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SupportCasesRequest();
    }
    /**
     * Gets the account_number property value. The account_number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountNumber() {
        return this.accountNumber;
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
     * Gets the case_language property value. The case_language property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCaseLanguage() {
        return this.caseLanguage;
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
     * Gets the contact_sso_name property value. The contact_sso_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactSsoName() {
        return this.contactSsoName;
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
     * Gets the event_stream_id property value. The event_stream_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventStreamId() {
        return this.eventStreamId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("account_number", (n) -> { this.setAccountNumber(n.getStringValue()); });
        deserializerMap.put("case_language", (n) -> { this.setCaseLanguage(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("contact_sso_name", (n) -> { this.setContactSsoName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("event_stream_id", (n) -> { this.setEventStreamId(n.getStringValue()); });
        deserializerMap.put("openshift_cluster_id", (n) -> { this.setOpenshiftClusterId(n.getStringValue()); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(SupportCasesRequest_severity.class)); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the openshift_cluster_id property value. The openshift_cluster_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOpenshiftClusterId() {
        return this.openshiftClusterId;
    }
    /**
     * Gets the product property value. The product property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProduct() {
        return this.product;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a SupportCasesRequest_severity
     */
    @javax.annotation.Nullable
    public SupportCasesRequest_severity getSeverity() {
        return this.severity;
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
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_number", this.getAccountNumber());
        writer.writeStringValue("case_language", this.getCaseLanguage());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeStringValue("contact_sso_name", this.getContactSsoName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("event_stream_id", this.getEventStreamId());
        writer.writeStringValue("openshift_cluster_id", this.getOpenshiftClusterId());
        writer.writeStringValue("product", this.getProduct());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeStringValue("version", this.getVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_number property value. The account_number property
     * @param value Value to set for the accountNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountNumber(@javax.annotation.Nullable final String value) {
        this.accountNumber = value;
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
     * Sets the case_language property value. The case_language property
     * @param value Value to set for the caseLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCaseLanguage(@javax.annotation.Nullable final String value) {
        this.caseLanguage = value;
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
     * Sets the contact_sso_name property value. The contact_sso_name property
     * @param value Value to set for the contactSsoName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactSsoName(@javax.annotation.Nullable final String value) {
        this.contactSsoName = value;
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
     * Sets the event_stream_id property value. The event_stream_id property
     * @param value Value to set for the eventStreamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventStreamId(@javax.annotation.Nullable final String value) {
        this.eventStreamId = value;
    }
    /**
     * Sets the openshift_cluster_id property value. The openshift_cluster_id property
     * @param value Value to set for the openshiftClusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenshiftClusterId(@javax.annotation.Nullable final String value) {
        this.openshiftClusterId = value;
    }
    /**
     * Sets the product property value. The product property
     * @param value Value to set for the product property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProduct(@javax.annotation.Nullable final String value) {
        this.product = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final SupportCasesRequest_severity value) {
        this.severity = value;
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
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
