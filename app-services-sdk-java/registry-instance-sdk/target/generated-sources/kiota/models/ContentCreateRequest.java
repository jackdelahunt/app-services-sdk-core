package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentCreateRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Raw content of the artifact or a valid (and accessible) URL where the content can be found. */
    private String content;
    /** Collection of references to other artifacts. */
    private java.util.List<ArtifactReference> references;
    /**
     * Instantiates a new ContentCreateRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContentCreateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContentCreateRequest
     */
    @javax.annotation.Nonnull
    public static ContentCreateRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentCreateRequest();
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
     * Gets the content property value. Raw content of the artifact or a valid (and accessible) URL where the content can be found.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getCollectionOfObjectValues(ArtifactReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the references property value. Collection of references to other artifacts.
     * @return a ArtifactReference
     */
    @javax.annotation.Nullable
    public java.util.List<ArtifactReference> getReferences() {
        return this.references;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("references", this.getReferences());
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
     * Sets the content property value. Raw content of the artifact or a valid (and accessible) URL where the content can be found.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the references property value. Collection of references to other artifacts.
     * @param value Value to set for the references property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferences(@javax.annotation.Nullable final java.util.List<ArtifactReference> value) {
        this.references = value;
    }
}
