package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ClusterAuthorizationRequest_product_id implements ValuedEnum {
    OCP("OCP"),
    OSD("OSD"),
    OSDTrial("OSDTrial"),
    MOA("MOA"),
    RHMI("RHMI"),
    RHOSAK("RHOSAK"),
    RHOSAKTrial("RHOSAKTrial"),
    RHOSR("RHOSR"),
    RHOSRTrial("RHOSRTrial"),
    RHOSE("RHOSE"),
    RHOSETrial("RHOSETrial"),
    RHACS("RHACS"),
    RHACSTrial("RHACSTrial"),
    ARO("ARO");
    public final String value;
    ClusterAuthorizationRequest_product_id(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ClusterAuthorizationRequest_product_id forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OCP": return OCP;
            case "OSD": return OSD;
            case "OSDTrial": return OSDTrial;
            case "MOA": return MOA;
            case "RHMI": return RHMI;
            case "RHOSAK": return RHOSAK;
            case "RHOSAKTrial": return RHOSAKTrial;
            case "RHOSR": return RHOSR;
            case "RHOSRTrial": return RHOSRTrial;
            case "RHOSE": return RHOSE;
            case "RHOSETrial": return RHOSETrial;
            case "RHACS": return RHACS;
            case "RHACSTrial": return RHACSTrial;
            case "ARO": return ARO;
            default: return null;
        }
    }
}
