package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterUpgrade implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The available property */
    private Boolean available;
    /** The state property */
    private String state;
    /** The updated_timestamp property */
    private OffsetDateTime updatedTimestamp;
    /** The version property */
    private String version;
    /**
     * Instantiates a new ClusterUpgrade and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterUpgrade() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterUpgrade
     */
    @javax.annotation.Nonnull
    public static ClusterUpgrade createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterUpgrade();
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
     * Gets the available property value. The available property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAvailable() {
        return this.available;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("available", (n) -> { this.setAvailable(n.getBooleanValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("updated_timestamp", (n) -> { this.setUpdatedTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the updated_timestamp property value. The updated_timestamp property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("available", this.getAvailable());
        writer.writeStringValue("state", this.getState());
        writer.writeOffsetDateTimeValue("updated_timestamp", this.getUpdatedTimestamp());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the available property value. The available property
     * @param value Value to set for the available property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailable(@javax.annotation.Nullable final Boolean value) {
        this.available = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the updated_timestamp property value. The updated_timestamp property
     * @param value Value to set for the updatedTimestamp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedTimestamp(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedTimestamp = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
