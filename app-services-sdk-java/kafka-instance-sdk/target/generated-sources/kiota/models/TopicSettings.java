package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The settings that are applicable to this topic. This includes partitions, configuration information, and number of replicas.
 */
public class TopicSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Topic configuration entries. */
    private java.util.List<ConfigEntry> config;
    /** Number of partitions for this topic. If not specified, the default for new topics is `1`. Number of partitions may not be reduced when updating existing topics */
    private Integer numPartitions;
    /**
     * Instantiates a new TopicSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TopicSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TopicSettings
     */
    @javax.annotation.Nonnull
    public static TopicSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TopicSettings();
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
     * Gets the config property value. Topic configuration entries.
     * @return a ConfigEntry
     */
    @javax.annotation.Nullable
    public java.util.List<ConfigEntry> getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("config", (n) -> { this.setConfig(n.getCollectionOfObjectValues(ConfigEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("numPartitions", (n) -> { this.setNumPartitions(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the numPartitions property value. Number of partitions for this topic. If not specified, the default for new topics is `1`. Number of partitions may not be reduced when updating existing topics
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumPartitions() {
        return this.numPartitions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("config", this.getConfig());
        writer.writeIntegerValue("numPartitions", this.getNumPartitions());
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
     * Sets the config property value. Topic configuration entries.
     * @param value Value to set for the config property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfig(@javax.annotation.Nullable final java.util.List<ConfigEntry> value) {
        this.config = value;
    }
    /**
     * Sets the numPartitions property value. Number of partitions for this topic. If not specified, the default for new topics is `1`. Number of partitions may not be reduced when updating existing topics
     * @param value Value to set for the numPartitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumPartitions(@javax.annotation.Nullable final Integer value) {
        this.numPartitions = value;
    }
}
