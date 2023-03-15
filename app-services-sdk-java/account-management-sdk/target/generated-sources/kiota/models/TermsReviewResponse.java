package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TermsReviewResponse implements AdditionalDataHolder, Parsable {
    /** The account_id property */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The organization_id property */
    private String organizationId;
    /** The redirect_url property */
    private String redirectUrl;
    /** The terms_available property */
    private Boolean termsAvailable;
    /** The terms_required property */
    private Boolean termsRequired;
    /**
     * Instantiates a new TermsReviewResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TermsReviewResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TermsReviewResponse
     */
    @javax.annotation.Nonnull
    public static TermsReviewResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsReviewResponse();
    }
    /**
     * Gets the account_id property value. The account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("redirect_url", (n) -> { this.setRedirectUrl(n.getStringValue()); });
        deserializerMap.put("terms_available", (n) -> { this.setTermsAvailable(n.getBooleanValue()); });
        deserializerMap.put("terms_required", (n) -> { this.setTermsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the organization_id property value. The organization_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the redirect_url property value. The redirect_url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectUrl() {
        return this.redirectUrl;
    }
    /**
     * Gets the terms_available property value. The terms_available property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTermsAvailable() {
        return this.termsAvailable;
    }
    /**
     * Gets the terms_required property value. The terms_required property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTermsRequired() {
        return this.termsRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("redirect_url", this.getRedirectUrl());
        writer.writeBooleanValue("terms_available", this.getTermsAvailable());
        writer.writeBooleanValue("terms_required", this.getTermsRequired());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. The account_id property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
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
     * Sets the organization_id property value. The organization_id property
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the redirect_url property value. The redirect_url property
     * @param value Value to set for the redirectUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectUrl(@javax.annotation.Nullable final String value) {
        this.redirectUrl = value;
    }
    /**
     * Sets the terms_available property value. The terms_available property
     * @param value Value to set for the termsAvailable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsAvailable(@javax.annotation.Nullable final Boolean value) {
        this.termsAvailable = value;
    }
    /**
     * Sets the terms_required property value. The terms_required property
     * @param value Value to set for the termsRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsRequired(@javax.annotation.Nullable final Boolean value) {
        this.termsRequired = value;
    }
}
