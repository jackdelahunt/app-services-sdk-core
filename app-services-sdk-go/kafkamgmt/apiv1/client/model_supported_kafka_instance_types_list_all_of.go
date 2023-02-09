/*
Kafka Management API

Kafka Management API is a REST API to manage Kafka instances

API version: 1.15.0
Contact: rhosak-support@redhat.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkamgmtclient

import (
	"encoding/json"
)

// SupportedKafkaInstanceTypesListAllOf struct for SupportedKafkaInstanceTypesListAllOf
type SupportedKafkaInstanceTypesListAllOf struct {
	InstanceTypes []SupportedKafkaInstanceType `json:"instance_types,omitempty"`
}

// NewSupportedKafkaInstanceTypesListAllOf instantiates a new SupportedKafkaInstanceTypesListAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSupportedKafkaInstanceTypesListAllOf() *SupportedKafkaInstanceTypesListAllOf {
	this := SupportedKafkaInstanceTypesListAllOf{}
	return &this
}

// NewSupportedKafkaInstanceTypesListAllOfWithDefaults instantiates a new SupportedKafkaInstanceTypesListAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSupportedKafkaInstanceTypesListAllOfWithDefaults() *SupportedKafkaInstanceTypesListAllOf {
	this := SupportedKafkaInstanceTypesListAllOf{}
	return &this
}

// GetInstanceTypes returns the InstanceTypes field value if set, zero value otherwise.
func (o *SupportedKafkaInstanceTypesListAllOf) GetInstanceTypes() []SupportedKafkaInstanceType {
	if o == nil || isNil(o.InstanceTypes) {
		var ret []SupportedKafkaInstanceType
		return ret
	}
	return o.InstanceTypes
}

// GetInstanceTypesOk returns a tuple with the InstanceTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SupportedKafkaInstanceTypesListAllOf) GetInstanceTypesOk() ([]SupportedKafkaInstanceType, bool) {
	if o == nil || isNil(o.InstanceTypes) {
    return nil, false
	}
	return o.InstanceTypes, true
}

// HasInstanceTypes returns a boolean if a field has been set.
func (o *SupportedKafkaInstanceTypesListAllOf) HasInstanceTypes() bool {
	if o != nil && !isNil(o.InstanceTypes) {
		return true
	}

	return false
}

// SetInstanceTypes gets a reference to the given []SupportedKafkaInstanceType and assigns it to the InstanceTypes field.
func (o *SupportedKafkaInstanceTypesListAllOf) SetInstanceTypes(v []SupportedKafkaInstanceType) {
	o.InstanceTypes = v
}

func (o SupportedKafkaInstanceTypesListAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.InstanceTypes) {
		toSerialize["instance_types"] = o.InstanceTypes
	}
	return json.Marshal(toSerialize)
}

type NullableSupportedKafkaInstanceTypesListAllOf struct {
	value *SupportedKafkaInstanceTypesListAllOf
	isSet bool
}

func (v NullableSupportedKafkaInstanceTypesListAllOf) Get() *SupportedKafkaInstanceTypesListAllOf {
	return v.value
}

func (v *NullableSupportedKafkaInstanceTypesListAllOf) Set(val *SupportedKafkaInstanceTypesListAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableSupportedKafkaInstanceTypesListAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableSupportedKafkaInstanceTypesListAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSupportedKafkaInstanceTypesListAllOf(val *SupportedKafkaInstanceTypesListAllOf) *NullableSupportedKafkaInstanceTypesListAllOf {
	return &NullableSupportedKafkaInstanceTypesListAllOf{value: val, isSet: true}
}

func (v NullableSupportedKafkaInstanceTypesListAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSupportedKafkaInstanceTypesListAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


