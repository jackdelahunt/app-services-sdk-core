package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a connector type supported by the API
 */
public class ConnectorType extends ObjectReference implements Parsable {
    /** Name-value string annotations for resource */
    private ConnectorResourceAnnotations annotations;
    /** The capabilities supported by the connector */
    private java.util.List<String> capabilities;
    /** Channels of the connector type. */
    private java.util.List<Channel> channels;
    /** Connector type is deprecated and removed from the catalog. */
    private Boolean deprecated;
    /** A description of the connector. */
    private String description;
    /** Ranking for featured connectors */
    private Integer featuredRank;
    /** URL to an icon of the connector. */
    private String iconHref;
    /** Labels used to categorize the connector */
    private java.util.List<String> labels;
    /** Name of the connector type. */
    private String name;
    /** A json schema that can be used to validate a ConnectorRequest connector field. */
    private ConnectorType_schema schema;
    /** Version of the connector type. */
    private String version;
    /**
     * Instantiates a new ConnectorType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorType
     */
    @javax.annotation.Nonnull
    public static ConnectorType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorType();
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
     * Gets the capabilities property value. The capabilities supported by the connector
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }
    /**
     * Gets the channels property value. Channels of the connector type.
     * @return a Channel
     */
    @javax.annotation.Nullable
    public java.util.List<Channel> getChannels() {
        return this.channels;
    }
    /**
     * Gets the deprecated property value. Connector type is deprecated and removed from the catalog.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeprecated() {
        return this.deprecated;
    }
    /**
     * Gets the description property value. A description of the connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the featured_rank property value. Ranking for featured connectors
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFeaturedRank() {
        return this.featuredRank;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("annotations", (n) -> { this.setAnnotations(n.getObjectValue(ConnectorResourceAnnotations::createFromDiscriminatorValue)); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfEnumValues(Channel.class)); });
        deserializerMap.put("deprecated", (n) -> { this.setDeprecated(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("featured_rank", (n) -> { this.setFeaturedRank(n.getIntegerValue()); });
        deserializerMap.put("icon_href", (n) -> { this.setIconHref(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(ConnectorType_schema::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the icon_href property value. URL to an icon of the connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIconHref() {
        return this.iconHref;
    }
    /**
     * Gets the labels property value. Labels used to categorize the connector
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. Name of the connector type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the schema property value. A json schema that can be used to validate a ConnectorRequest connector field.
     * @return a ConnectorType_schema
     */
    @javax.annotation.Nullable
    public ConnectorType_schema getSchema() {
        return this.schema;
    }
    /**
     * Gets the version property value. Version of the connector type.
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
        super.serialize(writer);
        writer.writeObjectValue("annotations", this.getAnnotations());
        writer.writeCollectionOfPrimitiveValues("capabilities", this.getCapabilities());
        writer.writeCollectionOfEnumValues("channels", this.getChannels());
        writer.writeBooleanValue("deprecated", this.getDeprecated());
        writer.writeStringValue("description", this.getDescription());
        writer.writeIntegerValue("featured_rank", this.getFeaturedRank());
        writer.writeStringValue("icon_href", this.getIconHref());
        writer.writeCollectionOfPrimitiveValues("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the capabilities property value. The capabilities supported by the connector
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final java.util.List<String> value) {
        this.capabilities = value;
    }
    /**
     * Sets the channels property value. Channels of the connector type.
     * @param value Value to set for the channels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannels(@javax.annotation.Nullable final java.util.List<Channel> value) {
        this.channels = value;
    }
    /**
     * Sets the deprecated property value. Connector type is deprecated and removed from the catalog.
     * @param value Value to set for the deprecated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeprecated(@javax.annotation.Nullable final Boolean value) {
        this.deprecated = value;
    }
    /**
     * Sets the description property value. A description of the connector.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the featured_rank property value. Ranking for featured connectors
     * @param value Value to set for the featuredRank property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeaturedRank(@javax.annotation.Nullable final Integer value) {
        this.featuredRank = value;
    }
    /**
     * Sets the icon_href property value. URL to an icon of the connector.
     * @param value Value to set for the iconHref property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIconHref(@javax.annotation.Nullable final String value) {
        this.iconHref = value;
    }
    /**
     * Sets the labels property value. Labels used to categorize the connector
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final java.util.List<String> value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Name of the connector type.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the schema property value. A json schema that can be used to validate a ConnectorRequest connector field.
     * @param value Value to set for the schema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchema(@javax.annotation.Nullable final ConnectorType_schema value) {
        this.schema = value;
    }
    /**
     * Sets the version property value. Version of the connector type.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
