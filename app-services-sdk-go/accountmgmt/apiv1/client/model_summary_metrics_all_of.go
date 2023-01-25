/*
 * Account Management Service API
 *
 * Manage user subscriptions and clusters
 *
 * API version: 0.0.1
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package accountmgmtclient

import (
	"encoding/json"
)

// SummaryMetricsAllOf struct for SummaryMetricsAllOf
type SummaryMetricsAllOf struct {
	Name *string `json:"name,omitempty"`
	Vector *[]SummaryVector `json:"vector,omitempty"`
}

// NewSummaryMetricsAllOf instantiates a new SummaryMetricsAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSummaryMetricsAllOf() *SummaryMetricsAllOf {
	this := SummaryMetricsAllOf{}
	return &this
}

// NewSummaryMetricsAllOfWithDefaults instantiates a new SummaryMetricsAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSummaryMetricsAllOfWithDefaults() *SummaryMetricsAllOf {
	this := SummaryMetricsAllOf{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SummaryMetricsAllOf) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SummaryMetricsAllOf) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SummaryMetricsAllOf) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SummaryMetricsAllOf) SetName(v string) {
	o.Name = &v
}

// GetVector returns the Vector field value if set, zero value otherwise.
func (o *SummaryMetricsAllOf) GetVector() []SummaryVector {
	if o == nil || o.Vector == nil {
		var ret []SummaryVector
		return ret
	}
	return *o.Vector
}

// GetVectorOk returns a tuple with the Vector field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SummaryMetricsAllOf) GetVectorOk() (*[]SummaryVector, bool) {
	if o == nil || o.Vector == nil {
		return nil, false
	}
	return o.Vector, true
}

// HasVector returns a boolean if a field has been set.
func (o *SummaryMetricsAllOf) HasVector() bool {
	if o != nil && o.Vector != nil {
		return true
	}

	return false
}

// SetVector gets a reference to the given []SummaryVector and assigns it to the Vector field.
func (o *SummaryMetricsAllOf) SetVector(v []SummaryVector) {
	o.Vector = &v
}

func (o SummaryMetricsAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Vector != nil {
		toSerialize["vector"] = o.Vector
	}
	return json.Marshal(toSerialize)
}

type NullableSummaryMetricsAllOf struct {
	value *SummaryMetricsAllOf
	isSet bool
}

func (v NullableSummaryMetricsAllOf) Get() *SummaryMetricsAllOf {
	return v.value
}

func (v *NullableSummaryMetricsAllOf) Set(val *SummaryMetricsAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableSummaryMetricsAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableSummaryMetricsAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSummaryMetricsAllOf(val *SummaryMetricsAllOf) *NullableSummaryMetricsAllOf {
	return &NullableSummaryMetricsAllOf{value: val, isSet: true}
}

func (v NullableSummaryMetricsAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSummaryMetricsAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


