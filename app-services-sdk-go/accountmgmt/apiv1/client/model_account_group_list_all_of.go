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

// AccountGroupListAllOf struct for AccountGroupListAllOf
type AccountGroupListAllOf struct {
	Items []AccountGroup `json:"items,omitempty"`
}

// NewAccountGroupListAllOf instantiates a new AccountGroupListAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccountGroupListAllOf() *AccountGroupListAllOf {
	this := AccountGroupListAllOf{}
	return &this
}

// NewAccountGroupListAllOfWithDefaults instantiates a new AccountGroupListAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountGroupListAllOfWithDefaults() *AccountGroupListAllOf {
	this := AccountGroupListAllOf{}
	return &this
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *AccountGroupListAllOf) GetItems() []AccountGroup {
	if o == nil || isNil(o.Items) {
		var ret []AccountGroup
		return ret
	}
	return o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountGroupListAllOf) GetItemsOk() ([]AccountGroup, bool) {
	if o == nil || isNil(o.Items) {
    return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *AccountGroupListAllOf) HasItems() bool {
	if o != nil && !isNil(o.Items) {
		return true
	}

	return false
}

// SetItems gets a reference to the given []AccountGroup and assigns it to the Items field.
func (o *AccountGroupListAllOf) SetItems(v []AccountGroup) {
	o.Items = v
}

func (o AccountGroupListAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Items) {
		toSerialize["items"] = o.Items
	}
	return json.Marshal(toSerialize)
}

type NullableAccountGroupListAllOf struct {
	value *AccountGroupListAllOf
	isSet bool
}

func (v NullableAccountGroupListAllOf) Get() *AccountGroupListAllOf {
	return v.value
}

func (v *NullableAccountGroupListAllOf) Set(val *AccountGroupListAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableAccountGroupListAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableAccountGroupListAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccountGroupListAllOf(val *AccountGroupListAllOf) *NullableAccountGroupListAllOf {
	return &NullableAccountGroupListAllOf{value: val, isSet: true}
}

func (v NullableAccountGroupListAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccountGroupListAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


