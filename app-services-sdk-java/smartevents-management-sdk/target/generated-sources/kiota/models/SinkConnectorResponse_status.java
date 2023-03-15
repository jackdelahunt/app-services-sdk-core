package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SinkConnectorResponse_status implements ValuedEnum {
    Accepted("accepted"),
    Preparing("preparing"),
    Provisioning("provisioning"),
    Ready("ready"),
    Update_accepted("update_accepted"),
    Update_preparing("update_preparing"),
    Update_provisioning("update_provisioning"),
    Deprovision("deprovision"),
    Deleting("deleting"),
    Deleted("deleted"),
    Failed("failed");
    public final String value;
    SinkConnectorResponse_status(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SinkConnectorResponse_status forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accepted": return Accepted;
            case "preparing": return Preparing;
            case "provisioning": return Provisioning;
            case "ready": return Ready;
            case "update_accepted": return Update_accepted;
            case "update_preparing": return Update_preparing;
            case "update_provisioning": return Update_provisioning;
            case "deprovision": return Deprovision;
            case "deleting": return Deleting;
            case "deleted": return Deleted;
            case "failed": return Failed;
            default: return null;
        }
    }
}
