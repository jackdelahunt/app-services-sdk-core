/*
Red Hat Openshift SmartEvents Fleet Manager V2

The API exposed by the fleet manager of the SmartEvents service.

API version: 0.0.1
Contact: openbridge-dev@redhat.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package smarteventsmgmtclient

import (
	"encoding/json"
)

// CloudRegionResponse struct for CloudRegionResponse
type CloudRegionResponse struct {
	Kind string `json:"kind"`
	Name string `json:"name"`
	DisplayName string `json:"display_name"`
	Enabled bool `json:"enabled"`
}

// NewCloudRegionResponse instantiates a new CloudRegionResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCloudRegionResponse(kind string, name string, displayName string, enabled bool) *CloudRegionResponse {
	this := CloudRegionResponse{}
	this.Kind = kind
	this.Name = name
	this.DisplayName = displayName
	this.Enabled = enabled
	return &this
}

// NewCloudRegionResponseWithDefaults instantiates a new CloudRegionResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCloudRegionResponseWithDefaults() *CloudRegionResponse {
	this := CloudRegionResponse{}
	return &this
}

// GetKind returns the Kind field value
func (o *CloudRegionResponse) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *CloudRegionResponse) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *CloudRegionResponse) SetKind(v string) {
	o.Kind = v
}

// GetName returns the Name field value
func (o *CloudRegionResponse) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CloudRegionResponse) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CloudRegionResponse) SetName(v string) {
	o.Name = v
}

// GetDisplayName returns the DisplayName field value
func (o *CloudRegionResponse) GetDisplayName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.DisplayName
}

// GetDisplayNameOk returns a tuple with the DisplayName field value
// and a boolean to check if the value has been set.
func (o *CloudRegionResponse) GetDisplayNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.DisplayName, true
}

// SetDisplayName sets field value
func (o *CloudRegionResponse) SetDisplayName(v string) {
	o.DisplayName = v
}

// GetEnabled returns the Enabled field value
func (o *CloudRegionResponse) GetEnabled() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value
// and a boolean to check if the value has been set.
func (o *CloudRegionResponse) GetEnabledOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Enabled, true
}

// SetEnabled sets field value
func (o *CloudRegionResponse) SetEnabled(v bool) {
	o.Enabled = v
}

func (o CloudRegionResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["display_name"] = o.DisplayName
	}
	if true {
		toSerialize["enabled"] = o.Enabled
	}
	return json.Marshal(toSerialize)
}

type NullableCloudRegionResponse struct {
	value *CloudRegionResponse
	isSet bool
}

func (v NullableCloudRegionResponse) Get() *CloudRegionResponse {
	return v.value
}

func (v *NullableCloudRegionResponse) Set(val *CloudRegionResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableCloudRegionResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableCloudRegionResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCloudRegionResponse(val *CloudRegionResponse) *NullableCloudRegionResponse {
	return &NullableCloudRegionResponse{value: val, isSet: true}
}

func (v NullableCloudRegionResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCloudRegionResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


