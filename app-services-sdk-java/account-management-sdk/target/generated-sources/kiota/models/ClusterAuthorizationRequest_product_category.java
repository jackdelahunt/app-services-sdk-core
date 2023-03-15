package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ClusterAuthorizationRequest_product_category implements ValuedEnum {
    AssistedInstall("assistedInstall"),
    HostedControlPlane("HostedControlPlane");
    public final String value;
    ClusterAuthorizationRequest_product_category(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ClusterAuthorizationRequest_product_category forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assistedInstall": return AssistedInstall;
            case "HostedControlPlane": return HostedControlPlane;
            default: return null;
        }
    }
}
