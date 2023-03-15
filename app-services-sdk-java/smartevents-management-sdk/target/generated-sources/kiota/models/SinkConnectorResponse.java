package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SinkConnectorResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The Connector configuration payload */
    private SinkConnectorResponse_connector connector;
    /** The connector type */
    private String connectorTypeId;
    /** The URL of this resource, without the protocol */
    private String href;
    /** The unique identifier of this resource */
    private String id;
    /** The kind (type) of this resource */
    private String kind;
    /** The modified_at property */
    private OffsetDateTime modifiedAt;
    /** The name of this resource */
    private String name;
    /** The user that owns this resource */
    private String owner;
    /** The published_at property */
    private OffsetDateTime publishedAt;
    /** The status property */
    private SinkConnectorResponse_status status;
    /** A detailed status message in case there is a problem with the connector */
    private String statusMessage;
    /** The submitted_at property */
    private OffsetDateTime submittedAt;
    /** The URI to be used in Camel DSL to send data to this sink */
    private String uriDsl;
    /**
     * Instantiates a new SinkConnectorResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SinkConnectorResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SinkConnectorResponse
     */
    @javax.annotation.Nonnull
    public static SinkConnectorResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SinkConnectorResponse();
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
     * @return a SinkConnectorResponse_connector
     */
    @javax.annotation.Nullable
    public SinkConnectorResponse_connector getConnector() {
        return this.connector;
    }
    /**
     * Gets the connector_type_id property value. The connector type
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("connector", (n) -> { this.setConnector(n.getObjectValue(SinkConnectorResponse_connector::createFromDiscriminatorValue)); });
        deserializerMap.put("connector_type_id", (n) -> { this.setConnectorTypeId(n.getStringValue()); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("modified_at", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("published_at", (n) -> { this.setPublishedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SinkConnectorResponse_status.class)); });
        deserializerMap.put("status_message", (n) -> { this.setStatusMessage(n.getStringValue()); });
        deserializerMap.put("submitted_at", (n) -> { this.setSubmittedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("uri_dsl", (n) -> { this.setUriDsl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URL of this resource, without the protocol
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the id property value. The unique identifier of this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the kind property value. The kind (type) of this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets the modified_at property value. The modified_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The name of this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the owner property value. The user that owns this resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the published_at property value. The published_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedAt() {
        return this.publishedAt;
    }
    /**
     * Gets the status property value. The status property
     * @return a SinkConnectorResponse_status
     */
    @javax.annotation.Nullable
    public SinkConnectorResponse_status getStatus() {
        return this.status;
    }
    /**
     * Gets the status_message property value. A detailed status message in case there is a problem with the connector
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Gets the submitted_at property value. The submitted_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSubmittedAt() {
        return this.submittedAt;
    }
    /**
     * Gets the uri_dsl property value. The URI to be used in Camel DSL to send data to this sink
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUriDsl() {
        return this.uriDsl;
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
        writer.writeStringValue("href", this.getHref());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("kind", this.getKind());
        writer.writeOffsetDateTimeValue("modified_at", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeOffsetDateTimeValue("published_at", this.getPublishedAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("status_message", this.getStatusMessage());
        writer.writeOffsetDateTimeValue("submitted_at", this.getSubmittedAt());
        writer.writeStringValue("uri_dsl", this.getUriDsl());
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
    public void setConnector(@javax.annotation.Nullable final SinkConnectorResponse_connector value) {
        this.connector = value;
    }
    /**
     * Sets the connector_type_id property value. The connector type
     * @param value Value to set for the connectorTypeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorTypeId(@javax.annotation.Nullable final String value) {
        this.connectorTypeId = value;
    }
    /**
     * Sets the href property value. The URL of this resource, without the protocol
     * @param value Value to set for the href property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHref(@javax.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the id property value. The unique identifier of this resource
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the kind property value. The kind (type) of this resource
     * @param value Value to set for the kind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKind(@javax.annotation.Nullable final String value) {
        this.kind = value;
    }
    /**
     * Sets the modified_at property value. The modified_at property
     * @param value Value to set for the modifiedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The name of this resource
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the owner property value. The user that owns this resource
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the published_at property value. The published_at property
     * @param value Value to set for the publishedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.publishedAt = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SinkConnectorResponse_status value) {
        this.status = value;
    }
    /**
     * Sets the status_message property value. A detailed status message in case there is a problem with the connector
     * @param value Value to set for the statusMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusMessage(@javax.annotation.Nullable final String value) {
        this.statusMessage = value;
    }
    /**
     * Sets the submitted_at property value. The submitted_at property
     * @param value Value to set for the submittedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubmittedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.submittedAt = value;
    }
    /**
     * Sets the uri_dsl property value. The URI to be used in Camel DSL to send data to this sink
     * @param value Value to set for the uriDsl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUriDsl(@javax.annotation.Nullable final String value) {
        this.uriDsl = value;
    }
}
