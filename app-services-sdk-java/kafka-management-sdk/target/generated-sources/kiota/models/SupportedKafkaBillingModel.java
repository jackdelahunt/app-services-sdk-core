package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Supported Kafka Billing Model
 */
public class SupportedKafkaBillingModel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of AMS available billing models: Accepted values: ['marketplace', 'marketplace-rhm', 'marketplace-aws'] */
    private java.util.List<String> amsBillingModels;
    /** AMS product to be used. Accepted values: ['RHOSAK', 'RHOSAKTrial', 'RHOSAKEval', 'RHOSAKCC'] */
    private String amsProduct;
    /** AMS resource to be used. Accepted values: ['rhosak'] */
    private String amsResource;
    /** Identifier for the Kafka billing model */
    private String id;
    /**
     * Instantiates a new SupportedKafkaBillingModel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SupportedKafkaBillingModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SupportedKafkaBillingModel
     */
    @javax.annotation.Nonnull
    public static SupportedKafkaBillingModel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SupportedKafkaBillingModel();
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
     * Gets the ams_billing_models property value. List of AMS available billing models: Accepted values: ['marketplace', 'marketplace-rhm', 'marketplace-aws']
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAmsBillingModels() {
        return this.amsBillingModels;
    }
    /**
     * Gets the ams_product property value. AMS product to be used. Accepted values: ['RHOSAK', 'RHOSAKTrial', 'RHOSAKEval', 'RHOSAKCC']
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAmsProduct() {
        return this.amsProduct;
    }
    /**
     * Gets the ams_resource property value. AMS resource to be used. Accepted values: ['rhosak']
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAmsResource() {
        return this.amsResource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("ams_billing_models", (n) -> { this.setAmsBillingModels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ams_product", (n) -> { this.setAmsProduct(n.getStringValue()); });
        deserializerMap.put("ams_resource", (n) -> { this.setAmsResource(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Identifier for the Kafka billing model
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("ams_billing_models", this.getAmsBillingModels());
        writer.writeStringValue("ams_product", this.getAmsProduct());
        writer.writeStringValue("ams_resource", this.getAmsResource());
        writer.writeStringValue("id", this.getId());
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
     * Sets the ams_billing_models property value. List of AMS available billing models: Accepted values: ['marketplace', 'marketplace-rhm', 'marketplace-aws']
     * @param value Value to set for the amsBillingModels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmsBillingModels(@javax.annotation.Nullable final java.util.List<String> value) {
        this.amsBillingModels = value;
    }
    /**
     * Sets the ams_product property value. AMS product to be used. Accepted values: ['RHOSAK', 'RHOSAKTrial', 'RHOSAKEval', 'RHOSAKCC']
     * @param value Value to set for the amsProduct property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmsProduct(@javax.annotation.Nullable final String value) {
        this.amsProduct = value;
    }
    /**
     * Sets the ams_resource property value. AMS resource to be used. Accepted values: ['rhosak']
     * @param value Value to set for the amsResource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmsResource(@javax.annotation.Nullable final String value) {
        this.amsResource = value;
    }
    /**
     * Sets the id property value. Identifier for the Kafka billing model
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
}
