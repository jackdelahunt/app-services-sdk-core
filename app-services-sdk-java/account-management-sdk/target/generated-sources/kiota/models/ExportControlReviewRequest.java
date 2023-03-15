package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExportControlReviewRequest implements AdditionalDataHolder, Parsable {
    /** The account_username property */
    private String accountUsername;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The ignore_cache property */
    private Boolean ignoreCache;
    /**
     * Instantiates a new ExportControlReviewRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExportControlReviewRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExportControlReviewRequest
     */
    @javax.annotation.Nonnull
    public static ExportControlReviewRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportControlReviewRequest();
    }
    /**
     * Gets the account_username property value. The account_username property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountUsername() {
        return this.accountUsername;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("account_username", (n) -> { this.setAccountUsername(n.getStringValue()); });
        deserializerMap.put("ignore_cache", (n) -> { this.setIgnoreCache(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignore_cache property value. The ignore_cache property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreCache() {
        return this.ignoreCache;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_username", this.getAccountUsername());
        writer.writeBooleanValue("ignore_cache", this.getIgnoreCache());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_username property value. The account_username property
     * @param value Value to set for the accountUsername property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountUsername(@javax.annotation.Nullable final String value) {
        this.accountUsername = value;
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
     * Sets the ignore_cache property value. The ignore_cache property
     * @param value Value to set for the ignoreCache property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIgnoreCache(@javax.annotation.Nullable final Boolean value) {
        this.ignoreCache = value;
    }
}
