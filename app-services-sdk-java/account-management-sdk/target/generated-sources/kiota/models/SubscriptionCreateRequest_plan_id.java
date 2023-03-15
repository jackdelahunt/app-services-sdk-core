package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionCreateRequest_plan_id implements ValuedEnum {
    OCP("OCP");
    public final String value;
    SubscriptionCreateRequest_plan_id(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionCreateRequest_plan_id forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OCP": return OCP;
            default: return null;
        }
    }
}
