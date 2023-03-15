package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AclPatternType implements ValuedEnum {
    LITERAL("LITERAL"),
    PREFIXED("PREFIXED");
    public final String value;
    AclPatternType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AclPatternType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "LITERAL": return LITERAL;
            case "PREFIXED": return PREFIXED;
            default: return null;
        }
    }
}
