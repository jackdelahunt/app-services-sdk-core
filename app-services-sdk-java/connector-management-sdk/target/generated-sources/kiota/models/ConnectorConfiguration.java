package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorConfiguration extends Connector implements Parsable {
    /** The connector property */
    private ConnectorConfiguration_connector connector;
    /** Holds the configuration to connect to a Kafka Instance. */
    private KafkaConnectionSettings kafka;
    /** Holds the configuration to connect to a Schem Registry Instance. */
    private SchemaRegistryConnectionSettings schemaRegistry;
    /** The service_account property */
    private ServiceAccount serviceAccount;
    /**
     * Instantiates a new ConnectorConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorConfiguration
     */
    @javax.annotation.Nonnull
    public static ConnectorConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorConfiguration();
    }
    /**
     * Gets the connector property value. The connector property
     * @return a ConnectorConfiguration_connector
     */
    @javax.annotation.Nullable
    public ConnectorConfiguration_connector getConnector() {
        return this.connector;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connector", (n) -> { this.setConnector(n.getObjectValue(ConnectorConfiguration_connector::createFromDiscriminatorValue)); });
        deserializerMap.put("kafka", (n) -> { this.setKafka(n.getObjectValue(KafkaConnectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("schema_registry", (n) -> { this.setSchemaRegistry(n.getObjectValue(SchemaRegistryConnectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("service_account", (n) -> { this.setServiceAccount(n.getObjectValue(ServiceAccount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the kafka property value. Holds the configuration to connect to a Kafka Instance.
     * @return a KafkaConnectionSettings
     */
    @javax.annotation.Nullable
    public KafkaConnectionSettings getKafka() {
        return this.kafka;
    }
    /**
     * Gets the schema_registry property value. Holds the configuration to connect to a Schem Registry Instance.
     * @return a SchemaRegistryConnectionSettings
     */
    @javax.annotation.Nullable
    public SchemaRegistryConnectionSettings getSchemaRegistry() {
        return this.schemaRegistry;
    }
    /**
     * Gets the service_account property value. The service_account property
     * @return a ServiceAccount
     */
    @javax.annotation.Nullable
    public ServiceAccount getServiceAccount() {
        return this.serviceAccount;
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
        writer.writeObjectValue("connector", this.getConnector());
        writer.writeObjectValue("kafka", this.getKafka());
        writer.writeObjectValue("schema_registry", this.getSchemaRegistry());
        writer.writeObjectValue("service_account", this.getServiceAccount());
    }
    /**
     * Sets the connector property value. The connector property
     * @param value Value to set for the connector property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnector(@javax.annotation.Nullable final ConnectorConfiguration_connector value) {
        this.connector = value;
    }
    /**
     * Sets the kafka property value. Holds the configuration to connect to a Kafka Instance.
     * @param value Value to set for the kafka property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKafka(@javax.annotation.Nullable final KafkaConnectionSettings value) {
        this.kafka = value;
    }
    /**
     * Sets the schema_registry property value. Holds the configuration to connect to a Schem Registry Instance.
     * @param value Value to set for the schemaRegistry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchemaRegistry(@javax.annotation.Nullable final SchemaRegistryConnectionSettings value) {
        this.schemaRegistry = value;
    }
    /**
     * Sets the service_account property value. The service_account property
     * @param value Value to set for the serviceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceAccount(@javax.annotation.Nullable final ServiceAccount value) {
        this.serviceAccount = value;
    }
}
