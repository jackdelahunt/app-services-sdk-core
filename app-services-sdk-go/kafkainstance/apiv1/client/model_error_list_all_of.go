/*
 * Kafka Instance API
 *
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * API version: 0.13.0-SNAPSHOT
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkainstanceclient

import (
	"encoding/json"
)

// ErrorListAllOf List of errors
type ErrorListAllOf struct {
	Items *[]Error `json:"items,omitempty"`
	// Total number of errors returned in this request
	Total *int32 `json:"total,omitempty"`
}

// NewErrorListAllOf instantiates a new ErrorListAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewErrorListAllOf() *ErrorListAllOf {
	this := ErrorListAllOf{}
	return &this
}

// NewErrorListAllOfWithDefaults instantiates a new ErrorListAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewErrorListAllOfWithDefaults() *ErrorListAllOf {
	this := ErrorListAllOf{}
	return &this
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *ErrorListAllOf) GetItems() []Error {
	if o == nil || o.Items == nil {
		var ret []Error
		return ret
	}
	return *o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorListAllOf) GetItemsOk() (*[]Error, bool) {
	if o == nil || o.Items == nil {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *ErrorListAllOf) HasItems() bool {
	if o != nil && o.Items != nil {
		return true
	}

	return false
}

// SetItems gets a reference to the given []Error and assigns it to the Items field.
func (o *ErrorListAllOf) SetItems(v []Error) {
	o.Items = &v
}

// GetTotal returns the Total field value if set, zero value otherwise.
func (o *ErrorListAllOf) GetTotal() int32 {
	if o == nil || o.Total == nil {
		var ret int32
		return ret
	}
	return *o.Total
}

// GetTotalOk returns a tuple with the Total field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorListAllOf) GetTotalOk() (*int32, bool) {
	if o == nil || o.Total == nil {
		return nil, false
	}
	return o.Total, true
}

// HasTotal returns a boolean if a field has been set.
func (o *ErrorListAllOf) HasTotal() bool {
	if o != nil && o.Total != nil {
		return true
	}

	return false
}

// SetTotal gets a reference to the given int32 and assigns it to the Total field.
func (o *ErrorListAllOf) SetTotal(v int32) {
	o.Total = &v
}

func (o ErrorListAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Items != nil {
		toSerialize["items"] = o.Items
	}
	if o.Total != nil {
		toSerialize["total"] = o.Total
	}
	return json.Marshal(toSerialize)
}

type NullableErrorListAllOf struct {
	value *ErrorListAllOf
	isSet bool
}

func (v NullableErrorListAllOf) Get() *ErrorListAllOf {
	return v.value
}

func (v *NullableErrorListAllOf) Set(val *ErrorListAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableErrorListAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableErrorListAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableErrorListAllOf(val *ErrorListAllOf) *NullableErrorListAllOf {
	return &NullableErrorListAllOf{value: val, isSet: true}
}

func (v NullableErrorListAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableErrorListAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


