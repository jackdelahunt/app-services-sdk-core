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

// KafkaRequestListAllOf struct for KafkaRequestListAllOf
type KafkaRequestListAllOf struct {
	Items []KafkaRequest `json:"items"`
}

// NewKafkaRequestListAllOf instantiates a new KafkaRequestListAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewKafkaRequestListAllOf(items []KafkaRequest) *KafkaRequestListAllOf {
	this := KafkaRequestListAllOf{}
	this.Items = items
	return &this
}

// NewKafkaRequestListAllOfWithDefaults instantiates a new KafkaRequestListAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewKafkaRequestListAllOfWithDefaults() *KafkaRequestListAllOf {
	this := KafkaRequestListAllOf{}
	return &this
}

// GetItems returns the Items field value
func (o *KafkaRequestListAllOf) GetItems() []KafkaRequest {
	if o == nil {
		var ret []KafkaRequest
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *KafkaRequestListAllOf) GetItemsOk() ([]KafkaRequest, bool) {
	if o == nil {
    return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *KafkaRequestListAllOf) SetItems(v []KafkaRequest) {
	o.Items = v
}

func (o KafkaRequestListAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["items"] = o.Items
	}
	return json.Marshal(toSerialize)
}

type NullableKafkaRequestListAllOf struct {
	value *KafkaRequestListAllOf
	isSet bool
}

func (v NullableKafkaRequestListAllOf) Get() *KafkaRequestListAllOf {
	return v.value
}

func (v *NullableKafkaRequestListAllOf) Set(val *KafkaRequestListAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableKafkaRequestListAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableKafkaRequestListAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKafkaRequestListAllOf(val *KafkaRequestListAllOf) *NullableKafkaRequestListAllOf {
	return &NullableKafkaRequestListAllOf{value: val, isSet: true}
}

func (v NullableKafkaRequestListAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKafkaRequestListAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


