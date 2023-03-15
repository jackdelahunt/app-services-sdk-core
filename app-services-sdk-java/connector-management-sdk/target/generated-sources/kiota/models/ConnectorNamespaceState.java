package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectorNamespaceState implements ValuedEnum {
    Disconnected("disconnected"),
    Ready("ready"),
    Deleting("deleting"),
    Deleted("deleted");
    public final String value;
    ConnectorNamespaceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectorNamespaceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disconnected": return Disconnected;
            case "ready": return Ready;
            case "deleting": return Deleting;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
