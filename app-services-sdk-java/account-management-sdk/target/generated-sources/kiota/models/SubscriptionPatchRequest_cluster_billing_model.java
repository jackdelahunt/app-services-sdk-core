package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubscriptionPatchRequest_cluster_billing_model implements ValuedEnum {
    Standard("standard"),
    Marketplace("marketplace"),
    MarketplaceAws("marketplaceAws"),
    MarketplaceAzure("marketplaceAzure"),
    MarketplaceRhm("marketplaceRhm");
    public final String value;
    SubscriptionPatchRequest_cluster_billing_model(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubscriptionPatchRequest_cluster_billing_model forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "marketplace": return Marketplace;
            case "marketplaceAws": return MarketplaceAws;
            case "marketplaceAzure": return MarketplaceAzure;
            case "marketplaceRhm": return MarketplaceRhm;
            default: return null;
        }
    }
}
