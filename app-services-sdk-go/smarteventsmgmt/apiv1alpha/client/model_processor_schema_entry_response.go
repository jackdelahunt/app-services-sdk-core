/*
 * Red Hat Openshift SmartEvents Fleet Manager
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

// ProcessorSchemaEntryResponse struct for ProcessorSchemaEntryResponse
type ProcessorSchemaEntryResponse struct {
	Kind string `json:"kind"`
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Href string `json:"href"`
}

// NewProcessorSchemaEntryResponse instantiates a new ProcessorSchemaEntryResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProcessorSchemaEntryResponse(kind string, id string, name string, description string, type_ string, href string) *ProcessorSchemaEntryResponse {
	this := ProcessorSchemaEntryResponse{}
	this.Kind = kind
	this.Id = id
	this.Name = name
	this.Description = description
	this.Type = type_
	this.Href = href
	return &this
}

// NewProcessorSchemaEntryResponseWithDefaults instantiates a new ProcessorSchemaEntryResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProcessorSchemaEntryResponseWithDefaults() *ProcessorSchemaEntryResponse {
	this := ProcessorSchemaEntryResponse{}
	return &this
}

// GetKind returns the Kind field value
func (o *ProcessorSchemaEntryResponse) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *ProcessorSchemaEntryResponse) GetKindOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *ProcessorSchemaEntryResponse) SetKind(v string) {
	o.Kind = v
}

// GetId returns the Id field value
func (o *ProcessorSchemaEntryResponse) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ProcessorSchemaEntryResponse) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ProcessorSchemaEntryResponse) SetId(v string) {
	o.Id = v
}

// GetName returns the Name field value
func (o *ProcessorSchemaEntryResponse) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ProcessorSchemaEntryResponse) GetNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ProcessorSchemaEntryResponse) SetName(v string) {
	o.Name = v
}

// GetDescription returns the Description field value
func (o *ProcessorSchemaEntryResponse) GetDescription() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Description
}

// GetDescriptionOk returns a tuple with the Description field value
// and a boolean to check if the value has been set.
func (o *ProcessorSchemaEntryResponse) GetDescriptionOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Description, true
}

// SetDescription sets field value
func (o *ProcessorSchemaEntryResponse) SetDescription(v string) {
	o.Description = v
}

// GetType returns the Type field value
func (o *ProcessorSchemaEntryResponse) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ProcessorSchemaEntryResponse) GetTypeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ProcessorSchemaEntryResponse) SetType(v string) {
	o.Type = v
}

// GetHref returns the Href field value
func (o *ProcessorSchemaEntryResponse) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *ProcessorSchemaEntryResponse) GetHrefOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *ProcessorSchemaEntryResponse) SetHref(v string) {
	o.Href = v
}

func (o ProcessorSchemaEntryResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["description"] = o.Description
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if true {
		toSerialize["href"] = o.Href
	}
	return json.Marshal(toSerialize)
}

type NullableProcessorSchemaEntryResponse struct {
	value *ProcessorSchemaEntryResponse
	isSet bool
}

func (v NullableProcessorSchemaEntryResponse) Get() *ProcessorSchemaEntryResponse {
	return v.value
}

func (v *NullableProcessorSchemaEntryResponse) Set(val *ProcessorSchemaEntryResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableProcessorSchemaEntryResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableProcessorSchemaEntryResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProcessorSchemaEntryResponse(val *ProcessorSchemaEntryResponse) *NullableProcessorSchemaEntryResponse {
	return &NullableProcessorSchemaEntryResponse{value: val, isSet: true}
}

func (v NullableProcessorSchemaEntryResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProcessorSchemaEntryResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


