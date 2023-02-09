/*
 * Red Hat Openshift SmartEvents Fleet Manager V2
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
	"time"
)

// ProcessorResponse struct for ProcessorResponse
type ProcessorResponse struct {
	// The kind (type) of this resource
	Kind string `json:"kind"`
	// The unique identifier of this resource
	Id string `json:"id"`
	// The name of this resource
	Name string `json:"name"`
	// The URL of this resource, without the protocol
	Href string `json:"href"`
	SubmittedAt time.Time `json:"submitted_at"`
	PublishedAt *time.Time `json:"published_at,omitempty"`
	ModifiedAt *time.Time `json:"modified_at,omitempty"`
	Status ManagedResourceStatus `json:"status"`
	// The user that owns this resource
	Owner string `json:"owner"`
	// The Camel YAML DSL code, formatted as JSON, that defines the flows in the processor
	Flows map[string]interface{} `json:"flows"`
	StatusMessage *string `json:"status_message,omitempty"`
}

// NewProcessorResponse instantiates a new ProcessorResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProcessorResponse(kind string, id string, name string, href string, submittedAt time.Time, status ManagedResourceStatus, owner string, flows map[string]interface{}) *ProcessorResponse {
	this := ProcessorResponse{}
	this.Kind = kind
	this.Id = id
	this.Name = name
	this.Href = href
	this.SubmittedAt = submittedAt
	this.Status = status
	this.Owner = owner
	this.Flows = flows
	return &this
}

// NewProcessorResponseWithDefaults instantiates a new ProcessorResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProcessorResponseWithDefaults() *ProcessorResponse {
	this := ProcessorResponse{}
	return &this
}

// GetKind returns the Kind field value
func (o *ProcessorResponse) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetKindOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *ProcessorResponse) SetKind(v string) {
	o.Kind = v
}

// GetId returns the Id field value
func (o *ProcessorResponse) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ProcessorResponse) SetId(v string) {
	o.Id = v
}

// GetName returns the Name field value
func (o *ProcessorResponse) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ProcessorResponse) SetName(v string) {
	o.Name = v
}

// GetHref returns the Href field value
func (o *ProcessorResponse) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetHrefOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *ProcessorResponse) SetHref(v string) {
	o.Href = v
}

// GetSubmittedAt returns the SubmittedAt field value
func (o *ProcessorResponse) GetSubmittedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.SubmittedAt
}

// GetSubmittedAtOk returns a tuple with the SubmittedAt field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetSubmittedAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.SubmittedAt, true
}

// SetSubmittedAt sets field value
func (o *ProcessorResponse) SetSubmittedAt(v time.Time) {
	o.SubmittedAt = v
}

// GetPublishedAt returns the PublishedAt field value if set, zero value otherwise.
func (o *ProcessorResponse) GetPublishedAt() time.Time {
	if o == nil || o.PublishedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.PublishedAt
}

// GetPublishedAtOk returns a tuple with the PublishedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetPublishedAtOk() (*time.Time, bool) {
	if o == nil || o.PublishedAt == nil {
		return nil, false
	}
	return o.PublishedAt, true
}

// HasPublishedAt returns a boolean if a field has been set.
func (o *ProcessorResponse) HasPublishedAt() bool {
	if o != nil && o.PublishedAt != nil {
		return true
	}

	return false
}

// SetPublishedAt gets a reference to the given time.Time and assigns it to the PublishedAt field.
func (o *ProcessorResponse) SetPublishedAt(v time.Time) {
	o.PublishedAt = &v
}

// GetModifiedAt returns the ModifiedAt field value if set, zero value otherwise.
func (o *ProcessorResponse) GetModifiedAt() time.Time {
	if o == nil || o.ModifiedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.ModifiedAt
}

// GetModifiedAtOk returns a tuple with the ModifiedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetModifiedAtOk() (*time.Time, bool) {
	if o == nil || o.ModifiedAt == nil {
		return nil, false
	}
	return o.ModifiedAt, true
}

// HasModifiedAt returns a boolean if a field has been set.
func (o *ProcessorResponse) HasModifiedAt() bool {
	if o != nil && o.ModifiedAt != nil {
		return true
	}

	return false
}

// SetModifiedAt gets a reference to the given time.Time and assigns it to the ModifiedAt field.
func (o *ProcessorResponse) SetModifiedAt(v time.Time) {
	o.ModifiedAt = &v
}

// GetStatus returns the Status field value
func (o *ProcessorResponse) GetStatus() ManagedResourceStatus {
	if o == nil {
		var ret ManagedResourceStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetStatusOk() (*ManagedResourceStatus, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *ProcessorResponse) SetStatus(v ManagedResourceStatus) {
	o.Status = v
}

// GetOwner returns the Owner field value
func (o *ProcessorResponse) GetOwner() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetOwnerOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Owner, true
}

// SetOwner sets field value
func (o *ProcessorResponse) SetOwner(v string) {
	o.Owner = v
}

// GetFlows returns the Flows field value
func (o *ProcessorResponse) GetFlows() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Flows
}

// GetFlowsOk returns a tuple with the Flows field value
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetFlowsOk() (*map[string]interface{}, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Flows, true
}

// SetFlows sets field value
func (o *ProcessorResponse) SetFlows(v map[string]interface{}) {
	o.Flows = v
}

// GetStatusMessage returns the StatusMessage field value if set, zero value otherwise.
func (o *ProcessorResponse) GetStatusMessage() string {
	if o == nil || o.StatusMessage == nil {
		var ret string
		return ret
	}
	return *o.StatusMessage
}

// GetStatusMessageOk returns a tuple with the StatusMessage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProcessorResponse) GetStatusMessageOk() (*string, bool) {
	if o == nil || o.StatusMessage == nil {
		return nil, false
	}
	return o.StatusMessage, true
}

// HasStatusMessage returns a boolean if a field has been set.
func (o *ProcessorResponse) HasStatusMessage() bool {
	if o != nil && o.StatusMessage != nil {
		return true
	}

	return false
}

// SetStatusMessage gets a reference to the given string and assigns it to the StatusMessage field.
func (o *ProcessorResponse) SetStatusMessage(v string) {
	o.StatusMessage = &v
}

func (o ProcessorResponse) MarshalJSON() ([]byte, error) {
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
		toSerialize["href"] = o.Href
	}
	if true {
		toSerialize["submitted_at"] = o.SubmittedAt
	}
	if o.PublishedAt != nil {
		toSerialize["published_at"] = o.PublishedAt
	}
	if o.ModifiedAt != nil {
		toSerialize["modified_at"] = o.ModifiedAt
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["owner"] = o.Owner
	}
	if true {
		toSerialize["flows"] = o.Flows
	}
	if o.StatusMessage != nil {
		toSerialize["status_message"] = o.StatusMessage
	}
	return json.Marshal(toSerialize)
}

type NullableProcessorResponse struct {
	value *ProcessorResponse
	isSet bool
}

func (v NullableProcessorResponse) Get() *ProcessorResponse {
	return v.value
}

func (v *NullableProcessorResponse) Set(val *ProcessorResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableProcessorResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableProcessorResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProcessorResponse(val *ProcessorResponse) *NullableProcessorResponse {
	return &NullableProcessorResponse{value: val, isSet: true}
}

func (v NullableProcessorResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProcessorResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


