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
	"time"
)

// BridgeResponse struct for BridgeResponse
type BridgeResponse struct {
	Kind string `json:"kind"`
	Id string `json:"id"`
	Name *string `json:"name,omitempty"`
	Href string `json:"href"`
	SubmittedAt time.Time `json:"submitted_at"`
	PublishedAt *time.Time `json:"published_at,omitempty"`
	ModifiedAt *time.Time `json:"modified_at,omitempty"`
	Status ManagedResourceStatus `json:"status"`
	Owner string `json:"owner"`
	Endpoint *string `json:"endpoint,omitempty"`
	CloudProvider *string `json:"cloud_provider,omitempty"`
	Region *string `json:"region,omitempty"`
	StatusMessage *string `json:"status_message,omitempty"`
}

// NewBridgeResponse instantiates a new BridgeResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBridgeResponse(kind string, id string, href string, submittedAt time.Time, status ManagedResourceStatus, owner string) *BridgeResponse {
	this := BridgeResponse{}
	this.Kind = kind
	this.Id = id
	this.Href = href
	this.SubmittedAt = submittedAt
	this.Status = status
	this.Owner = owner
	return &this
}

// NewBridgeResponseWithDefaults instantiates a new BridgeResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBridgeResponseWithDefaults() *BridgeResponse {
	this := BridgeResponse{}
	return &this
}

// GetKind returns the Kind field value
func (o *BridgeResponse) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *BridgeResponse) SetKind(v string) {
	o.Kind = v
}

// GetId returns the Id field value
func (o *BridgeResponse) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *BridgeResponse) SetId(v string) {
	o.Id = v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *BridgeResponse) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *BridgeResponse) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *BridgeResponse) SetName(v string) {
	o.Name = &v
}

// GetHref returns the Href field value
func (o *BridgeResponse) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetHrefOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *BridgeResponse) SetHref(v string) {
	o.Href = v
}

// GetSubmittedAt returns the SubmittedAt field value
func (o *BridgeResponse) GetSubmittedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.SubmittedAt
}

// GetSubmittedAtOk returns a tuple with the SubmittedAt field value
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetSubmittedAtOk() (*time.Time, bool) {
	if o == nil {
    return nil, false
	}
	return &o.SubmittedAt, true
}

// SetSubmittedAt sets field value
func (o *BridgeResponse) SetSubmittedAt(v time.Time) {
	o.SubmittedAt = v
}

// GetPublishedAt returns the PublishedAt field value if set, zero value otherwise.
func (o *BridgeResponse) GetPublishedAt() time.Time {
	if o == nil || isNil(o.PublishedAt) {
		var ret time.Time
		return ret
	}
	return *o.PublishedAt
}

// GetPublishedAtOk returns a tuple with the PublishedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetPublishedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.PublishedAt) {
    return nil, false
	}
	return o.PublishedAt, true
}

// HasPublishedAt returns a boolean if a field has been set.
func (o *BridgeResponse) HasPublishedAt() bool {
	if o != nil && !isNil(o.PublishedAt) {
		return true
	}

	return false
}

// SetPublishedAt gets a reference to the given time.Time and assigns it to the PublishedAt field.
func (o *BridgeResponse) SetPublishedAt(v time.Time) {
	o.PublishedAt = &v
}

// GetModifiedAt returns the ModifiedAt field value if set, zero value otherwise.
func (o *BridgeResponse) GetModifiedAt() time.Time {
	if o == nil || isNil(o.ModifiedAt) {
		var ret time.Time
		return ret
	}
	return *o.ModifiedAt
}

// GetModifiedAtOk returns a tuple with the ModifiedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetModifiedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.ModifiedAt) {
    return nil, false
	}
	return o.ModifiedAt, true
}

// HasModifiedAt returns a boolean if a field has been set.
func (o *BridgeResponse) HasModifiedAt() bool {
	if o != nil && !isNil(o.ModifiedAt) {
		return true
	}

	return false
}

// SetModifiedAt gets a reference to the given time.Time and assigns it to the ModifiedAt field.
func (o *BridgeResponse) SetModifiedAt(v time.Time) {
	o.ModifiedAt = &v
}

// GetStatus returns the Status field value
func (o *BridgeResponse) GetStatus() ManagedResourceStatus {
	if o == nil {
		var ret ManagedResourceStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetStatusOk() (*ManagedResourceStatus, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *BridgeResponse) SetStatus(v ManagedResourceStatus) {
	o.Status = v
}

// GetOwner returns the Owner field value
func (o *BridgeResponse) GetOwner() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetOwnerOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Owner, true
}

// SetOwner sets field value
func (o *BridgeResponse) SetOwner(v string) {
	o.Owner = v
}

// GetEndpoint returns the Endpoint field value if set, zero value otherwise.
func (o *BridgeResponse) GetEndpoint() string {
	if o == nil || isNil(o.Endpoint) {
		var ret string
		return ret
	}
	return *o.Endpoint
}

// GetEndpointOk returns a tuple with the Endpoint field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetEndpointOk() (*string, bool) {
	if o == nil || isNil(o.Endpoint) {
    return nil, false
	}
	return o.Endpoint, true
}

