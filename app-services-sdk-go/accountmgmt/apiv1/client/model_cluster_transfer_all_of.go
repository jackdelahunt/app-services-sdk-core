/*
Account Management Service API

Manage user subscriptions and clusters

API version: 0.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package accountmgmtclient

import (
	"encoding/json"
	"time"
)

// ClusterTransferAllOf struct for ClusterTransferAllOf
type ClusterTransferAllOf struct {
	ClusterUuid *string `json:"cluster_uuid,omitempty"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	ExpirationDate *time.Time `json:"expiration_date,omitempty"`
	Owner *string `json:"owner,omitempty"`
	Recipient *string `json:"recipient,omitempty"`
	Secret *string `json:"secret,omitempty"`
	Status *string `json:"status,omitempty"`
	UpdatedAt *time.Time `json:"updated_at,omitempty"`
}

// NewClusterTransferAllOf instantiates a new ClusterTransferAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClusterTransferAllOf() *ClusterTransferAllOf {
	this := ClusterTransferAllOf{}
	return &this
}

// NewClusterTransferAllOfWithDefaults instantiates a new ClusterTransferAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClusterTransferAllOfWithDefaults() *ClusterTransferAllOf {
	this := ClusterTransferAllOf{}
	return &this
}

// GetClusterUuid returns the ClusterUuid field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetClusterUuid() string {
	if o == nil || isNil(o.ClusterUuid) {
		var ret string
		return ret
	}
	return *o.ClusterUuid
}

// GetClusterUuidOk returns a tuple with the ClusterUuid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetClusterUuidOk() (*string, bool) {
	if o == nil || isNil(o.ClusterUuid) {
    return nil, false
	}
	return o.ClusterUuid, true
}

// HasClusterUuid returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasClusterUuid() bool {
	if o != nil && !isNil(o.ClusterUuid) {
		return true
	}

	return false
}

// SetClusterUuid gets a reference to the given string and assigns it to the ClusterUuid field.
func (o *ClusterTransferAllOf) SetClusterUuid(v string) {
	o.ClusterUuid = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetCreatedAt() time.Time {
	if o == nil || isNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.CreatedAt) {
    return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasCreatedAt() bool {
	if o != nil && !isNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *ClusterTransferAllOf) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetExpirationDate returns the ExpirationDate field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetExpirationDate() time.Time {
	if o == nil || isNil(o.ExpirationDate) {
		var ret time.Time
		return ret
	}
	return *o.ExpirationDate
}

// GetExpirationDateOk returns a tuple with the ExpirationDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetExpirationDateOk() (*time.Time, bool) {
	if o == nil || isNil(o.ExpirationDate) {
    return nil, false
	}
	return o.ExpirationDate, true
}

// HasExpirationDate returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasExpirationDate() bool {
	if o != nil && !isNil(o.ExpirationDate) {
		return true
	}

	return false
}

// SetExpirationDate gets a reference to the given time.Time and assigns it to the ExpirationDate field.
func (o *ClusterTransferAllOf) SetExpirationDate(v time.Time) {
	o.ExpirationDate = &v
}

// GetOwner returns the Owner field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetOwner() string {
	if o == nil || isNil(o.Owner) {
		var ret string
		return ret
	}
	return *o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetOwnerOk() (*string, bool) {
	if o == nil || isNil(o.Owner) {
    return nil, false
	}
	return o.Owner, true
}

// HasOwner returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasOwner() bool {
	if o != nil && !isNil(o.Owner) {
		return true
	}

	return false
}

// SetOwner gets a reference to the given string and assigns it to the Owner field.
func (o *ClusterTransferAllOf) SetOwner(v string) {
	o.Owner = &v
}

// GetRecipient returns the Recipient field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetRecipient() string {
	if o == nil || isNil(o.Recipient) {
		var ret string
		return ret
	}
	return *o.Recipient
}

// GetRecipientOk returns a tuple with the Recipient field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetRecipientOk() (*string, bool) {
	if o == nil || isNil(o.Recipient) {
    return nil, false
	}
	return o.Recipient, true
}

// HasRecipient returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasRecipient() bool {
	if o != nil && !isNil(o.Recipient) {
		return true
	}

	return false
}

// SetRecipient gets a reference to the given string and assigns it to the Recipient field.
func (o *ClusterTransferAllOf) SetRecipient(v string) {
	o.Recipient = &v
}

// GetSecret returns the Secret field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetSecret() string {
	if o == nil || isNil(o.Secret) {
		var ret string
		return ret
	}
	return *o.Secret
}

// GetSecretOk returns a tuple with the Secret field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetSecretOk() (*string, bool) {
	if o == nil || isNil(o.Secret) {
    return nil, false
	}
	return o.Secret, true
}

// HasSecret returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasSecret() bool {
	if o != nil && !isNil(o.Secret) {
		return true
	}

	return false
}

// SetSecret gets a reference to the given string and assigns it to the Secret field.
func (o *ClusterTransferAllOf) SetSecret(v string) {
	o.Secret = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *ClusterTransferAllOf) SetStatus(v string) {
	o.Status = &v
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *ClusterTransferAllOf) GetUpdatedAt() time.Time {
	if o == nil || isNil(o.UpdatedAt) {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterTransferAllOf) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.UpdatedAt) {
    return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *ClusterTransferAllOf) HasUpdatedAt() bool {
	if o != nil && !isNil(o.UpdatedAt) {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *ClusterTransferAllOf) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

func (o ClusterTransferAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ClusterUuid) {
		toSerialize["cluster_uuid"] = o.ClusterUuid
	}
	if !isNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !isNil(o.ExpirationDate) {
		toSerialize["expiration_date"] = o.ExpirationDate
	}
	if !isNil(o.Owner) {
		toSerialize["owner"] = o.Owner
	}
	if !isNil(o.Recipient) {
		toSerialize["recipient"] = o.Recipient
	}
	if !isNil(o.Secret) {
		toSerialize["secret"] = o.Secret
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !isNil(o.UpdatedAt) {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	return json.Marshal(toSerialize)
}

type NullableClusterTransferAllOf struct {
	value *ClusterTransferAllOf
	isSet bool
}

func (v NullableClusterTransferAllOf) Get() *ClusterTransferAllOf {
	return v.value
}

func (v *NullableClusterTransferAllOf) Set(val *ClusterTransferAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableClusterTransferAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableClusterTransferAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClusterTransferAllOf(val *ClusterTransferAllOf) *NullableClusterTransferAllOf {
	return &NullableClusterTransferAllOf{value: val, isSet: true}
}

func (v NullableClusterTransferAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClusterTransferAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


