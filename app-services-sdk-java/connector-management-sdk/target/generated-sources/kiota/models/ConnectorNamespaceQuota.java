package com.openshift.cloud.api.connector.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorNamespaceQuota implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The connectors property */
    private Integer connectors;
    /** CPU quota for limits or requests */
    private String cpuLimits;
    /** CPU quota for limits or requests */
    private String cpuRequests;
    /** Memory quota for limits or requests */
    private String memoryLimits;
    /** Memory quota for limits or requests */
    private String memoryRequests;
    /**
     * Instantiates a new ConnectorNamespaceQuota and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorNamespaceQuota() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorNamespaceQuota
     */
    @javax.annotation.Nonnull
    public static ConnectorNamespaceQuota createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorNamespaceQuota();
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
     * Gets the connectors property value. The connectors property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConnectors() {
        return this.connectors;
    }
    /**
     * Gets the cpu_limits property value. CPU quota for limits or requests
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCpuLimits() {
        return this.cpuLimits;
    }
    /**
     * Gets the cpu_requests property value. CPU quota for limits or requests
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCpuRequests() {
        return this.cpuRequests;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("connectors", (n) -> { this.setConnectors(n.getIntegerValue()); });
        deserializerMap.put("cpu_limits", (n) -> { this.setCpuLimits(n.getStringValue()); });
        deserializerMap.put("cpu_requests", (n) -> { this.setCpuRequests(n.getStringValue()); });
        deserializerMap.put("memory_limits", (n) -> { this.setMemoryLimits(n.getStringValue()); });
        deserializerMap.put("memory_requests", (n) -> { this.setMemoryRequests(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memory_limits property value. Memory quota for limits or requests
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemoryLimits() {
        return this.memoryLimits;
    }
    /**
     * Gets the memory_requests property value. Memory quota for limits or requests
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemoryRequests() {
        return this.memoryRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("connectors", this.getConnectors());
        writer.writeStringValue("cpu_limits", this.getCpuLimits());
        writer.writeStringValue("cpu_requests", this.getCpuRequests());
        writer.writeStringValue("memory_limits", this.getMemoryLimits());
        writer.writeStringValue("memory_requests", this.getMemoryRequests());
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
     * Sets the connectors property value. The connectors property
     * @param value Value to set for the connectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectors(@javax.annotation.Nullable final Integer value) {
        this.connectors = value;
    }
    /**
     * Sets the cpu_limits property value. CPU quota for limits or requests
     * @param value Value to set for the cpuLimits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCpuLimits(@javax.annotation.Nullable final String value) {
        this.cpuLimits = value;
    }
    /**
     * Sets the cpu_requests property value. CPU quota for limits or requests
     * @param value Value to set for the cpuRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCpuRequests(@javax.annotation.Nullable final String value) {
        this.cpuRequests = value;
    }
    /**
     * Sets the memory_limits property value. Memory quota for limits or requests
     * @param value Value to set for the memoryLimits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemoryLimits(@javax.annotation.Nullable final String value) {
        this.memoryLimits = value;
    }
    /**
     * Sets the memory_requests property value. Memory quota for limits or requests
     * @param value Value to set for the memoryRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemoryRequests(@javax.annotation.Nullable final String value) {
        this.memoryRequests = value;
    }
}
