package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SelfServiceLandingPageSchema_configTryLearn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The configure property */
    private java.util.List<LandingPageCTLItem> configure;
    /** The try property */
    private java.util.List<LandingPageCTLItem> tryEscaped;
    /**
     * Instantiates a new SelfServiceLandingPageSchema_configTryLearn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SelfServiceLandingPageSchema_configTryLearn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SelfServiceLandingPageSchema_configTryLearn
     */
    @javax.annotation.Nonnull
    public static SelfServiceLandingPageSchema_configTryLearn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfServiceLandingPageSchema_configTryLearn();
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
     * Gets the configure property value. The configure property
     * @return a LandingPageCTLItem
     */
    @javax.annotation.Nullable
    public java.util.List<LandingPageCTLItem> getConfigure() {
        return this.configure;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("configure", (n) -> { this.setConfigure(n.getCollectionOfObjectValues(LandingPageCTLItem::createFromDiscriminatorValue)); });
        deserializerMap.put("try", (n) -> { this.setTry(n.getCollectionOfObjectValues(LandingPageCTLItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the try property value. The try property
     * @return a LandingPageCTLItem
     */
    @javax.annotation.Nullable
    public java.util.List<LandingPageCTLItem> getTry() {
        return this.tryEscaped;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("configure", this.getConfigure());
        writer.writeCollectionOfObjectValues("try", this.getTry());
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
     * Sets the configure property value. The configure property
     * @param value Value to set for the configure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigure(@javax.annotation.Nullable final java.util.List<LandingPageCTLItem> value) {
        this.configure = value;
    }
    /**
     * Sets the try property value. The try property
     * @param value Value to set for the try property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTry(@javax.annotation.Nullable final java.util.List<LandingPageCTLItem> value) {
        this.tryEscaped = value;
    }
}
