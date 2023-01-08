/*
Account Management Service API

Manage user subscriptions and clusters

API version: 0.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package accountmgmtclient

import (
	"encoding/json"
)

// ClusterMetricsNodes struct for ClusterMetricsNodes
type ClusterMetricsNodes struct {
	Compute *float64 `json:"compute,omitempty"`
	Infra *float64 `json:"infra,omitempty"`
	Master *float64 `json:"master,omitempty"`
	Total *float64 `json:"total,omitempty"`
}

// NewClusterMetricsNodes instantiates a new ClusterMetricsNodes object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClusterMetricsNodes() *ClusterMetricsNodes {
	this := ClusterMetricsNodes{}
	return &this
}

// NewClusterMetricsNodesWithDefaults instantiates a new ClusterMetricsNodes object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClusterMetricsNodesWithDefaults() *ClusterMetricsNodes {
	this := ClusterMetricsNodes{}
	return &this
}

// GetCompute returns the Compute field value if set, zero value otherwise.
func (o *ClusterMetricsNodes) GetCompute() float64 {
	if o == nil || isNil(o.Compute) {
		var ret float64
		return ret
	}
	return *o.Compute
}

// GetComputeOk returns a tuple with the Compute field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterMetricsNodes) GetComputeOk() (*float64, bool) {
	if o == nil || isNil(o.Compute) {
    return nil, false
	}
	return o.Compute, true
}

// HasCompute returns a boolean if a field has been set.
func (o *ClusterMetricsNodes) HasCompute() bool {
	if o != nil && !isNil(o.Compute) {
		return true
	}

	return false
}

// SetCompute gets a reference to the given float64 and assigns it to the Compute field.
func (o *ClusterMetricsNodes) SetCompute(v float64) {
	o.Compute = &v
}

// GetInfra returns the Infra field value if set, zero value otherwise.
func (o *ClusterMetricsNodes) GetInfra() float64 {
	if o == nil || isNil(o.Infra) {
		var ret float64
		return ret
	}
	return *o.Infra
}

// GetInfraOk returns a tuple with the Infra field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterMetricsNodes) GetInfraOk() (*float64, bool) {
	if o == nil || isNil(o.Infra) {
    return nil, false
	}
	return o.Infra, true
}

// HasInfra returns a boolean if a field has been set.
func (o *ClusterMetricsNodes) HasInfra() bool {
	if o != nil && !isNil(o.Infra) {
		return true
	}

	return false
}

// SetInfra gets a reference to the given float64 and assigns it to the Infra field.
func (o *ClusterMetricsNodes) SetInfra(v float64) {
	o.Infra = &v
}

// GetMaster returns the Master field value if set, zero value otherwise.
func (o *ClusterMetricsNodes) GetMaster() float64 {
	if o == nil || isNil(o.Master) {
		var ret float64
		return ret
	}
	return *o.Master
}

// GetMasterOk returns a tuple with the Master field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterMetricsNodes) GetMasterOk() (*float64, bool) {
	if o == nil || isNil(o.Master) {
    return nil, false
	}
	return o.Master, true
}

// HasMaster returns a boolean if a field has been set.
func (o *ClusterMetricsNodes) HasMaster() bool {
	if o != nil && !isNil(o.Master) {
		return true
	}

	return false
}

// SetMaster gets a reference to the given float64 and assigns it to the Master field.
func (o *ClusterMetricsNodes) SetMaster(v float64) {
	o.Master = &v
}

// GetTotal returns the Total field value if set, zero value otherwise.
func (o *ClusterMetricsNodes) GetTotal() float64 {
	if o == nil || isNil(o.Total) {
		var ret float64
		return ret
	}
	return *o.Total
}

// GetTotalOk returns a tuple with the Total field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterMetricsNodes) GetTotalOk() (*float64, bool) {
	if o == nil || isNil(o.Total) {
    return nil, false
	}
	return o.Total, true
}

// HasTotal returns a boolean if a field has been set.
func (o *ClusterMetricsNodes) HasTotal() bool {
	if o != nil && !isNil(o.Total) {
		return true
	}

	return false
}

// SetTotal gets a reference to the given float64 and assigns it to the Total field.
func (o *ClusterMetricsNodes) SetTotal(v float64) {
	o.Total = &v
}

func (o ClusterMetricsNodes) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Compute) {
		toSerialize["compute"] = o.Compute
	}
	if !isNil(o.Infra) {
		toSerialize["infra"] = o.Infra
	}
	if !isNil(o.Master) {
		toSerialize["master"] = o.Master
	}
	if !isNil(o.Total) {
		toSerialize["total"] = o.Total
	}
	return json.Marshal(toSerialize)
}

type NullableClusterMetricsNodes struct {
	value *ClusterMetricsNodes
	isSet bool
}

func (v NullableClusterMetricsNodes) Get() *ClusterMetricsNodes {
	return v.value
}

func (v *NullableClusterMetricsNodes) Set(val *ClusterMetricsNodes) {
	v.value = val
	v.isSet = true
}

func (v NullableClusterMetricsNodes) IsSet() bool {
	return v.isSet
}

func (v *NullableClusterMetricsNodes) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClusterMetricsNodes(val *ClusterMetricsNodes) *NullableClusterMetricsNodes {
	return &NullableClusterMetricsNodes{value: val, isSet: true}
}

func (v NullableClusterMetricsNodes) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClusterMetricsNodes) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


