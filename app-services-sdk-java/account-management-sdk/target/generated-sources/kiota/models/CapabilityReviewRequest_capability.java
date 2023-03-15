package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CapabilityReviewRequest_capability implements ValuedEnum {
    Manage_cluster_admin("manage_cluster_admin");
    public final String value;
    CapabilityReviewRequest_capability(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CapabilityReviewRequest_capability forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manage_cluster_admin": return Manage_cluster_admin;
            default: return null;
        }
    }
}
