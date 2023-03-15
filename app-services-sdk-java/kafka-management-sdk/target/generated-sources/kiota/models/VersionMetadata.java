package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VersionMetadata extends ObjectReference implements Parsable {
    /** The collections property */
    private java.util.List<VersionMetadata_collections> collections;
    /** The server_version property */
    private String serverVersion;
    /**
     * Instantiates a new VersionMetadata and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionMetadata() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VersionMetadata
     */
    @javax.annotation.Nonnull
    public static VersionMetadata createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VersionMetadata();
    }
    /**
     * Gets the collections property value. The collections property
     * @return a VersionMetadata_collections
     */
    @javax.annotation.Nullable
    public java.util.List<VersionMetadata_collections> getCollections() {
        return this.collections;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("collections", (n) -> { this.setCollections(n.getCollectionOfObjectValues(VersionMetadata_collections::createFromDiscriminatorValue)); });
        deserializerMap.put("server_version", (n) -> { this.setServerVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the server_version property value. The server_version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerVersion() {
        return this.serverVersion;
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
        writer.writeCollectionOfObjectValues("collections", this.getCollections());
        writer.writeStringValue("server_version", this.getServerVersion());
    }
    /**
     * Sets the collections property value. The collections property
     * @param value Value to set for the collections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollections(@javax.annotation.Nullable final java.util.List<VersionMetadata_collections> value) {
        this.collections = value;
    }
    /**
     * Sets the server_version property value. The server_version property
     * @param value Value to set for the serverVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerVersion(@javax.annotation.Nullable final String value) {
        this.serverVersion = value;
    }
}
