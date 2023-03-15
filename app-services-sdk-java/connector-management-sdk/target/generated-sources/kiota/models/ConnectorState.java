package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectorState implements ValuedEnum {
    Assigning("assigning"),
    Assigned("assigned"),
    Updating("updating"),
    Ready("ready"),
    Stopped("stopped"),
    Failed("failed"),
    Deleting("deleting"),
    Deleted("deleted"),
    Provisioning("provisioning"),
    Deprovisioning("deprovisioning");
    public final String value;
    ConnectorState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectorState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assigning": return Assigning;
            case "assigned": return Assigned;
            case "updating": return Updating;
            case "ready": return Ready;
            case "stopped": return Stopped;
            case "failed": return Failed;
            case "deleting": return Deleting;
            case "deleted": return Deleted;
            case "provisioning": return Provisioning;
            case "deprovisioning": return Deprovisioning;
            default: return null;
        }
    }
}
