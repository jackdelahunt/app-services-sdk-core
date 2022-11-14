/*
 * Red Hat Openshift SmartEvents Fleet Manager
 *
 * The API exposed by the fleet manager of the SmartEvents service.
 *
 * API version: 0.0.1
 * Contact: openbridge-dev@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package smarteventsmgmtclient

import (
	"encoding/json"
)

// ErrorsList struct for ErrorsList
type ErrorsList struct {
	Kind string `json:"kind"`
	Items *[]Error `json:"items,omitempty"`
}

// NewErrorsList instantiates a new ErrorsList object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewErrorsList(kind string) *ErrorsList {
	this := ErrorsList{}
	this.Kind = kind
	return &this
}

// NewErrorsListWithDefaults instantiates a new ErrorsList object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewErrorsListWithDefaults() *ErrorsList {
	this := ErrorsList{}
	return &this
}

// GetKind returns the Kind field value
func (o *ErrorsList) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *ErrorsList) GetKindOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *ErrorsList) SetKind(v string) {
	o.Kind = v
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *ErrorsList) GetItems() []Error {
	if o == nil || o.Items == nil {
		var ret []Error
		return ret
	}
	return *o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorsList) GetItemsOk() (*[]Error, bool) {
	if o == nil || o.Items == nil {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *ErrorsList) HasItems() bool {
	if o != nil && o.Items != nil {
		return true
	}

	return false
}

// SetItems gets a reference to the given []Error and assigns it to the Items field.
func (o *ErrorsList) SetItems(v []Error) {
	o.Items = &v
}

func (o ErrorsList) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if o.Items != nil {
		toSerialize["items"] = o.Items
	}
	return json.Marshal(toSerialize)
}

type NullableErrorsList struct {
	value *ErrorsList
	isSet bool
}

func (v NullableErrorsList) Get() *ErrorsList {
	return v.value
}

func (v *NullableErrorsList) Set(val *ErrorsList) {
	v.value = val
	v.isSet = true
}

func (v NullableErrorsList) IsSet() bool {
	return v.isSet
}

func (v *NullableErrorsList) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableErrorsList(val *ErrorsList) *NullableErrorsList {
	return &NullableErrorsList{value: val, isSet: true}
}

func (v NullableErrorsList) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableErrorsList) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


