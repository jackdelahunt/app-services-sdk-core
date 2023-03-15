package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Metric extends ObjectReference implements Parsable {
    /** The external_id property */
    private String externalId;
    /** The health_state property */
    private String healthState;
    /** The metrics property */
    private String metrics;
    /** The query_timestamp property */
    private OffsetDateTime queryTimestamp;
    /**
     * Instantiates a new Metric and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Metric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Metric
     */
    @javax.annotation.Nonnull
    public static Metric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Metric();
    }
    /**
     * Gets the external_id property value. The external_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("health_state", (n) -> { this.setHealthState(n.getStringValue()); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getStringValue()); });
        deserializerMap.put("query_timestamp", (n) -> { this.setQueryTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the health_state property value. The health_state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHealthState() {
        return this.healthState;
    }
    /**
     * Gets the metrics property value. The metrics property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetrics() {
        return this.metrics;
    }
    /**
     * Gets the query_timestamp property value. The query_timestamp property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQueryTimestamp() {
        return this.queryTimestamp;
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
        writer.writeStringValue("external_id", this.getExternalId());
        writer.writeStringValue("health_state", this.getHealthState());
        writer.writeStringValue("metrics", this.getMetrics());
        writer.writeOffsetDateTimeValue("query_timestamp", this.getQueryTimestamp());
    }
    /**
     * Sets the external_id property value. The external_id property
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the health_state property value. The health_state property
     * @param value Value to set for the healthState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthState(@javax.annotation.Nullable final String value) {
        this.healthState = value;
    }
    /**
     * Sets the metrics property value. The metrics property
     * @param value Value to set for the metrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetrics(@javax.annotation.Nullable final String value) {
        this.metrics = value;
    }
    /**
     * Sets the query_timestamp property value. The query_timestamp property
     * @param value Value to set for the queryTimestamp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryTimestamp(@javax.annotation.Nullable final OffsetDateTime value) {
        this.queryTimestamp = value;
    }
}
