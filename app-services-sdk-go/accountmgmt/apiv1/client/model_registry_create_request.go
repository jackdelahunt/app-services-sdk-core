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

// RegistryCreateRequest struct for RegistryCreateRequest
type RegistryCreateRequest struct {
	CloudAlias *bool `json:"cloudAlias,omitempty"`
	Name string `json:"name"`
	OrgName *string `json:"org_name,omitempty"`
	TeamName *string `json:"team_name,omitempty"`
	Type string `json:"type"`
	Url string `json:"url"`
}

// NewRegistryCreateRequest instantiates a new RegistryCreateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRegistryCreateRequest(name string, type_ string, url string) *RegistryCreateRequest {
	this := RegistryCreateRequest{}
	this.Name = name
	this.Type = type_
	this.Url = url
	return &this
}

// NewRegistryCreateRequestWithDefaults instantiates a new RegistryCreateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRegistryCreateRequestWithDefaults() *RegistryCreateRequest {
	this := RegistryCreateRequest{}
	return &this
}

// GetCloudAlias returns the CloudAlias field value if set, zero value otherwise.
func (o *RegistryCreateRequest) GetCloudAlias() bool {
	if o == nil || isNil(o.CloudAlias) {
		var ret bool
		return ret
	}
	return *o.CloudAlias
}

// GetCloudAliasOk returns a tuple with the CloudAlias field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RegistryCreateRequest) GetCloudAliasOk() (*bool, bool) {
	if o == nil || isNil(o.CloudAlias) {
    return nil, false
	}
	return o.CloudAlias, true
}

// HasCloudAlias returns a boolean if a field has been set.
func (o *RegistryCreateRequest) HasCloudAlias() bool {
	if o != nil && !isNil(o.CloudAlias) {
		return true
	}

	return false
}

// SetCloudAlias gets a reference to the given bool and assigns it to the CloudAlias field.
func (o *RegistryCreateRequest) SetCloudAlias(v bool) {
	o.CloudAlias = &v
}

// GetName returns the Name field value
func (o *RegistryCreateRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *RegistryCreateRequest) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *RegistryCreateRequest) SetName(v string) {
	o.Name = v
}

// GetOrgName returns the OrgName field value if set, zero value otherwise.
func (o *RegistryCreateRequest) GetOrgName() string {
	if o == nil || isNil(o.OrgName) {
		var ret string
		return ret
	}
	return *o.OrgName
}

// GetOrgNameOk returns a tuple with the OrgName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RegistryCreateRequest) GetOrgNameOk() (*string, bool) {
	if o == nil || isNil(o.OrgName) {
    return nil, false
	}
	return o.OrgName, true
}

// HasOrgName returns a boolean if a field has been set.
func (o *RegistryCreateRequest) HasOrgName() bool {
	if o != nil && !isNil(o.OrgName) {
		return true
	}

	return false
}

// SetOrgName gets a reference to the given string and assigns it to the OrgName field.
func (o *RegistryCreateRequest) SetOrgName(v string) {
	o.OrgName = &v
}

// GetTeamName returns the TeamName field value if set, zero value otherwise.
func (o *RegistryCreateRequest) GetTeamName() string {
	if o == nil || isNil(o.TeamName) {
		var ret string
		return ret
	}
	return *o.TeamName
}

// GetTeamNameOk returns a tuple with the TeamName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RegistryCreateRequest) GetTeamNameOk() (*string, bool) {
	if o == nil || isNil(o.TeamName) {
    return nil, false
	}
	return o.TeamName, true
}

// HasTeamName returns a boolean if a field has been set.
func (o *RegistryCreateRequest) HasTeamName() bool {
	if o != nil && !isNil(o.TeamName) {
		return true
	}

	return false
}

// SetTeamName gets a reference to the given string and assigns it to the TeamName field.
func (o *RegistryCreateRequest) SetTeamName(v string) {
	o.TeamName = &v
}

// GetType returns the Type field value
func (o *RegistryCreateRequest) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *RegistryCreateRequest) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *RegistryCreateRequest) SetType(v string) {
	o.Type = v
}

// GetUrl returns the Url field value
func (o *RegistryCreateRequest) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *RegistryCreateRequest) GetUrlOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *RegistryCreateRequest) SetUrl(v string) {
	o.Url = v
}

func (o RegistryCreateRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.CloudAlias) {
		toSerialize["cloudAlias"] = o.CloudAlias
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.OrgName) {
		toSerialize["org_name"] = o.OrgName
	}
	if !isNil(o.TeamName) {
		toSerialize["team_name"] = o.TeamName
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if true {
		toSerialize["url"] = o.Url
	}
	return json.Marshal(toSerialize)
}

type NullableRegistryCreateRequest struct {
	value *RegistryCreateRequest
	isSet bool
}

func (v NullableRegistryCreateRequest) Get() *RegistryCreateRequest {
	return v.value
}

func (v *NullableRegistryCreateRequest) Set(val *RegistryCreateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableRegistryCreateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableRegistryCreateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRegistryCreateRequest(val *RegistryCreateRequest) *NullableRegistryCreateRequest {
	return &NullableRegistryCreateRequest{value: val, isSet: true}
}

func (v NullableRegistryCreateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRegistryCreateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


