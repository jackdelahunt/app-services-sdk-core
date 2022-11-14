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

// SelfTermsReview struct for SelfTermsReview
type SelfTermsReview struct {
	CheckOptionalTerms *bool `json:"check_optional_terms,omitempty"`
	EventCode *string `json:"event_code,omitempty"`
	SiteCode *string `json:"site_code,omitempty"`
}

// NewSelfTermsReview instantiates a new SelfTermsReview object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSelfTermsReview() *SelfTermsReview {
	this := SelfTermsReview{}
	var checkOptionalTerms bool = true
	this.CheckOptionalTerms = &checkOptionalTerms
	return &this
}

// NewSelfTermsReviewWithDefaults instantiates a new SelfTermsReview object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSelfTermsReviewWithDefaults() *SelfTermsReview {
	this := SelfTermsReview{}
	var checkOptionalTerms bool = true
	this.CheckOptionalTerms = &checkOptionalTerms
	return &this
}

// GetCheckOptionalTerms returns the CheckOptionalTerms field value if set, zero value otherwise.
func (o *SelfTermsReview) GetCheckOptionalTerms() bool {
	if o == nil || o.CheckOptionalTerms == nil {
		var ret bool
		return ret
	}
	return *o.CheckOptionalTerms
}

// GetCheckOptionalTermsOk returns a tuple with the CheckOptionalTerms field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SelfTermsReview) GetCheckOptionalTermsOk() (*bool, bool) {
	if o == nil || o.CheckOptionalTerms == nil {
		return nil, false
	}
	return o.CheckOptionalTerms, true
}

// HasCheckOptionalTerms returns a boolean if a field has been set.
func (o *SelfTermsReview) HasCheckOptionalTerms() bool {
	if o != nil && o.CheckOptionalTerms != nil {
		return true
	}

	return false
}

// SetCheckOptionalTerms gets a reference to the given bool and assigns it to the CheckOptionalTerms field.
func (o *SelfTermsReview) SetCheckOptionalTerms(v bool) {
	o.CheckOptionalTerms = &v
}

// GetEventCode returns the EventCode field value if set, zero value otherwise.
func (o *SelfTermsReview) GetEventCode() string {
	if o == nil || o.EventCode == nil {
		var ret string
		return ret
	}
	return *o.EventCode
}

// GetEventCodeOk returns a tuple with the EventCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SelfTermsReview) GetEventCodeOk() (*string, bool) {
	if o == nil || o.EventCode == nil {
		return nil, false
	}
	return o.EventCode, true
}

// HasEventCode returns a boolean if a field has been set.
func (o *SelfTermsReview) HasEventCode() bool {
	if o != nil && o.EventCode != nil {
		return true
	}

	return false
}

// SetEventCode gets a reference to the given string and assigns it to the EventCode field.
func (o *SelfTermsReview) SetEventCode(v string) {
	o.EventCode = &v
}

// GetSiteCode returns the SiteCode field value if set, zero value otherwise.
func (o *SelfTermsReview) GetSiteCode() string {
	if o == nil || o.SiteCode == nil {
		var ret string
		return ret
	}
	return *o.SiteCode
}

// GetSiteCodeOk returns a tuple with the SiteCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SelfTermsReview) GetSiteCodeOk() (*string, bool) {
	if o == nil || o.SiteCode == nil {
		return nil, false
	}
	return o.SiteCode, true
}

// HasSiteCode returns a boolean if a field has been set.
func (o *SelfTermsReview) HasSiteCode() bool {
	if o != nil && o.SiteCode != nil {
		return true
	}

	return false
}

// SetSiteCode gets a reference to the given string and assigns it to the SiteCode field.
func (o *SelfTermsReview) SetSiteCode(v string) {
	o.SiteCode = &v
}

func (o SelfTermsReview) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CheckOptionalTerms != nil {
		toSerialize["check_optional_terms"] = o.CheckOptionalTerms
	}
	if o.EventCode != nil {
		toSerialize["event_code"] = o.EventCode
	}
	if o.SiteCode != nil {
		toSerialize["site_code"] = o.SiteCode
	}
	return json.Marshal(toSerialize)
}

type NullableSelfTermsReview struct {
	value *SelfTermsReview
	isSet bool
}

func (v NullableSelfTermsReview) Get() *SelfTermsReview {
	return v.value
}

func (v *NullableSelfTermsReview) Set(val *SelfTermsReview) {
	v.value = val
	v.isSet = true
}

func (v NullableSelfTermsReview) IsSet() bool {
	return v.isSet
}

func (v *NullableSelfTermsReview) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSelfTermsReview(val *SelfTermsReview) *NullableSelfTermsReview {
	return &NullableSelfTermsReview{value: val, isSet: true}
}

func (v NullableSelfTermsReview) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSelfTermsReview) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


