package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SelfResourceReview implements AdditionalDataHolder, Parsable {
    /** The action property */
    private SelfResourceReview_action action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cluster_ids property */
    private java.util.List<String> clusterIds;
    /** The cluster_uuids property */
    private java.util.List<String> clusterUuids;
    /** The organization_ids property */
    private java.util.List<String> organizationIds;
    /** The resource_type property */
    private SelfResourceReview_resource_type resourceType;
    /** The subscription_ids property */
    private java.util.List<String> subscriptionIds;
    /**
     * Instantiates a new SelfResourceReview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SelfResourceReview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SelfResourceReview
     */
    @javax.annotation.Nonnull
    public static SelfResourceReview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfResourceReview();
    }
    /**
     * Gets the action property value. The action property
     * @return a SelfResourceReview_action
     */
    @javax.annotation.Nullable
    public SelfResourceReview_action getAction() {
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
     * Gets the cluster_ids property value. The cluster_ids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }
    /**
     * Gets the cluster_uuids property value. The cluster_uuids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getClusterUuids() {
        return this.clusterUuids;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(SelfResourceReview_action.class)); });
        deserializerMap.put("cluster_ids", (n) -> { this.setClusterIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("cluster_uuids", (n) -> { this.setClusterUuids(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("organization_ids", (n) -> { this.setOrganizationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(SelfResourceReview_resource_type.class)); });
        deserializerMap.put("subscription_ids", (n) -> { this.setSubscriptionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the organization_ids property value. The organization_ids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrganizationIds() {
        return this.organizationIds;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a SelfResourceReview_resource_type
     */
    @javax.annotation.Nullable
    public SelfResourceReview_resource_type getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the subscription_ids property value. The subscription_ids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSubscriptionIds() {
        return this.subscriptionIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfPrimitiveValues("cluster_ids", this.getClusterIds());
        writer.writeCollectionOfPrimitiveValues("cluster_uuids", this.getClusterUuids());
        writer.writeCollectionOfPrimitiveValues("organization_ids", this.getOrganizationIds());
        writer.writeEnumValue("resource_type", this.getResourceType());
        writer.writeCollectionOfPrimitiveValues("subscription_ids", this.getSubscriptionIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final SelfResourceReview_action value) {
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
     * Sets the cluster_ids property value. The cluster_ids property
     * @param value Value to set for the clusterIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.clusterIds = value;
    }
    /**
     * Sets the cluster_uuids property value. The cluster_uuids property
     * @param value Value to set for the clusterUuids property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterUuids(@javax.annotation.Nullable final java.util.List<String> value) {
        this.clusterUuids = value;
    }
    /**
     * Sets the organization_ids property value. The organization_ids property
     * @param value Value to set for the organizationIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.organizationIds = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final SelfResourceReview_resource_type value) {
        this.resourceType = value;
    }
    /**
     * Sets the subscription_ids property value. The subscription_ids property
     * @param value Value to set for the subscriptionIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.subscriptionIds = value;
    }
}
