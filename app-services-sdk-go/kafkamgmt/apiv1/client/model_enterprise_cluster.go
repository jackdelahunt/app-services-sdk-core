/*
 * Kafka Management API
 *
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * API version: 1.14.0
 * Contact: rhosak-support@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkamgmtclient

import (
	"encoding/json"
)

// EnterpriseCluster struct for EnterpriseCluster
type EnterpriseCluster struct {
	Id string `json:"id"`
	Kind string `json:"kind"`
	Href string `json:"href"`
	// Indicates whether Kafkas created on this data plane cluster have to be accessed via private network
	AccessKafkasViaPrivateNetwork bool `json:"access_kafkas_via_private_network"`
	// ocm cluster id of the registered Enterprise cluster
	ClusterId *string `json:"cluster_id,omitempty"`
	// status of registered Enterprise cluster
	Status *string `json:"status,omitempty"`
}

// NewEnterpriseCluster instantiates a new EnterpriseCluster object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnterpriseCluster(id string, kind string, href string, accessKafkasViaPrivateNetwork bool) *EnterpriseCluster {
	this := EnterpriseCluster{}
	this.Id = id
	this.Kind = kind
	this.Href = href
	this.AccessKafkasViaPrivateNetwork = accessKafkasViaPrivateNetwork
	return &this
}

// NewEnterpriseClusterWithDefaults instantiates a new EnterpriseCluster object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnterpriseClusterWithDefaults() *EnterpriseCluster {
	this := EnterpriseCluster{}
	return &this
}

// GetId returns the Id field value
func (o *EnterpriseCluster) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *EnterpriseCluster) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *EnterpriseCluster) SetId(v string) {
	o.Id = v
}

// GetKind returns the Kind field value
func (o *EnterpriseCluster) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *EnterpriseCluster) GetKindOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *EnterpriseCluster) SetKind(v string) {
	o.Kind = v
}

// GetHref returns the Href field value
func (o *EnterpriseCluster) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *EnterpriseCluster) GetHrefOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *EnterpriseCluster) SetHref(v string) {
	o.Href = v
}

// GetAccessKafkasViaPrivateNetwork returns the AccessKafkasViaPrivateNetwork field value
func (o *EnterpriseCluster) GetAccessKafkasViaPrivateNetwork() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.AccessKafkasViaPrivateNetwork
}

// GetAccessKafkasViaPrivateNetworkOk returns a tuple with the AccessKafkasViaPrivateNetwork field value
// and a boolean to check if the value has been set.
func (o *EnterpriseCluster) GetAccessKafkasViaPrivateNetworkOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.AccessKafkasViaPrivateNetwork, true
}

// SetAccessKafkasViaPrivateNetwork sets field value
func (o *EnterpriseCluster) SetAccessKafkasViaPrivateNetwork(v bool) {
	o.AccessKafkasViaPrivateNetwork = v
}

// GetClusterId returns the ClusterId field value if set, zero value otherwise.
func (o *EnterpriseCluster) GetClusterId() string {
	if o == nil || o.ClusterId == nil {
		var ret string
		return ret
	}
	return *o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnterpriseCluster) GetClusterIdOk() (*string, bool) {
	if o == nil || o.ClusterId == nil {
		return nil, false
	}
	return o.ClusterId, true
}

// HasClusterId returns a boolean if a field has been set.
func (o *EnterpriseCluster) HasClusterId() bool {
	if o != nil && o.ClusterId != nil {
		return true
	}

	return false
}

// SetClusterId gets a reference to the given string and assigns it to the ClusterId field.
func (o *EnterpriseCluster) SetClusterId(v string) {
	o.ClusterId = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *EnterpriseCluster) GetStatus() string {
	if o == nil || o.Status == nil {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnterpriseCluster) GetStatusOk() (*string, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *EnterpriseCluster) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *EnterpriseCluster) SetStatus(v string) {
	o.Status = &v
}

func (o EnterpriseCluster) MarshalJSON() ([]byte, error) {
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
	if o.ClusterId != nil {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableEnterpriseCluster struct {
	value *EnterpriseCluster
	isSet bool
}

func (v NullableEnterpriseCluster) Get() *EnterpriseCluster {
	return v.value
}

func (v *NullableEnterpriseCluster) Set(val *EnterpriseCluster) {
	v.value = val
	v.isSet = true
}

func (v NullableEnterpriseCluster) IsSet() bool {
	return v.isSet
}

func (v *NullableEnterpriseCluster) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnterpriseCluster(val *EnterpriseCluster) *NullableEnterpriseCluster {
	return &NullableEnterpriseCluster{value: val, isSet: true}
}

func (v NullableEnterpriseCluster) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnterpriseCluster) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


