package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ReservedResource_billing_model implements ValuedEnum {
    Standard("standard"),
    Marketplace("marketplace"),
    MarketplaceAws("marketplaceAws"),
    MarketplaceRhm("marketplaceRhm"),
    MarketplaceAzure("marketplaceAzure");
    public final String value;
    ReservedResource_billing_model(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ReservedResource_billing_model forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "marketplace": return Marketplace;
            case "marketplaceAws": return MarketplaceAws;
            case "marketplaceRhm": return MarketplaceRhm;
            case "marketplaceAzure": return MarketplaceAzure;
            default: return null;
        }
    }
}
