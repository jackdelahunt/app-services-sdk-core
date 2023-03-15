package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionPatchRequest_usage implements ValuedEnum {
    Production("Production"),
    DevelopmentTest("DevelopmentTest"),
    DisasterRecovery("DisasterRecovery"),
    Academic("Academic");
    public final String value;
    SubscriptionPatchRequest_usage(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionPatchRequest_usage forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Production": return Production;
            case "DevelopmentTest": return DevelopmentTest;
            case "DisasterRecovery": return DisasterRecovery;
            case "Academic": return Academic;
            default: return null;
        }
    }
}
