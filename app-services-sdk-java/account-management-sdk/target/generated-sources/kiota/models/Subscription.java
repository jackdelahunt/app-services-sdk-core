package com.openshift.cloud.api.accountmanagement.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Subscription extends SubscriptionCommonFields implements Parsable {
    /** The capabilities property */
    private java.util.List<Capability> capabilities;
    /** The created_at property */
    private OffsetDateTime createdAt;
    /** The creator property */
    private AccountReference creator;
    /** Calulated as the subscription created date + 60 days */
    private OffsetDateTime evalExpirationDate;
    /** The labels property */
    private java.util.List<Label> labels;
    /** The metrics property */
    private java.util.List<OneMetric> metrics;
    /** The notification_contacts property */
    private java.util.List<Account> notificationContacts;
    /** The plan property */
    private Plan plan;
    /** The updated_at property */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new Subscription and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Subscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Subscription
     */
    @javax.annotation.Nonnull
    public static Subscription createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subscription();
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
     * Gets the creator property value. The creator property
     * @return a AccountReference
     */
    @javax.annotation.Nullable
    public AccountReference getCreator() {
        return this.creator;
    }
    /**
     * Gets the eval_expiration_date property value. Calulated as the subscription created date + 60 days
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEvalExpirationDate() {
        return this.evalExpirationDate;
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
        deserializerMap.put("creator", (n) -> { this.setCreator(n.getObjectValue(AccountReference::createFromDiscriminatorValue)); });
        deserializerMap.put("eval_expiration_date", (n) -> { this.setEvalExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfObjectValues(Label::createFromDiscriminatorValue)); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getCollectionOfObjectValues(OneMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("notification_contacts", (n) -> { this.setNotificationContacts(n.getCollectionOfObjectValues(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getObjectValue(Plan::createFromDiscriminatorValue)); });
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
     * Gets the metrics property value. The metrics property
     * @return a OneMetric
     */
    @javax.annotation.Nullable
    public java.util.List<OneMetric> getMetrics() {
        return this.metrics;
    }
    /**
     * Gets the notification_contacts property value. The notification_contacts property
     * @return a Account
     */
    @javax.annotation.Nullable
    public java.util.List<Account> getNotificationContacts() {
        return this.notificationContacts;
    }
    /**
     * Gets the plan property value. The plan property
     * @return a Plan
     */
    @javax.annotation.Nullable
    public Plan getPlan() {
        return this.plan;
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
        writer.writeObjectValue("creator", this.getCreator());
        writer.writeOffsetDateTimeValue("eval_expiration_date", this.getEvalExpirationDate());
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
        writer.writeCollectionOfObjectValues("metrics", this.getMetrics());
        writer.writeCollectionOfObjectValues("notification_contacts", this.getNotificationContacts());
        writer.writeObjectValue("plan", this.getPlan());
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
     * Sets the creator property value. The creator property
     * @param value Value to set for the creator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreator(@javax.annotation.Nullable final AccountReference value) {
        this.creator = value;
    }
    /**
     * Sets the eval_expiration_date property value. Calulated as the subscription created date + 60 days
     * @param value Value to set for the evalExpirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvalExpirationDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.evalExpirationDate = value;
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
     * Sets the metrics property value. The metrics property
     * @param value Value to set for the metrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetrics(@javax.annotation.Nullable final java.util.List<OneMetric> value) {
        this.metrics = value;
    }
    /**
     * Sets the notification_contacts property value. The notification_contacts property
     * @param value Value to set for the notificationContacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationContacts(@javax.annotation.Nullable final java.util.List<Account> value) {
        this.notificationContacts = value;
    }
    /**
     * Sets the plan property value. The plan property
     * @param value Value to set for the plan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlan(@javax.annotation.Nullable final Plan value) {
        this.plan = value;
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
