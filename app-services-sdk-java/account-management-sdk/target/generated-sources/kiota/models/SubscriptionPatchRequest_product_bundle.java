package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionPatchRequest_product_bundle implements ValuedEnum {
    Openshift("Openshift"),
    JBossMiddleware("JBossMiddleware"),
    IBMCloudPak("IBMCloudPak");
    public final String value;
    SubscriptionPatchRequest_product_bundle(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionPatchRequest_product_bundle forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Openshift": return Openshift;
            case "JBossMiddleware": return JBossMiddleware;
            case "IBMCloudPak": return IBMCloudPak;
            default: return null;
        }
    }
}
