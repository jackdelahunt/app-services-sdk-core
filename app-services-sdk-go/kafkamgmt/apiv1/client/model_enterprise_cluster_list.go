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

// checks if the EnterpriseClusterList type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &EnterpriseClusterList{}

// EnterpriseClusterList struct for EnterpriseClusterList
type EnterpriseClusterList struct {
	Kind string `json:"kind"`
	Page int32 `json:"page"`
	Size int32 `json:"size"`
	Total int32 `json:"total"`
	Items []EnterpriseClusterListItem `json:"items"`
}

// NewEnterpriseClusterList instantiates a new EnterpriseClusterList object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnterpriseClusterList(kind string, page int32, size int32, total int32, items []EnterpriseClusterListItem) *EnterpriseClusterList {
	this := EnterpriseClusterList{}
	this.Kind = kind
	this.Page = page
	this.Size = size
	this.Total = total
	this.Items = items
	return &this
}

// NewEnterpriseClusterListWithDefaults instantiates a new EnterpriseClusterList object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnterpriseClusterListWithDefaults() *EnterpriseClusterList {
	this := EnterpriseClusterList{}
	return &this
}

// GetKind returns the Kind field value
func (o *EnterpriseClusterList) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterList) GetKindOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *EnterpriseClusterList) SetKind(v string) {
	o.Kind = v
}

// GetPage returns the Page field value
func (o *EnterpriseClusterList) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterList) GetPageOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *EnterpriseClusterList) SetPage(v int32) {
	o.Page = v
}

// GetSize returns the Size field value
func (o *EnterpriseClusterList) GetSize() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Size
}

// GetSizeOk returns a tuple with the Size field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterList) GetSizeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Size, true
}

// SetSize sets field value
func (o *EnterpriseClusterList) SetSize(v int32) {
	o.Size = v
}

// GetTotal returns the Total field value
func (o *EnterpriseClusterList) GetTotal() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterList) GetTotalOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *EnterpriseClusterList) SetTotal(v int32) {
	o.Total = v
}

// GetItems returns the Items field value
func (o *EnterpriseClusterList) GetItems() []EnterpriseClusterListItem {
	if o == nil {
		var ret []EnterpriseClusterListItem
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *EnterpriseClusterList) GetItemsOk() ([]EnterpriseClusterListItem, bool) {
	if o == nil {
		return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *EnterpriseClusterList) SetItems(v []EnterpriseClusterListItem) {
	o.Items = v
}

func (o EnterpriseClusterList) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o EnterpriseClusterList) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["kind"] = o.Kind
	toSerialize["page"] = o.Page
	toSerialize["size"] = o.Size
	toSerialize["total"] = o.Total
	toSerialize["items"] = o.Items
	return toSerialize, nil
}

type NullableEnterpriseClusterList struct {
	value *EnterpriseClusterList
	isSet bool
}

func (v NullableEnterpriseClusterList) Get() *EnterpriseClusterList {
	return v.value
}

func (v *NullableEnterpriseClusterList) Set(val *EnterpriseClusterList) {
	v.value = val
	v.isSet = true
}

func (v NullableEnterpriseClusterList) IsSet() bool {
	return v.isSet
}

func (v *NullableEnterpriseClusterList) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnterpriseClusterList(val *EnterpriseClusterList) *NullableEnterpriseClusterList {
	return &NullableEnterpriseClusterList{value: val, isSet: true}
}

func (v NullableEnterpriseClusterList) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnterpriseClusterList) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


