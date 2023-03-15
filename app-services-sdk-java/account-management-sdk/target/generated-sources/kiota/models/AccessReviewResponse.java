package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewResponse implements AdditionalDataHolder, Parsable {
    /** The account_id property */
    private String accountId;
    /** The action property */
    private AccessReviewResponse_action action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The allowed property */
    private Boolean allowed;
    /** The cluster_id property */
    private String clusterId;
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The organization_id property */
    private String organizationId;
    /** The resource_type property */
    private AccessReviewResponse_resource_type resourceType;
    /** The subscription_id property */
    private String subscriptionId;
    /**
     * Instantiates a new AccessReviewResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewResponse
     */
    @javax.annotation.Nonnull
    public static AccessReviewResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewResponse();
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
     * Gets the action property value. The action property
     * @return a AccessReviewResponse_action
     */
    @javax.annotation.Nullable
    public AccessReviewResponse_action getAction() {
        return this.action;
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
     * Gets the allowed property value. The allowed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowed() {
        return this.allowed;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(AccessReviewResponse_action.class)); });
        deserializerMap.put("allowed", (n) -> { this.setAllowed(n.getBooleanValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(AccessReviewResponse_resource_type.class)); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the resource_type property value. The resource_type property
     * @return a AccessReviewResponse_resource_type
     */
    @javax.annotation.Nullable
    public AccessReviewResponse_resource_type getResourceType() {
        return this.resourceType;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeEnumValue("action", this.getAction());
        writer.writeBooleanValue("allowed", this.getAllowed());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeEnumValue("resource_type", this.getResourceType());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
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
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final AccessReviewResponse_action value) {
        this.action = value;
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
     * Sets the allowed property value. The allowed property
     * @param value Value to set for the allowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowed(@javax.annotation.Nullable final Boolean value) {
        this.allowed = value;
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
     * Sets the organization_id property value. The organization_id property
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final AccessReviewResponse_resource_type value) {
        this.resourceType = value;
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
}
