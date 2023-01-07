/*
Account Management Service API

Manage user subscriptions and clusters

API version: 0.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package accountmgmtclient

import (
	"encoding/json"
	"time"
)

// SubscriptionAllOf struct for SubscriptionAllOf
type SubscriptionAllOf struct {
	Capabilities []Capability `json:"capabilities,omitempty"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	Creator *AccountReference `json:"creator,omitempty"`
	// Calulated as the subscription created date + 60 days
	EvalExpirationDate *time.Time `json:"eval_expiration_date,omitempty"`
	Labels []Label `json:"labels,omitempty"`
	Metrics []OneMetric `json:"metrics,omitempty"`
	NotificationContacts []Account `json:"notification_contacts,omitempty"`
	Plan *Plan `json:"plan,omitempty"`
	UpdatedAt *time.Time `json:"updated_at,omitempty"`
}

// NewSubscriptionAllOf instantiates a new SubscriptionAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubscriptionAllOf() *SubscriptionAllOf {
	this := SubscriptionAllOf{}
	return &this
}

// NewSubscriptionAllOfWithDefaults instantiates a new SubscriptionAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubscriptionAllOfWithDefaults() *SubscriptionAllOf {
	this := SubscriptionAllOf{}
	return &this
}

// GetCapabilities returns the Capabilities field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetCapabilities() []Capability {
	if o == nil || isNil(o.Capabilities) {
		var ret []Capability
		return ret
	}
	return o.Capabilities
}

// GetCapabilitiesOk returns a tuple with the Capabilities field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetCapabilitiesOk() ([]Capability, bool) {
	if o == nil || isNil(o.Capabilities) {
    return nil, false
	}
	return o.Capabilities, true
}

// HasCapabilities returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasCapabilities() bool {
	if o != nil && !isNil(o.Capabilities) {
		return true
	}

	return false
}

// SetCapabilities gets a reference to the given []Capability and assigns it to the Capabilities field.
func (o *SubscriptionAllOf) SetCapabilities(v []Capability) {
	o.Capabilities = v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetCreatedAt() time.Time {
	if o == nil || isNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.CreatedAt) {
    return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasCreatedAt() bool {
	if o != nil && !isNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *SubscriptionAllOf) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetCreator returns the Creator field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetCreator() AccountReference {
	if o == nil || isNil(o.Creator) {
		var ret AccountReference
		return ret
	}
	return *o.Creator
}

// GetCreatorOk returns a tuple with the Creator field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetCreatorOk() (*AccountReference, bool) {
	if o == nil || isNil(o.Creator) {
    return nil, false
	}
	return o.Creator, true
}

// HasCreator returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasCreator() bool {
	if o != nil && !isNil(o.Creator) {
		return true
	}

	return false
}

// SetCreator gets a reference to the given AccountReference and assigns it to the Creator field.
func (o *SubscriptionAllOf) SetCreator(v AccountReference) {
	o.Creator = &v
}

// GetEvalExpirationDate returns the EvalExpirationDate field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetEvalExpirationDate() time.Time {
	if o == nil || isNil(o.EvalExpirationDate) {
		var ret time.Time
		return ret
	}
	return *o.EvalExpirationDate
}

// GetEvalExpirationDateOk returns a tuple with the EvalExpirationDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetEvalExpirationDateOk() (*time.Time, bool) {
	if o == nil || isNil(o.EvalExpirationDate) {
    return nil, false
	}
	return o.EvalExpirationDate, true
}

// HasEvalExpirationDate returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasEvalExpirationDate() bool {
	if o != nil && !isNil(o.EvalExpirationDate) {
		return true
	}

	return false
}

// SetEvalExpirationDate gets a reference to the given time.Time and assigns it to the EvalExpirationDate field.
func (o *SubscriptionAllOf) SetEvalExpirationDate(v time.Time) {
	o.EvalExpirationDate = &v
}

// GetLabels returns the Labels field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetLabels() []Label {
	if o == nil || isNil(o.Labels) {
		var ret []Label
		return ret
	}
	return o.Labels
}

// GetLabelsOk returns a tuple with the Labels field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetLabelsOk() ([]Label, bool) {
	if o == nil || isNil(o.Labels) {
    return nil, false
	}
	return o.Labels, true
}

// HasLabels returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasLabels() bool {
	if o != nil && !isNil(o.Labels) {
		return true
	}

	return false
}

// SetLabels gets a reference to the given []Label and assigns it to the Labels field.
func (o *SubscriptionAllOf) SetLabels(v []Label) {
	o.Labels = v
}

// GetMetrics returns the Metrics field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetMetrics() []OneMetric {
	if o == nil || isNil(o.Metrics) {
		var ret []OneMetric
		return ret
	}
	return o.Metrics
}

// GetMetricsOk returns a tuple with the Metrics field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetMetricsOk() ([]OneMetric, bool) {
	if o == nil || isNil(o.Metrics) {
    return nil, false
	}
	return o.Metrics, true
}

// HasMetrics returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasMetrics() bool {
	if o != nil && !isNil(o.Metrics) {
		return true
	}

	return false
}

// SetMetrics gets a reference to the given []OneMetric and assigns it to the Metrics field.
func (o *SubscriptionAllOf) SetMetrics(v []OneMetric) {
	o.Metrics = v
}

// GetNotificationContacts returns the NotificationContacts field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetNotificationContacts() []Account {
	if o == nil || isNil(o.NotificationContacts) {
		var ret []Account
		return ret
	}
	return o.NotificationContacts
}

// GetNotificationContactsOk returns a tuple with the NotificationContacts field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetNotificationContactsOk() ([]Account, bool) {
	if o == nil || isNil(o.NotificationContacts) {
    return nil, false
	}
	return o.NotificationContacts, true
}

// HasNotificationContacts returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasNotificationContacts() bool {
	if o != nil && !isNil(o.NotificationContacts) {
		return true
	}

	return false
}

// SetNotificationContacts gets a reference to the given []Account and assigns it to the NotificationContacts field.
func (o *SubscriptionAllOf) SetNotificationContacts(v []Account) {
	o.NotificationContacts = v
}

// GetPlan returns the Plan field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetPlan() Plan {
	if o == nil || isNil(o.Plan) {
		var ret Plan
		return ret
	}
	return *o.Plan
}

// GetPlanOk returns a tuple with the Plan field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetPlanOk() (*Plan, bool) {
	if o == nil || isNil(o.Plan) {
    return nil, false
	}
	return o.Plan, true
}

// HasPlan returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasPlan() bool {
	if o != nil && !isNil(o.Plan) {
		return true
	}

	return false
}

// SetPlan gets a reference to the given Plan and assigns it to the Plan field.
func (o *SubscriptionAllOf) SetPlan(v Plan) {
	o.Plan = &v
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *SubscriptionAllOf) GetUpdatedAt() time.Time {
	if o == nil || isNil(o.UpdatedAt) {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscriptionAllOf) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.UpdatedAt) {
    return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *SubscriptionAllOf) HasUpdatedAt() bool {
	if o != nil && !isNil(o.UpdatedAt) {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *SubscriptionAllOf) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

func (o SubscriptionAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Capabilities) {
		toSerialize["capabilities"] = o.Capabilities
	}
	if !isNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !isNil(o.Creator) {
		toSerialize["creator"] = o.Creator
	}
	if !isNil(o.EvalExpirationDate) {
		toSerialize["eval_expiration_date"] = o.EvalExpirationDate
	}
	if !isNil(o.Labels) {
		toSerialize["labels"] = o.Labels
	}
	if !isNil(o.Metrics) {
		toSerialize["metrics"] = o.Metrics
	}
	if !isNil(o.NotificationContacts) {
		toSerialize["notification_contacts"] = o.NotificationContacts
	}
	if !isNil(o.Plan) {
		toSerialize["plan"] = o.Plan
	}
	if !isNil(o.UpdatedAt) {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	return json.Marshal(toSerialize)
}

type NullableSubscriptionAllOf struct {
	value *SubscriptionAllOf
	isSet bool
}

func (v NullableSubscriptionAllOf) Get() *SubscriptionAllOf {
	return v.value
}

func (v *NullableSubscriptionAllOf) Set(val *SubscriptionAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableSubscriptionAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableSubscriptionAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubscriptionAllOf(val *SubscriptionAllOf) *NullableSubscriptionAllOf {
	return &NullableSubscriptionAllOf{value: val, isSet: true}
}

func (v NullableSubscriptionAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubscriptionAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


