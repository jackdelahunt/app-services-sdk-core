package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SelfResourceReviewRequest_action implements ValuedEnum {
    Get("get"),
    Delete("delete"),
    Update("update");
    public final String value;
    SelfResourceReviewRequest_action(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SelfResourceReviewRequest_action forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "get": return Get;
            case "delete": return Delete;
            case "update": return Update;
            default: return null;
        }
    }
}
