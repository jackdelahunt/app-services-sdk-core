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

// SelfEntitlementStatus struct for SelfEntitlementStatus
type SelfEntitlementStatus struct {
	Product *string `json:"product,omitempty"`
	Status *string `json:"status,omitempty"`
}

// NewSelfEntitlementStatus instantiates a new SelfEntitlementStatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSelfEntitlementStatus() *SelfEntitlementStatus {
	this := SelfEntitlementStatus{}
	return &this
}

// NewSelfEntitlementStatusWithDefaults instantiates a new SelfEntitlementStatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSelfEntitlementStatusWithDefaults() *SelfEntitlementStatus {
	this := SelfEntitlementStatus{}
	return &this
}

// GetProduct returns the Product field value if set, zero value otherwise.
func (o *SelfEntitlementStatus) GetProduct() string {
	if o == nil || isNil(o.Product) {
		var ret string
		return ret
	}
	return *o.Product
}

// GetProductOk returns a tuple with the Product field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SelfEntitlementStatus) GetProductOk() (*string, bool) {
	if o == nil || isNil(o.Product) {
    return nil, false
	}
	return o.Product, true
}

// HasProduct returns a boolean if a field has been set.
func (o *SelfEntitlementStatus) HasProduct() bool {
	if o != nil && !isNil(o.Product) {
		return true
	}

	return false
}

// SetProduct gets a reference to the given string and assigns it to the Product field.
func (o *SelfEntitlementStatus) SetProduct(v string) {
	o.Product = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *SelfEntitlementStatus) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SelfEntitlementStatus) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *SelfEntitlementStatus) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *SelfEntitlementStatus) SetStatus(v string) {
	o.Status = &v
}

func (o SelfEntitlementStatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Product) {
		toSerialize["product"] = o.Product
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableSelfEntitlementStatus struct {
	value *SelfEntitlementStatus
	isSet bool
}

func (v NullableSelfEntitlementStatus) Get() *SelfEntitlementStatus {
	return v.value
}

func (v *NullableSelfEntitlementStatus) Set(val *SelfEntitlementStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableSelfEntitlementStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableSelfEntitlementStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSelfEntitlementStatus(val *SelfEntitlementStatus) *NullableSelfEntitlementStatus {
	return &NullableSelfEntitlementStatus{value: val, isSet: true}
}

func (v NullableSelfEntitlementStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSelfEntitlementStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


