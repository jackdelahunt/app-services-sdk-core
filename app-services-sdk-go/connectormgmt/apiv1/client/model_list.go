/*
Connector Management API

Connector Management API is a REST API to manage connectors.

API version: 0.1.0
Contact: rhosak-support@redhat.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package connectormgmtclient

import (
	"encoding/json"
)

// List struct for List
type List struct {
	Kind string `json:"kind"`
	Page int32 `json:"page"`
	Size int32 `json:"size"`
	Total int32 `json:"total"`
	Items []ObjectReference `json:"items"`
}

// NewList instantiates a new List object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewList(kind string, page int32, size int32, total int32, items []ObjectReference) *List {
	this := List{}
	this.Kind = kind
	this.Page = page
	this.Size = size
	this.Total = total
	this.Items = items
	return &this
}

// NewListWithDefaults instantiates a new List object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewListWithDefaults() *List {
	this := List{}
	return &this
}

// GetKind returns the Kind field value
func (o *List) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *List) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *List) SetKind(v string) {
	o.Kind = v
}

// GetPage returns the Page field value
func (o *List) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *List) GetPageOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *List) SetPage(v int32) {
	o.Page = v
}

// GetSize returns the Size field value
func (o *List) GetSize() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Size
}

// GetSizeOk returns a tuple with the Size field value
// and a boolean to check if the value has been set.
func (o *List) GetSizeOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Size, true
}

// SetSize sets field value
func (o *List) SetSize(v int32) {
	o.Size = v
}

// GetTotal returns the Total field value
func (o *List) GetTotal() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *List) GetTotalOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *List) SetTotal(v int32) {
	o.Total = v
}

// GetItems returns the Items field value
func (o *List) GetItems() []ObjectReference {
	if o == nil {
		var ret []ObjectReference
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *List) GetItemsOk() ([]ObjectReference, bool) {
	if o == nil {
    return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *List) SetItems(v []ObjectReference) {
	o.Items = v
}

func (o List) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["page"] = o.Page
	}
	if true {
		toSerialize["size"] = o.Size
	}
	if true {
		toSerialize["total"] = o.Total
	}
	if true {
		toSerialize["items"] = o.Items
	}
	return json.Marshal(toSerialize)
}

type NullableList struct {
	value *List
	isSet bool
}

func (v NullableList) Get() *List {
	return v.value
}

func (v *NullableList) Set(val *List) {
	v.value = val
	v.isSet = true
}

func (v NullableList) IsSet() bool {
	return v.isSet
}

func (v *NullableList) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableList(val *List) *NullableList {
	return &NullableList{value: val, isSet: true}
}

func (v NullableList) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableList) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


