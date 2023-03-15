package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * schema for a kafka instance type capacity in region
 */
public class RegionCapacityListItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** list of available Kafka instance sizes that can be created in this region when taking account current capacity and regional limits */
    private java.util.List<String> availableSizes;
    /** kafka instance type */
    private String instanceType;
    /**
     * Instantiates a new RegionCapacityListItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegionCapacityListItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegionCapacityListItem
     */
    @javax.annotation.Nonnull
    public static RegionCapacityListItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionCapacityListItem();
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
     * Gets the available_sizes property value. list of available Kafka instance sizes that can be created in this region when taking account current capacity and regional limits
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAvailableSizes() {
        return this.availableSizes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("available_sizes", (n) -> { this.setAvailableSizes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("instance_type", (n) -> { this.setInstanceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instance_type property value. kafka instance type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("available_sizes", this.getAvailableSizes());
        writer.writeStringValue("instance_type", this.getInstanceType());
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
     * Sets the available_sizes property value. list of available Kafka instance sizes that can be created in this region when taking account current capacity and regional limits
     * @param value Value to set for the availableSizes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailableSizes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.availableSizes = value;
    }
    /**
     * Sets the instance_type property value. kafka instance type
     * @param value Value to set for the instanceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceType(@javax.annotation.Nullable final String value) {
        this.instanceType = value;
    }
}
