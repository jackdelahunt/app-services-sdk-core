package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RoleBinding_type implements ValuedEnum {
    Application("Application"),
    Subscription("Subscription"),
    Organization("Organization");
    public final String value;
    RoleBinding_type(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoleBinding_type forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Application": return Application;
            case "Subscription": return Subscription;
            case "Organization": return Organization;
            default: return null;
        }
    }
}
