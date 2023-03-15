package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BridgeRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cloud provider where the bridge resides */
    private String cloudProvider;
    /** The name of the bridge */
    private String name;
    /** The cloud provider region where the bridge resides */
    private String region;
    /**
     * Instantiates a new BridgeRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BridgeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BridgeRequest
     */
    @javax.annotation.Nonnull
    public static BridgeRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BridgeRequest();
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
     * Gets the cloud_provider property value. The cloud provider where the bridge resides
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the bridge
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the region property value. The cloud provider region where the bridge resides
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
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeStringValue("name", this.getName());
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
     * Sets the cloud_provider property value. The cloud provider where the bridge resides
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the name property value. The name of the bridge
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the region property value. The cloud provider region where the bridge resides
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
}
