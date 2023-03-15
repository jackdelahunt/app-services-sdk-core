package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReservedResource extends ObjectReference implements Parsable {
    /** The availability_zone_type property */
    private String availabilityZoneType;
    /** The billing_marketplace_account property */
    private String billingMarketplaceAccount;
    /** The billing_model property */
    private ReservedResource_billing_model billingModel;
    /** The byoc property */
    private Boolean byoc;
    /** The cluster property */
    private Boolean cluster;
    /** The count property */
    private Integer count;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The resource_name property */
    private String resourceName;
    /** The resource_type property */
    private ReservedResource_resource_type resourceType;
    /** The subscription property */
    private ObjectReference subscription;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new ReservedResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReservedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReservedResource
     */
    @javax.annotation.Nonnull
    public static ReservedResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReservedResource();
    }
    /**
     * Gets the availability_zone_type property value. The availability_zone_type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailabilityZoneType() {
        return this.availabilityZoneType;
    }
    /**
     * Gets the billing_marketplace_account property value. The billing_marketplace_account property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingMarketplaceAccount() {
        return this.billingMarketplaceAccount;
    }
    /**
     * Gets the billing_model property value. The billing_model property
     * @return a ReservedResource_billing_model
     */
    @javax.annotation.Nullable
    public ReservedResource_billing_model getBillingModel() {
        return this.billingModel;
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
     * Gets the cluster property value. The cluster property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCluster() {
        return this.cluster;
    }
    /**
     * Gets the count property value. The count property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this.count;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availability_zone_type", (n) -> { this.setAvailabilityZoneType(n.getStringValue()); });
        deserializerMap.put("billing_marketplace_account", (n) -> { this.setBillingMarketplaceAccount(n.getStringValue()); });
        deserializerMap.put("billing_model", (n) -> { this.setBillingModel(n.getEnumValue(ReservedResource_billing_model.class)); });
        deserializerMap.put("byoc", (n) -> { this.setByoc(n.getBooleanValue()); });
        deserializerMap.put("cluster", (n) -> { this.setCluster(n.getBooleanValue()); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resource_name", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(ReservedResource_resource_type.class)); });
        deserializerMap.put("subscription", (n) -> { this.setSubscription(n.getObjectValue(ObjectReference::createFromDiscriminatorValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resource_name property value. The resource_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this.resourceName;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a ReservedResource_resource_type
     */
    @javax.annotation.Nullable
    public ReservedResource_resource_type getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the subscription property value. The subscription property
     * @return a ObjectReference
     */
    @javax.annotation.Nullable
    public ObjectReference getSubscription() {
        return this.subscription;
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
        writer.writeStringValue("availability_zone_type", this.getAvailabilityZoneType());
        writer.writeStringValue("billing_marketplace_account", this.getBillingMarketplaceAccount());
        writer.writeEnumValue("billing_model", this.getBillingModel());
        writer.writeBooleanValue("byoc", this.getByoc());
        writer.writeBooleanValue("cluster", this.getCluster());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("resource_name", this.getResourceName());
        writer.writeEnumValue("resource_type", this.getResourceType());
        writer.writeObjectValue("subscription", this.getSubscription());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the availability_zone_type property value. The availability_zone_type property
     * @param value Value to set for the availabilityZoneType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityZoneType(@javax.annotation.Nullable final String value) {
        this.availabilityZoneType = value;
    }
    /**
     * Sets the billing_marketplace_account property value. The billing_marketplace_account property
     * @param value Value to set for the billingMarketplaceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingMarketplaceAccount(@javax.annotation.Nullable final String value) {
        this.billingMarketplaceAccount = value;
    }
    /**
     * Sets the billing_model property value. The billing_model property
     * @param value Value to set for the billingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingModel(@javax.annotation.Nullable final ReservedResource_billing_model value) {
        this.billingModel = value;
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
     * Sets the cluster property value. The cluster property
     * @param value Value to set for the cluster property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCluster(@javax.annotation.Nullable final Boolean value) {
        this.cluster = value;
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this.count = value;
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
     * Sets the resource_name property value. The resource_name property
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this.resourceName = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final ReservedResource_resource_type value) {
        this.resourceType = value;
    }
    /**
     * Sets the subscription property value. The subscription property
     * @param value Value to set for the subscription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscription(@javax.annotation.Nullable final ObjectReference value) {
        this.subscription = value;
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
