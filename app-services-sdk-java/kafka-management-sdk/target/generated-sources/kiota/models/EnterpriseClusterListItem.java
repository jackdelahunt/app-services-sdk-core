package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnterpriseClusterListItem extends VersionMetadata_collections implements Parsable {
    /** Indicates whether Kafkas created on this data plane cluster have to be accessed via private network */
    private Boolean accessKafkasViaPrivateNetwork;
    /** The cloud provider for this cluster. This valus will be used as the Kafka's cloud provider value when a Kafka is created on this cluster */
    private String cloudProvider;
    /** The OCM's cluster id of the registered Enterprise cluster. */
    private String clusterId;
    /** A flag indicating whether this cluster is available on multiple availability zones or not */
    private Boolean multiAz;
    /** The region of this cluster. This valus will be used as the Kafka's region value when a Kafka is created on this cluster */
    private String region;
    /** The status of Enterprise cluster registration */
    private String status;
    /**
     * Instantiates a new EnterpriseClusterListItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnterpriseClusterListItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnterpriseClusterListItem
     */
    @javax.annotation.Nonnull
    public static EnterpriseClusterListItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseClusterListItem();
    }
    /**
     * Gets the access_kafkas_via_private_network property value. Indicates whether Kafkas created on this data plane cluster have to be accessed via private network
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccessKafkasViaPrivateNetwork() {
        return this.accessKafkasViaPrivateNetwork;
    }
    /**
     * Gets the cloud_provider property value. The cloud provider for this cluster. This valus will be used as the Kafka's cloud provider value when a Kafka is created on this cluster
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Gets the cluster_id property value. The OCM's cluster id of the registered Enterprise cluster.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("access_kafkas_via_private_network", (n) -> { this.setAccessKafkasViaPrivateNetwork(n.getBooleanValue()); });
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("multi_az", (n) -> { this.setMultiAz(n.getBooleanValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the multi_az property value. A flag indicating whether this cluster is available on multiple availability zones or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMultiAz() {
        return this.multiAz;
    }
    /**
     * Gets the region property value. The region of this cluster. This valus will be used as the Kafka's region value when a Kafka is created on this cluster
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the status property value. The status of Enterprise cluster registration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
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
        writer.writeBooleanValue("access_kafkas_via_private_network", this.getAccessKafkasViaPrivateNetwork());
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeBooleanValue("multi_az", this.getMultiAz());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the access_kafkas_via_private_network property value. Indicates whether Kafkas created on this data plane cluster have to be accessed via private network
     * @param value Value to set for the accessKafkasViaPrivateNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessKafkasViaPrivateNetwork(@javax.annotation.Nullable final Boolean value) {
        this.accessKafkasViaPrivateNetwork = value;
    }
    /**
     * Sets the cloud_provider property value. The cloud provider for this cluster. This valus will be used as the Kafka's cloud provider value when a Kafka is created on this cluster
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the cluster_id property value. The OCM's cluster id of the registered Enterprise cluster.
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the multi_az property value. A flag indicating whether this cluster is available on multiple availability zones or not
     * @param value Value to set for the multiAz property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiAz(@javax.annotation.Nullable final Boolean value) {
        this.multiAz = value;
    }
    /**
     * Sets the region property value. The region of this cluster. This valus will be used as the Kafka's region value when a Kafka is created on this cluster
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the status property value. The status of Enterprise cluster registration
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}
