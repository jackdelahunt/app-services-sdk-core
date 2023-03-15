package com.openshift.cloud.api.srs.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** "accepted": Registry status when accepted for processing."provisioning": Registry status when provisioning a new instance."ready": Registry status when ready for use."failed": Registry status when the provisioning failed. When removing a Registry instance in this state,the status transitions directly to "deleting"."deprovision": Registry status when accepted for deprovisioning."deleting": Registry status when deprovisioning. */
public enum RegistryStatusValue implements ValuedEnum {
    Accepted("accepted"),
    Provisioning("provisioning"),
    Ready("ready"),
    Failed("failed"),
    Deprovision("deprovision"),
    Deleting("deleting");
    public final String value;
    RegistryStatusValue(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistryStatusValue forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accepted": return Accepted;
            case "provisioning": return Provisioning;
            case "ready": return Ready;
            case "failed": return Failed;
            case "deprovision": return Deprovision;
            case "deleting": return Deleting;
            default: return null;
        }
    }
}
