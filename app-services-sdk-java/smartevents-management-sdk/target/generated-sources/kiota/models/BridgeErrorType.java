package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BridgeErrorType implements ValuedEnum {
    USER("USER"),
    PLATFORM("PLATFORM");
    public final String value;
    BridgeErrorType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BridgeErrorType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "USER": return USER;
            case "PLATFORM": return PLATFORM;
            default: return null;
        }
    }
}
