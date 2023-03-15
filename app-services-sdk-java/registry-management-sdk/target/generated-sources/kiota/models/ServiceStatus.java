package com.openshift.cloud.api.srs.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Schema for the service status response body
 */
public class ServiceStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Boolean property indicating if the maximum number of total Registry instances have been reached, therefore creation of more instances should not be allowed. */
    private Boolean maxInstancesReached;
    /**
     * Instantiates a new ServiceStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceStatus
     */
    @javax.annotation.Nonnull
    public static ServiceStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceStatus();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("max_instances_reached", (n) -> { this.setMaxInstancesReached(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_instances_reached property value. Boolean property indicating if the maximum number of total Registry instances have been reached, therefore creation of more instances should not be allowed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMaxInstancesReached() {
        return this.maxInstancesReached;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("max_instances_reached", this.getMaxInstancesReached());
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
     * Sets the max_instances_reached property value. Boolean property indicating if the maximum number of total Registry instances have been reached, therefore creation of more instances should not be allowed.
     * @param value Value to set for the maxInstancesReached property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxInstancesReached(@javax.annotation.Nullable final Boolean value) {
        this.maxInstancesReached = value;
    }
}
