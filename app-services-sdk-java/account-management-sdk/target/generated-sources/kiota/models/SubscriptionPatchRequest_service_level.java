package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionPatchRequest_service_level implements ValuedEnum {
    L1L3("L1L3"),
    L3Only("L3Only");
    public final String value;
    SubscriptionPatchRequest_service_level(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionPatchRequest_service_level forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "L1L3": return L1L3;
            case "L3Only": return L3Only;
            default: return null;
        }
    }
}
