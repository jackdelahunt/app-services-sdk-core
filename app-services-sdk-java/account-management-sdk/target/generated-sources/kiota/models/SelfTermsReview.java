package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SelfTermsReview implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The check_optional_terms property */
    private Boolean checkOptionalTerms;
    /** The event_code property */
    private String eventCode;
    /** The site_code property */
    private String siteCode;
    /**
     * Instantiates a new SelfTermsReview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SelfTermsReview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SelfTermsReview
     */
    @javax.annotation.Nonnull
    public static SelfTermsReview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfTermsReview();
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
     * Gets the check_optional_terms property value. The check_optional_terms property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCheckOptionalTerms() {
        return this.checkOptionalTerms;
    }
    /**
     * Gets the event_code property value. The event_code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventCode() {
        return this.eventCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("check_optional_terms", (n) -> { this.setCheckOptionalTerms(n.getBooleanValue()); });
        deserializerMap.put("event_code", (n) -> { this.setEventCode(n.getStringValue()); });
        deserializerMap.put("site_code", (n) -> { this.setSiteCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the site_code property value. The site_code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteCode() {
        return this.siteCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("check_optional_terms", this.getCheckOptionalTerms());
        writer.writeStringValue("event_code", this.getEventCode());
        writer.writeStringValue("site_code", this.getSiteCode());
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
     * Sets the check_optional_terms property value. The check_optional_terms property
     * @param value Value to set for the checkOptionalTerms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckOptionalTerms(@javax.annotation.Nullable final Boolean value) {
        this.checkOptionalTerms = value;
    }
    /**
     * Sets the event_code property value. The event_code property
     * @param value Value to set for the eventCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventCode(@javax.annotation.Nullable final String value) {
        this.eventCode = value;
    }
    /**
     * Sets the site_code property value. The site_code property
     * @param value Value to set for the siteCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteCode(@javax.annotation.Nullable final String value) {
        this.siteCode = value;
    }
}
