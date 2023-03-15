package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AclResourceType implements ValuedEnum {
    GROUP("GROUP"),
    TOPIC("TOPIC"),
    CLUSTER("CLUSTER"),
    TRANSACTIONAL_ID("TRANSACTIONAL_ID");
    public final String value;
    AclResourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AclResourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "GROUP": return GROUP;
            case "TOPIC": return TOPIC;
            case "CLUSTER": return CLUSTER;
            case "TRANSACTIONAL_ID": return TRANSACTIONAL_ID;
            default: return null;
        }
    }
}
