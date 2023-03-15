package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SelfAccessReview_action implements ValuedEnum {
    Get("get"),
    List("list"),
    Create("create"),
    Delete("delete"),
    Update("update");
    public final String value;
    SelfAccessReview_action(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SelfAccessReview_action forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "get": return Get;
            case "list": return List;
            case "create": return Create;
            case "delete": return Delete;
            case "update": return Update;
            default: return null;
        }
    }
}
