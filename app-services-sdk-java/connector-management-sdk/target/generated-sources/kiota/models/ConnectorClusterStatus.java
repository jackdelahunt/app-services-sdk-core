package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorClusterStatus extends ConnectorClusterRequestMeta implements Parsable {
    /** The status property */
    private ConnectorClusterStatus_status status;
    /**
     * Instantiates a new ConnectorClusterStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorClusterStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorClusterStatus
     */
    @javax.annotation.Nonnull
    public static ConnectorClusterStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorClusterStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(ConnectorClusterStatus_status::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status property
     * @return a ConnectorClusterStatus_status
     */
    @javax.annotation.Nullable
    public ConnectorClusterStatus_status getStatus() {
        return this.status;
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
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ConnectorClusterStatus_status value) {
        this.status = value;
    }
}
