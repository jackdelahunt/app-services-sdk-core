package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectorNamespaceTenantKind implements ValuedEnum {
    User("user"),
    Organisation("organisation");
    public final String value;
    ConnectorNamespaceTenantKind(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectorNamespaceTenantKind forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "organisation": return Organisation;
            default: return null;
        }
    }
}
