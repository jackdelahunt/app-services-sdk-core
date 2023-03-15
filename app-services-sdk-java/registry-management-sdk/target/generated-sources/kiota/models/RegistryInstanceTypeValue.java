package com.openshift.cloud.api.srs.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Type of the Registry instance. This will determine functional and/or non-functional features provided by the instance."standard": Standard, full-featured Registry instance"eval": Evaluation (Trial) instance, provided for a limited time */
public enum RegistryInstanceTypeValue implements ValuedEnum {
    Standard("standard"),
    Eval("eval");
    public final String value;
    RegistryInstanceTypeValue(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistryInstanceTypeValue forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "eval": return Eval;
            default: return null;
        }
    }
}
