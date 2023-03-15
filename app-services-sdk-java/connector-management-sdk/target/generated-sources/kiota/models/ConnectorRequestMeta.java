package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorRequestMeta extends ObjectMeta implements Parsable {
    /** Name-value string annotations for resource */
    private ConnectorResourceAnnotations annotations;
    /** The channel property */
    private Channel channel;
    /** The connector_type_id property */
    private String connectorTypeId;
    /** The desired_state property */
    private ConnectorDesiredState desiredState;
    /** The name property */
    private String name;
    /** The namespace_id property */
    private String namespaceId;
    /**
     * Instantiates a new ConnectorRequestMeta and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorRequestMeta() {
        super();
        this.setChannel(Channel.forValue("stable"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorRequestMeta
     */
    @javax.annotation.Nonnull
    public static ConnectorRequestMeta createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorRequestMeta();
    }
    /**
     * Gets the annotations property value. Name-value string annotations for resource
     * @return a ConnectorResourceAnnotations
     */
    @javax.annotation.Nullable
    public ConnectorResourceAnnotations getAnnotations() {
        return this.annotations;
    }
    /**
     * Gets the channel property value. The channel property
     * @return a Channel
     */
    @javax.annotation.Nullable
    public Channel getChannel() {
        return this.channel;
    }
    /**
     * Gets the connector_type_id property value. The connector_type_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorTypeId() {
        return this.connectorTypeId;
    }
    /**
     * Gets the desired_state property value. The desired_state property
     * @return a ConnectorDesiredState
     */
    @javax.annotation.Nullable
    public ConnectorDesiredState getDesiredState() {
        return this.desiredState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("annotations", (n) -> { this.setAnnotations(n.getObjectValue(ConnectorResourceAnnotations::createFromDiscriminatorValue)); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(Channel.class)); });
        deserializerMap.put("connector_type_id", (n) -> { this.setConnectorTypeId(n.getStringValue()); });
        deserializerMap.put("desired_state", (n) -> { this.setDesiredState(n.getEnumValue(ConnectorDesiredState.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace_id", (n) -> { this.setNamespaceId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the namespace_id property value. The namespace_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNamespaceId() {
        return this.namespaceId;
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
        writer.writeObjectValue("annotations", this.getAnnotations());
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeStringValue("connector_type_id", this.getConnectorTypeId());
        writer.writeEnumValue("desired_state", this.getDesiredState());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("namespace_id", this.getNamespaceId());
    }
    /**
     * Sets the annotations property value. Name-value string annotations for resource
     * @param value Value to set for the annotations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnnotations(@javax.annotation.Nullable final ConnectorResourceAnnotations value) {
        this.annotations = value;
    }
    /**
     * Sets the channel property value. The channel property
     * @param value Value to set for the channel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannel(@javax.annotation.Nullable final Channel value) {
        this.channel = value;
    }
    /**
     * Sets the connector_type_id property value. The connector_type_id property
     * @param value Value to set for the connectorTypeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorTypeId(@javax.annotation.Nullable final String value) {
        this.connectorTypeId = value;
    }
    /**
     * Sets the desired_state property value. The desired_state property
     * @param value Value to set for the desiredState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDesiredState(@javax.annotation.Nullable final ConnectorDesiredState value) {
        this.desiredState = value;
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
    /**
     * Sets the namespace_id property value. The namespace_id property
     * @param value Value to set for the namespaceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNamespaceId(@javax.annotation.Nullable final String value) {
        this.namespaceId = value;
    }
}
