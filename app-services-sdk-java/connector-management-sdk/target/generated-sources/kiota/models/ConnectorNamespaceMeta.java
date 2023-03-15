package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorNamespaceMeta extends ObjectMeta implements Parsable {
    /** The quota property */
    private ConnectorNamespaceQuota quota;
    /** The resource_version property */
    private Long resourceVersion;
    /**
     * Instantiates a new ConnectorNamespaceMeta and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorNamespaceMeta() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorNamespaceMeta
     */
    @javax.annotation.Nonnull
    public static ConnectorNamespaceMeta createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorNamespaceMeta();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("quota", (n) -> { this.setQuota(n.getObjectValue(ConnectorNamespaceQuota::createFromDiscriminatorValue)); });
        deserializerMap.put("resource_version", (n) -> { this.setResourceVersion(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the quota property value. The quota property
     * @return a ConnectorNamespaceQuota
     */
    @javax.annotation.Nullable
    public ConnectorNamespaceQuota getQuota() {
        return this.quota;
    }
    /**
     * Gets the resource_version property value. The resource_version property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getResourceVersion() {
        return this.resourceVersion;
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
        writer.writeObjectValue("quota", this.getQuota());
        writer.writeLongValue("resource_version", this.getResourceVersion());
    }
    /**
     * Sets the quota property value. The quota property
     * @param value Value to set for the quota property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuota(@javax.annotation.Nullable final ConnectorNamespaceQuota value) {
        this.quota = value;
    }
    /**
     * Sets the resource_version property value. The resource_version property
     * @param value Value to set for the resourceVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceVersion(@javax.annotation.Nullable final Long value) {
        this.resourceVersion = value;
    }
}
