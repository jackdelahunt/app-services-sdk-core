package com.openshift.cloud.api.serviceaccounts.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RedHatErrorRepresentation_error implements ValuedEnum {
    Service_account_limit_exceeded("service_account_limit_exceeded"),
    Service_account_not_found("service_account_not_found"),
    Service_account_user_not_found("service_account_user_not_found"),
    Service_account_access_invalid("service_account_access_invalid"),
    Acs_tenant_limit_exceeded("acs_tenant_limit_exceeded"),
    Acs_tenant_not_found("acs_tenant_not_found"),
    Acs_access_invalid("acs_access_invalid"),
    Acs_invalid_redirect_uri("acs_invalid_redirect_uri"),
    Acs_invalid_client("acs_invalid_client"),
    Acs_disabled("acs_disabled"),
    Smoketest_access_invalid("smoketest_access_invalid"),
    Smoketest_not_found("smoketest_not_found"),
    General_failure("general_failure"),
    Organization_api_access_invalid("organization_api_access_invalid");
    public final String value;
    RedHatErrorRepresentation_error(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RedHatErrorRepresentation_error forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "service_account_limit_exceeded": return Service_account_limit_exceeded;
            case "service_account_not_found": return Service_account_not_found;
            case "service_account_user_not_found": return Service_account_user_not_found;
            case "service_account_access_invalid": return Service_account_access_invalid;
            case "acs_tenant_limit_exceeded": return Acs_tenant_limit_exceeded;
            case "acs_tenant_not_found": return Acs_tenant_not_found;
            case "acs_access_invalid": return Acs_access_invalid;
            case "acs_invalid_redirect_uri": return Acs_invalid_redirect_uri;
            case "acs_invalid_client": return Acs_invalid_client;
            case "acs_disabled": return Acs_disabled;
            case "smoketest_access_invalid": return Smoketest_access_invalid;
            case "smoketest_not_found": return Smoketest_not_found;
            case "general_failure": return General_failure;
            case "organization_api_access_invalid": return Organization_api_access_invalid;
            default: return null;
        }
    }
}
