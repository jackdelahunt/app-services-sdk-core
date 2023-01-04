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

// AccountGroupAssignmentList struct for AccountGroupAssignmentList
type AccountGroupAssignmentList struct {
	Kind string `json:"kind"`
	Page int32 `json:"page"`
	Size int32 `json:"size"`
	Total int32 `json:"total"`
	Items []AccountGroupAssignment `json:"items"`
}

// NewAccountGroupAssignmentList instantiates a new AccountGroupAssignmentList object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccountGroupAssignmentList(kind string, page int32, size int32, total int32, items []AccountGroupAssignment) *AccountGroupAssignmentList {
	this := AccountGroupAssignmentList{}
	this.Kind = kind
	this.Page = page
	this.Size = size
	this.Total = total
	this.Items = items
	return &this
}

// NewAccountGroupAssignmentListWithDefaults instantiates a new AccountGroupAssignmentList object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountGroupAssignmentListWithDefaults() *AccountGroupAssignmentList {
	this := AccountGroupAssignmentList{}
	return &this
}

// GetKind returns the Kind field value
func (o *AccountGroupAssignmentList) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *AccountGroupAssignmentList) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *AccountGroupAssignmentList) SetKind(v string) {
	o.Kind = v
}

// GetPage returns the Page field value
func (o *AccountGroupAssignmentList) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *AccountGroupAssignmentList) GetPageOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *AccountGroupAssignmentList) SetPage(v int32) {
	o.Page = v
}

// GetSize returns the Size field value
func (o *AccountGroupAssignmentList) GetSize() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Size
}

// GetSizeOk returns a tuple with the Size field value
// and a boolean to check if the value has been set.
func (o *AccountGroupAssignmentList) GetSizeOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Size, true
}

// SetSize sets field value
func (o *AccountGroupAssignmentList) SetSize(v int32) {
	o.Size = v
}

// GetTotal returns the Total field value
func (o *AccountGroupAssignmentList) GetTotal() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *AccountGroupAssignmentList) GetTotalOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *AccountGroupAssignmentList) SetTotal(v int32) {
	o.Total = v
}

// GetItems returns the Items field value
func (o *AccountGroupAssignmentList) GetItems() []AccountGroupAssignment {
	if o == nil {
		var ret []AccountGroupAssignment
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *AccountGroupAssignmentList) GetItemsOk() ([]AccountGroupAssignment, bool) {
	if o == nil {
    return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *AccountGroupAssignmentList) SetItems(v []AccountGroupAssignment) {
	o.Items = v
}

func (o AccountGroupAssignmentList) MarshalJSON() ([]byte, error) {
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

type NullableAccountGroupAssignmentList struct {
	value *AccountGroupAssignmentList
	isSet bool
}

func (v NullableAccountGroupAssignmentList) Get() *AccountGroupAssignmentList {
	return v.value
}

func (v *NullableAccountGroupAssignmentList) Set(val *AccountGroupAssignmentList) {
	v.value = val
	v.isSet = true
}

func (v NullableAccountGroupAssignmentList) IsSet() bool {
	return v.isSet
}

func (v *NullableAccountGroupAssignmentList) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccountGroupAssignmentList(val *AccountGroupAssignmentList) *NullableAccountGroupAssignmentList {
	return &NullableAccountGroupAssignmentList{value: val, isSet: true}
}

func (v NullableAccountGroupAssignmentList) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccountGroupAssignmentList) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


