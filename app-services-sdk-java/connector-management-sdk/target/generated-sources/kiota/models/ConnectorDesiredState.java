package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectorDesiredState implements ValuedEnum {
    Unassigned("unassigned"),
    Ready("ready"),
    Stopped("stopped"),
    Deleted("deleted");
    public final String value;
    ConnectorDesiredState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectorDesiredState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "ready": return Ready;
            case "stopped": return Stopped;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
