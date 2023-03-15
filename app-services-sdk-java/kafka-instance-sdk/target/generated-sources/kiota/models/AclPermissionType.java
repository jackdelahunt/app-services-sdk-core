package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AclPermissionType implements ValuedEnum {
    ALLOW("ALLOW"),
    DENY("DENY");
    public final String value;
    AclPermissionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AclPermissionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ALLOW": return ALLOW;
            case "DENY": return DENY;
            default: return null;
        }
    }
}
