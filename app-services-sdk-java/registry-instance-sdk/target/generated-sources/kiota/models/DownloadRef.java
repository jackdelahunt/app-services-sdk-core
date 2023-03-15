package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Models a download "link".  Useful for browser use-cases.
 */
public class DownloadRef implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The downloadId property */
    private String downloadId;
    /** The href property */
    private String href;
    /**
     * Instantiates a new DownloadRef and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DownloadRef() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DownloadRef
     */
    @javax.annotation.Nonnull
    public static DownloadRef createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DownloadRef();
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
     * Gets the downloadId property value. The downloadId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDownloadId() {
        return this.downloadId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("downloadId", (n) -> { this.setDownloadId(n.getStringValue()); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The href property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("downloadId", this.getDownloadId());
        writer.writeStringValue("href", this.getHref());
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
     * Sets the downloadId property value. The downloadId property
     * @param value Value to set for the downloadId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDownloadId(@javax.annotation.Nullable final String value) {
        this.downloadId = value;
    }
    /**
     * Sets the href property value. The href property
     * @param value Value to set for the href property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHref(@javax.annotation.Nullable final String value) {
        this.href = value;
    }
}
