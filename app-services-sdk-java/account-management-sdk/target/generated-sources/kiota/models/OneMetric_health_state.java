package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OneMetric_health_state implements ValuedEnum {
    Healthy("healthy"),
    Unhealthy("unhealthy"),
    Unknown("unknown");
    public final String value;
    OneMetric_health_state(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OneMetric_health_state forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "healthy": return Healthy;
            case "unhealthy": return Unhealthy;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
