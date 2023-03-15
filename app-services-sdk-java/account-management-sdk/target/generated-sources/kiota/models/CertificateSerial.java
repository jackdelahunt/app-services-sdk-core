package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CertificateSerial implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The created property */
    private OffsetDateTime created;
    /** The expiration property */
    private OffsetDateTime expiration;
    /** The id property */
    private Long id;
    /** The serial property */
    private Long serial;
    /** The updated property */
    private OffsetDateTime updated;
    /**
     * Instantiates a new CertificateSerial and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CertificateSerial() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CertificateSerial
     */
    @javax.annotation.Nonnull
    public static CertificateSerial createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateSerial();
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
     * Gets the created property value. The created property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreated() {
        return this.created;
    }
    /**
     * Gets the expiration property value. The expiration property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiration() {
        return this.expiration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("created", (n) -> { this.setCreated(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expiration", (n) -> { this.setExpiration(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("serial", (n) -> { this.setSerial(n.getLongValue()); });
        deserializerMap.put("updated", (n) -> { this.setUpdated(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the serial property value. The serial property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSerial() {
        return this.serial;
    }
    /**
     * Gets the updated property value. The updated property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdated() {
        return this.updated;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created", this.getCreated());
        writer.writeOffsetDateTimeValue("expiration", this.getExpiration());
        writer.writeLongValue("id", this.getId());
        writer.writeLongValue("serial", this.getSerial());
        writer.writeOffsetDateTimeValue("updated", this.getUpdated());
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
     * Sets the created property value. The created property
     * @param value Value to set for the created property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreated(@javax.annotation.Nullable final OffsetDateTime value) {
        this.created = value;
    }
    /**
     * Sets the expiration property value. The expiration property
     * @param value Value to set for the expiration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiration(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expiration = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the serial property value. The serial property
     * @param value Value to set for the serial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerial(@javax.annotation.Nullable final Long value) {
        this.serial = value;
    }
    /**
     * Sets the updated property value. The updated property
     * @param value Value to set for the updated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdated(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updated = value;
    }
}
