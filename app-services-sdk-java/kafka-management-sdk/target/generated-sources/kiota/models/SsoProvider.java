package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * SSO Provider
 */
public class SsoProvider extends VersionMetadata_collections implements Parsable {
    /** base url */
    private String baseUrl;
    /** The jwks property */
    private String jwks;
    /** name of the sso provider */
    private String name;
    /** The token_url property */
    private String tokenUrl;
    /** The valid_issuer property */
    private String validIssuer;
    /**
     * Instantiates a new SsoProvider and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SsoProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SsoProvider
     */
    @javax.annotation.Nonnull
    public static SsoProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SsoProvider();
    }
    /**
     * Gets the base_url property value. base url
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBaseUrl() {
        return this.baseUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("base_url", (n) -> { this.setBaseUrl(n.getStringValue()); });
        deserializerMap.put("jwks", (n) -> { this.setJwks(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("token_url", (n) -> { this.setTokenUrl(n.getStringValue()); });
        deserializerMap.put("valid_issuer", (n) -> { this.setValidIssuer(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jwks property value. The jwks property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJwks() {
        return this.jwks;
    }
    /**
     * Gets the name property value. name of the sso provider
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the token_url property value. The token_url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenUrl() {
        return this.tokenUrl;
    }
    /**
     * Gets the valid_issuer property value. The valid_issuer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValidIssuer() {
        return this.validIssuer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("base_url", this.getBaseUrl());
        writer.writeStringValue("jwks", this.getJwks());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("token_url", this.getTokenUrl());
        writer.writeStringValue("valid_issuer", this.getValidIssuer());
    }
    /**
     * Sets the base_url property value. base url
     * @param value Value to set for the baseUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBaseUrl(@javax.annotation.Nullable final String value) {
        this.baseUrl = value;
    }
    /**
     * Sets the jwks property value. The jwks property
     * @param value Value to set for the jwks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJwks(@javax.annotation.Nullable final String value) {
        this.jwks = value;
    }
    /**
     * Sets the name property value. name of the sso provider
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the token_url property value. The token_url property
     * @param value Value to set for the tokenUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenUrl(@javax.annotation.Nullable final String value) {
        this.tokenUrl = value;
    }
    /**
     * Sets the valid_issuer property value. The valid_issuer property
     * @param value Value to set for the validIssuer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidIssuer(@javax.annotation.Nullable final String value) {
        this.validIssuer = value;
    }
}
