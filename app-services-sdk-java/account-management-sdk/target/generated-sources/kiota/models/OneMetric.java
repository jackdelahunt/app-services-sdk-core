package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OneMetric implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The arch property */
    private String arch;
    /** The channel_info property */
    private String channelInfo;
    /** The cloud_provider property */
    private String cloudProvider;
    /** The cluster_type property */
    private String clusterType;
    /** The compute_nodes_cpu property */
    private ClusterResource computeNodesCpu;
    /** The compute_nodes_memory property */
    private ClusterResource computeNodesMemory;
    /** The compute_nodes_sockets property */
    private ClusterResource computeNodesSockets;
    /** The console_url property */
    private String consoleUrl;
    /** The cpu property */
    private ClusterResource cpu;
    /** The critical_alerts_firing property */
    private Double criticalAlertsFiring;
    /** The health_state property */
    private OneMetric_health_state healthState;
    /** The memory property */
    private ClusterResource memory;
    /** The nodes property */
    private ClusterMetricsNodes nodes;
    /** The nodes_arch property */
    private java.util.List<ClusterMetricsNodes> nodesArch;
    /** The non_virt_nodes property */
    private Double nonVirtNodes;
    /** The openshift_version property */
    private String openshiftVersion;
    /** The operating_system property */
    private String operatingSystem;
    /** The operators_condition_failing property */
    private Double operatorsConditionFailing;
    /** The query_timestamp property */
    private OffsetDateTime queryTimestamp;
    /** The region property */
    private String region;
    /** The sockets property */
    private ClusterResource sockets;
    /** The state property */
    private String state;
    /** The state_description property */
    private String stateDescription;
    /** The storage property */
    private ClusterResource storage;
    /** The subscription_cpu_total property */
    private Double subscriptionCpuTotal;
    /** The subscription_obligation_exists property */
    private Double subscriptionObligationExists;
    /** The subscription_socket_total property */
    private Double subscriptionSocketTotal;
    /** The upgrade property */
    private ClusterUpgrade upgrade;
    /**
     * Instantiates a new OneMetric and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OneMetric() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OneMetric
     */
    @javax.annotation.Nonnull
    public static OneMetric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OneMetric();
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
     * Gets the arch property value. The arch property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getArch() {
        return this.arch;
    }
    /**
     * Gets the channel_info property value. The channel_info property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChannelInfo() {
        return this.channelInfo;
    }
    /**
     * Gets the cloud_provider property value. The cloud_provider property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Gets the cluster_type property value. The cluster_type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterType() {
        return this.clusterType;
    }
    /**
     * Gets the compute_nodes_cpu property value. The compute_nodes_cpu property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getComputeNodesCpu() {
        return this.computeNodesCpu;
    }
    /**
     * Gets the compute_nodes_memory property value. The compute_nodes_memory property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getComputeNodesMemory() {
        return this.computeNodesMemory;
    }
    /**
     * Gets the compute_nodes_sockets property value. The compute_nodes_sockets property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getComputeNodesSockets() {
        return this.computeNodesSockets;
    }
    /**
     * Gets the console_url property value. The console_url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConsoleUrl() {
        return this.consoleUrl;
    }
    /**
     * Gets the cpu property value. The cpu property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getCpu() {
        return this.cpu;
    }
    /**
     * Gets the critical_alerts_firing property value. The critical_alerts_firing property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCriticalAlertsFiring() {
        return this.criticalAlertsFiring;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(28);
        deserializerMap.put("arch", (n) -> { this.setArch(n.getStringValue()); });
        deserializerMap.put("channel_info", (n) -> { this.setChannelInfo(n.getStringValue()); });
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("cluster_type", (n) -> { this.setClusterType(n.getStringValue()); });
        deserializerMap.put("compute_nodes_cpu", (n) -> { this.setComputeNodesCpu(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("compute_nodes_memory", (n) -> { this.setComputeNodesMemory(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("compute_nodes_sockets", (n) -> { this.setComputeNodesSockets(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("console_url", (n) -> { this.setConsoleUrl(n.getStringValue()); });
        deserializerMap.put("cpu", (n) -> { this.setCpu(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("critical_alerts_firing", (n) -> { this.setCriticalAlertsFiring(n.getDoubleValue()); });
        deserializerMap.put("health_state", (n) -> { this.setHealthState(n.getEnumValue(OneMetric_health_state.class)); });
        deserializerMap.put("memory", (n) -> { this.setMemory(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("nodes", (n) -> { this.setNodes(n.getObjectValue(ClusterMetricsNodes::createFromDiscriminatorValue)); });
        deserializerMap.put("nodes_arch", (n) -> { this.setNodesArch(n.getCollectionOfObjectValues(ClusterMetricsNodes::createFromDiscriminatorValue)); });
        deserializerMap.put("non_virt_nodes", (n) -> { this.setNonVirtNodes(n.getDoubleValue()); });
        deserializerMap.put("openshift_version", (n) -> { this.setOpenshiftVersion(n.getStringValue()); });
        deserializerMap.put("operating_system", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("operators_condition_failing", (n) -> { this.setOperatorsConditionFailing(n.getDoubleValue()); });
        deserializerMap.put("query_timestamp", (n) -> { this.setQueryTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("sockets", (n) -> { this.setSockets(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("state_description", (n) -> { this.setStateDescription(n.getStringValue()); });
        deserializerMap.put("storage", (n) -> { this.setStorage(n.getObjectValue(ClusterResource::createFromDiscriminatorValue)); });
        deserializerMap.put("subscription_cpu_total", (n) -> { this.setSubscriptionCpuTotal(n.getDoubleValue()); });
        deserializerMap.put("subscription_obligation_exists", (n) -> { this.setSubscriptionObligationExists(n.getDoubleValue()); });
        deserializerMap.put("subscription_socket_total", (n) -> { this.setSubscriptionSocketTotal(n.getDoubleValue()); });
        deserializerMap.put("upgrade", (n) -> { this.setUpgrade(n.getObjectValue(ClusterUpgrade::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the health_state property value. The health_state property
     * @return a OneMetric_health_state
     */
    @javax.annotation.Nullable
    public OneMetric_health_state getHealthState() {
        return this.healthState;
    }
    /**
     * Gets the memory property value. The memory property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getMemory() {
        return this.memory;
    }
    /**
     * Gets the nodes property value. The nodes property
     * @return a ClusterMetricsNodes
     */
    @javax.annotation.Nullable
    public ClusterMetricsNodes getNodes() {
        return this.nodes;
    }
    /**
     * Gets the nodes_arch property value. The nodes_arch property
     * @return a ClusterMetricsNodes
     */
    @javax.annotation.Nullable
    public java.util.List<ClusterMetricsNodes> getNodesArch() {
        return this.nodesArch;
    }
    /**
     * Gets the non_virt_nodes property value. The non_virt_nodes property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getNonVirtNodes() {
        return this.nonVirtNodes;
    }
    /**
     * Gets the openshift_version property value. The openshift_version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOpenshiftVersion() {
        return this.openshiftVersion;
    }
    /**
     * Gets the operating_system property value. The operating_system property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Gets the operators_condition_failing property value. The operators_condition_failing property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getOperatorsConditionFailing() {
        return this.operatorsConditionFailing;
    }
    /**
     * Gets the query_timestamp property value. The query_timestamp property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQueryTimestamp() {
        return this.queryTimestamp;
    }
    /**
     * Gets the region property value. The region property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the sockets property value. The sockets property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getSockets() {
        return this.sockets;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the state_description property value. The state_description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStateDescription() {
        return this.stateDescription;
    }
    /**
     * Gets the storage property value. The storage property
     * @return a ClusterResource
     */
    @javax.annotation.Nullable
    public ClusterResource getStorage() {
        return this.storage;
    }
    /**
     * Gets the subscription_cpu_total property value. The subscription_cpu_total property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSubscriptionCpuTotal() {
        return this.subscriptionCpuTotal;
    }
    /**
     * Gets the subscription_obligation_exists property value. The subscription_obligation_exists property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSubscriptionObligationExists() {
        return this.subscriptionObligationExists;
    }
    /**
     * Gets the subscription_socket_total property value. The subscription_socket_total property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSubscriptionSocketTotal() {
        return this.subscriptionSocketTotal;
    }
    /**
     * Gets the upgrade property value. The upgrade property
     * @return a ClusterUpgrade
     */
    @javax.annotation.Nullable
    public ClusterUpgrade getUpgrade() {
        return this.upgrade;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("arch", this.getArch());
        writer.writeStringValue("channel_info", this.getChannelInfo());
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeStringValue("cluster_type", this.getClusterType());
        writer.writeObjectValue("compute_nodes_cpu", this.getComputeNodesCpu());
        writer.writeObjectValue("compute_nodes_memory", this.getComputeNodesMemory());
        writer.writeObjectValue("compute_nodes_sockets", this.getComputeNodesSockets());
        writer.writeStringValue("console_url", this.getConsoleUrl());
        writer.writeObjectValue("cpu", this.getCpu());
        writer.writeDoubleValue("critical_alerts_firing", this.getCriticalAlertsFiring());
        writer.writeEnumValue("health_state", this.getHealthState());
        writer.writeObjectValue("memory", this.getMemory());
        writer.writeObjectValue("nodes", this.getNodes());
        writer.writeCollectionOfObjectValues("nodes_arch", this.getNodesArch());
        writer.writeDoubleValue("non_virt_nodes", this.getNonVirtNodes());
        writer.writeStringValue("openshift_version", this.getOpenshiftVersion());
        writer.writeStringValue("operating_system", this.getOperatingSystem());
        writer.writeDoubleValue("operators_condition_failing", this.getOperatorsConditionFailing());
        writer.writeOffsetDateTimeValue("query_timestamp", this.getQueryTimestamp());
        writer.writeStringValue("region", this.getRegion());
        writer.writeObjectValue("sockets", this.getSockets());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("state_description", this.getStateDescription());
        writer.writeObjectValue("storage", this.getStorage());
        writer.writeDoubleValue("subscription_cpu_total", this.getSubscriptionCpuTotal());
        writer.writeDoubleValue("subscription_obligation_exists", this.getSubscriptionObligationExists());
        writer.writeDoubleValue("subscription_socket_total", this.getSubscriptionSocketTotal());
        writer.writeObjectValue("upgrade", this.getUpgrade());
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
     * Sets the arch property value. The arch property
     * @param value Value to set for the arch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArch(@javax.annotation.Nullable final String value) {
        this.arch = value;
    }
    /**
     * Sets the channel_info property value. The channel_info property
     * @param value Value to set for the channelInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannelInfo(@javax.annotation.Nullable final String value) {
        this.channelInfo = value;
    }
    /**
     * Sets the cloud_provider property value. The cloud_provider property
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the cluster_type property value. The cluster_type property
     * @param value Value to set for the clusterType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterType(@javax.annotation.Nullable final String value) {
        this.clusterType = value;
    }
    /**
     * Sets the compute_nodes_cpu property value. The compute_nodes_cpu property
     * @param value Value to set for the computeNodesCpu property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComputeNodesCpu(@javax.annotation.Nullable final ClusterResource value) {
        this.computeNodesCpu = value;
    }
    /**
     * Sets the compute_nodes_memory property value. The compute_nodes_memory property
     * @param value Value to set for the computeNodesMemory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComputeNodesMemory(@javax.annotation.Nullable final ClusterResource value) {
        this.computeNodesMemory = value;
    }
    /**
     * Sets the compute_nodes_sockets property value. The compute_nodes_sockets property
     * @param value Value to set for the computeNodesSockets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComputeNodesSockets(@javax.annotation.Nullable final ClusterResource value) {
        this.computeNodesSockets = value;
    }
    /**
     * Sets the console_url property value. The console_url property
     * @param value Value to set for the consoleUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsoleUrl(@javax.annotation.Nullable final String value) {
        this.consoleUrl = value;
    }
    /**
     * Sets the cpu property value. The cpu property
     * @param value Value to set for the cpu property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCpu(@javax.annotation.Nullable final ClusterResource value) {
        this.cpu = value;
    }
    /**
     * Sets the critical_alerts_firing property value. The critical_alerts_firing property
     * @param value Value to set for the criticalAlertsFiring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriticalAlertsFiring(@javax.annotation.Nullable final Double value) {
        this.criticalAlertsFiring = value;
    }
    /**
     * Sets the health_state property value. The health_state property
     * @param value Value to set for the healthState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthState(@javax.annotation.Nullable final OneMetric_health_state value) {
        this.healthState = value;
    }
    /**
     * Sets the memory property value. The memory property
     * @param value Value to set for the memory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemory(@javax.annotation.Nullable final ClusterResource value) {
        this.memory = value;
    }
    /**
     * Sets the nodes property value. The nodes property
     * @param value Value to set for the nodes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodes(@javax.annotation.Nullable final ClusterMetricsNodes value) {
        this.nodes = value;
    }
    /**
     * Sets the nodes_arch property value. The nodes_arch property
     * @param value Value to set for the nodesArch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodesArch(@javax.annotation.Nullable final java.util.List<ClusterMetricsNodes> value) {
        this.nodesArch = value;
    }
    /**
     * Sets the non_virt_nodes property value. The non_virt_nodes property
     * @param value Value to set for the nonVirtNodes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNonVirtNodes(@javax.annotation.Nullable final Double value) {
        this.nonVirtNodes = value;
    }
    /**
     * Sets the openshift_version property value. The openshift_version property
     * @param value Value to set for the openshiftVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenshiftVersion(@javax.annotation.Nullable final String value) {
        this.openshiftVersion = value;
    }
    /**
     * Sets the operating_system property value. The operating_system property
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this.operatingSystem = value;
    }
    /**
     * Sets the operators_condition_failing property value. The operators_condition_failing property
     * @param value Value to set for the operatorsConditionFailing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatorsConditionFailing(@javax.annotation.Nullable final Double value) {
        this.operatorsConditionFailing = value;
    }
    /**
     * Sets the query_timestamp property value. The query_timestamp property
     * @param value Value to set for the queryTimestamp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryTimestamp(@javax.annotation.Nullable final OffsetDateTime value) {
        this.queryTimestamp = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the sockets property value. The sockets property
     * @param value Value to set for the sockets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSockets(@javax.annotation.Nullable final ClusterResource value) {
        this.sockets = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the state_description property value. The state_description property
     * @param value Value to set for the stateDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStateDescription(@javax.annotation.Nullable final String value) {
        this.stateDescription = value;
    }
    /**
     * Sets the storage property value. The storage property
     * @param value Value to set for the storage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorage(@javax.annotation.Nullable final ClusterResource value) {
        this.storage = value;
    }
    /**
     * Sets the subscription_cpu_total property value. The subscription_cpu_total property
     * @param value Value to set for the subscriptionCpuTotal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionCpuTotal(@javax.annotation.Nullable final Double value) {
        this.subscriptionCpuTotal = value;
    }
    /**
     * Sets the subscription_obligation_exists property value. The subscription_obligation_exists property
     * @param value Value to set for the subscriptionObligationExists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionObligationExists(@javax.annotation.Nullable final Double value) {
        this.subscriptionObligationExists = value;
    }
    /**
     * Sets the subscription_socket_total property value. The subscription_socket_total property
     * @param value Value to set for the subscriptionSocketTotal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionSocketTotal(@javax.annotation.Nullable final Double value) {
        this.subscriptionSocketTotal = value;
    }
    /**
     * Sets the upgrade property value. The upgrade property
     * @param value Value to set for the upgrade property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgrade(@javax.annotation.Nullable final ClusterUpgrade value) {
        this.upgrade = value;
    }
}
