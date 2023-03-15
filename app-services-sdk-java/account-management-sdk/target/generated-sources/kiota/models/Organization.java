package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Organization extends ObjectReference implements Parsable {
    /** The capabilities property */
    private java.util.List<Capability> capabilities;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The ebs_account_id property */
    private String ebsAccountId;
    /** The external_id property */
    private String externalId;
    /** The labels property */
    private java.util.List<Label> labels;
    /** The name property */
    private String name;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new Organization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Organization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Organization
     */
    @javax.annotation.Nonnull
    public static Organization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Organization();
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a Capability
     */
    @javax.annotation.Nullable
    public java.util.List<Capability> getCapabilities() {
        return this.capabilities;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the ebs_account_id property value. The ebs_account_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEbsAccountId() {
        return this.ebsAccountId;
    }
    /**
     * Gets the external_id property value. The external_id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getCollectionOfObjectValues(Capability::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ebs_account_id", (n) -> { this.setEbsAccountId(n.getStringValue()); });
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfObjectValues(Label::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a Label
     */
    @javax.annotation.Nullable
    public java.util.List<Label> getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
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
        writer.writeCollectionOfObjectValues("capabilities", this.getCapabilities());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("ebs_account_id", this.getEbsAccountId());
        writer.writeStringValue("external_id", this.getExternalId());
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final java.util.List<Capability> value) {
        this.capabilities = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the ebs_account_id property value. The ebs_account_id property
     * @param value Value to set for the ebsAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEbsAccountId(@javax.annotation.Nullable final String value) {
        this.ebsAccountId = value;
    }
    /**
     * Sets the external_id property value. The external_id property
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final java.util.List<Label> value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedAt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
