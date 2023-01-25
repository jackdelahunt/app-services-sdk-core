/*
Kafka Management API

Kafka Management API is a REST API to manage Kafka instances

API version: 1.14.0
Contact: rhosak-support@redhat.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkamgmtclient

import (
	"encoding/json"
)

// Error struct for Error
type Error struct {
	// Human-readable description of the error. Intended for human consumption
	Reason string `json:"reason"`
	// Relatively unique operation ID of the request associated to the error
	OperationId *string `json:"operation_id,omitempty"`
	// The unique and immutable identifier of the resource
	Id string `json:"id"`
	// The kind of the resource
	Kind string `json:"kind"`
	// The absolute path of the resource
	Href string `json:"href"`
	// Code of the error
	Code string `json:"code"`
}

// NewError instantiates a new Error object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewError(reason string, id string, kind string, href string, code string) *Error {
	this := Error{}
	this.Reason = reason
	this.Id = id
	this.Kind = kind
	this.Href = href
	this.Code = code
	return &this
}

// NewErrorWithDefaults instantiates a new Error object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewErrorWithDefaults() *Error {
	this := Error{}
	return &this
}

// GetReason returns the Reason field value
func (o *Error) GetReason() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Reason
}

// GetReasonOk returns a tuple with the Reason field value
// and a boolean to check if the value has been set.
func (o *Error) GetReasonOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Reason, true
}

// SetReason sets field value
func (o *Error) SetReason(v string) {
	o.Reason = v
}

// GetOperationId returns the OperationId field value if set, zero value otherwise.
func (o *Error) GetOperationId() string {
	if o == nil || isNil(o.OperationId) {
		var ret string
		return ret
	}
	return *o.OperationId
}

// GetOperationIdOk returns a tuple with the OperationId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Error) GetOperationIdOk() (*string, bool) {
	if o == nil || isNil(o.OperationId) {
    return nil, false
	}
	return o.OperationId, true
}

// HasOperationId returns a boolean if a field has been set.
func (o *Error) HasOperationId() bool {
	if o != nil && !isNil(o.OperationId) {
		return true
	}

	return false
}

// SetOperationId gets a reference to the given string and assigns it to the OperationId field.
func (o *Error) SetOperationId(v string) {
	o.OperationId = &v
}

// GetId returns the Id field value
func (o *Error) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Error) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Error) SetId(v string) {
	o.Id = v
}

// GetKind returns the Kind field value
func (o *Error) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *Error) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *Error) SetKind(v string) {
	o.Kind = v
}

// GetHref returns the Href field value
func (o *Error) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *Error) GetHrefOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *Error) SetHref(v string) {
	o.Href = v
}

// GetCode returns the Code field value
func (o *Error) GetCode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Code
}

// GetCodeOk returns a tuple with the Code field value
// and a boolean to check if the value has been set.
func (o *Error) GetCodeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Code, true
}

// SetCode sets field value
func (o *Error) SetCode(v string) {
	o.Code = v
}

func (o Error) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["reason"] = o.Reason
	}
	if !isNil(o.OperationId) {
		toSerialize["operation_id"] = o.OperationId
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["href"] = o.Href
	}
	if true {
		toSerialize["code"] = o.Code
	}
	return json.Marshal(toSerialize)
}

type NullableError struct {
	value *Error
	isSet bool
}

func (v NullableError) Get() *Error {
	return v.value
}

func (v *NullableError) Set(val *Error) {
	v.value = val
	v.isSet = true
}

func (v NullableError) IsSet() bool {
	return v.isSet
}

func (v *NullableError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableError(val *Error) *NullableError {
	return &NullableError{value: val, isSet: true}
}

func (v NullableError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


