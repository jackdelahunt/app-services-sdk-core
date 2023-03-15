package com.openshift.cloud.api.kas.auth.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * General error response
 */
public class Error extends ApiException implements Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The class property */
    private String classEscaped;
    /** The code property */
    private Integer code;
    /** Detail specific to an error occurrence. May be different depending on the condition(s) that trigger the error. */
    private String detail;
    /** The error_message property */
    private String errorMessage;
    /** Link path to request the object. Not supported for all object kinds. */
    private String href;
    /** Unique identifier for the object. Not supported for all object kinds. */
    private String id;
    /** The kind property */
    private String kind;
    /** General reason for the error. Does not change between specific occurrences. */
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
     * Gets the class property value. The class property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassEscaped() {
        return this.classEscaped;
    }
    /**
     * Gets the code property value. The code property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCode() {
        return this.code;
    }
    /**
     * Gets the detail property value. Detail specific to an error occurrence. May be different depending on the condition(s) that trigger the error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetail() {
        return this.detail;
    }
    /**
     * Gets the error_message property value. The error_message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("class", (n) -> { this.setClass(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getIntegerValue()); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getStringValue()); });
        deserializerMap.put("error_message", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. Link path to request the object. Not supported for all object kinds.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the id property value. Unique identifier for the object. Not supported for all object kinds.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the reason property value. General reason for the error. Does not change between specific occurrences.
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
        writer.writeStringValue("class", this.getClassEscaped());
        writer.writeIntegerValue("code", this.getCode());
        writer.writeStringValue("detail", this.getDetail());
        writer.writeStringValue("error_message", this.getErrorMessage());
        writer.writeStringValue("href", this.getHref());
        writer.writeStringValue("id", this.getId());
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
     * Sets the class property value. The class property
     * @param value Value to set for the class property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClass(@javax.annotation.Nullable final String value) {
        this.classEscaped = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final Integer value) {
        this.code = value;
    }
    /**
     * Sets the detail property value. Detail specific to an error occurrence. May be different depending on the condition(s) that trigger the error.
     * @param value Value to set for the detail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetail(@javax.annotation.Nullable final String value) {
        this.detail = value;
    }
    /**
     * Sets the error_message property value. The error_message property
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the href property value. Link path to request the object. Not supported for all object kinds.
     * @param value Value to set for the href property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHref(@javax.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the id property value. Unique identifier for the object. Not supported for all object kinds.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
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
     * Sets the reason property value. General reason for the error. Does not change between specific occurrences.
     * @param value Value to set for the reason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReason(@javax.annotation.Nullable final String value) {
        this.reason = value;
    }
}
