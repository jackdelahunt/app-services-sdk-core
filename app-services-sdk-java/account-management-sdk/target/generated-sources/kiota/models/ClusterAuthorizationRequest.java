package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterAuthorizationRequest implements AdditionalDataHolder, Parsable {
    /** The account_username property */
    private String accountUsername;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The availability_zone property */
    private String availabilityZone;
    /** The byoc property */
    private Boolean byoc;
    /** The cloud_account_id property */
    private String cloudAccountId;
    /** The cloud_provider_id property */
    private String cloudProviderId;
    /** The cluster_id property */
    private String clusterId;
    /** The disconnected property */
    private Boolean disconnected;
    /** The display_name property */
    private String displayName;
    /** The external_cluster_id property */
    private String externalClusterId;
    /** The managed property */
    private Boolean managed;
    /** The product_category property */
    private ClusterAuthorizationRequest_product_category productCategory;
    /** The product_id property */
    private ClusterAuthorizationRequest_product_id productId;
    /** The quota_version property */
    private String quotaVersion;
    /** The reserve property */
    private Boolean reserve;
    /** The resources property */
    private java.util.List<ReservedResource> resources;
    /**
     * Instantiates a new ClusterAuthorizationRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterAuthorizationRequest() {
        this.setAdditionalData(new HashMap<>());
        this.setProductId(ClusterAuthorizationRequest_product_id.forValue("OSD"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterAuthorizationRequest
     */
    @javax.annotation.Nonnull
    public static ClusterAuthorizationRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterAuthorizationRequest();
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
     * Gets the availability_zone property value. The availability_zone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Gets the byoc property value. The byoc property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getByoc() {
        return this.byoc;
    }
    /**
     * Gets the cloud_account_id property value. The cloud_account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }
    /**
     * Gets the cloud_provider_id property value. The cloud_provider_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProviderId() {
        return this.cloudProviderId;
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
     * Gets the disconnected property value. The disconnected property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisconnected() {
        return this.disconnected;
    }
    /**
     * Gets the display_name property value. The display_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the external_cluster_id property value. The external_cluster_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalClusterId() {
        return this.externalClusterId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("account_username", (n) -> { this.setAccountUsername(n.getStringValue()); });
        deserializerMap.put("availability_zone", (n) -> { this.setAvailabilityZone(n.getStringValue()); });
        deserializerMap.put("byoc", (n) -> { this.setByoc(n.getBooleanValue()); });
        deserializerMap.put("cloud_account_id", (n) -> { this.setCloudAccountId(n.getStringValue()); });
        deserializerMap.put("cloud_provider_id", (n) -> { this.setCloudProviderId(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("disconnected", (n) -> { this.setDisconnected(n.getBooleanValue()); });
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("external_cluster_id", (n) -> { this.setExternalClusterId(n.getStringValue()); });
        deserializerMap.put("managed", (n) -> { this.setManaged(n.getBooleanValue()); });
        deserializerMap.put("product_category", (n) -> { this.setProductCategory(n.getEnumValue(ClusterAuthorizationRequest_product_category.class)); });
        deserializerMap.put("product_id", (n) -> { this.setProductId(n.getEnumValue(ClusterAuthorizationRequest_product_id.class)); });
        deserializerMap.put("quota_version", (n) -> { this.setQuotaVersion(n.getStringValue()); });
        deserializerMap.put("reserve", (n) -> { this.setReserve(n.getBooleanValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(ReservedResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managed property value. The managed property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManaged() {
        return this.managed;
    }
    /**
     * Gets the product_category property value. The product_category property
     * @return a ClusterAuthorizationRequest_product_category
     */
    @javax.annotation.Nullable
    public ClusterAuthorizationRequest_product_category getProductCategory() {
        return this.productCategory;
    }
    /**
     * Gets the product_id property value. The product_id property
     * @return a ClusterAuthorizationRequest_product_id
     */
    @javax.annotation.Nullable
    public ClusterAuthorizationRequest_product_id getProductId() {
        return this.productId;
    }
    /**
     * Gets the quota_version property value. The quota_version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuotaVersion() {
        return this.quotaVersion;
    }
    /**
     * Gets the reserve property value. The reserve property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReserve() {
        return this.reserve;
    }
    /**
     * Gets the resources property value. The resources property
     * @return a ReservedResource
     */
    @javax.annotation.Nullable
    public java.util.List<ReservedResource> getResources() {
        return this.resources;
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
        writer.writeStringValue("availability_zone", this.getAvailabilityZone());
        writer.writeBooleanValue("byoc", this.getByoc());
        writer.writeStringValue("cloud_account_id", this.getCloudAccountId());
        writer.writeStringValue("cloud_provider_id", this.getCloudProviderId());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeBooleanValue("disconnected", this.getDisconnected());
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeStringValue("external_cluster_id", this.getExternalClusterId());
        writer.writeBooleanValue("managed", this.getManaged());
        writer.writeEnumValue("product_category", this.getProductCategory());
        writer.writeEnumValue("product_id", this.getProductId());
        writer.writeStringValue("quota_version", this.getQuotaVersion());
        writer.writeBooleanValue("reserve", this.getReserve());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
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
     * Sets the availability_zone property value. The availability_zone property
     * @param value Value to set for the availabilityZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityZone(@javax.annotation.Nullable final String value) {
        this.availabilityZone = value;
    }
    /**
     * Sets the byoc property value. The byoc property
     * @param value Value to set for the byoc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setByoc(@javax.annotation.Nullable final Boolean value) {
        this.byoc = value;
    }
    /**
     * Sets the cloud_account_id property value. The cloud_account_id property
     * @param value Value to set for the cloudAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAccountId(@javax.annotation.Nullable final String value) {
        this.cloudAccountId = value;
    }
    /**
     * Sets the cloud_provider_id property value. The cloud_provider_id property
     * @param value Value to set for the cloudProviderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProviderId(@javax.annotation.Nullable final String value) {
        this.cloudProviderId = value;
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
     * Sets the disconnected property value. The disconnected property
     * @param value Value to set for the disconnected property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisconnected(@javax.annotation.Nullable final Boolean value) {
        this.disconnected = value;
    }
    /**
     * Sets the display_name property value. The display_name property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the external_cluster_id property value. The external_cluster_id property
     * @param value Value to set for the externalClusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalClusterId(@javax.annotation.Nullable final String value) {
        this.externalClusterId = value;
    }
    /**
     * Sets the managed property value. The managed property
     * @param value Value to set for the managed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManaged(@javax.annotation.Nullable final Boolean value) {
        this.managed = value;
    }
    /**
     * Sets the product_category property value. The product_category property
     * @param value Value to set for the productCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductCategory(@javax.annotation.Nullable final ClusterAuthorizationRequest_product_category value) {
        this.productCategory = value;
    }
    /**
     * Sets the product_id property value. The product_id property
     * @param value Value to set for the productId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductId(@javax.annotation.Nullable final ClusterAuthorizationRequest_product_id value) {
        this.productId = value;
    }
    /**
     * Sets the quota_version property value. The quota_version property
     * @param value Value to set for the quotaVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuotaVersion(@javax.annotation.Nullable final String value) {
        this.quotaVersion = value;
    }
    /**
     * Sets the reserve property value. The reserve property
     * @param value Value to set for the reserve property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReserve(@javax.annotation.Nullable final Boolean value) {
        this.reserve = value;
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<ReservedResource> value) {
        this.resources = value;
    }
}
