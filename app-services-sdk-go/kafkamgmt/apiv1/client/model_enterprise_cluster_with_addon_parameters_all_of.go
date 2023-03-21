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

// checks if the EnterpriseClusterWithAddonParametersAllOf type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &EnterpriseClusterWithAddonParametersAllOf{}

// EnterpriseClusterWithAddonParametersAllOf struct for EnterpriseClusterWithAddonParametersAllOf
type EnterpriseClusterWithAddonParametersAllOf struct {
	FleetshardParameters []FleetshardParameter `json:"fleetshard_parameters,omitempty"`
}

// NewEnterpriseClusterWithAddonParametersAllOf instantiates a new EnterpriseClusterWithAddonParametersAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnterpriseClusterWithAddonParametersAllOf() *EnterpriseClusterWithAddonParametersAllOf {
	this := EnterpriseClusterWithAddonParametersAllOf{}
	return &this
}

// NewEnterpriseClusterWithAddonParametersAllOfWithDefaults instantiates a new EnterpriseClusterWithAddonParametersAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnterpriseClusterWithAddonParametersAllOfWithDefaults() *EnterpriseClusterWithAddonParametersAllOf {
	this := EnterpriseClusterWithAddonParametersAllOf{}
	return &this
}

// GetFleetshardParameters returns the FleetshardParameters field value if set, zero value otherwise.
func (o *EnterpriseClusterWithAddonParametersAllOf) GetFleetshardParameters() []FleetshardParameter {
	if o == nil || IsNil(o.FleetshardParameters) {
		var ret []FleetshardParameter
		return ret
	}
	return o.FleetshardParameters
}

// GetFleetshardParametersOk returns a tuple with the FleetshardParameters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParametersAllOf) GetFleetshardParametersOk() ([]FleetshardParameter, bool) {
	if o == nil || IsNil(o.FleetshardParameters) {
		return nil, false
	}
	return o.FleetshardParameters, true
}

// HasFleetshardParameters returns a boolean if a field has been set.
func (o *EnterpriseClusterWithAddonParametersAllOf) HasFleetshardParameters() bool {
	if o != nil && !IsNil(o.FleetshardParameters) {
		return true
	}

	return false
}

// SetFleetshardParameters gets a reference to the given []FleetshardParameter and assigns it to the FleetshardParameters field.
func (o *EnterpriseClusterWithAddonParametersAllOf) SetFleetshardParameters(v []FleetshardParameter) {
	o.FleetshardParameters = v
}

func (o EnterpriseClusterWithAddonParametersAllOf) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o EnterpriseClusterWithAddonParametersAllOf) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.FleetshardParameters) {
		toSerialize["fleetshard_parameters"] = o.FleetshardParameters
	}
	return toSerialize, nil
}

type NullableEnterpriseClusterWithAddonParametersAllOf struct {
	value *EnterpriseClusterWithAddonParametersAllOf
	isSet bool
}

func (v NullableEnterpriseClusterWithAddonParametersAllOf) Get() *EnterpriseClusterWithAddonParametersAllOf {
	return v.value
}

func (v *NullableEnterpriseClusterWithAddonParametersAllOf) Set(val *EnterpriseClusterWithAddonParametersAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableEnterpriseClusterWithAddonParametersAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableEnterpriseClusterWithAddonParametersAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnterpriseClusterWithAddonParametersAllOf(val *EnterpriseClusterWithAddonParametersAllOf) *NullableEnterpriseClusterWithAddonParametersAllOf {
	return &NullableEnterpriseClusterWithAddonParametersAllOf{value: val, isSet: true}
}

func (v NullableEnterpriseClusterWithAddonParametersAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnterpriseClusterWithAddonParametersAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


