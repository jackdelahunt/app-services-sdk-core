package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes the response received when searching for artifacts.
 */
public class ArtifactSearchResults implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The artifacts returned in the result set. */
    private java.util.List<SearchedArtifact> artifacts;
    /** The total number of artifacts that matched the query that produced the result set (may be more than the number of artifacts in the result set). */
    private Integer count;
    /**
     * Instantiates a new ArtifactSearchResults and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ArtifactSearchResults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ArtifactSearchResults
     */
    @javax.annotation.Nonnull
    public static ArtifactSearchResults createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArtifactSearchResults();
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
     * Gets the artifacts property value. The artifacts returned in the result set.
     * @return a SearchedArtifact
     */
    @javax.annotation.Nullable
    public java.util.List<SearchedArtifact> getArtifacts() {
        return this.artifacts;
    }
    /**
     * Gets the count property value. The total number of artifacts that matched the query that produced the result set (may be more than the number of artifacts in the result set).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("artifacts", (n) -> { this.setArtifacts(n.getCollectionOfObjectValues(SearchedArtifact::createFromDiscriminatorValue)); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("artifacts", this.getArtifacts());
        writer.writeIntegerValue("count", this.getCount());
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
     * Sets the artifacts property value. The artifacts returned in the result set.
     * @param value Value to set for the artifacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArtifacts(@javax.annotation.Nullable final java.util.List<SearchedArtifact> value) {
        this.artifacts = value;
    }
    /**
     * Sets the count property value. The total number of artifacts that matched the query that produced the result set (may be more than the number of artifacts in the result set).
     * @param value Value to set for the count property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this.count = value;
    }
}
