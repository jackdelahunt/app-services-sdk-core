package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RoleType implements ValuedEnum {
    READ_ONLY("READ_ONLY"),
    DEVELOPER("DEVELOPER"),
    ADMIN("ADMIN");
    public final String value;
    RoleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "READ_ONLY": return READ_ONLY;
            case "DEVELOPER": return DEVELOPER;
            case "ADMIN": return ADMIN;
            default: return null;
        }
    }
}
