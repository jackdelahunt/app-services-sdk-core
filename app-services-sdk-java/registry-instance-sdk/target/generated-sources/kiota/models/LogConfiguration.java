package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogConfiguration extends NamedLogConfiguration implements Parsable {
    /** The level property */
    private LogLevel level;
    /**
     * Instantiates a new LogConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LogConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LogConfiguration
     */
    @javax.annotation.Nonnull
    public static LogConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(LogLevel.class)); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. The level property
     * @return a LogLevel
     */
    @javax.annotation.Nullable
    public LogLevel getLevel() {
        return this.level;
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
        writer.writeEnumValue("level", this.getLevel());
    }
    /**
     * Sets the level property value. The level property
     * @param value Value to set for the level property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLevel(@javax.annotation.Nullable final LogLevel value) {
        this.level = value;
    }
}
