package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SelfServiceLandingPageSchema implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The configTryLearn property */
    private SelfServiceLandingPageSchema_configTryLearn configTryLearn;
    /** The estate property */
    private SelfServiceLandingPageSchema_estate estate;
    /**
     * Instantiates a new SelfServiceLandingPageSchema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SelfServiceLandingPageSchema() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SelfServiceLandingPageSchema
     */
    @javax.annotation.Nonnull
    public static SelfServiceLandingPageSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfServiceLandingPageSchema();
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
     * Gets the configTryLearn property value. The configTryLearn property
     * @return a SelfServiceLandingPageSchema_configTryLearn
     */
    @javax.annotation.Nullable
    public SelfServiceLandingPageSchema_configTryLearn getConfigTryLearn() {
        return this.configTryLearn;
    }
    /**
     * Gets the estate property value. The estate property
     * @return a SelfServiceLandingPageSchema_estate
     */
    @javax.annotation.Nullable
    public SelfServiceLandingPageSchema_estate getEstate() {
        return this.estate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("configTryLearn", (n) -> { this.setConfigTryLearn(n.getObjectValue(SelfServiceLandingPageSchema_configTryLearn::createFromDiscriminatorValue)); });
        deserializerMap.put("estate", (n) -> { this.setEstate(n.getObjectValue(SelfServiceLandingPageSchema_estate::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("configTryLearn", this.getConfigTryLearn());
        writer.writeObjectValue("estate", this.getEstate());
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
     * Sets the configTryLearn property value. The configTryLearn property
     * @param value Value to set for the configTryLearn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigTryLearn(@javax.annotation.Nullable final SelfServiceLandingPageSchema_configTryLearn value) {
        this.configTryLearn = value;
    }
    /**
     * Sets the estate property value. The estate property
     * @param value Value to set for the estate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEstate(@javax.annotation.Nullable final SelfServiceLandingPageSchema_estate value) {
        this.estate = value;
    }
}
