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

// ExcessResourceAllOf struct for ExcessResourceAllOf
type ExcessResourceAllOf struct {
	AvailabilityZoneType *string `json:"availability_zone_type,omitempty"`
	BillingModel *string `json:"billing_model,omitempty"`
	Byoc bool `json:"byoc"`
	Count *int32 `json:"count,omitempty"`
	ResourceName *string `json:"resource_name,omitempty"`
	ResourceType *string `json:"resource_type,omitempty"`
}

// NewExcessResourceAllOf instantiates a new ExcessResourceAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewExcessResourceAllOf(byoc bool) *ExcessResourceAllOf {
	this := ExcessResourceAllOf{}
	this.Byoc = byoc
	return &this
}

// NewExcessResourceAllOfWithDefaults instantiates a new ExcessResourceAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewExcessResourceAllOfWithDefaults() *ExcessResourceAllOf {
	this := ExcessResourceAllOf{}
	return &this
}

// GetAvailabilityZoneType returns the AvailabilityZoneType field value if set, zero value otherwise.
func (o *ExcessResourceAllOf) GetAvailabilityZoneType() string {
	if o == nil || isNil(o.AvailabilityZoneType) {
		var ret string
		return ret
	}
	return *o.AvailabilityZoneType
}

// GetAvailabilityZoneTypeOk returns a tuple with the AvailabilityZoneType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExcessResourceAllOf) GetAvailabilityZoneTypeOk() (*string, bool) {
	if o == nil || isNil(o.AvailabilityZoneType) {
    return nil, false
	}
	return o.AvailabilityZoneType, true
}

// HasAvailabilityZoneType returns a boolean if a field has been set.
func (o *ExcessResourceAllOf) HasAvailabilityZoneType() bool {
	if o != nil && !isNil(o.AvailabilityZoneType) {
		return true
	}

	return false
}

// SetAvailabilityZoneType gets a reference to the given string and assigns it to the AvailabilityZoneType field.
func (o *ExcessResourceAllOf) SetAvailabilityZoneType(v string) {
	o.AvailabilityZoneType = &v
}

// GetBillingModel returns the BillingModel field value if set, zero value otherwise.
func (o *ExcessResourceAllOf) GetBillingModel() string {
	if o == nil || isNil(o.BillingModel) {
		var ret string
		return ret
	}
	return *o.BillingModel
}

// GetBillingModelOk returns a tuple with the BillingModel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExcessResourceAllOf) GetBillingModelOk() (*string, bool) {
	if o == nil || isNil(o.BillingModel) {
    return nil, false
	}
	return o.BillingModel, true
}

// HasBillingModel returns a boolean if a field has been set.
func (o *ExcessResourceAllOf) HasBillingModel() bool {
	if o != nil && !isNil(o.BillingModel) {
		return true
	}

	return false
}

// SetBillingModel gets a reference to the given string and assigns it to the BillingModel field.
func (o *ExcessResourceAllOf) SetBillingModel(v string) {
	o.BillingModel = &v
}

// GetByoc returns the Byoc field value
func (o *ExcessResourceAllOf) GetByoc() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Byoc
}

// GetByocOk returns a tuple with the Byoc field value
// and a boolean to check if the value has been set.
func (o *ExcessResourceAllOf) GetByocOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Byoc, true
}

// SetByoc sets field value
func (o *ExcessResourceAllOf) SetByoc(v bool) {
	o.Byoc = v
}

// GetCount returns the Count field value if set, zero value otherwise.
func (o *ExcessResourceAllOf) GetCount() int32 {
	if o == nil || isNil(o.Count) {
		var ret int32
		return ret
	}
	return *o.Count
}

// GetCountOk returns a tuple with the Count field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExcessResourceAllOf) GetCountOk() (*int32, bool) {
	if o == nil || isNil(o.Count) {
    return nil, false
	}
	return o.Count, true
}

// HasCount returns a boolean if a field has been set.
func (o *ExcessResourceAllOf) HasCount() bool {
	if o != nil && !isNil(o.Count) {
		return true
	}

	return false
}

// SetCount gets a reference to the given int32 and assigns it to the Count field.
func (o *ExcessResourceAllOf) SetCount(v int32) {
	o.Count = &v
}

// GetResourceName returns the ResourceName field value if set, zero value otherwise.
func (o *ExcessResourceAllOf) GetResourceName() string {
	if o == nil || isNil(o.ResourceName) {
		var ret string
		return ret
	}
	return *o.ResourceName
}

// GetResourceNameOk returns a tuple with the ResourceName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExcessResourceAllOf) GetResourceNameOk() (*string, bool) {
	if o == nil || isNil(o.ResourceName) {
    return nil, false
	}
	return o.ResourceName, true
}

// HasResourceName returns a boolean if a field has been set.
func (o *ExcessResourceAllOf) HasResourceName() bool {
	if o != nil && !isNil(o.ResourceName) {
		return true
	}

	return false
}

// SetResourceName gets a reference to the given string and assigns it to the ResourceName field.
func (o *ExcessResourceAllOf) SetResourceName(v string) {
	o.ResourceName = &v
}

// GetResourceType returns the ResourceType field value if set, zero value otherwise.
func (o *ExcessResourceAllOf) GetResourceType() string {
	if o == nil || isNil(o.ResourceType) {
		var ret string
		return ret
	}
	return *o.ResourceType
}

// GetResourceTypeOk returns a tuple with the ResourceType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExcessResourceAllOf) GetResourceTypeOk() (*string, bool) {
	if o == nil || isNil(o.ResourceType) {
    return nil, false
	}
	return o.ResourceType, true
}

// HasResourceType returns a boolean if a field has been set.
func (o *ExcessResourceAllOf) HasResourceType() bool {
	if o != nil && !isNil(o.ResourceType) {
		return true
	}

	return false
}

// SetResourceType gets a reference to the given string and assigns it to the ResourceType field.
func (o *ExcessResourceAllOf) SetResourceType(v string) {
	o.ResourceType = &v
}

func (o ExcessResourceAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AvailabilityZoneType) {
		toSerialize["availability_zone_type"] = o.AvailabilityZoneType
	}
	if !isNil(o.BillingModel) {
		toSerialize["billing_model"] = o.BillingModel
	}
	if true {
		toSerialize["byoc"] = o.Byoc
	}
	if !isNil(o.Count) {
		toSerialize["count"] = o.Count
	}
	if !isNil(o.ResourceName) {
		toSerialize["resource_name"] = o.ResourceName
	}
	if !isNil(o.ResourceType) {
		toSerialize["resource_type"] = o.ResourceType
	}
	return json.Marshal(toSerialize)
}

type NullableExcessResourceAllOf struct {
	value *ExcessResourceAllOf
	isSet bool
}

func (v NullableExcessResourceAllOf) Get() *ExcessResourceAllOf {
	return v.value
}

func (v *NullableExcessResourceAllOf) Set(val *ExcessResourceAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableExcessResourceAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableExcessResourceAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableExcessResourceAllOf(val *ExcessResourceAllOf) *NullableExcessResourceAllOf {
	return &NullableExcessResourceAllOf{value: val, isSet: true}
}

func (v NullableExcessResourceAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableExcessResourceAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


