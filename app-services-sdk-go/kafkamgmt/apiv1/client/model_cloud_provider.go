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

// CloudProvider Cloud provider.
type CloudProvider struct {
	// Indicates the type of this object. Will be 'CloudProvider' link.
	Kind *string `json:"kind,omitempty"`
	// Unique identifier of the object.
	Id *string `json:"id,omitempty"`
	// Name of the cloud provider for display purposes.
	DisplayName *string `json:"display_name,omitempty"`
	// Human friendly identifier of the cloud provider, for example `aws`.
	Name *string `json:"name,omitempty"`
	// Whether the cloud provider is enabled for deploying an OSD cluster.
	Enabled bool `json:"enabled"`
}

// NewCloudProvider instantiates a new CloudProvider object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCloudProvider(enabled bool) *CloudProvider {
	this := CloudProvider{}
	this.Enabled = enabled
	return &this
}

// NewCloudProviderWithDefaults instantiates a new CloudProvider object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCloudProviderWithDefaults() *CloudProvider {
	this := CloudProvider{}
	return &this
}

// GetKind returns the Kind field value if set, zero value otherwise.
func (o *CloudProvider) GetKind() string {
	if o == nil || isNil(o.Kind) {
		var ret string
		return ret
	}
	return *o.Kind
}

// GetKindOk returns a tuple with the Kind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudProvider) GetKindOk() (*string, bool) {
	if o == nil || isNil(o.Kind) {
    return nil, false
	}
	return o.Kind, true
}

// HasKind returns a boolean if a field has been set.
func (o *CloudProvider) HasKind() bool {
	if o != nil && !isNil(o.Kind) {
		return true
	}

	return false
}

// SetKind gets a reference to the given string and assigns it to the Kind field.
func (o *CloudProvider) SetKind(v string) {
	o.Kind = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CloudProvider) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudProvider) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CloudProvider) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *CloudProvider) SetId(v string) {
	o.Id = &v
}

// GetDisplayName returns the DisplayName field value if set, zero value otherwise.
func (o *CloudProvider) GetDisplayName() string {
	if o == nil || isNil(o.DisplayName) {
		var ret string
		return ret
	}
	return *o.DisplayName
}

// GetDisplayNameOk returns a tuple with the DisplayName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudProvider) GetDisplayNameOk() (*string, bool) {
	if o == nil || isNil(o.DisplayName) {
    return nil, false
	}
	return o.DisplayName, true
}

// HasDisplayName returns a boolean if a field has been set.
func (o *CloudProvider) HasDisplayName() bool {
	if o != nil && !isNil(o.DisplayName) {
		return true
	}

	return false
}

// SetDisplayName gets a reference to the given string and assigns it to the DisplayName field.
func (o *CloudProvider) SetDisplayName(v string) {
	o.DisplayName = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *CloudProvider) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudProvider) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *CloudProvider) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *CloudProvider) SetName(v string) {
	o.Name = &v
}

// GetEnabled returns the Enabled field value
func (o *CloudProvider) GetEnabled() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value
// and a boolean to check if the value has been set.
func (o *CloudProvider) GetEnabledOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Enabled, true
}

// SetEnabled sets field value
func (o *CloudProvider) SetEnabled(v bool) {
	o.Enabled = v
}

func (o CloudProvider) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Kind) {
		toSerialize["kind"] = o.Kind
	}
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.DisplayName) {
		toSerialize["display_name"] = o.DisplayName
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["enabled"] = o.Enabled
	}
	return json.Marshal(toSerialize)
}

type NullableCloudProvider struct {
	value *CloudProvider
	isSet bool
}

func (v NullableCloudProvider) Get() *CloudProvider {
	return v.value
}

func (v *NullableCloudProvider) Set(val *CloudProvider) {
	v.value = val
	v.isSet = true
}

func (v NullableCloudProvider) IsSet() bool {
	return v.isSet
}

func (v *NullableCloudProvider) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCloudProvider(val *CloudProvider) *NullableCloudProvider {
	return &NullableCloudProvider{value: val, isSet: true}
}

func (v NullableCloudProvider) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCloudProvider) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


