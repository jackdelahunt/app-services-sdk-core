package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The Connector configuration payload */
    private ConnectorRequest_connector connector;
    /** The name of the connector */
    private String connectorTypeId;
    /** The name of the connector */
    private String name;
    /**
     * Instantiates a new ConnectorRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorRequest
     */
    @javax.annotation.Nonnull
    public static ConnectorRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorRequest();
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
     * Gets the connector property value. The Connector configuration payload
     * @return a ConnectorRequest_connector
     */
    @javax.annotation.Nullable
    public ConnectorRequest_connector getConnector() {
        return this.connector;
    }
    /**
     * Gets the connector_type_id property value. The name of the connector
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorTypeId() {
        return this.connectorTypeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("connector", (n) -> { this.setConnector(n.getObjectValue(ConnectorRequest_connector::createFromDiscriminatorValue)); });
        deserializerMap.put("connector_type_id", (n) -> { this.setConnectorTypeId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the connector
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
        writer.writeObjectValue("connector", this.getConnector());
        writer.writeStringValue("connector_type_id", this.getConnectorTypeId());
        writer.writeStringValue("name", this.getName());
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
     * Sets the connector property value. The Connector configuration payload
     * @param value Value to set for the connector property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnector(@javax.annotation.Nullable final ConnectorRequest_connector value) {
        this.connector = value;
    }
    /**
     * Sets the connector_type_id property value. The name of the connector
     * @param value Value to set for the connectorTypeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorTypeId(@javax.annotation.Nullable final String value) {
        this.connectorTypeId = value;
    }
    /**
     * Sets the name property value. The name of the connector
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
}
