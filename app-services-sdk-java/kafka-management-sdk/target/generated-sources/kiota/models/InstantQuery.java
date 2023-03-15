package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InstantQuery implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The metric property */
    private InstantQuery_metric metric;
    /** The timestamp property */
    private Long timestamp;
    /** The value property */
    private Double value;
    /**
     * Instantiates a new InstantQuery and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InstantQuery() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstantQuery
     */
    @javax.annotation.Nonnull
    public static InstantQuery createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstantQuery();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getObjectValue(InstantQuery_metric::createFromDiscriminatorValue)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getLongValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metric property value. The metric property
     * @return a InstantQuery_metric
     */
    @javax.annotation.Nullable
    public InstantQuery_metric getMetric() {
        return this.metric;
    }
    /**
     * Gets the timestamp property value. The timestamp property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the value property value. The value property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("metric", this.getMetric());
        writer.writeLongValue("timestamp", this.getTimestamp());
        writer.writeDoubleValue("value", this.getValue());
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
     * Sets the metric property value. The metric property
     * @param value Value to set for the metric property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetric(@javax.annotation.Nullable final InstantQuery_metric value) {
        this.metric = value;
    }
    /**
     * Sets the timestamp property value. The timestamp property
     * @param value Value to set for the timestamp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimestamp(@javax.annotation.Nullable final Long value) {
        this.timestamp = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final Double value) {
        this.value = value;
    }
}
