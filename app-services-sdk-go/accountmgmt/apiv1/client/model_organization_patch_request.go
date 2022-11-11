/*
 * Account Management Service API
 *
 * Manage user subscriptions and clusters
 *
 * API version: 0.0.1
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package accountmgmtclient

import (
	"encoding/json"
)

// OrganizationPatchRequest struct for OrganizationPatchRequest
type OrganizationPatchRequest struct {
	EbsAccountId *string `json:"ebs_account_id,omitempty"`
	ExternalId *string `json:"external_id,omitempty"`
	Name *string `json:"name,omitempty"`
}

// NewOrganizationPatchRequest instantiates a new OrganizationPatchRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrganizationPatchRequest() *OrganizationPatchRequest {
	this := OrganizationPatchRequest{}
	return &this
}

// NewOrganizationPatchRequestWithDefaults instantiates a new OrganizationPatchRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrganizationPatchRequestWithDefaults() *OrganizationPatchRequest {
	this := OrganizationPatchRequest{}
	return &this
}

// GetEbsAccountId returns the EbsAccountId field value if set, zero value otherwise.
func (o *OrganizationPatchRequest) GetEbsAccountId() string {
	if o == nil || o.EbsAccountId == nil {
		var ret string
		return ret
	}
	return *o.EbsAccountId
}

// GetEbsAccountIdOk returns a tuple with the EbsAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrganizationPatchRequest) GetEbsAccountIdOk() (*string, bool) {
	if o == nil || o.EbsAccountId == nil {
		return nil, false
	}
	return o.EbsAccountId, true
}

// HasEbsAccountId returns a boolean if a field has been set.
func (o *OrganizationPatchRequest) HasEbsAccountId() bool {
	if o != nil && o.EbsAccountId != nil {
		return true
	}

	return false
}

// SetEbsAccountId gets a reference to the given string and assigns it to the EbsAccountId field.
func (o *OrganizationPatchRequest) SetEbsAccountId(v string) {
	o.EbsAccountId = &v
}

// GetExternalId returns the ExternalId field value if set, zero value otherwise.
func (o *OrganizationPatchRequest) GetExternalId() string {
	if o == nil || o.ExternalId == nil {
		var ret string
		return ret
	}
	return *o.ExternalId
}

// GetExternalIdOk returns a tuple with the ExternalId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrganizationPatchRequest) GetExternalIdOk() (*string, bool) {
	if o == nil || o.ExternalId == nil {
		return nil, false
	}
	return o.ExternalId, true
}

// HasExternalId returns a boolean if a field has been set.
func (o *OrganizationPatchRequest) HasExternalId() bool {
	if o != nil && o.ExternalId != nil {
		return true
	}

	return false
}

// SetExternalId gets a reference to the given string and assigns it to the ExternalId field.
func (o *OrganizationPatchRequest) SetExternalId(v string) {
	o.ExternalId = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *OrganizationPatchRequest) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrganizationPatchRequest) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *OrganizationPatchRequest) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *OrganizationPatchRequest) SetName(v string) {
	o.Name = &v
}

func (o OrganizationPatchRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.EbsAccountId != nil {
		toSerialize["ebs_account_id"] = o.EbsAccountId
	}
	if o.ExternalId != nil {
		toSerialize["external_id"] = o.ExternalId
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableOrganizationPatchRequest struct {
	value *OrganizationPatchRequest
	isSet bool
}

func (v NullableOrganizationPatchRequest) Get() *OrganizationPatchRequest {
	return v.value
}

func (v *NullableOrganizationPatchRequest) Set(val *OrganizationPatchRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableOrganizationPatchRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableOrganizationPatchRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrganizationPatchRequest(val *OrganizationPatchRequest) *NullableOrganizationPatchRequest {
	return &NullableOrganizationPatchRequest{value: val, isSet: true}
}

func (v NullableOrganizationPatchRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrganizationPatchRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


