package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionPatchRequest_system_units implements ValuedEnum {
    CoresVCPU("CoresVCPU"),
    Sockets("Sockets");
    public final String value;
    SubscriptionPatchRequest_system_units(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionPatchRequest_system_units forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CoresVCPU": return CoresVCPU;
            case "Sockets": return Sockets;
            default: return null;
        }
    }
}
