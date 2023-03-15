package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Supported Kafka instance type
 */
public class SupportedKafkaInstanceTypesList_instance_types implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Human readable name of the supported Kafka instance type */
    private String displayName;
    /** Unique identifier of the Kafka instance type. */
    private String id;
    /** A list of Kafka instance sizes available for this instance type */
    private java.util.List<SupportedKafkaInstanceTypesList_instance_types_sizes> sizes;
    /** A list of available kafka billing models for the instance type. Each kafka billing model item has a unique 'id' */
    private java.util.List<SupportedKafkaBillingModel> supportedBillingModels;
    /**
     * Instantiates a new SupportedKafkaInstanceTypesList_instance_types and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SupportedKafkaInstanceTypesList_instance_types() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SupportedKafkaInstanceTypesList_instance_types
     */
    @javax.annotation.Nonnull
    public static SupportedKafkaInstanceTypesList_instance_types createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SupportedKafkaInstanceTypesList_instance_types();
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
     * Gets the display_name property value. Human readable name of the supported Kafka instance type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("sizes", (n) -> { this.setSizes(n.getCollectionOfObjectValues(SupportedKafkaInstanceTypesList_instance_types_sizes::createFromDiscriminatorValue)); });
        deserializerMap.put("supported_billing_models", (n) -> { this.setSupportedBillingModels(n.getCollectionOfObjectValues(SupportedKafkaBillingModel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier of the Kafka instance type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the sizes property value. A list of Kafka instance sizes available for this instance type
     * @return a SupportedKafkaInstanceTypesList_instance_types_sizes
     */
    @javax.annotation.Nullable
    public java.util.List<SupportedKafkaInstanceTypesList_instance_types_sizes> getSizes() {
        return this.sizes;
    }
    /**
     * Gets the supported_billing_models property value. A list of available kafka billing models for the instance type. Each kafka billing model item has a unique 'id'
     * @return a SupportedKafkaBillingModel
     */
    @javax.annotation.Nullable
    public java.util.List<SupportedKafkaBillingModel> getSupportedBillingModels() {
        return this.supportedBillingModels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("sizes", this.getSizes());
        writer.writeCollectionOfObjectValues("supported_billing_models", this.getSupportedBillingModels());
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
     * Sets the display_name property value. Human readable name of the supported Kafka instance type
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. Unique identifier of the Kafka instance type.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the sizes property value. A list of Kafka instance sizes available for this instance type
     * @param value Value to set for the sizes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizes(@javax.annotation.Nullable final java.util.List<SupportedKafkaInstanceTypesList_instance_types_sizes> value) {
        this.sizes = value;
    }
    /**
     * Sets the supported_billing_models property value. A list of available kafka billing models for the instance type. Each kafka billing model item has a unique 'id'
     * @param value Value to set for the supportedBillingModels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedBillingModels(@javax.annotation.Nullable final java.util.List<SupportedKafkaBillingModel> value) {
        this.supportedBillingModels = value;
    }
}
