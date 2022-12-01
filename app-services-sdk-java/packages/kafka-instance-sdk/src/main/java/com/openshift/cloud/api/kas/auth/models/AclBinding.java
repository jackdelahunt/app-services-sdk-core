/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.13.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.auth.models.AclBindingAllOf;
import com.openshift.cloud.api.kas.auth.models.AclOperation;
import com.openshift.cloud.api.kas.auth.models.AclPatternType;
import com.openshift.cloud.api.kas.auth.models.AclPermissionType;
import com.openshift.cloud.api.kas.auth.models.AclResourceType;
import com.openshift.cloud.api.kas.auth.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AclBinding
 */
@JsonPropertyOrder({
  AclBinding.JSON_PROPERTY_ID,
  AclBinding.JSON_PROPERTY_KIND,
  AclBinding.JSON_PROPERTY_HREF,
  AclBinding.JSON_PROPERTY_RESOURCE_TYPE,
  AclBinding.JSON_PROPERTY_RESOURCE_NAME,
  AclBinding.JSON_PROPERTY_PATTERN_TYPE,
  AclBinding.JSON_PROPERTY_PRINCIPAL,
  AclBinding.JSON_PROPERTY_OPERATION,
  AclBinding.JSON_PROPERTY_PERMISSION
})
@JsonTypeName("AclBinding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AclBinding {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private AclResourceType resourceType;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resourceName";
  private String resourceName;

  public static final String JSON_PROPERTY_PATTERN_TYPE = "patternType";
  private AclPatternType patternType;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private AclOperation operation;

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private AclPermissionType permission;

  public AclBinding() { 
  }

  @JsonCreator
  public AclBinding(
    @JsonProperty(JSON_PROPERTY_KIND) String kind
  ) {
    this();
    this.kind = kind;
  }

  public AclBinding id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the object. Not supported for all object kinds.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the object. Not supported for all object kinds.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }




  public AclBinding href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Link path to request the object. Not supported for all object kinds.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link path to request the object. Not supported for all object kinds.")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public AclBinding resourceType(AclResourceType resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclResourceType getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceType(AclResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public AclBinding resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceName() {
    return resourceName;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public AclBinding patternType(AclPatternType patternType) {
    
    this.patternType = patternType;
    return this;
  }

   /**
   * Get patternType
   * @return patternType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclPatternType getPatternType() {
    return patternType;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPatternType(AclPatternType patternType) {
    this.patternType = patternType;
  }


  public AclBinding principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Identifies the user or service account to which an ACL entry is bound. The literal prefix value of &#x60;User:&#x60; is required. May be used to specify all users with value &#x60;User:*&#x60;.
   * @return principal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "User:user-123-abc", required = true, value = "Identifies the user or service account to which an ACL entry is bound. The literal prefix value of `User:` is required. May be used to specify all users with value `User:*`.")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public AclBinding operation(AclOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclOperation getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(AclOperation operation) {
    this.operation = operation;
  }


  public AclBinding permission(AclPermissionType permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclPermissionType getPermission() {
    return permission;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermission(AclPermissionType permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AclBinding aclBinding = (AclBinding) o;
    return Objects.equals(this.id, aclBinding.id) &&
        Objects.equals(this.kind, aclBinding.kind) &&
        Objects.equals(this.href, aclBinding.href) &&
        Objects.equals(this.resourceType, aclBinding.resourceType) &&
        Objects.equals(this.resourceName, aclBinding.resourceName) &&
        Objects.equals(this.patternType, aclBinding.patternType) &&
        Objects.equals(this.principal, aclBinding.principal) &&
        Objects.equals(this.operation, aclBinding.operation) &&
        Objects.equals(this.permission, aclBinding.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, resourceType, resourceName, patternType, principal, operation, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AclBinding {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

