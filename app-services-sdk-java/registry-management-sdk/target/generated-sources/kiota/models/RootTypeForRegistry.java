package com.openshift.cloud.api.srs.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service Registry instance in a multi-tenant deployment.
 */
public class RootTypeForRegistry extends ObjectReference implements Parsable {
    /** The browserUrl property */
    private String browserUrl;
    /** ISO 8601 UTC timestamp. */
    private OffsetDateTime createdAt;
    /** Description of the Registry instance. */
    private String description;
    /** Type of the Registry instance. This will determine functional and/or non-functional features provided by the instance."standard": Standard, full-featured Registry instance"eval": Evaluation (Trial) instance, provided for a limited time */
    private RegistryInstanceTypeValue instanceType;
    /** User-defined Registry instance name. Does not have to be unique. */
    private String name;
    /** Registry instance owner. */
    private String owner;
    /** Identifier of a multi-tenant deployment, where this Service Registry instance resides. */
    private Integer registryDeploymentId;
    /** The registryUrl property */
    private String registryUrl;
    /** "accepted": Registry status when accepted for processing."provisioning": Registry status when provisioning a new instance."ready": Registry status when ready for use."failed": Registry status when the provisioning failed. When removing a Registry instance in this state,the status transitions directly to "deleting"."deprovision": Registry status when accepted for deprovisioning."deleting": Registry status when deprovisioning. */
    private RegistryStatusValue status;
    /** ISO 8601 UTC timestamp. */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new RootTypeForRegistry and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RootTypeForRegistry() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RootTypeForRegistry
     */
    @javax.annotation.Nonnull
    public static RootTypeForRegistry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RootTypeForRegistry();
    }
    /**
     * Gets the browserUrl property value. The browserUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserUrl() {
        return this.browserUrl;
    }
    /**
     * Gets the created_at property value. ISO 8601 UTC timestamp.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the description property value. Description of the Registry instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("browserUrl", (n) -> { this.setBrowserUrl(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("instance_type", (n) -> { this.setInstanceType(n.getEnumValue(RegistryInstanceTypeValue.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("registryDeploymentId", (n) -> { this.setRegistryDeploymentId(n.getIntegerValue()); });
        deserializerMap.put("registryUrl", (n) -> { this.setRegistryUrl(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RegistryStatusValue.class)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instance_type property value. Type of the Registry instance. This will determine functional and/or non-functional features provided by the instance."standard": Standard, full-featured Registry instance"eval": Evaluation (Trial) instance, provided for a limited time
     * @return a RegistryInstanceTypeValue
     */
    @javax.annotation.Nullable
    public RegistryInstanceTypeValue getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets the name property value. User-defined Registry instance name. Does not have to be unique.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the owner property value. Registry instance owner.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the registryDeploymentId property value. Identifier of a multi-tenant deployment, where this Service Registry instance resides.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRegistryDeploymentId() {
        return this.registryDeploymentId;
    }
    /**
     * Gets the registryUrl property value. The registryUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryUrl() {
        return this.registryUrl;
    }
    /**
     * Gets the status property value. "accepted": Registry status when accepted for processing."provisioning": Registry status when provisioning a new instance."ready": Registry status when ready for use."failed": Registry status when the provisioning failed. When removing a Registry instance in this state,the status transitions directly to "deleting"."deprovision": Registry status when accepted for deprovisioning."deleting": Registry status when deprovisioning.
     * @return a RegistryStatusValue
     */
    @javax.annotation.Nullable
    public RegistryStatusValue getStatus() {
        return this.status;
    }
    /**
     * Gets the updated_at property value. ISO 8601 UTC timestamp.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
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
        writer.writeStringValue("browserUrl", this.getBrowserUrl());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("instance_type", this.getInstanceType());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeIntegerValue("registryDeploymentId", this.getRegistryDeploymentId());
        writer.writeStringValue("registryUrl", this.getRegistryUrl());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the browserUrl property value. The browserUrl property
     * @param value Value to set for the browserUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserUrl(@javax.annotation.Nullable final String value) {
        this.browserUrl = value;
    }
    /**
     * Sets the created_at property value. ISO 8601 UTC timestamp.
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the description property value. Description of the Registry instance.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the instance_type property value. Type of the Registry instance. This will determine functional and/or non-functional features provided by the instance."standard": Standard, full-featured Registry instance"eval": Evaluation (Trial) instance, provided for a limited time
     * @param value Value to set for the instanceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceType(@javax.annotation.Nullable final RegistryInstanceTypeValue value) {
        this.instanceType = value;
    }
    /**
     * Sets the name property value. User-defined Registry instance name. Does not have to be unique.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the owner property value. Registry instance owner.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the registryDeploymentId property value. Identifier of a multi-tenant deployment, where this Service Registry instance resides.
     * @param value Value to set for the registryDeploymentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryDeploymentId(@javax.annotation.Nullable final Integer value) {
        this.registryDeploymentId = value;
    }
    /**
     * Sets the registryUrl property value. The registryUrl property
     * @param value Value to set for the registryUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryUrl(@javax.annotation.Nullable final String value) {
        this.registryUrl = value;
    }
    /**
     * Sets the status property value. "accepted": Registry status when accepted for processing."provisioning": Registry status when provisioning a new instance."ready": Registry status when ready for use."failed": Registry status when the provisioning failed. When removing a Registry instance in this state,the status transitions directly to "deleting"."deprovision": Registry status when accepted for deprovisioning."deleting": Registry status when deprovisioning.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final RegistryStatusValue value) {
        this.status = value;
    }
    /**
     * Sets the updated_at property value. ISO 8601 UTC timestamp.
     * @param value Value to set for the updatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
