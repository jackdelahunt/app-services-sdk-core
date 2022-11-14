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

// RecordListAllOf A page of records consumed from a topic
type RecordListAllOf struct {
	Items *[]Record `json:"items,omitempty"`
	// Total number of records returned in this request. This value does not indicate the total number of records in the topic.
	Total *int32 `json:"total,omitempty"`
	// Not used
	Size *int32 `json:"size,omitempty"`
	// Not used
	Page *int32 `json:"page,omitempty"`
}

// NewRecordListAllOf instantiates a new RecordListAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRecordListAllOf() *RecordListAllOf {
	this := RecordListAllOf{}
	return &this
}

// NewRecordListAllOfWithDefaults instantiates a new RecordListAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRecordListAllOfWithDefaults() *RecordListAllOf {
	this := RecordListAllOf{}
	return &this
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *RecordListAllOf) GetItems() []Record {
	if o == nil || o.Items == nil {
		var ret []Record
		return ret
	}
	return *o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordListAllOf) GetItemsOk() (*[]Record, bool) {
	if o == nil || o.Items == nil {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *RecordListAllOf) HasItems() bool {
	if o != nil && o.Items != nil {
		return true
	}

	return false
}

// SetItems gets a reference to the given []Record and assigns it to the Items field.
func (o *RecordListAllOf) SetItems(v []Record) {
	o.Items = &v
}

// GetTotal returns the Total field value if set, zero value otherwise.
func (o *RecordListAllOf) GetTotal() int32 {
	if o == nil || o.Total == nil {
		var ret int32
		return ret
	}
	return *o.Total
}

// GetTotalOk returns a tuple with the Total field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordListAllOf) GetTotalOk() (*int32, bool) {
	if o == nil || o.Total == nil {
		return nil, false
	}
	return o.Total, true
}

// HasTotal returns a boolean if a field has been set.
func (o *RecordListAllOf) HasTotal() bool {
	if o != nil && o.Total != nil {
		return true
	}

	return false
}

// SetTotal gets a reference to the given int32 and assigns it to the Total field.
func (o *RecordListAllOf) SetTotal(v int32) {
	o.Total = &v
}

// GetSize returns the Size field value if set, zero value otherwise.
func (o *RecordListAllOf) GetSize() int32 {
	if o == nil || o.Size == nil {
		var ret int32
		return ret
	}
	return *o.Size
}

// GetSizeOk returns a tuple with the Size field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordListAllOf) GetSizeOk() (*int32, bool) {
	if o == nil || o.Size == nil {
		return nil, false
	}
	return o.Size, true
}

// HasSize returns a boolean if a field has been set.
func (o *RecordListAllOf) HasSize() bool {
	if o != nil && o.Size != nil {
		return true
	}

	return false
}

// SetSize gets a reference to the given int32 and assigns it to the Size field.
func (o *RecordListAllOf) SetSize(v int32) {
	o.Size = &v
}

// GetPage returns the Page field value if set, zero value otherwise.
func (o *RecordListAllOf) GetPage() int32 {
	if o == nil || o.Page == nil {
		var ret int32
		return ret
	}
	return *o.Page
}

// GetPageOk returns a tuple with the Page field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordListAllOf) GetPageOk() (*int32, bool) {
	if o == nil || o.Page == nil {
		return nil, false
	}
	return o.Page, true
}

// HasPage returns a boolean if a field has been set.
func (o *RecordListAllOf) HasPage() bool {
	if o != nil && o.Page != nil {
		return true
	}

	return false
}

// SetPage gets a reference to the given int32 and assigns it to the Page field.
func (o *RecordListAllOf) SetPage(v int32) {
	o.Page = &v
}

func (o RecordListAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Items != nil {
		toSerialize["items"] = o.Items
	}
	if o.Total != nil {
		toSerialize["total"] = o.Total
	}
	if o.Size != nil {
		toSerialize["size"] = o.Size
	}
	if o.Page != nil {
		toSerialize["page"] = o.Page
	}
	return json.Marshal(toSerialize)
}

type NullableRecordListAllOf struct {
	value *RecordListAllOf
	isSet bool
}

func (v NullableRecordListAllOf) Get() *RecordListAllOf {
	return v.value
}

func (v *NullableRecordListAllOf) Set(val *RecordListAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableRecordListAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableRecordListAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecordListAllOf(val *RecordListAllOf) *NullableRecordListAllOf {
	return &NullableRecordListAllOf{value: val, isSet: true}
}

func (v NullableRecordListAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecordListAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


