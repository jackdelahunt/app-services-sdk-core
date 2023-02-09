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

// SummaryAllOf struct for SummaryAllOf
type SummaryAllOf struct {
	Metrics []SummaryMetrics `json:"metrics"`
	Name *string `json:"name,omitempty"`
}

// NewSummaryAllOf instantiates a new SummaryAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSummaryAllOf(metrics []SummaryMetrics) *SummaryAllOf {
	this := SummaryAllOf{}
	this.Metrics = metrics
	return &this
}

// NewSummaryAllOfWithDefaults instantiates a new SummaryAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSummaryAllOfWithDefaults() *SummaryAllOf {
	this := SummaryAllOf{}
	return &this
}

// GetMetrics returns the Metrics field value
func (o *SummaryAllOf) GetMetrics() []SummaryMetrics {
	if o == nil {
		var ret []SummaryMetrics
		return ret
	}

	return o.Metrics
}

// GetMetricsOk returns a tuple with the Metrics field value
// and a boolean to check if the value has been set.
func (o *SummaryAllOf) GetMetricsOk() (*[]SummaryMetrics, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Metrics, true
}

// SetMetrics sets field value
func (o *SummaryAllOf) SetMetrics(v []SummaryMetrics) {
	o.Metrics = v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SummaryAllOf) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SummaryAllOf) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SummaryAllOf) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SummaryAllOf) SetName(v string) {
	o.Name = &v
}

func (o SummaryAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["metrics"] = o.Metrics
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableSummaryAllOf struct {
	value *SummaryAllOf
	isSet bool
}

func (v NullableSummaryAllOf) Get() *SummaryAllOf {
	return v.value
}

func (v *NullableSummaryAllOf) Set(val *SummaryAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableSummaryAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableSummaryAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSummaryAllOf(val *SummaryAllOf) *NullableSummaryAllOf {
	return &NullableSummaryAllOf{value: val, isSet: true}
}

func (v NullableSummaryAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSummaryAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


