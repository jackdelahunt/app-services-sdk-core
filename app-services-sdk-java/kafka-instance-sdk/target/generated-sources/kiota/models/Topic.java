package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka Topic (A feed where records are stored and published)
 */
public class Topic extends ObjectReference implements Parsable {
    /** Topic configuration entry. */
    private java.util.List<ConfigEntry> config;
    /** The isInternal property */
    private Boolean isInternal;
    /** The name of the topic. */
    private String name;
    /** Partitions for this topic. */
    private java.util.List<Partition> partitions;
    /**
     * Instantiates a new Topic and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Topic() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Topic
     */
    @javax.annotation.Nonnull
    public static Topic createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Topic();
    }
    /**
     * Gets the config property value. Topic configuration entry.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("config", (n) -> { this.setConfig(n.getCollectionOfObjectValues(ConfigEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("isInternal", (n) -> { this.setIsInternal(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("partitions", (n) -> { this.setPartitions(n.getCollectionOfObjectValues(Partition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isInternal property value. The isInternal property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInternal() {
        return this.isInternal;
    }
    /**
     * Gets the name property value. The name of the topic.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the partitions property value. Partitions for this topic.
     * @return a Partition
     */
    @javax.annotation.Nullable
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
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
        writer.writeCollectionOfObjectValues("config", this.getConfig());
        writer.writeBooleanValue("isInternal", this.getIsInternal());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("partitions", this.getPartitions());
    }
    /**
     * Sets the config property value. Topic configuration entry.
     * @param value Value to set for the config property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfig(@javax.annotation.Nullable final java.util.List<ConfigEntry> value) {
        this.config = value;
    }
    /**
     * Sets the isInternal property value. The isInternal property
     * @param value Value to set for the isInternal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsInternal(@javax.annotation.Nullable final Boolean value) {
        this.isInternal = value;
    }
    /**
     * Sets the name property value. The name of the topic.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the partitions property value. Partitions for this topic.
     * @param value Value to set for the partitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartitions(@javax.annotation.Nullable final java.util.List<Partition> value) {
        this.partitions = value;
    }
}
