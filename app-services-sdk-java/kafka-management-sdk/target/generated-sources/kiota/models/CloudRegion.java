package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Description of a region of a cloud provider.
 */
public class CloudRegion implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Indicates whether there is capacity left per instance type */
    private java.util.List<RegionCapacityListItem> capacity;
    /** Name of the region for display purposes, for example `N. Virginia`. */
    private String displayName;
    /** Whether the region is enabled for deploying an OSD cluster. */
    private Boolean enabled;
    /** Unique identifier of the object. */
    private String id;
    /** Indicates the type of this object. Will be 'CloudRegion'. */
    private String kind;
    /**
     * Instantiates a new CloudRegion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudRegion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudRegion
     */
    @javax.annotation.Nonnull
    public static CloudRegion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudRegion();
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
     * Gets the capacity property value. Indicates whether there is capacity left per instance type
     * @return a RegionCapacityListItem
     */
    @javax.annotation.Nullable
    public java.util.List<RegionCapacityListItem> getCapacity() {
        return this.capacity;
    }
    /**
     * Gets the display_name property value. Name of the region for display purposes, for example `N. Virginia`.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enabled property value. Whether the region is enabled for deploying an OSD cluster.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getCollectionOfObjectValues(RegionCapacityListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier of the object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the kind property value. Indicates the type of this object. Will be 'CloudRegion'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKind() {
        return this.kind;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("capacity", this.getCapacity());
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("kind", this.getKind());
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
     * Sets the capacity property value. Indicates whether there is capacity left per instance type
     * @param value Value to set for the capacity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapacity(@javax.annotation.Nullable final java.util.List<RegionCapacityListItem> value) {
        this.capacity = value;
    }
    /**
     * Sets the display_name property value. Name of the region for display purposes, for example `N. Virginia`.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enabled property value. Whether the region is enabled for deploying an OSD cluster.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. Unique identifier of the object.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the kind property value. Indicates the type of this object. Will be 'CloudRegion'.
     * @param value Value to set for the kind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKind(@javax.annotation.Nullable final String value) {
        this.kind = value;
    }
}
