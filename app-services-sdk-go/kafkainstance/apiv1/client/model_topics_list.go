/*
Kafka Instance API

API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs

API version: 0.13.0-SNAPSHOT
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkainstanceclient

import (
	"encoding/json"
)

// TopicsList struct for TopicsList
type TopicsList struct {
	Kind *string `json:"kind,omitempty"`
	Items []Topic `json:"items"`
	// Total number of entries in the full result set
	Total int32 `json:"total"`
	// Number of entries per page (returned for fetch requests)
	Size *int32 `json:"size,omitempty"`
	// Current page number (returned for fetch requests)
	Page *int32 `json:"page,omitempty"`
	// Offset of the first record returned, zero-based
	// Deprecated
	Offset *int32 `json:"offset,omitempty"`
	// Maximum number of records to return, from request
	// Deprecated
	Limit *int32 `json:"limit,omitempty"`
	// Total number of entries in the full result set
	// Deprecated
	Count *int32 `json:"count,omitempty"`
}

// NewTopicsList instantiates a new TopicsList object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTopicsList(items []Topic, total int32) *TopicsList {
	this := TopicsList{}
	this.Items = items
	this.Total = total
	return &this
}

// NewTopicsListWithDefaults instantiates a new TopicsList object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTopicsListWithDefaults() *TopicsList {
	this := TopicsList{}
	return &this
}

// GetKind returns the Kind field value if set, zero value otherwise.
func (o *TopicsList) GetKind() string {
	if o == nil || isNil(o.Kind) {
		var ret string
		return ret
	}
	return *o.Kind
}

// GetKindOk returns a tuple with the Kind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopicsList) GetKindOk() (*string, bool) {
	if o == nil || isNil(o.Kind) {
    return nil, false
	}
	return o.Kind, true
}

// HasKind returns a boolean if a field has been set.
func (o *TopicsList) HasKind() bool {
	if o != nil && !isNil(o.Kind) {
		return true
	}

	return false
}

// SetKind gets a reference to the given string and assigns it to the Kind field.
func (o *TopicsList) SetKind(v string) {
	o.Kind = &v
}

// GetItems returns the Items field value
func (o *TopicsList) GetItems() []Topic {
	if o == nil {
		var ret []Topic
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *TopicsList) GetItemsOk() ([]Topic, bool) {
	if o == nil {
    return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *TopicsList) SetItems(v []Topic) {
	o.Items = v
}

// GetTotal returns the Total field value
func (o *TopicsList) GetTotal() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *TopicsList) GetTotalOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *TopicsList) SetTotal(v int32) {
	o.Total = v
}

// GetSize returns the Size field value if set, zero value otherwise.
func (o *TopicsList) GetSize() int32 {
	if o == nil || isNil(o.Size) {
		var ret int32
		return ret
	}
	return *o.Size
}

// GetSizeOk returns a tuple with the Size field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopicsList) GetSizeOk() (*int32, bool) {
	if o == nil || isNil(o.Size) {
    return nil, false
	}
	return o.Size, true
}

// HasSize returns a boolean if a field has been set.
func (o *TopicsList) HasSize() bool {
	if o != nil && !isNil(o.Size) {
		return true
	}

	return false
}

// SetSize gets a reference to the given int32 and assigns it to the Size field.
func (o *TopicsList) SetSize(v int32) {
	o.Size = &v
}

// GetPage returns the Page field value if set, zero value otherwise.
func (o *TopicsList) GetPage() int32 {
	if o == nil || isNil(o.Page) {
		var ret int32
		return ret
	}
	return *o.Page
}

// GetPageOk returns a tuple with the Page field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopicsList) GetPageOk() (*int32, bool) {
	if o == nil || isNil(o.Page) {
    return nil, false
	}
	return o.Page, true
}

// HasPage returns a boolean if a field has been set.
func (o *TopicsList) HasPage() bool {
	if o != nil && !isNil(o.Page) {
		return true
	}

	return false
}

// SetPage gets a reference to the given int32 and assigns it to the Page field.
func (o *TopicsList) SetPage(v int32) {
	o.Page = &v
}

// GetOffset returns the Offset field value if set, zero value otherwise.
// Deprecated
func (o *TopicsList) GetOffset() int32 {
	if o == nil || isNil(o.Offset) {
		var ret int32
		return ret
	}
	return *o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *TopicsList) GetOffsetOk() (*int32, bool) {
	if o == nil || isNil(o.Offset) {
    return nil, false
	}
	return o.Offset, true
}

// HasOffset returns a boolean if a field has been set.
func (o *TopicsList) HasOffset() bool {
	if o != nil && !isNil(o.Offset) {
		return true
	}

	return false
}

// SetOffset gets a reference to the given int32 and assigns it to the Offset field.
// Deprecated
func (o *TopicsList) SetOffset(v int32) {
	o.Offset = &v
}

// GetLimit returns the Limit field value if set, zero value otherwise.
// Deprecated
func (o *TopicsList) GetLimit() int32 {
	if o == nil || isNil(o.Limit) {
		var ret int32
		return ret
	}
	return *o.Limit
}

// GetLimitOk returns a tuple with the Limit field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *TopicsList) GetLimitOk() (*int32, bool) {
	if o == nil || isNil(o.Limit) {
    return nil, false
	}
	return o.Limit, true
}

// HasLimit returns a boolean if a field has been set.
func (o *TopicsList) HasLimit() bool {
	if o != nil && !isNil(o.Limit) {
		return true
	}

	return false
}

// SetLimit gets a reference to the given int32 and assigns it to the Limit field.
// Deprecated
func (o *TopicsList) SetLimit(v int32) {
	o.Limit = &v
}

// GetCount returns the Count field value if set, zero value otherwise.
// Deprecated
func (o *TopicsList) GetCount() int32 {
	if o == nil || isNil(o.Count) {
		var ret int32
		return ret
	}
	return *o.Count
}

// GetCountOk returns a tuple with the Count field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *TopicsList) GetCountOk() (*int32, bool) {
	if o == nil || isNil(o.Count) {
    return nil, false
	}
	return o.Count, true
}

// HasCount returns a boolean if a field has been set.
func (o *TopicsList) HasCount() bool {
	if o != nil && !isNil(o.Count) {
		return true
	}

	return false
}

// SetCount gets a reference to the given int32 and assigns it to the Count field.
// Deprecated
func (o *TopicsList) SetCount(v int32) {
	o.Count = &v
}

func (o TopicsList) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Kind) {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["items"] = o.Items
	}
	if true {
		toSerialize["total"] = o.Total
	}
	if !isNil(o.Size) {
		toSerialize["size"] = o.Size
	}
	if !isNil(o.Page) {
		toSerialize["page"] = o.Page
	}
	if !isNil(o.Offset) {
		toSerialize["offset"] = o.Offset
	}
	if !isNil(o.Limit) {
		toSerialize["limit"] = o.Limit
	}
	if !isNil(o.Count) {
		toSerialize["count"] = o.Count
	}
	return json.Marshal(toSerialize)
}

type NullableTopicsList struct {
	value *TopicsList
	isSet bool
}

func (v NullableTopicsList) Get() *TopicsList {
	return v.value
}

func (v *NullableTopicsList) Set(val *TopicsList) {
	v.value = val
	v.isSet = true
}

func (v NullableTopicsList) IsSet() bool {
	return v.isSet
}

func (v *NullableTopicsList) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTopicsList(val *TopicsList) *NullableTopicsList {
	return &NullableTopicsList{value: val, isSet: true}
}

func (v NullableTopicsList) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTopicsList) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


