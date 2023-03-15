package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnterpriseCluster extends EnterpriseClusterListItem implements Parsable {
    /** Returns the capacity related information */
    private EnterpriseCluster_capacity_information capacityInformation;
    /** The supported_instance_types property */
    private SupportedKafkaInstanceTypesList supportedInstanceTypes;
    /**
     * Instantiates a new EnterpriseCluster and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnterpriseCluster() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnterpriseCluster
     */
    @javax.annotation.Nonnull
    public static EnterpriseCluster createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseCluster();
    }
    /**
     * Gets the capacity_information property value. Returns the capacity related information
     * @return a EnterpriseCluster_capacity_information
     */
    @javax.annotation.Nullable
    public EnterpriseCluster_capacity_information getCapacityInformation() {
        return this.capacityInformation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capacity_information", (n) -> { this.setCapacityInformation(n.getObjectValue(EnterpriseCluster_capacity_information::createFromDiscriminatorValue)); });
        deserializerMap.put("supported_instance_types", (n) -> { this.setSupportedInstanceTypes(n.getObjectValue(SupportedKafkaInstanceTypesList::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the supported_instance_types property value. The supported_instance_types property
     * @return a SupportedKafkaInstanceTypesList
     */
    @javax.annotation.Nullable
    public SupportedKafkaInstanceTypesList getSupportedInstanceTypes() {
        return this.supportedInstanceTypes;
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
        writer.writeObjectValue("capacity_information", this.getCapacityInformation());
        writer.writeObjectValue("supported_instance_types", this.getSupportedInstanceTypes());
    }
    /**
     * Sets the capacity_information property value. Returns the capacity related information
     * @param value Value to set for the capacityInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapacityInformation(@javax.annotation.Nullable final EnterpriseCluster_capacity_information value) {
        this.capacityInformation = value;
    }
    /**
     * Sets the supported_instance_types property value. The supported_instance_types property
     * @param value Value to set for the supportedInstanceTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedInstanceTypes(@javax.annotation.Nullable final SupportedKafkaInstanceTypesList value) {
        this.supportedInstanceTypes = value;
    }
}
