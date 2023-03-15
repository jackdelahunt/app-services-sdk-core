package com.openshift.cloud.api.smartevents.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProcessorListResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The items property */
    private java.util.List<ProcessorResponse> items;
    /** The kind property */
    private String kind;
    /** The page property */
    private Long page;
    /** The size property */
    private Long size;
    /** The total property */
    private Long total;
    /**
     * Instantiates a new ProcessorListResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProcessorListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProcessorListResponse
     */
    @javax.annotation.Nonnull
    public static ProcessorListResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessorListResponse();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ProcessorResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("page", (n) -> { this.setPage(n.getLongValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. The items property
     * @return a ProcessorResponse
     */
    @javax.annotation.Nullable
    public java.util.List<ProcessorResponse> getItems() {
        return this.items;
    }
    /**
     * Gets the kind property value. The kind property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets the page property value. The page property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPage() {
        return this.page;
    }
    /**
     * Gets the size property value. The size property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the total property value. The total property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("kind", this.getKind());
        writer.writeLongValue("page", this.getPage());
        writer.writeLongValue("size", this.getSize());
        writer.writeLongValue("total", this.getTotal());
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
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<ProcessorResponse> value) {
        this.items = value;
    }
    /**
     * Sets the kind property value. The kind property
     * @param value Value to set for the kind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKind(@javax.annotation.Nullable final String value) {
        this.kind = value;
    }
    /**
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPage(@javax.annotation.Nullable final Long value) {
        this.page = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotal(@javax.annotation.Nullable final Long value) {
        this.total = value;
    }
}
