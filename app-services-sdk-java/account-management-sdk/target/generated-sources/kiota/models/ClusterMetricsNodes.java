package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClusterMetricsNodes implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The arch property */
    private String arch;
    /** The compute property */
    private Double compute;
    /** The infra property */
    private Double infra;
    /** The master property */
    private Double master;
    /** The total property */
    private Double total;
    /**
     * Instantiates a new ClusterMetricsNodes and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClusterMetricsNodes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClusterMetricsNodes
     */
    @javax.annotation.Nonnull
    public static ClusterMetricsNodes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClusterMetricsNodes();
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
     * Gets the arch property value. The arch property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getArch() {
        return this.arch;
    }
    /**
     * Gets the compute property value. The compute property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCompute() {
        return this.compute;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("arch", (n) -> { this.setArch(n.getStringValue()); });
        deserializerMap.put("compute", (n) -> { this.setCompute(n.getDoubleValue()); });
        deserializerMap.put("infra", (n) -> { this.setInfra(n.getDoubleValue()); });
        deserializerMap.put("master", (n) -> { this.setMaster(n.getDoubleValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the infra property value. The infra property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getInfra() {
        return this.infra;
    }
    /**
     * Gets the master property value. The master property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaster() {
        return this.master;
    }
    /**
     * Gets the total property value. The total property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("arch", this.getArch());
        writer.writeDoubleValue("compute", this.getCompute());
        writer.writeDoubleValue("infra", this.getInfra());
        writer.writeDoubleValue("master", this.getMaster());
        writer.writeDoubleValue("total", this.getTotal());
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
     * Sets the arch property value. The arch property
     * @param value Value to set for the arch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArch(@javax.annotation.Nullable final String value) {
        this.arch = value;
    }
    /**
     * Sets the compute property value. The compute property
     * @param value Value to set for the compute property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompute(@javax.annotation.Nullable final Double value) {
        this.compute = value;
    }
    /**
     * Sets the infra property value. The infra property
     * @param value Value to set for the infra property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfra(@javax.annotation.Nullable final Double value) {
        this.infra = value;
    }
    /**
     * Sets the master property value. The master property
     * @param value Value to set for the master property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaster(@javax.annotation.Nullable final Double value) {
        this.master = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotal(@javax.annotation.Nullable final Double value) {
        this.total = value;
    }
}
