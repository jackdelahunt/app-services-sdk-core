/*
 * Red Hat Openshift SmartEvents Fleet Manager V1
 *
 * The API exposed by the fleet manager of the SmartEvents service.
 *
 * API version: 0.0.1
 * Contact: openbridge-dev@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package smarteventsmgmtclient

import (
	"encoding/json"
)

// ProcessorCatalogResponse struct for ProcessorCatalogResponse
type ProcessorCatalogResponse struct {
	Kind string `json:"kind"`
	Items *[]ProcessorSchemaEntryResponse `json:"items,omitempty"`
}

// NewProcessorCatalogResponse instantiates a new ProcessorCatalogResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProcessorCatalogResponse(kind string) *ProcessorCatalogResponse {
	this := ProcessorCatalogResponse{}
	this.Kind = kind
	return &this
}

// NewProcessorCatalogResponseWithDefaults instantiates a new ProcessorCatalogResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProcessorCatalogResponseWithDefaults() *ProcessorCatalogResponse {
	this := ProcessorCatalogResponse{}
	return &this
}

// GetKind returns the Kind field value
func (o *ProcessorCatalogResponse) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *ProcessorCatalogResponse) GetKindOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *ProcessorCatalogResponse) SetKind(v string) {
	o.Kind = v
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *ProcessorCatalogResponse) GetItems() []ProcessorSchemaEntryResponse {
	if o == nil || o.Items == nil {
		var ret []ProcessorSchemaEntryResponse
		return ret
	}
	return *o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProcessorCatalogResponse) GetItemsOk() (*[]ProcessorSchemaEntryResponse, bool) {
	if o == nil || o.Items == nil {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *ProcessorCatalogResponse) HasItems() bool {
	if o != nil && o.Items != nil {
		return true
	}

	return false
}

// SetItems gets a reference to the given []ProcessorSchemaEntryResponse and assigns it to the Items field.
func (o *ProcessorCatalogResponse) SetItems(v []ProcessorSchemaEntryResponse) {
	o.Items = &v
}

func (o ProcessorCatalogResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if o.Items != nil {
		toSerialize["items"] = o.Items
	}
	return json.Marshal(toSerialize)
}

type NullableProcessorCatalogResponse struct {
	value *ProcessorCatalogResponse
	isSet bool
}

func (v NullableProcessorCatalogResponse) Get() *ProcessorCatalogResponse {
	return v.value
}

func (v *NullableProcessorCatalogResponse) Set(val *ProcessorCatalogResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableProcessorCatalogResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableProcessorCatalogResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProcessorCatalogResponse(val *ProcessorCatalogResponse) *NullableProcessorCatalogResponse {
	return &NullableProcessorCatalogResponse{value: val, isSet: true}
}

func (v NullableProcessorCatalogResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProcessorCatalogResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


