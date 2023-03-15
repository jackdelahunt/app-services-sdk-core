package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ResourceReview_resource_type implements ValuedEnum {
    Cluster("Cluster"),
    Subscription("Subscription");
    public final String value;
    ResourceReview_resource_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ResourceReview_resource_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Cluster": return Cluster;
            case "Subscription": return Subscription;
            default: return null;
        }
    }
}
