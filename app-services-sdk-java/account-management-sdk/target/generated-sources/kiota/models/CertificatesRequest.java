package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CertificatesRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The arch property */
    private CertificatesRequest_arch arch;
    /** The type property */
    private CertificatesRequest_type type;
    /**
     * Instantiates a new CertificatesRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CertificatesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CertificatesRequest
     */
    @javax.annotation.Nonnull
    public static CertificatesRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificatesRequest();
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
     * Gets the arch property value. The arch property
     * @return a CertificatesRequest_arch
     */
    @javax.annotation.Nullable
    public CertificatesRequest_arch getArch() {
        return this.arch;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("arch", (n) -> { this.setArch(n.getEnumValue(CertificatesRequest_arch.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CertificatesRequest_type.class)); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. The type property
     * @return a CertificatesRequest_type
     */
    @javax.annotation.Nullable
    public CertificatesRequest_type getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("arch", this.getArch());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the arch property value. The arch property
     * @param value Value to set for the arch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArch(@javax.annotation.Nullable final CertificatesRequest_arch value) {
        this.arch = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final CertificatesRequest_type value) {
        this.type = value;
    }
}
