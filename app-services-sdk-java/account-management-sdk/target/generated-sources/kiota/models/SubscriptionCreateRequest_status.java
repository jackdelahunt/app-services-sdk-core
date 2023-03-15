package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionCreateRequest_status implements ValuedEnum {
    Disconnected("Disconnected");
    public final String value;
    SubscriptionCreateRequest_status(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionCreateRequest_status forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Disconnected": return Disconnected;
            default: return null;
        }
    }
}
