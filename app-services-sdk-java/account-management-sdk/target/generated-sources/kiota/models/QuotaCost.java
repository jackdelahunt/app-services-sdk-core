package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class QuotaCost extends ObjectReference implements Parsable {
    /** The allowed property */
    private Integer allowed;
    /** The cloud_accounts property */
    private java.util.List<CloudAccount> cloudAccounts;
    /** The consumed property */
    private Integer consumed;
    /** The organization_id property */
    private String organizationId;
    /** The quota_id property */
    private String quotaId;
    /** The related_resources property */
    private java.util.List<RelatedResource> relatedResources;
    /** The version property */
    private String version;
    /**
     * Instantiates a new QuotaCost and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public QuotaCost() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a QuotaCost
     */
    @javax.annotation.Nonnull
    public static QuotaCost createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QuotaCost();
    }
    /**
     * Gets the allowed property value. The allowed property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAllowed() {
        return this.allowed;
    }
    /**
     * Gets the cloud_accounts property value. The cloud_accounts property
     * @return a CloudAccount
     */
    @javax.annotation.Nullable
    public java.util.List<CloudAccount> getCloudAccounts() {
        return this.cloudAccounts;
    }
    /**
     * Gets the consumed property value. The consumed property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConsumed() {
        return this.consumed;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowed", (n) -> { this.setAllowed(n.getIntegerValue()); });
        deserializerMap.put("cloud_accounts", (n) -> { this.setCloudAccounts(n.getCollectionOfObjectValues(CloudAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("consumed", (n) -> { this.setConsumed(n.getIntegerValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("quota_id", (n) -> { this.setQuotaId(n.getStringValue()); });
        deserializerMap.put("related_resources", (n) -> { this.setRelatedResources(n.getCollectionOfObjectValues(RelatedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
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
     * Gets the quota_id property value. The quota_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuotaId() {
        return this.quotaId;
    }
    /**
     * Gets the related_resources property value. The related_resources property
     * @return a RelatedResource
     */
    @javax.annotation.Nullable
    public java.util.List<RelatedResource> getRelatedResources() {
        return this.relatedResources;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeIntegerValue("allowed", this.getAllowed());
        writer.writeCollectionOfObjectValues("cloud_accounts", this.getCloudAccounts());
        writer.writeIntegerValue("consumed", this.getConsumed());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("quota_id", this.getQuotaId());
        writer.writeCollectionOfObjectValues("related_resources", this.getRelatedResources());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the allowed property value. The allowed property
     * @param value Value to set for the allowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowed(@javax.annotation.Nullable final Integer value) {
        this.allowed = value;
    }
    /**
     * Sets the cloud_accounts property value. The cloud_accounts property
     * @param value Value to set for the cloudAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAccounts(@javax.annotation.Nullable final java.util.List<CloudAccount> value) {
        this.cloudAccounts = value;
    }
    /**
     * Sets the consumed property value. The consumed property
     * @param value Value to set for the consumed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsumed(@javax.annotation.Nullable final Integer value) {
        this.consumed = value;
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
     * Sets the quota_id property value. The quota_id property
     * @param value Value to set for the quotaId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuotaId(@javax.annotation.Nullable final String value) {
        this.quotaId = value;
    }
    /**
     * Sets the related_resources property value. The related_resources property
     * @param value Value to set for the relatedResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelatedResources(@javax.annotation.Nullable final java.util.List<RelatedResource> value) {
        this.relatedResources = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
