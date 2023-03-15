package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CapabilityReviewRequest_type implements ValuedEnum {
    Cluster("Cluster");
    public final String value;
    CapabilityReviewRequest_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CapabilityReviewRequest_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Cluster": return Cluster;
            default: return null;
        }
    }
}
