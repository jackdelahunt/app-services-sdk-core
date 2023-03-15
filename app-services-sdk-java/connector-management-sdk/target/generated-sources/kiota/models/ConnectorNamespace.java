package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A connector namespace
 */
public class ConnectorNamespace extends VersionMetadata_collections implements Parsable {
    /** The cluster_id property */
    private String clusterId;
    /** Namespace expiration timestamp in RFC 3339 format */
    private String expiration;
    /** The name property */
    private String name;
    /** The status property */
    private ConnectorNamespaceStatus status;
    /** The tenant property */
    private ConnectorNamespaceTenant tenant;
    /**
     * Instantiates a new ConnectorNamespace and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorNamespace() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorNamespace
     */
    @javax.annotation.Nonnull
    public static ConnectorNamespace createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorNamespace();
    }
    /**
     * Gets the cluster_id property value. The cluster_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * Gets the expiration property value. Namespace expiration timestamp in RFC 3339 format
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpiration() {
        return this.expiration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cluster_id", (n) -> { this.setClusterId(n.getStringValue()); });
        deserializerMap.put("expiration", (n) -> { this.setExpiration(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(ConnectorNamespaceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("tenant", (n) -> { this.setTenant(n.getObjectValue(ConnectorNamespaceTenant::createFromDiscriminatorValue)); });
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
     * Gets the status property value. The status property
     * @return a ConnectorNamespaceStatus
     */
    @javax.annotation.Nullable
    public ConnectorNamespaceStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tenant property value. The tenant property
     * @return a ConnectorNamespaceTenant
     */
    @javax.annotation.Nullable
    public ConnectorNamespaceTenant getTenant() {
        return this.tenant;
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
        writer.writeStringValue("cluster_id", this.getClusterId());
        writer.writeStringValue("expiration", this.getExpiration());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeObjectValue("tenant", this.getTenant());
    }
    /**
     * Sets the cluster_id property value. The cluster_id property
     * @param value Value to set for the clusterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterId(@javax.annotation.Nullable final String value) {
        this.clusterId = value;
    }
    /**
     * Sets the expiration property value. Namespace expiration timestamp in RFC 3339 format
     * @param value Value to set for the expiration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiration(@javax.annotation.Nullable final String value) {
        this.expiration = value;
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
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ConnectorNamespaceStatus value) {
        this.status = value;
    }
    /**
     * Sets the tenant property value. The tenant property
     * @param value Value to set for the tenant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenant(@javax.annotation.Nullable final ConnectorNamespaceTenant value) {
        this.tenant = value;
    }
}
