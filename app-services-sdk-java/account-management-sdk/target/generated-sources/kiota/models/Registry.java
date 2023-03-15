package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Registry extends ObjectReference implements Parsable {
    /** The cloudAlias property */
    private Boolean cloudAlias;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The name property */
    private String name;
    /** The org_name property */
    private String orgName;
    /** The team_name property */
    private String teamName;
    /** The type property */
    private String type;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /** The url property */
    private String url;
    /**
     * Instantiates a new Registry and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Registry() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Registry
     */
    @javax.annotation.Nonnull
    public static Registry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Registry();
    }
    /**
     * Gets the cloudAlias property value. The cloudAlias property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCloudAlias() {
        return this.cloudAlias;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudAlias", (n) -> { this.setCloudAlias(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("org_name", (n) -> { this.setOrgName(n.getStringValue()); });
        deserializerMap.put("team_name", (n) -> { this.setTeamName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the org_name property value. The org_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrgName() {
        return this.orgName;
    }
    /**
     * Gets the team_name property value. The team_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamName() {
        return this.teamName;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
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
     * Gets the url property value. The url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeBooleanValue("cloudAlias", this.getCloudAlias());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("org_name", this.getOrgName());
        writer.writeStringValue("team_name", this.getTeamName());
        writer.writeStringValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the cloudAlias property value. The cloudAlias property
     * @param value Value to set for the cloudAlias property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAlias(@javax.annotation.Nullable final Boolean value) {
        this.cloudAlias = value;
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
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the org_name property value. The org_name property
     * @param value Value to set for the orgName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrgName(@javax.annotation.Nullable final String value) {
        this.orgName = value;
    }
    /**
     * Sets the team_name property value. The team_name property
     * @param value Value to set for the teamName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamName(@javax.annotation.Nullable final String value) {
        this.teamName = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
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
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
