package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConsumerGroupState implements ValuedEnum {
    UNKNOWN("UNKNOWN"),
    PREPARING_REBALANCE("PREPARING_REBALANCE"),
    COMPLETING_REBALANCE("COMPLETING_REBALANCE"),
    STABLE("STABLE"),
    DEAD("DEAD"),
    EMPTY("EMPTY");
    public final String value;
    ConsumerGroupState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConsumerGroupState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "UNKNOWN": return UNKNOWN;
            case "PREPARING_REBALANCE": return PREPARING_REBALANCE;
            case "COMPLETING_REBALANCE": return COMPLETING_REBALANCE;
            case "STABLE": return STABLE;
            case "DEAD": return DEAD;
            case "EMPTY": return EMPTY;
            default: return null;
        }
    }
}
