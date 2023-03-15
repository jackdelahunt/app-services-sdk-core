package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KafkaPromoteRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The desired Kafka billing cloud account ID to promote the kafka instance to. Only considered when desired_kafka_billing_model is 'marketplace' */
    private String desiredBillingCloudAccountId;
    /** The desired Kafka billing model to promote the kafka instance to. Promotion is performed asynchronously. Accepted values: ['marketplace', 'standard'] */
    private String desiredKafkaBillingModel;
    /** The desired billing marketplace to promote the kafka instance to. Accepted values: ['aws', 'rhm']. Only considered when desired_kafka_billing_model is 'marketplace' */
    private String desiredMarketplace;
    /**
     * Instantiates a new KafkaPromoteRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkaPromoteRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KafkaPromoteRequest
     */
    @javax.annotation.Nonnull
    public static KafkaPromoteRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KafkaPromoteRequest();
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
     * Gets the desired_billing_cloud_account_id property value. The desired Kafka billing cloud account ID to promote the kafka instance to. Only considered when desired_kafka_billing_model is 'marketplace'
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDesiredBillingCloudAccountId() {
        return this.desiredBillingCloudAccountId;
    }
    /**
     * Gets the desired_kafka_billing_model property value. The desired Kafka billing model to promote the kafka instance to. Promotion is performed asynchronously. Accepted values: ['marketplace', 'standard']
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDesiredKafkaBillingModel() {
        return this.desiredKafkaBillingModel;
    }
    /**
     * Gets the desired_marketplace property value. The desired billing marketplace to promote the kafka instance to. Accepted values: ['aws', 'rhm']. Only considered when desired_kafka_billing_model is 'marketplace'
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDesiredMarketplace() {
        return this.desiredMarketplace;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("desired_billing_cloud_account_id", (n) -> { this.setDesiredBillingCloudAccountId(n.getStringValue()); });
        deserializerMap.put("desired_kafka_billing_model", (n) -> { this.setDesiredKafkaBillingModel(n.getStringValue()); });
        deserializerMap.put("desired_marketplace", (n) -> { this.setDesiredMarketplace(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("desired_billing_cloud_account_id", this.getDesiredBillingCloudAccountId());
        writer.writeStringValue("desired_kafka_billing_model", this.getDesiredKafkaBillingModel());
        writer.writeStringValue("desired_marketplace", this.getDesiredMarketplace());
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
     * Sets the desired_billing_cloud_account_id property value. The desired Kafka billing cloud account ID to promote the kafka instance to. Only considered when desired_kafka_billing_model is 'marketplace'
     * @param value Value to set for the desiredBillingCloudAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDesiredBillingCloudAccountId(@javax.annotation.Nullable final String value) {
        this.desiredBillingCloudAccountId = value;
    }
    /**
     * Sets the desired_kafka_billing_model property value. The desired Kafka billing model to promote the kafka instance to. Promotion is performed asynchronously. Accepted values: ['marketplace', 'standard']
     * @param value Value to set for the desiredKafkaBillingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDesiredKafkaBillingModel(@javax.annotation.Nullable final String value) {
        this.desiredKafkaBillingModel = value;
    }
    /**
     * Sets the desired_marketplace property value. The desired billing marketplace to promote the kafka instance to. Accepted values: ['aws', 'rhm']. Only considered when desired_kafka_billing_model is 'marketplace'
     * @param value Value to set for the desiredMarketplace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDesiredMarketplace(@javax.annotation.Nullable final String value) {
        this.desiredMarketplace = value;
    }
}
