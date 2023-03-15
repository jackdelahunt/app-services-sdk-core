package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Describes the state of an artifact or artifact version.  The following statesare possible:* ENABLED* DISABLED* DEPRECATED */
public enum ArtifactState implements ValuedEnum {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    DEPRECATED("DEPRECATED");
    public final String value;
    ArtifactState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ArtifactState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ENABLED": return ENABLED;
            case "DISABLED": return DISABLED;
            case "DEPRECATED": return DEPRECATED;
            default: return null;
        }
    }
}
