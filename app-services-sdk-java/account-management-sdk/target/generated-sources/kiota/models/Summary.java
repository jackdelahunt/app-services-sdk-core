package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Summary extends ObjectReference implements Parsable {
    /** The metrics property */
    private java.util.List<SummaryMetrics> metrics;
    /** The name property */
    private String name;
    /**
     * Instantiates a new Summary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Summary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Summary
     */
    @javax.annotation.Nonnull
    public static Summary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Summary();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getCollectionOfObjectValues(SummaryMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metrics property value. The metrics property
     * @return a SummaryMetrics
     */
    @javax.annotation.Nullable
    public java.util.List<SummaryMetrics> getMetrics() {
        return this.metrics;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
        writer.writeCollectionOfObjectValues("metrics", this.getMetrics());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the metrics property value. The metrics property
     * @param value Value to set for the metrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetrics(@javax.annotation.Nullable final java.util.List<SummaryMetrics> value) {
        this.metrics = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
}
