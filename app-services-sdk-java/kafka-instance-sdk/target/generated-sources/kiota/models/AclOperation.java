package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AclOperation implements ValuedEnum {
    ALL("ALL"),
    READ("READ"),
    WRITE("WRITE"),
    CREATE("CREATE"),
    DELETE("DELETE"),
    ALTER("ALTER"),
    DESCRIBE("DESCRIBE"),
    DESCRIBE_CONFIGS("DESCRIBE_CONFIGS"),
    ALTER_CONFIGS("ALTER_CONFIGS");
    public final String value;
    AclOperation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AclOperation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ALL": return ALL;
            case "READ": return READ;
            case "WRITE": return WRITE;
            case "CREATE": return CREATE;
            case "DELETE": return DELETE;
            case "ALTER": return ALTER;
            case "DESCRIBE": return DESCRIBE;
            case "DESCRIBE_CONFIGS": return DESCRIBE_CONFIGS;
            case "ALTER_CONFIGS": return ALTER_CONFIGS;
            default: return null;
        }
    }
}
