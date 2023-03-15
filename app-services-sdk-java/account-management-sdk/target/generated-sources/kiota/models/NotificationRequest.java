package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NotificationRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The bcc_address property */
    private String bccAddress;
    /** The cluster_id property */
    private String clusterId;
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The include_red_hat_associates property */
    private Boolean includeRedHatAssociates;
    /** The internal_only property */
    private Boolean internalOnly;
    /** The subject property */
    private String subject;
    /** The subscription_id property */
    private String subscriptionId;
    /** The template_name property */
    private String templateName;
    /** The template_parameters property */
    private java.util.List<TemplateParameter> templateParameters;
    /**
     * Instantiates a new NotificationRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NotificationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NotificationRequest
     */
    @javax.annotation.Nonnull
    public static NotificationRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationRequest();
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
     * Gets the bcc_address property value. The bcc_address property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBccAddress() {
        return this.bccAddress;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("bcc_address", (n) -> { this.setBccAddress(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("include_red_hat_associates", (n) -> { this.setIncludeRedHatAssociates(n.getBooleanValue()); });
        deserializerMap.put("internal_only", (n) -> { this.setInternalOnly(n.getBooleanValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("template_name", (n) -> { this.setTemplateName(n.getStringValue()); });
        deserializerMap.put("template_parameters", (n) -> { this.setTemplateParameters(n.getCollectionOfObjectValues(TemplateParameter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the include_red_hat_associates property value. The include_red_hat_associates property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeRedHatAssociates() {
        return this.includeRedHatAssociates;
    }
    /**
     * Gets the internal_only property value. The internal_only property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInternalOnly() {
        return this.internalOnly;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
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
     * Gets the template_name property value. The template_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateName() {
        return this.templateName;
    }
    /**
     * Gets the template_parameters property value. The template_parameters property
     * @return a TemplateParameter
     */
    @javax.annotation.Nullable
    public java.util.List<TemplateParameter> getTemplateParameters() {
        return this.templateParameters;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("bcc_address", this.getBccAddress());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeBooleanValue("include_red_hat_associates", this.getIncludeRedHatAssociates());
        writer.writeBooleanValue("internal_only", this.getInternalOnly());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
        writer.writeStringValue("template_name", this.getTemplateName());
        writer.writeCollectionOfObjectValues("template_parameters", this.getTemplateParameters());
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
     * Sets the bcc_address property value. The bcc_address property
     * @param value Value to set for the bccAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBccAddress(@javax.annotation.Nullable final String value) {
        this.bccAddress = value;
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
     * Sets the include_red_hat_associates property value. The include_red_hat_associates property
     * @param value Value to set for the includeRedHatAssociates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeRedHatAssociates(@javax.annotation.Nullable final Boolean value) {
        this.includeRedHatAssociates = value;
    }
    /**
     * Sets the internal_only property value. The internal_only property
     * @param value Value to set for the internalOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalOnly(@javax.annotation.Nullable final Boolean value) {
        this.internalOnly = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
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
     * Sets the template_name property value. The template_name property
     * @param value Value to set for the templateName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateName(@javax.annotation.Nullable final String value) {
        this.templateName = value;
    }
    /**
     * Sets the template_parameters property value. The template_parameters property
     * @param value Value to set for the templateParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateParameters(@javax.annotation.Nullable final java.util.List<TemplateParameter> value) {
        this.templateParameters = value;
    }
}
