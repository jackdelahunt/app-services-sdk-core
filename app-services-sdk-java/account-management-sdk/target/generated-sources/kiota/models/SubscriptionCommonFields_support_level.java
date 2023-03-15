package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionCommonFields_support_level implements ValuedEnum {
    Eval("Eval"),
    Standard("Standard"),
    Premium("Premium"),
    SelfSupport("SelfSupport"),
    None("None");
    public final String value;
    SubscriptionCommonFields_support_level(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionCommonFields_support_level forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Eval": return Eval;
            case "Standard": return Standard;
            case "Premium": return Premium;
            case "SelfSupport": return SelfSupport;
            case "None": return None;
            default: return null;
        }
    }
}
