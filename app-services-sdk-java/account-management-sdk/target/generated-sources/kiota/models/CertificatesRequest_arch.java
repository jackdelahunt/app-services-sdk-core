package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CertificatesRequest_arch implements ValuedEnum {
    X86("x86"),
    X86_64("x86_64"),
    Ppc("ppc"),
    Ppc64("ppc64"),
    Ppc64le("ppc64le"),
    S390("s390"),
    S390x("s390x"),
    Ia64("ia64"),
    Aarch64("aarch64");
    public final String value;
    CertificatesRequest_arch(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CertificatesRequest_arch forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "x86": return X86;
            case "x86_64": return X86_64;
            case "ppc": return Ppc;
            case "ppc64": return Ppc64;
            case "ppc64le": return Ppc64le;
            case "s390": return S390;
            case "s390x": return S390x;
            case "ia64": return Ia64;
            case "aarch64": return Aarch64;
            default: return null;
        }
    }
}
