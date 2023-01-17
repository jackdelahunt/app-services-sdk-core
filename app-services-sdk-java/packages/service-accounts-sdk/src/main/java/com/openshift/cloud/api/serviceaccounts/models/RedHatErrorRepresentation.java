/*
 * sso.redhat.com API documentation
 * This is the API documentation for sso.redhat.com
 *
 * The version of the OpenAPI document: 5.0.19-SNAPSHOT
 * Contact: it-user-team-list@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.serviceaccounts.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RedHatErrorRepresentation
 */
@JsonPropertyOrder({
  RedHatErrorRepresentation.JSON_PROPERTY_ERROR,
  RedHatErrorRepresentation.JSON_PROPERTY_ERROR_DESCRIPTION
})
@JsonTypeName("RedHatErrorRepresentation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RedHatErrorRepresentation {
  /**
   * Gets or Sets error
   */
  public enum ErrorEnum {
    SERVICE_ACCOUNT_LIMIT_EXCEEDED("service_account_limit_exceeded"),
    
    SERVICE_ACCOUNT_NOT_FOUND("service_account_not_found"),
    
    SERVICE_ACCOUNT_USER_NOT_FOUND("service_account_user_not_found"),
    
    SERVICE_ACCOUNT_ACCESS_INVALID("service_account_access_invalid"),
    
    ACS_TENANT_LIMIT_EXCEEDED("acs_tenant_limit_exceeded"),
    
    ACS_TENANT_NOT_FOUND("acs_tenant_not_found"),
    
    ACS_ACCESS_INVALID("acs_access_invalid"),
    
    ACS_INVALID_REDIRECT_URI("acs_invalid_redirect_uri"),
    
    ACS_INVALID_CLIENT("acs_invalid_client"),
    
    ACS_DISABLED("acs_disabled"),
    
    SMOKETEST_ACCESS_INVALID("smoketest_access_invalid"),
    
    GENERAL_FAILURE("general_failure"),
    
    ORGANIZATION_API_ACCESS_INVALID("organization_api_access_invalid");

    private String value;

    ErrorEnum(String value) {
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
    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ERROR = "error";
  private ErrorEnum error;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "error_description";
  private String errorDescription;

  public RedHatErrorRepresentation() { 
  }

  public RedHatErrorRepresentation error(ErrorEnum error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorEnum getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(ErrorEnum error) {
    this.error = error;
  }


  public RedHatErrorRepresentation errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDescription() {
    return errorDescription;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedHatErrorRepresentation redHatErrorRepresentation = (RedHatErrorRepresentation) o;
    return Objects.equals(this.error, redHatErrorRepresentation.error) &&
        Objects.equals(this.errorDescription, redHatErrorRepresentation.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedHatErrorRepresentation {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

