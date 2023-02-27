/*
 * Service Registry Management API
 * Service Registry Management API is a REST API for managing Service Registry instances. Service Registry is a datastore for event schemas and API designs, which is based on the open source Apicurio Registry project.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: rhosak-eval-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.srs.models;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * \&quot;accepted\&quot;: Registry status when accepted for processing.  \&quot;provisioning\&quot;: Registry status when provisioning a new instance.  \&quot;ready\&quot;: Registry status when ready for use.  \&quot;failed\&quot;: Registry status when the provisioning failed. When removing a Registry instance in this state, the status transitions directly to \&quot;deleting\&quot;.   \&quot;deprovision\&quot;: Registry status when accepted for deprovisioning.  \&quot;deleting\&quot;: Registry status when deprovisioning. 
 */
public enum RegistryStatusValue {
  
  ACCEPTED("accepted"),
  
  PROVISIONING("provisioning"),
  
  READY("ready"),
  
  FAILED("failed"),
  
  DEPROVISION("deprovision"),
  
  DELETING("deleting");

  private String value;

  RegistryStatusValue(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RegistryStatusValue fromValue(String value) {
    for (RegistryStatusValue b : RegistryStatusValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

