package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RelatedResource extends ObjectReference implements Parsable {
    /** The availability_zone_type property */
    private String availabilityZoneType;
    /** The billing_model property */
    private RelatedResource_billing_model billingModel;
    /** The byoc property */
    private String byoc;
    /** The cloud_provider property */
    private String cloudProvider;
    /** The cost property */
    private Integer cost;
    /** The product property */
    private String product;
    /** The product_id property */
    private String productId;
    /** The resource_name property */
    private String resourceName;
    /** The resource_type property */
    private String resourceType;
    /**
     * Instantiates a new RelatedResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RelatedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RelatedResource
     */
    @javax.annotation.Nonnull
    public static RelatedResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedResource();
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
     * Gets the billing_model property value. The billing_model property
     * @return a RelatedResource_billing_model
     */
    @javax.annotation.Nullable
    public RelatedResource_billing_model getBillingModel() {
        return this.billingModel;
    }
    /**
     * Gets the byoc property value. The byoc property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getByoc() {
        return this.byoc;
    }
    /**
     * Gets the cloud_provider property value. The cloud_provider property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Gets the cost property value. The cost property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCost() {
        return this.cost;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availability_zone_type", (n) -> { this.setAvailabilityZoneType(n.getStringValue()); });
        deserializerMap.put("billing_model", (n) -> { this.setBillingModel(n.getEnumValue(RelatedResource_billing_model.class)); });
        deserializerMap.put("byoc", (n) -> { this.setByoc(n.getStringValue()); });
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("cost", (n) -> { this.setCost(n.getIntegerValue()); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("product_id", (n) -> { this.setProductId(n.getStringValue()); });
        deserializerMap.put("resource_name", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the product_id property value. The product_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductId() {
        return this.productId;
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
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
        writer.writeEnumValue("billing_model", this.getBillingModel());
        writer.writeStringValue("byoc", this.getByoc());
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeIntegerValue("cost", this.getCost());
        writer.writeStringValue("product", this.getProduct());
        writer.writeStringValue("product_id", this.getProductId());
        writer.writeStringValue("resource_name", this.getResourceName());
        writer.writeStringValue("resource_type", this.getResourceType());
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
     * Sets the billing_model property value. The billing_model property
     * @param value Value to set for the billingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingModel(@javax.annotation.Nullable final RelatedResource_billing_model value) {
        this.billingModel = value;
    }
    /**
     * Sets the byoc property value. The byoc property
     * @param value Value to set for the byoc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setByoc(@javax.annotation.Nullable final String value) {
        this.byoc = value;
    }
    /**
     * Sets the cloud_provider property value. The cloud_provider property
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the cost property value. The cost property
     * @param value Value to set for the cost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCost(@javax.annotation.Nullable final Integer value) {
        this.cost = value;
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
     * Sets the product_id property value. The product_id property
     * @param value Value to set for the productId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductId(@javax.annotation.Nullable final String value) {
        this.productId = value;
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
    public void setResourceType(@javax.annotation.Nullable final String value) {
        this.resourceType = value;
    }
}
