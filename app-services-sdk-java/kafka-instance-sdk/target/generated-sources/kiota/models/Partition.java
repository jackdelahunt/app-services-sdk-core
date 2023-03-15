package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka topic partition
 */
public class Partition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Unique id for the partition (deprecated, use `partition` instead) */
    private Integer id;
    /** List in-sync replicas for this partition. */
    private java.util.List<Node> isr;
    /** The leader property */
    private Partition_leader leader;
    /** The partition id, unique among partitions of the same topic */
    private Integer partition;
    /** List of replicas for the partition */
    private java.util.List<Node> replicas;
    /**
     * Instantiates a new Partition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Partition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Partition
     */
    @javax.annotation.Nonnull
    public static Partition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Partition();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("id", (n) -> { this.setId(n.getIntegerValue()); });
        deserializerMap.put("isr", (n) -> { this.setIsr(n.getCollectionOfObjectValues(Node::createFromDiscriminatorValue)); });
        deserializerMap.put("leader", (n) -> { this.setLeader(n.getObjectValue(Partition_leader::createFromDiscriminatorValue)); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("replicas", (n) -> { this.setReplicas(n.getCollectionOfObjectValues(Node::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique id for the partition (deprecated, use `partition` instead)
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getId() {
        return this.id;
    }
    /**
     * Gets the isr property value. List in-sync replicas for this partition.
     * @return a Node
     */
    @javax.annotation.Nullable
    public java.util.List<Node> getIsr() {
        return this.isr;
    }
    /**
     * Gets the leader property value. The leader property
     * @return a Partition_leader
     */
    @javax.annotation.Nullable
    public Partition_leader getLeader() {
        return this.leader;
    }
    /**
     * Gets the partition property value. The partition id, unique among partitions of the same topic
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the replicas property value. List of replicas for the partition
     * @return a Node
     */
    @javax.annotation.Nullable
    public java.util.List<Node> getReplicas() {
        return this.replicas;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("id", this.getId());
        writer.writeCollectionOfObjectValues("isr", this.getIsr());
        writer.writeObjectValue("leader", this.getLeader());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeCollectionOfObjectValues("replicas", this.getReplicas());
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
     * Sets the id property value. Unique id for the partition (deprecated, use `partition` instead)
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final Integer value) {
        this.id = value;
    }
    /**
     * Sets the isr property value. List in-sync replicas for this partition.
     * @param value Value to set for the isr property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsr(@javax.annotation.Nullable final java.util.List<Node> value) {
        this.isr = value;
    }
    /**
     * Sets the leader property value. The leader property
     * @param value Value to set for the leader property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeader(@javax.annotation.Nullable final Partition_leader value) {
        this.leader = value;
    }
    /**
     * Sets the partition property value. The partition id, unique among partitions of the same topic
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the replicas property value. List of replicas for the partition
     * @param value Value to set for the replicas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplicas(@javax.annotation.Nullable final java.util.List<Node> value) {
        this.replicas = value;
    }
}
