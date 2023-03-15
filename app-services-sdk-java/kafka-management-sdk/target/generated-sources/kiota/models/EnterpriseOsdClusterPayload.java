package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Schema for the request body sent to /clusters POST
 */
public class EnterpriseOsdClusterPayload implements AdditionalDataHolder, Parsable {
    /** Sets whether Kafkas created on this data plane cluster have to be accessed via private network */
    private Boolean accessKafkasViaPrivateNetwork;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The data plane cluster ID. This is the ID of the cluster obtained from OpenShift Cluster Manager (OCM) API */
    private String clusterId;
    /** dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/<cluster_id>/ingresses (dns_name) */
    private String clusterIngressDnsName;
    /** The node count given to the created kafka machine pool. The machine pool must be created via /api/clusters_mgmt/v1/clusters/<cluster_id>/machine_pools prior to passing this value.The created machine pool must have a `bf2.org/kafkaInstanceProfileType=standard` label and a `bf2.org/kafkaInstanceProfileType=standard:NoExecute` taint.The name of the machine pool must be `kafka-standard` The node count value has to be a multiple of 3 with a minimum of 3 nodes. */
    private Integer kafkaMachinePoolNodeCount;
    /**
     * Instantiates a new EnterpriseOsdClusterPayload and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnterpriseOsdClusterPayload() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnterpriseOsdClusterPayload
     */
    @javax.annotation.Nonnull
    public static EnterpriseOsdClusterPayload createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseOsdClusterPayload();
    }
    /**
     * Gets the access_kafkas_via_private_network property value. Sets whether Kafkas created on this data plane cluster have to be accessed via private network
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccessKafkasViaPrivateNetwork() {
        return this.accessKafkasViaPrivateNetwork;
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
     * Gets the cluster_id property value. The data plane cluster ID. This is the ID of the cluster obtained from OpenShift Cluster Manager (OCM) API
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * Gets the cluster_ingress_dns_name property value. dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/<cluster_id>/ingresses (dns_name)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterIngressDnsName() {
        return this.clusterIngressDnsName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("access_kafkas_via_private_network", (n) -> { this.setAccessKafkasViaPrivateNetwork(n.getBooleanValue()); });
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("cluster_ingress_dns_name", (n) -> { this.setClusterIngressDnsName(n.getStringValue()); });
        deserializerMap.put("kafka_machine_pool_node_count", (n) -> { this.setKafkaMachinePoolNodeCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kafka_machine_pool_node_count property value. The node count given to the created kafka machine pool. The machine pool must be created via /api/clusters_mgmt/v1/clusters/<cluster_id>/machine_pools prior to passing this value.The created machine pool must have a `bf2.org/kafkaInstanceProfileType=standard` label and a `bf2.org/kafkaInstanceProfileType=standard:NoExecute` taint.The name of the machine pool must be `kafka-standard` The node count value has to be a multiple of 3 with a minimum of 3 nodes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKafkaMachinePoolNodeCount() {
        return this.kafkaMachinePoolNodeCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("access_kafkas_via_private_network", this.getAccessKafkasViaPrivateNetwork());
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("cluster_ingress_dns_name", this.getClusterIngressDnsName());
        writer.writeIntegerValue("kafka_machine_pool_node_count", this.getKafkaMachinePoolNodeCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access_kafkas_via_private_network property value. Sets whether Kafkas created on this data plane cluster have to be accessed via private network
     * @param value Value to set for the accessKafkasViaPrivateNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessKafkasViaPrivateNetwork(@javax.annotation.Nullable final Boolean value) {
        this.accessKafkasViaPrivateNetwork = value;
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
     * Sets the cluster_id property value. The data plane cluster ID. This is the ID of the cluster obtained from OpenShift Cluster Manager (OCM) API
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the cluster_ingress_dns_name property value. dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/<cluster_id>/ingresses (dns_name)
     * @param value Value to set for the clusterIngressDnsName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterIngressDnsName(@javax.annotation.Nullable final String value) {
        this.clusterIngressDnsName = value;
    }
    /**
     * Sets the kafka_machine_pool_node_count property value. The node count given to the created kafka machine pool. The machine pool must be created via /api/clusters_mgmt/v1/clusters/<cluster_id>/machine_pools prior to passing this value.The created machine pool must have a `bf2.org/kafkaInstanceProfileType=standard` label and a `bf2.org/kafkaInstanceProfileType=standard:NoExecute` taint.The name of the machine pool must be `kafka-standard` The node count value has to be a multiple of 3 with a minimum of 3 nodes.
     * @param value Value to set for the kafkaMachinePoolNodeCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKafkaMachinePoolNodeCount(@javax.annotation.Nullable final Integer value) {
        this.kafkaMachinePoolNodeCount = value;
    }
}
