package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ClusterTransfer_status implements ValuedEnum {
    Pending("Pending"),
    Accepted("Accepted"),
    Declined("Declined"),
    Rescinded("Rescinded"),
    Completed("Completed");
    public final String value;
    ClusterTransfer_status(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ClusterTransfer_status forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Accepted": return Accepted;
            case "Declined": return Declined;
            case "Rescinded": return Rescinded;
            case "Completed": return Completed;
            default: return null;
        }
    }
}
