package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ResourceQuota_type implements ValuedEnum {
    Config("Config"),
    Manual("Manual"),
    Subscription("Subscription");
    public final String value;
    ResourceQuota_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ResourceQuota_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Config": return Config;
            case "Manual": return Manual;
            case "Subscription": return Subscription;
            default: return null;
        }
    }
}
