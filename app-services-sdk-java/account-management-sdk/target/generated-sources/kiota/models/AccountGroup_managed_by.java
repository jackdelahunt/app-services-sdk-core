package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccountGroup_managed_by implements ValuedEnum {
    SSO("SSO"),
    OCM("OCM");
    public final String value;
    AccountGroup_managed_by(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountGroup_managed_by forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SSO": return SSO;
            case "OCM": return OCM;
            default: return null;
        }
    }
}
