package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RoleBinding_managed_by implements ValuedEnum {
    Config("Config"),
    User("User");
    public final String value;
    RoleBinding_managed_by(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoleBinding_managed_by forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Config": return Config;
            case "User": return User;
            default: return null;
        }
    }
}
