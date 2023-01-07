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

// DeletedSubscriptionListAllOf struct for DeletedSubscriptionListAllOf
type DeletedSubscriptionListAllOf struct {
	Items []DeletedSubscription `json:"items,omitempty"`
}

// NewDeletedSubscriptionListAllOf instantiates a new DeletedSubscriptionListAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeletedSubscriptionListAllOf() *DeletedSubscriptionListAllOf {
	this := DeletedSubscriptionListAllOf{}
	return &this
}

// NewDeletedSubscriptionListAllOfWithDefaults instantiates a new DeletedSubscriptionListAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeletedSubscriptionListAllOfWithDefaults() *DeletedSubscriptionListAllOf {
	this := DeletedSubscriptionListAllOf{}
	return &this
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *DeletedSubscriptionListAllOf) GetItems() []DeletedSubscription {
	if o == nil || isNil(o.Items) {
		var ret []DeletedSubscription
		return ret
	}
	return o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeletedSubscriptionListAllOf) GetItemsOk() ([]DeletedSubscription, bool) {
	if o == nil || isNil(o.Items) {
    return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *DeletedSubscriptionListAllOf) HasItems() bool {
	if o != nil && !isNil(o.Items) {
		return true
	}

	return false
}

// SetItems gets a reference to the given []DeletedSubscription and assigns it to the Items field.
func (o *DeletedSubscriptionListAllOf) SetItems(v []DeletedSubscription) {
	o.Items = v
}

func (o DeletedSubscriptionListAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Items) {
		toSerialize["items"] = o.Items
	}
	return json.Marshal(toSerialize)
}

type NullableDeletedSubscriptionListAllOf struct {
	value *DeletedSubscriptionListAllOf
	isSet bool
}

func (v NullableDeletedSubscriptionListAllOf) Get() *DeletedSubscriptionListAllOf {
	return v.value
}

func (v *NullableDeletedSubscriptionListAllOf) Set(val *DeletedSubscriptionListAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableDeletedSubscriptionListAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableDeletedSubscriptionListAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeletedSubscriptionListAllOf(val *DeletedSubscriptionListAllOf) *NullableDeletedSubscriptionListAllOf {
	return &NullableDeletedSubscriptionListAllOf{value: val, isSet: true}
}

func (v NullableDeletedSubscriptionListAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeletedSubscriptionListAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


