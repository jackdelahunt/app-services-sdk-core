package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeletedSubscription extends SubscriptionCommonFields implements Parsable {
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The metrics property */
    private String metrics;
    /** The query_timestamp property */
    private OffsetDateTime queryTimestamp;
    /**
     * Instantiates a new DeletedSubscription and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeletedSubscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeletedSubscription
     */
    @javax.annotation.Nonnull
    public static DeletedSubscription createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeletedSubscription();
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
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getStringValue()); });
        deserializerMap.put("query_timestamp", (n) -> { this.setQueryTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
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
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("metrics", this.getMetrics());
        writer.writeOffsetDateTimeValue("query_timestamp", this.getQueryTimestamp());
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
