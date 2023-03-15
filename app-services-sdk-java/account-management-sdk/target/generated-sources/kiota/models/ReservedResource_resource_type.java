package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ReservedResource_resource_type implements ValuedEnum {
    ComputeNodeAws("computeNodeAws"),
    PvStorageAws("pvStorageAws"),
    ClusterAws("clusterAws"),
    NetworkIoAws("networkIoAws"),
    NetworkLoadbalancerAws("networkLoadbalancerAws"),
    ComputeNodeGcp("computeNodeGcp"),
    PvStorageGcp("pvStorageGcp"),
    ClusterGcp("clusterGcp"),
    NetworkIoGcp("networkIoGcp"),
    NetworkGcpLoadbalancerGcp("networkGcpLoadbalancerGcp"),
    Addon("addon"),
    ComputeNode("computeNode"),
    PvStorage("pvStorage"),
    Cluster("cluster"),
    NetworkIo("networkIo"),
    NetworkLoadbalancer("networkLoadbalancer");
    public final String value;
    ReservedResource_resource_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ReservedResource_resource_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "computeNodeAws": return ComputeNodeAws;
            case "pvStorageAws": return PvStorageAws;
            case "clusterAws": return ClusterAws;
            case "networkIoAws": return NetworkIoAws;
            case "networkLoadbalancerAws": return NetworkLoadbalancerAws;
            case "computeNodeGcp": return ComputeNodeGcp;
            case "pvStorageGcp": return PvStorageGcp;
            case "clusterGcp": return ClusterGcp;
            case "networkIoGcp": return NetworkIoGcp;
            case "networkGcpLoadbalancerGcp": return NetworkGcpLoadbalancerGcp;
            case "addon": return Addon;
            case "computeNode": return ComputeNode;
            case "pvStorage": return PvStorage;
            case "cluster": return Cluster;
            case "networkIo": return NetworkIo;
            case "networkLoadbalancer": return NetworkLoadbalancer;
            default: return null;
        }
    }
}
