package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RangeQuery implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The metric property */
    private RangeQuery_metric metric;
    /** The values property */
    private java.util.List<Values> values;
    /**
     * Instantiates a new RangeQuery and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RangeQuery() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RangeQuery
     */
    @javax.annotation.Nonnull
    public static RangeQuery createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RangeQuery();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getObjectValue(RangeQuery_metric::createFromDiscriminatorValue)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(Values::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metric property value. The metric property
     * @return a RangeQuery_metric
     */
    @javax.annotation.Nullable
    public RangeQuery_metric getMetric() {
        return this.metric;
    }
    /**
     * Gets the values property value. The values property
     * @return a Values
     */
    @javax.annotation.Nullable
    public java.util.List<Values> getValues() {
        return this.values;
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
        writer.writeCollectionOfObjectValues("values", this.getValues());
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
    public void setMetric(@javax.annotation.Nullable final RangeQuery_metric value) {
        this.metric = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValues(@javax.annotation.Nullable final java.util.List<Values> value) {
        this.values = value;
    }
}