// HasEndpoint returns a boolean if a field has been set.
func (o *BridgeResponse) HasEndpoint() bool {
	if o != nil && !isNil(o.Endpoint) {
		return true
	}

	return false
}

// SetEndpoint gets a reference to the given string and assigns it to the Endpoint field.
func (o *BridgeResponse) SetEndpoint(v string) {
	o.Endpoint = &v
}

// GetCloudProvider returns the CloudProvider field value if set, zero value otherwise.
func (o *BridgeResponse) GetCloudProvider() string {
	if o == nil || isNil(o.CloudProvider) {
		var ret string
		return ret
	}
	return *o.CloudProvider
}

// GetCloudProviderOk returns a tuple with the CloudProvider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetCloudProviderOk() (*string, bool) {
	if o == nil || isNil(o.CloudProvider) {
    return nil, false
	}
	return o.CloudProvider, true
}

// HasCloudProvider returns a boolean if a field has been set.
func (o *BridgeResponse) HasCloudProvider() bool {
	if o != nil && !isNil(o.CloudProvider) {
		return true
	}

	return false
}

// SetCloudProvider gets a reference to the given string and assigns it to the CloudProvider field.
func (o *BridgeResponse) SetCloudProvider(v string) {
	o.CloudProvider = &v
}

// GetRegion returns the Region field value if set, zero value otherwise.
func (o *BridgeResponse) GetRegion() string {
	if o == nil || isNil(o.Region) {
		var ret string
		return ret
	}
	return *o.Region
}

// GetRegionOk returns a tuple with the Region field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetRegionOk() (*string, bool) {
	if o == nil || isNil(o.Region) {
    return nil, false
	}
	return o.Region, true
}

// HasRegion returns a boolean if a field has been set.
func (o *BridgeResponse) HasRegion() bool {
	if o != nil && !isNil(o.Region) {
		return true
	}

	return false
}

// SetRegion gets a reference to the given string and assigns it to the Region field.
func (o *BridgeResponse) SetRegion(v string) {
	o.Region = &v
}

// GetStatusMessage returns the StatusMessage field value if set, zero value otherwise.
func (o *BridgeResponse) GetStatusMessage() string {
	if o == nil || isNil(o.StatusMessage) {
		var ret string
		return ret
	}
	return *o.StatusMessage
}

// GetStatusMessageOk returns a tuple with the StatusMessage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BridgeResponse) GetStatusMessageOk() (*string, bool) {
	if o == nil || isNil(o.StatusMessage) {
    return nil, false
	}
	return o.StatusMessage, true
}

// HasStatusMessage returns a boolean if a field has been set.
func (o *BridgeResponse) HasStatusMessage() bool {
	if o != nil && !isNil(o.StatusMessage) {
		return true
	}

	return false
}

// SetStatusMessage gets a reference to the given string and assigns it to the StatusMessage field.
func (o *BridgeResponse) SetStatusMessage(v string) {
	o.StatusMessage = &v
}

func (o BridgeResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["href"] = o.Href
	}
	if true {
		toSerialize["submitted_at"] = o.SubmittedAt
	}
	if !isNil(o.PublishedAt) {
		toSerialize["published_at"] = o.PublishedAt
	}
	if !isNil(o.ModifiedAt) {
		toSerialize["modified_at"] = o.ModifiedAt
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["owner"] = o.Owner
	}
	if !isNil(o.Endpoint) {
		toSerialize["endpoint"] = o.Endpoint
	}
	if !isNil(o.CloudProvider) {
		toSerialize["cloud_provider"] = o.CloudProvider
	}
	if !isNil(o.Region) {
		toSerialize["region"] = o.Region
	}
	if !isNil(o.StatusMessage) {
		toSerialize["status_message"] = o.StatusMessage
	}
	return json.Marshal(toSerialize)
}

type NullableBridgeResponse struct {
	value *BridgeResponse
	isSet bool
}

func (v NullableBridgeResponse) Get() *BridgeResponse {
	return v.value
}

func (v *NullableBridgeResponse) Set(val *BridgeResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableBridgeResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableBridgeResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBridgeResponse(val *BridgeResponse) *NullableBridgeResponse {
	return &NullableBridgeResponse{value: val, isSet: true}
}

func (v NullableBridgeResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBridgeResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


