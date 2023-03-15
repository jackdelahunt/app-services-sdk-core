package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExcessResource extends ObjectReference implements Parsable {
    /** The availability_zone_type property */
    private String availabilityZoneType;
    /** The billing_model property */
    private ExcessResource_billing_model billingModel;
    /** The byoc property */
    private Boolean byoc;
    /** The count property */
    private Integer count;
    /** The resource_name property */
    private String resourceName;
    /** The resource_type property */
    private String resourceType;
    /**
     * Instantiates a new ExcessResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExcessResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExcessResource
     */
    @javax.annotation.Nonnull
    public static ExcessResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExcessResource();
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
     * @return a ExcessResource_billing_model
     */
    @javax.annotation.Nullable
    public ExcessResource_billing_model getBillingModel() {
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
     * Gets the count property value. The count property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availability_zone_type", (n) -> { this.setAvailabilityZoneType(n.getStringValue()); });
        deserializerMap.put("billing_model", (n) -> { this.setBillingModel(n.getEnumValue(ExcessResource_billing_model.class)); });
        deserializerMap.put("byoc", (n) -> { this.setByoc(n.getBooleanValue()); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("resource_name", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getStringValue()); });
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
        writer.writeBooleanValue("byoc", this.getByoc());
        writer.writeIntegerValue("count", this.getCount());
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
    public void setBillingModel(@javax.annotation.Nullable final ExcessResource_billing_model value) {
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
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this.count = value;
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
