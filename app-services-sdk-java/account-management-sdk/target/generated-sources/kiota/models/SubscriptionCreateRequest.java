package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubscriptionCreateRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cluster_uuid property */
    private String clusterUuid;
    /** The console_url property */
    private String consoleUrl;
    /** The display_name property */
    private String displayName;
    /** The plan_id property */
    private SubscriptionCreateRequest_plan_id planId;
    /** The status property */
    private SubscriptionCreateRequest_status status;
    /**
     * Instantiates a new SubscriptionCreateRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubscriptionCreateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubscriptionCreateRequest
     */
    @javax.annotation.Nonnull
    public static SubscriptionCreateRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionCreateRequest();
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
     * Gets the cluster_uuid property value. The cluster_uuid property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterUuid() {
        return this.clusterUuid;
    }
    /**
     * Gets the console_url property value. The console_url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConsoleUrl() {
        return this.consoleUrl;
    }
    /**
     * Gets the display_name property value. The display_name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cluster_uuid", (n) -> { this.setClusterUuid(n.getStringValue()); });
        deserializerMap.put("console_url", (n) -> { this.setConsoleUrl(n.getStringValue()); });
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getEnumValue(SubscriptionCreateRequest_plan_id.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SubscriptionCreateRequest_status.class)); });
        return deserializerMap;
    }
    /**
     * Gets the plan_id property value. The plan_id property
     * @return a SubscriptionCreateRequest_plan_id
     */
    @javax.annotation.Nullable
    public SubscriptionCreateRequest_plan_id getPlanId() {
        return this.planId;
    }
    /**
     * Gets the status property value. The status property
     * @return a SubscriptionCreateRequest_status
     */
    @javax.annotation.Nullable
    public SubscriptionCreateRequest_status getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cluster_uuid", this.getClusterUuid());
        writer.writeStringValue("console_url", this.getConsoleUrl());
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeEnumValue("plan_id", this.getPlanId());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the cluster_uuid property value. The cluster_uuid property
     * @param value Value to set for the clusterUuid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterUuid(@javax.annotation.Nullable final String value) {
        this.clusterUuid = value;
    }
    /**
     * Sets the console_url property value. The console_url property
     * @param value Value to set for the consoleUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsoleUrl(@javax.annotation.Nullable final String value) {
        this.consoleUrl = value;
    }
    /**
     * Sets the display_name property value. The display_name property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the plan_id property value. The plan_id property
     * @param value Value to set for the planId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanId(@javax.annotation.Nullable final SubscriptionCreateRequest_plan_id value) {
        this.planId = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SubscriptionCreateRequest_status value) {
        this.status = value;
    }
}
