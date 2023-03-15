package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Error extends ApiException implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Code of the error */
    private String code;
    /** The absolute path of the resource */
    private String href;
    /** The unique and immutable identifier of the resource */
    private String id;
    /** The kind of the resource */
    private String kind;
    /** Relatively unique operation ID of the request associated to the error */
    private String operationId;
    /** Human-readable description of the error. Intended for human consumption */
    private String reason;
    /**
     * Instantiates a new Error and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Error() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Error
     */
    @javax.annotation.Nonnull
    public static Error createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Error();
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
     * Gets the code property value. Code of the error
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("operation_id", (n) -> { this.setOperationId(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The absolute path of the resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the id property value. The unique and immutable identifier of the resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the kind property value. The kind of the resource
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets the operation_id property value. Relatively unique operation ID of the request associated to the error
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperationId() {
        return this.operationId;
    }
    /**
     * Gets the reason property value. Human-readable description of the error. Intended for human consumption
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("href", this.getHref());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("kind", this.getKind());
        writer.writeStringValue("operation_id", this.getOperationId());
        writer.writeStringValue("reason", this.getReason());
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
     * Sets the code property value. Code of the error
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the href property value. The absolute path of the resource
     * @param value Value to set for the href property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHref(@javax.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the id property value. The unique and immutable identifier of the resource
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the kind property value. The kind of the resource
     * @param value Value to set for the kind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKind(@javax.annotation.Nullable final String value) {
        this.kind = value;
    }
    /**
     * Sets the operation_id property value. Relatively unique operation ID of the request associated to the error
     * @param value Value to set for the operationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationId(@javax.annotation.Nullable final String value) {
        this.operationId = value;
    }
    /**
     * Sets the reason property value. Human-readable description of the error. Intended for human consumption
     * @param value Value to set for the reason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReason(@javax.annotation.Nullable final String value) {
        this.reason = value;
    }
}
