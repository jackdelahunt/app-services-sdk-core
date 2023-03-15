package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * List of limitations on used resources, that are applied on the current instance of Registry.Keys represent the resource type and are suffixed by the corresponding unit.Values are integers. Only non-negative values are allowed, with the exception of -1, which means that the limit is not applied.
 */
public class Limits implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The maxArtifactDescriptionLengthChars property */
    private Long maxArtifactDescriptionLengthChars;
    /** The maxArtifactLabelsCount property */
    private Long maxArtifactLabelsCount;
    /** The maxArtifactNameLengthChars property */
    private Long maxArtifactNameLengthChars;
    /** The maxArtifactPropertiesCount property */
    private Long maxArtifactPropertiesCount;
    /** The maxArtifactsCount property */
    private Long maxArtifactsCount;
    /** The maxLabelSizeBytes property */
    private Long maxLabelSizeBytes;
    /** The maxPropertyKeySizeBytes property */
    private Long maxPropertyKeySizeBytes;
    /** The maxPropertyValueSizeBytes property */
    private Long maxPropertyValueSizeBytes;
    /** The maxRequestsPerSecondCount property */
    private Long maxRequestsPerSecondCount;
    /** The maxSchemaSizeBytes property */
    private Long maxSchemaSizeBytes;
    /** The maxTotalSchemasCount property */
    private Long maxTotalSchemasCount;
    /** The maxVersionsPerArtifactCount property */
    private Long maxVersionsPerArtifactCount;
    /**
     * Instantiates a new Limits and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Limits() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Limits
     */
    @javax.annotation.Nonnull
    public static Limits createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Limits();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("maxArtifactDescriptionLengthChars", (n) -> { this.setMaxArtifactDescriptionLengthChars(n.getLongValue()); });
        deserializerMap.put("maxArtifactLabelsCount", (n) -> { this.setMaxArtifactLabelsCount(n.getLongValue()); });
        deserializerMap.put("maxArtifactNameLengthChars", (n) -> { this.setMaxArtifactNameLengthChars(n.getLongValue()); });
        deserializerMap.put("maxArtifactPropertiesCount", (n) -> { this.setMaxArtifactPropertiesCount(n.getLongValue()); });
        deserializerMap.put("maxArtifactsCount", (n) -> { this.setMaxArtifactsCount(n.getLongValue()); });
        deserializerMap.put("maxLabelSizeBytes", (n) -> { this.setMaxLabelSizeBytes(n.getLongValue()); });
        deserializerMap.put("maxPropertyKeySizeBytes", (n) -> { this.setMaxPropertyKeySizeBytes(n.getLongValue()); });
        deserializerMap.put("maxPropertyValueSizeBytes", (n) -> { this.setMaxPropertyValueSizeBytes(n.getLongValue()); });
        deserializerMap.put("maxRequestsPerSecondCount", (n) -> { this.setMaxRequestsPerSecondCount(n.getLongValue()); });
        deserializerMap.put("maxSchemaSizeBytes", (n) -> { this.setMaxSchemaSizeBytes(n.getLongValue()); });
        deserializerMap.put("maxTotalSchemasCount", (n) -> { this.setMaxTotalSchemasCount(n.getLongValue()); });
        deserializerMap.put("maxVersionsPerArtifactCount", (n) -> { this.setMaxVersionsPerArtifactCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxArtifactDescriptionLengthChars property value. The maxArtifactDescriptionLengthChars property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxArtifactDescriptionLengthChars() {
        return this.maxArtifactDescriptionLengthChars;
    }
    /**
     * Gets the maxArtifactLabelsCount property value. The maxArtifactLabelsCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxArtifactLabelsCount() {
        return this.maxArtifactLabelsCount;
    }
    /**
     * Gets the maxArtifactNameLengthChars property value. The maxArtifactNameLengthChars property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxArtifactNameLengthChars() {
        return this.maxArtifactNameLengthChars;
    }
    /**
     * Gets the maxArtifactPropertiesCount property value. The maxArtifactPropertiesCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxArtifactPropertiesCount() {
        return this.maxArtifactPropertiesCount;
    }
    /**
     * Gets the maxArtifactsCount property value. The maxArtifactsCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxArtifactsCount() {
        return this.maxArtifactsCount;
    }
    /**
     * Gets the maxLabelSizeBytes property value. The maxLabelSizeBytes property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxLabelSizeBytes() {
        return this.maxLabelSizeBytes;
    }
    /**
     * Gets the maxPropertyKeySizeBytes property value. The maxPropertyKeySizeBytes property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxPropertyKeySizeBytes() {
        return this.maxPropertyKeySizeBytes;
    }
    /**
     * Gets the maxPropertyValueSizeBytes property value. The maxPropertyValueSizeBytes property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxPropertyValueSizeBytes() {
        return this.maxPropertyValueSizeBytes;
    }
    /**
     * Gets the maxRequestsPerSecondCount property value. The maxRequestsPerSecondCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxRequestsPerSecondCount() {
        return this.maxRequestsPerSecondCount;
    }
    /**
     * Gets the maxSchemaSizeBytes property value. The maxSchemaSizeBytes property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxSchemaSizeBytes() {
        return this.maxSchemaSizeBytes;
    }
    /**
     * Gets the maxTotalSchemasCount property value. The maxTotalSchemasCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxTotalSchemasCount() {
        return this.maxTotalSchemasCount;
    }
    /**
     * Gets the maxVersionsPerArtifactCount property value. The maxVersionsPerArtifactCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaxVersionsPerArtifactCount() {
        return this.maxVersionsPerArtifactCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("maxArtifactDescriptionLengthChars", this.getMaxArtifactDescriptionLengthChars());
        writer.writeLongValue("maxArtifactLabelsCount", this.getMaxArtifactLabelsCount());
        writer.writeLongValue("maxArtifactNameLengthChars", this.getMaxArtifactNameLengthChars());
        writer.writeLongValue("maxArtifactPropertiesCount", this.getMaxArtifactPropertiesCount());
        writer.writeLongValue("maxArtifactsCount", this.getMaxArtifactsCount());
        writer.writeLongValue("maxLabelSizeBytes", this.getMaxLabelSizeBytes());
        writer.writeLongValue("maxPropertyKeySizeBytes", this.getMaxPropertyKeySizeBytes());
        writer.writeLongValue("maxPropertyValueSizeBytes", this.getMaxPropertyValueSizeBytes());
        writer.writeLongValue("maxRequestsPerSecondCount", this.getMaxRequestsPerSecondCount());
        writer.writeLongValue("maxSchemaSizeBytes", this.getMaxSchemaSizeBytes());
        writer.writeLongValue("maxTotalSchemasCount", this.getMaxTotalSchemasCount());
        writer.writeLongValue("maxVersionsPerArtifactCount", this.getMaxVersionsPerArtifactCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the maxArtifactDescriptionLengthChars property value. The maxArtifactDescriptionLengthChars property
     * @param value Value to set for the maxArtifactDescriptionLengthChars property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxArtifactDescriptionLengthChars(@javax.annotation.Nullable final Long value) {
        this.maxArtifactDescriptionLengthChars = value;
    }
    /**
     * Sets the maxArtifactLabelsCount property value. The maxArtifactLabelsCount property
     * @param value Value to set for the maxArtifactLabelsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxArtifactLabelsCount(@javax.annotation.Nullable final Long value) {
        this.maxArtifactLabelsCount = value;
    }
    /**
     * Sets the maxArtifactNameLengthChars property value. The maxArtifactNameLengthChars property
     * @param value Value to set for the maxArtifactNameLengthChars property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxArtifactNameLengthChars(@javax.annotation.Nullable final Long value) {
        this.maxArtifactNameLengthChars = value;
    }
    /**
     * Sets the maxArtifactPropertiesCount property value. The maxArtifactPropertiesCount property
     * @param value Value to set for the maxArtifactPropertiesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxArtifactPropertiesCount(@javax.annotation.Nullable final Long value) {
        this.maxArtifactPropertiesCount = value;
    }
    /**
     * Sets the maxArtifactsCount property value. The maxArtifactsCount property
     * @param value Value to set for the maxArtifactsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxArtifactsCount(@javax.annotation.Nullable final Long value) {
        this.maxArtifactsCount = value;
    }
    /**
     * Sets the maxLabelSizeBytes property value. The maxLabelSizeBytes property
     * @param value Value to set for the maxLabelSizeBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxLabelSizeBytes(@javax.annotation.Nullable final Long value) {
        this.maxLabelSizeBytes = value;
    }
    /**
     * Sets the maxPropertyKeySizeBytes property value. The maxPropertyKeySizeBytes property
     * @param value Value to set for the maxPropertyKeySizeBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxPropertyKeySizeBytes(@javax.annotation.Nullable final Long value) {
        this.maxPropertyKeySizeBytes = value;
    }
    /**
     * Sets the maxPropertyValueSizeBytes property value. The maxPropertyValueSizeBytes property
     * @param value Value to set for the maxPropertyValueSizeBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxPropertyValueSizeBytes(@javax.annotation.Nullable final Long value) {
        this.maxPropertyValueSizeBytes = value;
    }
    /**
     * Sets the maxRequestsPerSecondCount property value. The maxRequestsPerSecondCount property
     * @param value Value to set for the maxRequestsPerSecondCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxRequestsPerSecondCount(@javax.annotation.Nullable final Long value) {
        this.maxRequestsPerSecondCount = value;
    }
    /**
     * Sets the maxSchemaSizeBytes property value. The maxSchemaSizeBytes property
     * @param value Value to set for the maxSchemaSizeBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxSchemaSizeBytes(@javax.annotation.Nullable final Long value) {
        this.maxSchemaSizeBytes = value;
    }
    /**
     * Sets the maxTotalSchemasCount property value. The maxTotalSchemasCount property
     * @param value Value to set for the maxTotalSchemasCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxTotalSchemasCount(@javax.annotation.Nullable final Long value) {
        this.maxTotalSchemasCount = value;
    }
    /**
     * Sets the maxVersionsPerArtifactCount property value. The maxVersionsPerArtifactCount property
     * @param value Value to set for the maxVersionsPerArtifactCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxVersionsPerArtifactCount(@javax.annotation.Nullable final Long value) {
        this.maxVersionsPerArtifactCount = value;
    }
}
