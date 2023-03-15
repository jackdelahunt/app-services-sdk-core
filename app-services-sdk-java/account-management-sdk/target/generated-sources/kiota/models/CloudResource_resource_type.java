package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudResource_resource_type implements ValuedEnum {
    Addon("addon"),
    ComputeNode("computeNode"),
    Cluster("cluster"),
    NetworkIo("networkIo"),
    NetworkLoadbalancer("networkLoadbalancer"),
    PvStorage("pvStorage");
    public final String value;
    CloudResource_resource_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudResource_resource_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "addon": return Addon;
            case "computeNode": return ComputeNode;
            case "cluster": return Cluster;
            case "networkIo": return NetworkIo;
            case "networkLoadbalancer": return NetworkLoadbalancer;
            case "pvStorage": return PvStorage;
            default: return null;
        }
    }
}
