package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Schema for the request body sent to /kafkas POST
 */
public class KafkaRequestPayload implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** cloud account id used to purchase the instance */
    private String billingCloudAccountId;
    /** billing model to use */
    private String billingModel;
    /** The cloud provider where the Kafka cluster will be created in */
    private String cloudProvider;
    /** enterprise OSD cluster ID to be used for kafka creation */
    private String clusterId;
    /** marketplace where the instance is purchased on */
    private String marketplace;
    /** The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or '-', start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters. */
    private String name;
    /** kafka plan in a format of <instance_type>.<size_id> */
    private String plan;
    /** Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes. The default value is true */
    private Boolean reauthenticationEnabled;
    /** The region where the Kafka cluster will be created in */
    private String region;
    /**
     * Instantiates a new KafkaRequestPayload and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkaRequestPayload() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KafkaRequestPayload
     */
    @javax.annotation.Nonnull
    public static KafkaRequestPayload createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KafkaRequestPayload();
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
     * Gets the billing_cloud_account_id property value. cloud account id used to purchase the instance
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingCloudAccountId() {
        return this.billingCloudAccountId;
    }
    /**
     * Gets the billing_model property value. billing model to use
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingModel() {
        return this.billingModel;
    }
    /**
     * Gets the cloud_provider property value. The cloud provider where the Kafka cluster will be created in
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Gets the cluster_id property value. enterprise OSD cluster ID to be used for kafka creation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("billing_cloud_account_id", (n) -> { this.setBillingCloudAccountId(n.getStringValue()); });
        deserializerMap.put("billing_model", (n) -> { this.setBillingModel(n.getStringValue()); });
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("marketplace", (n) -> { this.setMarketplace(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("reauthentication_enabled", (n) -> { this.setReauthenticationEnabled(n.getBooleanValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplace property value. marketplace where the instance is purchased on
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMarketplace() {
        return this.marketplace;
    }
    /**
     * Gets the name property value. The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or '-', start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the plan property value. kafka plan in a format of <instance_type>.<size_id>
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlan() {
        return this.plan;
    }
    /**
     * Gets the reauthentication_enabled property value. Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes. The default value is true
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReauthenticationEnabled() {
        return this.reauthenticationEnabled;
    }
    /**
     * Gets the region property value. The region where the Kafka cluster will be created in
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("billing_cloud_account_id", this.getBillingCloudAccountId());
        writer.writeStringValue("billing_model", this.getBillingModel());
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("marketplace", this.getMarketplace());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeBooleanValue("reauthentication_enabled", this.getReauthenticationEnabled());
        writer.writeStringValue("region", this.getRegion());
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
     * Sets the billing_cloud_account_id property value. cloud account id used to purchase the instance
     * @param value Value to set for the billingCloudAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingCloudAccountId(@javax.annotation.Nullable final String value) {
        this.billingCloudAccountId = value;
    }
    /**
     * Sets the billing_model property value. billing model to use
     * @param value Value to set for the billingModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingModel(@javax.annotation.Nullable final String value) {
        this.billingModel = value;
    }
    /**
     * Sets the cloud_provider property value. The cloud provider where the Kafka cluster will be created in
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the cluster_id property value. enterprise OSD cluster ID to be used for kafka creation
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the marketplace property value. marketplace where the instance is purchased on
     * @param value Value to set for the marketplace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMarketplace(@javax.annotation.Nullable final String value) {
        this.marketplace = value;
    }
    /**
     * Sets the name property value. The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or '-', start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the plan property value. kafka plan in a format of <instance_type>.<size_id>
     * @param value Value to set for the plan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlan(@javax.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the reauthentication_enabled property value. Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes. The default value is true
     * @param value Value to set for the reauthenticationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReauthenticationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.reauthenticationEnabled = value;
    }
    /**
     * Sets the region property value. The region where the Kafka cluster will be created in
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
}
