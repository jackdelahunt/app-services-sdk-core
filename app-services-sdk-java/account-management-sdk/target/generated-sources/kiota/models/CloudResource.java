package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudResource extends ObjectReference implements Parsable {
    /** The active property */
    private Boolean active;
    /** The category property */
    private String category;
    /** The category_pretty property */
    private String categoryPretty;
    /** The cloud_provider property */
    private String cloudProvider;
    /** The cpu_cores property */
    private Integer cpuCores;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The generic_name property */
    private String genericName;
    /** The memory property */
    private Long memory;
    /** The memory_pretty property */
    private String memoryPretty;
    /** The name_pretty property */
    private String namePretty;
    /** The resource_type property */
    private CloudResource_resource_type resourceType;
    /** The size_pretty property */
    private String sizePretty;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new CloudResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudResource
     */
    @javax.annotation.Nonnull
    public static CloudResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudResource();
    }
    /**
     * Gets the active property value. The active property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getActive() {
        return this.active;
    }
    /**
     * Gets the category property value. The category property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the category_pretty property value. The category_pretty property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryPretty() {
        return this.categoryPretty;
    }
    /**
     * Gets the cloud_provider property value. The cloud_provider property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Gets the cpu_cores property value. The cpu_cores property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCpuCores() {
        return this.cpuCores;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("active", (n) -> { this.setActive(n.getBooleanValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("category_pretty", (n) -> { this.setCategoryPretty(n.getStringValue()); });
        deserializerMap.put("cloud_provider", (n) -> { this.setCloudProvider(n.getStringValue()); });
        deserializerMap.put("cpu_cores", (n) -> { this.setCpuCores(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("generic_name", (n) -> { this.setGenericName(n.getStringValue()); });
        deserializerMap.put("memory", (n) -> { this.setMemory(n.getLongValue()); });
        deserializerMap.put("memory_pretty", (n) -> { this.setMemoryPretty(n.getStringValue()); });
        deserializerMap.put("name_pretty", (n) -> { this.setNamePretty(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(CloudResource_resource_type.class)); });
        deserializerMap.put("size_pretty", (n) -> { this.setSizePretty(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the generic_name property value. The generic_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGenericName() {
        return this.genericName;
    }
    /**
     * Gets the memory property value. The memory property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMemory() {
        return this.memory;
    }
    /**
     * Gets the memory_pretty property value. The memory_pretty property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemoryPretty() {
        return this.memoryPretty;
    }
    /**
     * Gets the name_pretty property value. The name_pretty property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNamePretty() {
        return this.namePretty;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a CloudResource_resource_type
     */
    @javax.annotation.Nullable
    public CloudResource_resource_type getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the size_pretty property value. The size_pretty property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSizePretty() {
        return this.sizePretty;
    }
    /**
     * Gets the updated_at property value. The updated_at property
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
        writer.writeBooleanValue("active", this.getActive());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("category_pretty", this.getCategoryPretty());
        writer.writeStringValue("cloud_provider", this.getCloudProvider());
        writer.writeIntegerValue("cpu_cores", this.getCpuCores());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("generic_name", this.getGenericName());
        writer.writeLongValue("memory", this.getMemory());
        writer.writeStringValue("memory_pretty", this.getMemoryPretty());
        writer.writeStringValue("name_pretty", this.getNamePretty());
        writer.writeEnumValue("resource_type", this.getResourceType());
        writer.writeStringValue("size_pretty", this.getSizePretty());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the active property value. The active property
     * @param value Value to set for the active property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActive(@javax.annotation.Nullable final Boolean value) {
        this.active = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the category_pretty property value. The category_pretty property
     * @param value Value to set for the categoryPretty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryPretty(@javax.annotation.Nullable final String value) {
        this.categoryPretty = value;
    }
    /**
     * Sets the cloud_provider property value. The cloud_provider property
     * @param value Value to set for the cloudProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvider(@javax.annotation.Nullable final String value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the cpu_cores property value. The cpu_cores property
     * @param value Value to set for the cpuCores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCpuCores(@javax.annotation.Nullable final Integer value) {
        this.cpuCores = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the generic_name property value. The generic_name property
     * @param value Value to set for the genericName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGenericName(@javax.annotation.Nullable final String value) {
        this.genericName = value;
    }
    /**
     * Sets the memory property value. The memory property
     * @param value Value to set for the memory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemory(@javax.annotation.Nullable final Long value) {
        this.memory = value;
    }
    /**
     * Sets the memory_pretty property value. The memory_pretty property
     * @param value Value to set for the memoryPretty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemoryPretty(@javax.annotation.Nullable final String value) {
        this.memoryPretty = value;
    }
    /**
     * Sets the name_pretty property value. The name_pretty property
     * @param value Value to set for the namePretty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNamePretty(@javax.annotation.Nullable final String value) {
        this.namePretty = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final CloudResource_resource_type value) {
        this.resourceType = value;
    }
    /**
     * Sets the size_pretty property value. The size_pretty property
     * @param value Value to set for the sizePretty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizePretty(@javax.annotation.Nullable final String value) {
        this.sizePretty = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
