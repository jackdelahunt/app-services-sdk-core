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

// EnterpriseClusterWithAddonParameters Enterprise cluster with addon parameters
type EnterpriseClusterWithAddonParameters struct {
	Id string `json:"id"`
	Kind string `json:"kind"`
	Href string `json:"href"`
	// Indicates whether Kafkas created on this data plane cluster have to be accessed via private network
	AccessKafkasViaPrivateNetwork bool `json:"access_kafkas_via_private_network"`
	// OCM cluster id of the registered Enterprise cluster
	ClusterId *string `json:"cluster_id,omitempty"`
	// status of registered Enterprise cluster
	Status *string `json:"status,omitempty"`
	FleetshardParameters []FleetshardParameter `json:"fleetshard_parameters,omitempty"`
}

// NewEnterpriseClusterWithAddonParameters instantiates a new EnterpriseClusterWithAddonParameters object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnterpriseClusterWithAddonParameters(id string, kind string, href string, accessKafkasViaPrivateNetwork bool) *EnterpriseClusterWithAddonParameters {
	this := EnterpriseClusterWithAddonParameters{}
	this.Id = id
	this.Kind = kind
	this.Href = href
	this.AccessKafkasViaPrivateNetwork = accessKafkasViaPrivateNetwork
	return &this
}

// NewEnterpriseClusterWithAddonParametersWithDefaults instantiates a new EnterpriseClusterWithAddonParameters object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnterpriseClusterWithAddonParametersWithDefaults() *EnterpriseClusterWithAddonParameters {
	this := EnterpriseClusterWithAddonParameters{}
	return &this
}

// GetId returns the Id field value
func (o *EnterpriseClusterWithAddonParameters) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *EnterpriseClusterWithAddonParameters) SetId(v string) {
	o.Id = v
}

// GetKind returns the Kind field value
func (o *EnterpriseClusterWithAddonParameters) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *EnterpriseClusterWithAddonParameters) SetKind(v string) {
	o.Kind = v
}

// GetHref returns the Href field value
func (o *EnterpriseClusterWithAddonParameters) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetHrefOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *EnterpriseClusterWithAddonParameters) SetHref(v string) {
	o.Href = v
}

// GetAccessKafkasViaPrivateNetwork returns the AccessKafkasViaPrivateNetwork field value
func (o *EnterpriseClusterWithAddonParameters) GetAccessKafkasViaPrivateNetwork() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.AccessKafkasViaPrivateNetwork
}

// GetAccessKafkasViaPrivateNetworkOk returns a tuple with the AccessKafkasViaPrivateNetwork field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetAccessKafkasViaPrivateNetworkOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.AccessKafkasViaPrivateNetwork, true
}

// SetAccessKafkasViaPrivateNetwork sets field value
func (o *EnterpriseClusterWithAddonParameters) SetAccessKafkasViaPrivateNetwork(v bool) {
	o.AccessKafkasViaPrivateNetwork = v
}

// GetClusterId returns the ClusterId field value if set, zero value otherwise.
func (o *EnterpriseClusterWithAddonParameters) GetClusterId() string {
	if o == nil || isNil(o.ClusterId) {
		var ret string
		return ret
	}
	return *o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetClusterIdOk() (*string, bool) {
	if o == nil || isNil(o.ClusterId) {
    return nil, false
	}
	return o.ClusterId, true
}

// HasClusterId returns a boolean if a field has been set.
func (o *EnterpriseClusterWithAddonParameters) HasClusterId() bool {
	if o != nil && !isNil(o.ClusterId) {
		return true
	}

	return false
}

// SetClusterId gets a reference to the given string and assigns it to the ClusterId field.
func (o *EnterpriseClusterWithAddonParameters) SetClusterId(v string) {
	o.ClusterId = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *EnterpriseClusterWithAddonParameters) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *EnterpriseClusterWithAddonParameters) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *EnterpriseClusterWithAddonParameters) SetStatus(v string) {
	o.Status = &v
}

// GetFleetshardParameters returns the FleetshardParameters field value if set, zero value otherwise.
func (o *EnterpriseClusterWithAddonParameters) GetFleetshardParameters() []FleetshardParameter {
	if o == nil || isNil(o.FleetshardParameters) {
		var ret []FleetshardParameter
		return ret
	}
	return o.FleetshardParameters
}

// GetFleetshardParametersOk returns a tuple with the FleetshardParameters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterWithAddonParameters) GetFleetshardParametersOk() ([]FleetshardParameter, bool) {
	if o == nil || isNil(o.FleetshardParameters) {
    return nil, false
	}
	return o.FleetshardParameters, true
}

// HasFleetshardParameters returns a boolean if a field has been set.
func (o *EnterpriseClusterWithAddonParameters) HasFleetshardParameters() bool {
	if o != nil && !isNil(o.FleetshardParameters) {
		return true
	}

	return false
}

// SetFleetshardParameters gets a reference to the given []FleetshardParameter and assigns it to the FleetshardParameters field.
func (o *EnterpriseClusterWithAddonParameters) SetFleetshardParameters(v []FleetshardParameter) {
	o.FleetshardParameters = v
}

func (o EnterpriseClusterWithAddonParameters) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["href"] = o.Href
	}
	if true {
		toSerialize["access_kafkas_via_private_network"] = o.AccessKafkasViaPrivateNetwork
	}
	if !isNil(o.ClusterId) {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !isNil(o.FleetshardParameters) {
		toSerialize["fleetshard_parameters"] = o.FleetshardParameters
	}
	return json.Marshal(toSerialize)
}

type NullableEnterpriseClusterWithAddonParameters struct {
	value *EnterpriseClusterWithAddonParameters
	isSet bool
}

func (v NullableEnterpriseClusterWithAddonParameters) Get() *EnterpriseClusterWithAddonParameters {
	return v.value
}

func (v *NullableEnterpriseClusterWithAddonParameters) Set(val *EnterpriseClusterWithAddonParameters) {
	v.value = val
	v.isSet = true
}

func (v NullableEnterpriseClusterWithAddonParameters) IsSet() bool {
	return v.isSet
}

func (v *NullableEnterpriseClusterWithAddonParameters) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnterpriseClusterWithAddonParameters(val *EnterpriseClusterWithAddonParameters) *NullableEnterpriseClusterWithAddonParameters {
	return &NullableEnterpriseClusterWithAddonParameters{value: val, isSet: true}
}

func (v NullableEnterpriseClusterWithAddonParameters) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnterpriseClusterWithAddonParameters) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


