package com.openshift.cloud.api.kas.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Enterprise cluster with addon parameters
 */
public class EnterpriseClusterWithAddonParameters extends EnterpriseClusterListItem implements Parsable {
    /** The fleetshard_parameters property */
    private java.util.List<EnterpriseClusterWithAddonParameters_fleetshard_parameters> fleetshardParameters;
    /**
     * Instantiates a new EnterpriseClusterWithAddonParameters and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnterpriseClusterWithAddonParameters() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnterpriseClusterWithAddonParameters
     */
    @javax.annotation.Nonnull
    public static EnterpriseClusterWithAddonParameters createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseClusterWithAddonParameters();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fleetshard_parameters", (n) -> { this.setFleetshardParameters(n.getCollectionOfObjectValues(EnterpriseClusterWithAddonParameters_fleetshard_parameters::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fleetshard_parameters property value. The fleetshard_parameters property
     * @return a EnterpriseClusterWithAddonParameters_fleetshard_parameters
     */
    @javax.annotation.Nullable
    public java.util.List<EnterpriseClusterWithAddonParameters_fleetshard_parameters> getFleetshardParameters() {
        return this.fleetshardParameters;
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
        writer.writeCollectionOfObjectValues("fleetshard_parameters", this.getFleetshardParameters());
    }
    /**
     * Sets the fleetshard_parameters property value. The fleetshard_parameters property
     * @param value Value to set for the fleetshardParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFleetshardParameters(@javax.annotation.Nullable final java.util.List<EnterpriseClusterWithAddonParameters_fleetshard_parameters> value) {
        this.fleetshardParameters = value;
    }
}
