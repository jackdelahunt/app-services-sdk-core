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

// ClusterResource struct for ClusterResource
type ClusterResource struct {
	Total ClusterResourceTotal `json:"total"`
	UpdatedTimestamp time.Time `json:"updated_timestamp"`
	Used ClusterResourceTotal `json:"used"`
}

// NewClusterResource instantiates a new ClusterResource object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClusterResource(total ClusterResourceTotal, updatedTimestamp time.Time, used ClusterResourceTotal) *ClusterResource {
	this := ClusterResource{}
	this.Total = total
	this.UpdatedTimestamp = updatedTimestamp
	this.Used = used
	return &this
}

// NewClusterResourceWithDefaults instantiates a new ClusterResource object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClusterResourceWithDefaults() *ClusterResource {
	this := ClusterResource{}
	return &this
}

// GetTotal returns the Total field value
func (o *ClusterResource) GetTotal() ClusterResourceTotal {
	if o == nil {
		var ret ClusterResourceTotal
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *ClusterResource) GetTotalOk() (*ClusterResourceTotal, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *ClusterResource) SetTotal(v ClusterResourceTotal) {
	o.Total = v
}

// GetUpdatedTimestamp returns the UpdatedTimestamp field value
func (o *ClusterResource) GetUpdatedTimestamp() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.UpdatedTimestamp
}

// GetUpdatedTimestampOk returns a tuple with the UpdatedTimestamp field value
// and a boolean to check if the value has been set.
func (o *ClusterResource) GetUpdatedTimestampOk() (*time.Time, bool) {
	if o == nil {
    return nil, false
	}
	return &o.UpdatedTimestamp, true
}

// SetUpdatedTimestamp sets field value
func (o *ClusterResource) SetUpdatedTimestamp(v time.Time) {
	o.UpdatedTimestamp = v
}

// GetUsed returns the Used field value
func (o *ClusterResource) GetUsed() ClusterResourceTotal {
	if o == nil {
		var ret ClusterResourceTotal
		return ret
	}

	return o.Used
}

// GetUsedOk returns a tuple with the Used field value
// and a boolean to check if the value has been set.
func (o *ClusterResource) GetUsedOk() (*ClusterResourceTotal, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Used, true
}

// SetUsed sets field value
func (o *ClusterResource) SetUsed(v ClusterResourceTotal) {
	o.Used = v
}

func (o ClusterResource) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["total"] = o.Total
	}
	if true {
		toSerialize["updated_timestamp"] = o.UpdatedTimestamp
	}
	if true {
		toSerialize["used"] = o.Used
	}
	return json.Marshal(toSerialize)
}

type NullableClusterResource struct {
	value *ClusterResource
	isSet bool
}

func (v NullableClusterResource) Get() *ClusterResource {
	return v.value
}

func (v *NullableClusterResource) Set(val *ClusterResource) {
	v.value = val
	v.isSet = true
}

func (v NullableClusterResource) IsSet() bool {
	return v.isSet
}

func (v *NullableClusterResource) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClusterResource(val *ClusterResource) *NullableClusterResource {
	return &NullableClusterResource{value: val, isSet: true}
}

func (v NullableClusterResource) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClusterResource) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


