package com.openshift.cloud.api.serviceaccounts.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ValidationExceptionData extends ApiException implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The error property */
    private String error;
    /** The error_description property */
    private String errorDescription;
    /** The fields property */
    private ValidationExceptionData_fields fields;
    /**
     * Instantiates a new ValidationExceptionData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ValidationExceptionData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ValidationExceptionData
     */
    @javax.annotation.Nonnull
    public static ValidationExceptionData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidationExceptionData();
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
     * Gets the error property value. The error property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * Gets the error_description property value. The error_description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDescription() {
        return this.errorDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("error_description", (n) -> { this.setErrorDescription(n.getStringValue()); });
        deserializerMap.put("fields", (n) -> { this.setFields(n.getObjectValue(ValidationExceptionData_fields::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. The fields property
     * @return a ValidationExceptionData_fields
     */
    @javax.annotation.Nullable
    public ValidationExceptionData_fields getFields() {
        return this.fields;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeStringValue("error_description", this.getErrorDescription());
        writer.writeObjectValue("fields", this.getFields());
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
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the error_description property value. The error_description property
     * @param value Value to set for the errorDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDescription(@javax.annotation.Nullable final String value) {
        this.errorDescription = value;
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final ValidationExceptionData_fields value) {
        this.fields = value;
    }
}
