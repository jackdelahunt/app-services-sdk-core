package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceAccount implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The client_id property */
    private String clientId;
    /** The client_secret property */
    private String clientSecret;
    /**
     * Instantiates a new ServiceAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceAccount
     */
    @javax.annotation.Nonnull
    public static ServiceAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceAccount();
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
     * Gets the client_id property value. The client_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Gets the client_secret property value. The client_secret property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("client_id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("client_secret", (n) -> { this.setClientSecret(n.getStringValue()); });
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
        writer.writeStringValue("client_id", this.getClientId());
        writer.writeStringValue("client_secret", this.getClientSecret());
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
     * Sets the client_id property value. The client_id property
     * @param value Value to set for the clientId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientId(@javax.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the client_secret property value. The client_secret property
     * @param value Value to set for the clientSecret property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientSecret(@javax.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
}
