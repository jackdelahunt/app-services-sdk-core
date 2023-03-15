package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RuleType implements ValuedEnum {
    VALIDITY("VALIDITY"),
    COMPATIBILITY("COMPATIBILITY");
    public final String value;
    RuleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RuleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "VALIDITY": return VALIDITY;
            case "COMPATIBILITY": return COMPATIBILITY;
            default: return null;
        }
    }
}
