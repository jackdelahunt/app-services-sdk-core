/*
 * Kafka Management API
 *
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * API version: 1.13.0
 * Contact: rhosak-support@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkamgmtclient

import (
	"encoding/json"
)

// KafkaUpdateRequest struct for KafkaUpdateRequest
type KafkaUpdateRequest struct {
	Owner NullableString `json:"owner,omitempty"`
	// Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes.
	ReauthenticationEnabled NullableBool `json:"reauthentication_enabled,omitempty"`
}

// NewKafkaUpdateRequest instantiates a new KafkaUpdateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewKafkaUpdateRequest() *KafkaUpdateRequest {
	this := KafkaUpdateRequest{}
	return &this
}

// NewKafkaUpdateRequestWithDefaults instantiates a new KafkaUpdateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewKafkaUpdateRequestWithDefaults() *KafkaUpdateRequest {
	this := KafkaUpdateRequest{}
	return &this
}

// GetOwner returns the Owner field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *KafkaUpdateRequest) GetOwner() string {
	if o == nil || o.Owner.Get() == nil {
		var ret string
		return ret
	}
	return *o.Owner.Get()
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *KafkaUpdateRequest) GetOwnerOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Owner.Get(), o.Owner.IsSet()
}

// HasOwner returns a boolean if a field has been set.
func (o *KafkaUpdateRequest) HasOwner() bool {
	if o != nil && o.Owner.IsSet() {
		return true
	}

	return false
}

// SetOwner gets a reference to the given NullableString and assigns it to the Owner field.
func (o *KafkaUpdateRequest) SetOwner(v string) {
	o.Owner.Set(&v)
}
// SetOwnerNil sets the value for Owner to be an explicit nil
func (o *KafkaUpdateRequest) SetOwnerNil() {
	o.Owner.Set(nil)
}

// UnsetOwner ensures that no value is present for Owner, not even an explicit nil
func (o *KafkaUpdateRequest) UnsetOwner() {
	o.Owner.Unset()
}

// GetReauthenticationEnabled returns the ReauthenticationEnabled field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *KafkaUpdateRequest) GetReauthenticationEnabled() bool {
	if o == nil || o.ReauthenticationEnabled.Get() == nil {
		var ret bool
		return ret
	}
	return *o.ReauthenticationEnabled.Get()
}

// GetReauthenticationEnabledOk returns a tuple with the ReauthenticationEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *KafkaUpdateRequest) GetReauthenticationEnabledOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return o.ReauthenticationEnabled.Get(), o.ReauthenticationEnabled.IsSet()
}

// HasReauthenticationEnabled returns a boolean if a field has been set.
func (o *KafkaUpdateRequest) HasReauthenticationEnabled() bool {
	if o != nil && o.ReauthenticationEnabled.IsSet() {
		return true
	}

	return false
}

// SetReauthenticationEnabled gets a reference to the given NullableBool and assigns it to the ReauthenticationEnabled field.
func (o *KafkaUpdateRequest) SetReauthenticationEnabled(v bool) {
	o.ReauthenticationEnabled.Set(&v)
}
// SetReauthenticationEnabledNil sets the value for ReauthenticationEnabled to be an explicit nil
func (o *KafkaUpdateRequest) SetReauthenticationEnabledNil() {
	o.ReauthenticationEnabled.Set(nil)
}

// UnsetReauthenticationEnabled ensures that no value is present for ReauthenticationEnabled, not even an explicit nil
func (o *KafkaUpdateRequest) UnsetReauthenticationEnabled() {
	o.ReauthenticationEnabled.Unset()
}

func (o KafkaUpdateRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Owner.IsSet() {
		toSerialize["owner"] = o.Owner.Get()
	}
	if o.ReauthenticationEnabled.IsSet() {
		toSerialize["reauthentication_enabled"] = o.ReauthenticationEnabled.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableKafkaUpdateRequest struct {
	value *KafkaUpdateRequest
	isSet bool
}

func (v NullableKafkaUpdateRequest) Get() *KafkaUpdateRequest {
	return v.value
}

func (v *NullableKafkaUpdateRequest) Set(val *KafkaUpdateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableKafkaUpdateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableKafkaUpdateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKafkaUpdateRequest(val *KafkaUpdateRequest) *NullableKafkaUpdateRequest {
	return &NullableKafkaUpdateRequest{value: val, isSet: true}
}

func (v NullableKafkaUpdateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKafkaUpdateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


