package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class QuotaRules extends ObjectReference implements Parsable {
    /** The availability_zone property */
    private String availabilityZone;
    /** The billing_model property */
    private QuotaRules_billing_model billingModel;
    /** The byoc property */
    private String byoc;
    /** The cloud property */
    private String cloud;
    /** The cost property */
    private Integer cost;
    /** The name property */
    private String name;
    /** The product property */
    private String product;
    /** The quota_id property */
    private String quotaId;
    /** The type property */
    private String type;
    /**
     * Instantiates a new QuotaRules and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public QuotaRules() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a QuotaRules
     */
    @javax.annotation.Nonnull
    public static QuotaRules createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QuotaRules();
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
     * Gets the billing_model property value. The billing_model property
     * @return a QuotaRules_billing_model
     */
    @javax.annotation.Nullable
    public QuotaRules_billing_model getBillingModel() {
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
     * Gets the cloud property value. The cloud property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloud() {
        return this.cloud;
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
        deserializerMap.put("availability_zone", (n) -> { this.setAvailabilityZone(n.getStringValue()); });
        deserializerMap.put("billing_model", (n) -> { this.setBillingModel(n.getEnumValue(QuotaRules_billing_model.class)); });
        deserializerMap.put("byoc", (n) -> { this.setByoc(n.getStringValue()); });
        deserializerMap.put("cloud", (n) -> { this.setCloud(n.getStringValue()); });
        deserializerMap.put("cost", (n) -> { this.setCost(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("quota_id", (n) -> { this.setQuotaId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the quota_id property value. The quota_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuotaId() {
        return this.quotaId;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
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
        writer.writeStringValue("availability_zone", this.getAvailabilityZone());
        writer.writeEnumValue("billing_model", this.getBillingModel());
        writer.writeStringValue("byoc", this.getByoc());
        writer.writeStringValue("cloud", this.getCloud());
        writer.writeIntegerValue("cost", this.getCost());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("product", this.getProduct());
        writer.writeStringValue("quota_id", this.getQuotaId());
        writer.writeStringValue("type", this.getType());
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
     * Sets the billing_model property value. The billing_model property
     * @param value Value to set for the billingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingModel(@javax.annotation.Nullable final QuotaRules_billing_model value) {
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
     * Sets the cloud property value. The cloud property
     * @param value Value to set for the cloud property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloud(@javax.annotation.Nullable final String value) {
        this.cloud = value;
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
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the quota_id property value. The quota_id property
     * @param value Value to set for the quotaId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuotaId(@javax.annotation.Nullable final String value) {
        this.quotaId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}
