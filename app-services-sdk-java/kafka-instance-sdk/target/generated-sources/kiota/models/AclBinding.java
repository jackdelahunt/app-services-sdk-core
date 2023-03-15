package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AclBinding extends ObjectReference implements Parsable {
    /** The operation property */
    private AclOperation operation;
    /** The patternType property */
    private AclPatternType patternType;
    /** The permission property */
    private AclPermissionType permission;
    /** Identifies the user or service account to which an ACL entry is bound. The literal prefix value of `User:` is required. May be used to specify all users with value `User:*`. */
    private String principal;
    /** The resourceName property */
    private String resourceName;
    /** The resourceType property */
    private AclResourceType resourceType;
    /**
     * Instantiates a new AclBinding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AclBinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AclBinding
     */
    @javax.annotation.Nonnull
    public static AclBinding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AclBinding();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getEnumValue(AclOperation.class)); });
        deserializerMap.put("patternType", (n) -> { this.setPatternType(n.getEnumValue(AclPatternType.class)); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(AclPermissionType.class)); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getStringValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getEnumValue(AclResourceType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the operation property value. The operation property
     * @return a AclOperation
     */
    @javax.annotation.Nullable
    public AclOperation getOperation() {
        return this.operation;
    }
    /**
     * Gets the patternType property value. The patternType property
     * @return a AclPatternType
     */
    @javax.annotation.Nullable
    public AclPatternType getPatternType() {
        return this.patternType;
    }
    /**
     * Gets the permission property value. The permission property
     * @return a AclPermissionType
     */
    @javax.annotation.Nullable
    public AclPermissionType getPermission() {
        return this.permission;
    }
    /**
     * Gets the principal property value. Identifies the user or service account to which an ACL entry is bound. The literal prefix value of `User:` is required. May be used to specify all users with value `User:*`.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the resourceName property value. The resourceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this.resourceName;
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a AclResourceType
     */
    @javax.annotation.Nullable
    public AclResourceType getResourceType() {
        return this.resourceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("operation", this.getOperation());
        writer.writeEnumValue("patternType", this.getPatternType());
        writer.writeEnumValue("permission", this.getPermission());
        writer.writeStringValue("principal", this.getPrincipal());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeEnumValue("resourceType", this.getResourceType());
    }
    /**
     * Sets the operation property value. The operation property
     * @param value Value to set for the operation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperation(@javax.annotation.Nullable final AclOperation value) {
        this.operation = value;
    }
    /**
     * Sets the patternType property value. The patternType property
     * @param value Value to set for the patternType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPatternType(@javax.annotation.Nullable final AclPatternType value) {
        this.patternType = value;
    }
    /**
     * Sets the permission property value. The permission property
     * @param value Value to set for the permission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermission(@javax.annotation.Nullable final AclPermissionType value) {
        this.permission = value;
    }
    /**
     * Sets the principal property value. Identifies the user or service account to which an ACL entry is bound. The literal prefix value of `User:` is required. May be used to specify all users with value `User:*`.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipal(@javax.annotation.Nullable final String value) {
        this.principal = value;
    }
    /**
     * Sets the resourceName property value. The resourceName property
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this.resourceName = value;
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final AclResourceType value) {
        this.resourceType = value;
    }
}
