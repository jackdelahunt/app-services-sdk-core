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
	"time"
)

// ReservedResource struct for ReservedResource
type ReservedResource struct {
	Href *string `json:"href,omitempty"`
	Id *string `json:"id,omitempty"`
	Kind *string `json:"kind,omitempty"`
	AvailabilityZoneType *string `json:"availability_zone_type,omitempty"`
	BillingMarketplaceAccount *string `json:"billing_marketplace_account,omitempty"`
	BillingModel *string `json:"billing_model,omitempty"`
	Byoc bool `json:"byoc"`
	Cluster *bool `json:"cluster,omitempty"`
	Count *int32 `json:"count,omitempty"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	ResourceName *string `json:"resource_name,omitempty"`
	ResourceType *string `json:"resource_type,omitempty"`
	Subscription *ObjectReference `json:"subscription,omitempty"`
	UpdatedAt *time.Time `json:"updated_at,omitempty"`
}

// NewReservedResource instantiates a new ReservedResource object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReservedResource(byoc bool) *ReservedResource {
	this := ReservedResource{}
	this.Byoc = byoc
	return &this
}

// NewReservedResourceWithDefaults instantiates a new ReservedResource object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReservedResourceWithDefaults() *ReservedResource {
	this := ReservedResource{}
	return &this
}

// GetHref returns the Href field value if set, zero value otherwise.
func (o *ReservedResource) GetHref() string {
	if o == nil || o.Href == nil {
		var ret string
		return ret
	}
	return *o.Href
}

// GetHrefOk returns a tuple with the Href field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetHrefOk() (*string, bool) {
	if o == nil || o.Href == nil {
		return nil, false
	}
	return o.Href, true
}

// HasHref returns a boolean if a field has been set.
func (o *ReservedResource) HasHref() bool {
	if o != nil && o.Href != nil {
		return true
	}

	return false
}

// SetHref gets a reference to the given string and assigns it to the Href field.
func (o *ReservedResource) SetHref(v string) {
	o.Href = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ReservedResource) GetId() string {
	if o == nil || o.Id == nil {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetIdOk() (*string, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ReservedResource) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *ReservedResource) SetId(v string) {
	o.Id = &v
}

// GetKind returns the Kind field value if set, zero value otherwise.
func (o *ReservedResource) GetKind() string {
	if o == nil || o.Kind == nil {
		var ret string
		return ret
	}
	return *o.Kind
}

// GetKindOk returns a tuple with the Kind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetKindOk() (*string, bool) {
	if o == nil || o.Kind == nil {
		return nil, false
	}
	return o.Kind, true
}

// HasKind returns a boolean if a field has been set.
func (o *ReservedResource) HasKind() bool {
	if o != nil && o.Kind != nil {
		return true
	}

	return false
}

// SetKind gets a reference to the given string and assigns it to the Kind field.
func (o *ReservedResource) SetKind(v string) {
	o.Kind = &v
}

// GetAvailabilityZoneType returns the AvailabilityZoneType field value if set, zero value otherwise.
func (o *ReservedResource) GetAvailabilityZoneType() string {
	if o == nil || o.AvailabilityZoneType == nil {
		var ret string
		return ret
	}
	return *o.AvailabilityZoneType
}

// GetAvailabilityZoneTypeOk returns a tuple with the AvailabilityZoneType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetAvailabilityZoneTypeOk() (*string, bool) {
	if o == nil || o.AvailabilityZoneType == nil {
		return nil, false
	}
	return o.AvailabilityZoneType, true
}

// HasAvailabilityZoneType returns a boolean if a field has been set.
func (o *ReservedResource) HasAvailabilityZoneType() bool {
	if o != nil && o.AvailabilityZoneType != nil {
		return true
	}

	return false
}

// SetAvailabilityZoneType gets a reference to the given string and assigns it to the AvailabilityZoneType field.
func (o *ReservedResource) SetAvailabilityZoneType(v string) {
	o.AvailabilityZoneType = &v
}

// GetBillingMarketplaceAccount returns the BillingMarketplaceAccount field value if set, zero value otherwise.
func (o *ReservedResource) GetBillingMarketplaceAccount() string {
	if o == nil || o.BillingMarketplaceAccount == nil {
		var ret string
		return ret
	}
	return *o.BillingMarketplaceAccount
}

// GetBillingMarketplaceAccountOk returns a tuple with the BillingMarketplaceAccount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetBillingMarketplaceAccountOk() (*string, bool) {
	if o == nil || o.BillingMarketplaceAccount == nil {
		return nil, false
	}
	return o.BillingMarketplaceAccount, true
}

// HasBillingMarketplaceAccount returns a boolean if a field has been set.
func (o *ReservedResource) HasBillingMarketplaceAccount() bool {
	if o != nil && o.BillingMarketplaceAccount != nil {
		return true
	}

	return false
}

// SetBillingMarketplaceAccount gets a reference to the given string and assigns it to the BillingMarketplaceAccount field.
func (o *ReservedResource) SetBillingMarketplaceAccount(v string) {
	o.BillingMarketplaceAccount = &v
}

// GetBillingModel returns the BillingModel field value if set, zero value otherwise.
func (o *ReservedResource) GetBillingModel() string {
	if o == nil || o.BillingModel == nil {
		var ret string
		return ret
	}
	return *o.BillingModel
}

// GetBillingModelOk returns a tuple with the BillingModel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetBillingModelOk() (*string, bool) {
	if o == nil || o.BillingModel == nil {
		return nil, false
	}
	return o.BillingModel, true
}

// HasBillingModel returns a boolean if a field has been set.
func (o *ReservedResource) HasBillingModel() bool {
	if o != nil && o.BillingModel != nil {
		return true
	}

	return false
}

// SetBillingModel gets a reference to the given string and assigns it to the BillingModel field.
func (o *ReservedResource) SetBillingModel(v string) {
	o.BillingModel = &v
}

// GetByoc returns the Byoc field value
func (o *ReservedResource) GetByoc() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Byoc
}

// GetByocOk returns a tuple with the Byoc field value
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetByocOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Byoc, true
}

// SetByoc sets field value
func (o *ReservedResource) SetByoc(v bool) {
	o.Byoc = v
}

// GetCluster returns the Cluster field value if set, zero value otherwise.
func (o *ReservedResource) GetCluster() bool {
	if o == nil || o.Cluster == nil {
		var ret bool
		return ret
	}
	return *o.Cluster
}

// GetClusterOk returns a tuple with the Cluster field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetClusterOk() (*bool, bool) {
	if o == nil || o.Cluster == nil {
		return nil, false
	}
	return o.Cluster, true
}

// HasCluster returns a boolean if a field has been set.
func (o *ReservedResource) HasCluster() bool {
	if o != nil && o.Cluster != nil {
		return true
	}

	return false
}

// SetCluster gets a reference to the given bool and assigns it to the Cluster field.
func (o *ReservedResource) SetCluster(v bool) {
	o.Cluster = &v
}

// GetCount returns the Count field value if set, zero value otherwise.
func (o *ReservedResource) GetCount() int32 {
	if o == nil || o.Count == nil {
		var ret int32
		return ret
	}
	return *o.Count
}

// GetCountOk returns a tuple with the Count field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetCountOk() (*int32, bool) {
	if o == nil || o.Count == nil {
		return nil, false
	}
	return o.Count, true
}

// HasCount returns a boolean if a field has been set.
func (o *ReservedResource) HasCount() bool {
	if o != nil && o.Count != nil {
		return true
	}

	return false
}

// SetCount gets a reference to the given int32 and assigns it to the Count field.
func (o *ReservedResource) SetCount(v int32) {
	o.Count = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *ReservedResource) GetCreatedAt() time.Time {
	if o == nil || o.CreatedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || o.CreatedAt == nil {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *ReservedResource) HasCreatedAt() bool {
	if o != nil && o.CreatedAt != nil {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *ReservedResource) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetResourceName returns the ResourceName field value if set, zero value otherwise.
func (o *ReservedResource) GetResourceName() string {
	if o == nil || o.ResourceName == nil {
		var ret string
		return ret
	}
	return *o.ResourceName
}

// GetResourceNameOk returns a tuple with the ResourceName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetResourceNameOk() (*string, bool) {
	if o == nil || o.ResourceName == nil {
		return nil, false
	}
	return o.ResourceName, true
}

// HasResourceName returns a boolean if a field has been set.
func (o *ReservedResource) HasResourceName() bool {
	if o != nil && o.ResourceName != nil {
		return true
	}

	return false
}

// SetResourceName gets a reference to the given string and assigns it to the ResourceName field.
func (o *ReservedResource) SetResourceName(v string) {
	o.ResourceName = &v
}

// GetResourceType returns the ResourceType field value if set, zero value otherwise.
func (o *ReservedResource) GetResourceType() string {
	if o == nil || o.ResourceType == nil {
		var ret string
		return ret
	}
	return *o.ResourceType
}

// GetResourceTypeOk returns a tuple with the ResourceType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetResourceTypeOk() (*string, bool) {
	if o == nil || o.ResourceType == nil {
		return nil, false
	}
	return o.ResourceType, true
}

// HasResourceType returns a boolean if a field has been set.
func (o *ReservedResource) HasResourceType() bool {
	if o != nil && o.ResourceType != nil {
		return true
	}

	return false
}

// SetResourceType gets a reference to the given string and assigns it to the ResourceType field.
func (o *ReservedResource) SetResourceType(v string) {
	o.ResourceType = &v
}

// GetSubscription returns the Subscription field value if set, zero value otherwise.
func (o *ReservedResource) GetSubscription() ObjectReference {
	if o == nil || o.Subscription == nil {
		var ret ObjectReference
		return ret
	}
	return *o.Subscription
}

// GetSubscriptionOk returns a tuple with the Subscription field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetSubscriptionOk() (*ObjectReference, bool) {
	if o == nil || o.Subscription == nil {
		return nil, false
	}
	return o.Subscription, true
}

// HasSubscription returns a boolean if a field has been set.
func (o *ReservedResource) HasSubscription() bool {
	if o != nil && o.Subscription != nil {
		return true
	}

	return false
}

// SetSubscription gets a reference to the given ObjectReference and assigns it to the Subscription field.
func (o *ReservedResource) SetSubscription(v ObjectReference) {
	o.Subscription = &v
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *ReservedResource) GetUpdatedAt() time.Time {
	if o == nil || o.UpdatedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReservedResource) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || o.UpdatedAt == nil {
		return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *ReservedResource) HasUpdatedAt() bool {
	if o != nil && o.UpdatedAt != nil {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *ReservedResource) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

func (o ReservedResource) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Href != nil {
		toSerialize["href"] = o.Href
	}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Kind != nil {
		toSerialize["kind"] = o.Kind
	}
	if o.AvailabilityZoneType != nil {
		toSerialize["availability_zone_type"] = o.AvailabilityZoneType
	}
	if o.BillingMarketplaceAccount != nil {
		toSerialize["billing_marketplace_account"] = o.BillingMarketplaceAccount
	}
	if o.BillingModel != nil {
		toSerialize["billing_model"] = o.BillingModel
	}
	if true {
		toSerialize["byoc"] = o.Byoc
	}
	if o.Cluster != nil {
		toSerialize["cluster"] = o.Cluster
	}
	if o.Count != nil {
		toSerialize["count"] = o.Count
	}
	if o.CreatedAt != nil {
		toSerialize["created_at"] = o.CreatedAt
	}
	if o.ResourceName != nil {
		toSerialize["resource_name"] = o.ResourceName
	}
	if o.ResourceType != nil {
		toSerialize["resource_type"] = o.ResourceType
	}
	if o.Subscription != nil {
		toSerialize["subscription"] = o.Subscription
	}
	if o.UpdatedAt != nil {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	return json.Marshal(toSerialize)
}

type NullableReservedResource struct {
	value *ReservedResource
	isSet bool
}

func (v NullableReservedResource) Get() *ReservedResource {
	return v.value
}

func (v *NullableReservedResource) Set(val *ReservedResource) {
	v.value = val
	v.isSet = true
}

func (v NullableReservedResource) IsSet() bool {
	return v.isSet
}

func (v *NullableReservedResource) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReservedResource(val *ReservedResource) *NullableReservedResource {
	return &NullableReservedResource{value: val, isSet: true}
}

func (v NullableReservedResource) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReservedResource) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


