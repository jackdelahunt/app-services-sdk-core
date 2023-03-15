package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OffsetType implements ValuedEnum {
    Timestamp("timestamp"),
    Absolute("absolute"),
    Latest("latest"),
    Earliest("earliest");
    public final String value;
    OffsetType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OffsetType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "timestamp": return Timestamp;
            case "absolute": return Absolute;
            case "latest": return Latest;
            case "earliest": return Earliest;
            default: return null;
        }
    }
}
