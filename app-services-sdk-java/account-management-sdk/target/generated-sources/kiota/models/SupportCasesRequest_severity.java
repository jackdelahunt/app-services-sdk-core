package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SupportCasesRequest_severity implements ValuedEnum {
    OneUrgent("OneUrgent"),
    TwoHigh("TwoHigh"),
    ThreeNormal("ThreeNormal"),
    FourLow("FourLow");
    public final String value;
    SupportCasesRequest_severity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SupportCasesRequest_severity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OneUrgent": return OneUrgent;
            case "TwoHigh": return TwoHigh;
            case "ThreeNormal": return ThreeNormal;
            case "FourLow": return FourLow;
            default: return null;
        }
    }
}
