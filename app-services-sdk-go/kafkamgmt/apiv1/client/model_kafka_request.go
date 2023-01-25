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

// KafkaRequest struct for KafkaRequest
type KafkaRequest struct {
	Id string `json:"id"`
	Kind string `json:"kind"`
	Href string `json:"href"`
	// Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting, suspending, suspended, resuming] 
	Status *string `json:"status,omitempty"`
	// Name of Cloud used to deploy. For example AWS
	CloudProvider *string `json:"cloud_provider,omitempty"`
	MultiAz bool `json:"multi_az"`
	// Values will be regions of specific cloud provider. For example: us-east-1 for AWS
	Region *string `json:"region,omitempty"`
	Owner *string `json:"owner,omitempty"`
	Name *string `json:"name,omitempty"`
	BootstrapServerHost *string `json:"bootstrap_server_host,omitempty"`
	// The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a 'ready' state
	AdminApiServerUrl *string `json:"admin_api_server_url,omitempty"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	ExpiresAt NullableTime `json:"expires_at,omitempty"`
	UpdatedAt *time.Time `json:"updated_at,omitempty"`
	FailedReason *string `json:"failed_reason,omitempty"`
	Version *string `json:"version,omitempty"`
	InstanceType *string `json:"instance_type,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	InstanceTypeName *string `json:"instance_type_name,omitempty"`
	ReauthenticationEnabled bool `json:"reauthentication_enabled"`
	// Maximum data storage available to this Kafka. This is now deprecated, please use max_data_retention_size instead.
	// Deprecated
	KafkaStorageSize *string `json:"kafka_storage_size,omitempty"`
	MaxDataRetentionSize *SupportedKafkaSizeBytesValueItem `json:"max_data_retention_size,omitempty"`
	BrowserUrl *string `json:"browser_url,omitempty"`
	SizeId *string `json:"size_id,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	IngressThroughputPerSec *string `json:"ingress_throughput_per_sec,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	EgressThroughputPerSec *string `json:"egress_throughput_per_sec,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	TotalMaxConnections *int32 `json:"total_max_connections,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	MaxPartitions *int32 `json:"max_partitions,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	MaxDataRetentionPeriod *string `json:"max_data_retention_period,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	// Deprecated
	MaxConnectionAttemptsPerSec *int32 `json:"max_connection_attempts_per_sec,omitempty"`
	BillingCloudAccountId *string `json:"billing_cloud_account_id,omitempty"`
	Marketplace *string `json:"marketplace,omitempty"`
	BillingModel *string `json:"billing_model,omitempty"`
}

// NewKafkaRequest instantiates a new KafkaRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewKafkaRequest(id string, kind string, href string, multiAz bool, reauthenticationEnabled bool) *KafkaRequest {
	this := KafkaRequest{}
	this.Id = id
	this.Kind = kind
	this.Href = href
	this.MultiAz = multiAz
	this.ReauthenticationEnabled = reauthenticationEnabled
	return &this
}

// NewKafkaRequestWithDefaults instantiates a new KafkaRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewKafkaRequestWithDefaults() *KafkaRequest {
	this := KafkaRequest{}
	return &this
}

// GetId returns the Id field value
func (o *KafkaRequest) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *KafkaRequest) SetId(v string) {
	o.Id = v
}

// GetKind returns the Kind field value
func (o *KafkaRequest) GetKind() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Kind
}

// GetKindOk returns a tuple with the Kind field value
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetKindOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kind, true
}

// SetKind sets field value
func (o *KafkaRequest) SetKind(v string) {
	o.Kind = v
}

// GetHref returns the Href field value
func (o *KafkaRequest) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetHrefOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *KafkaRequest) SetHref(v string) {
	o.Href = v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *KafkaRequest) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *KafkaRequest) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *KafkaRequest) SetStatus(v string) {
	o.Status = &v
}

// GetCloudProvider returns the CloudProvider field value if set, zero value otherwise.
func (o *KafkaRequest) GetCloudProvider() string {
	if o == nil || isNil(o.CloudProvider) {
		var ret string
		return ret
	}
	return *o.CloudProvider
}

// GetCloudProviderOk returns a tuple with the CloudProvider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetCloudProviderOk() (*string, bool) {
	if o == nil || isNil(o.CloudProvider) {
    return nil, false
	}
	return o.CloudProvider, true
}

// HasCloudProvider returns a boolean if a field has been set.
func (o *KafkaRequest) HasCloudProvider() bool {
	if o != nil && !isNil(o.CloudProvider) {
		return true
	}

	return false
}

// SetCloudProvider gets a reference to the given string and assigns it to the CloudProvider field.
func (o *KafkaRequest) SetCloudProvider(v string) {
	o.CloudProvider = &v
}

// GetMultiAz returns the MultiAz field value
func (o *KafkaRequest) GetMultiAz() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.MultiAz
}

// GetMultiAzOk returns a tuple with the MultiAz field value
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMultiAzOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.MultiAz, true
}

// SetMultiAz sets field value
func (o *KafkaRequest) SetMultiAz(v bool) {
	o.MultiAz = v
}

// GetRegion returns the Region field value if set, zero value otherwise.
func (o *KafkaRequest) GetRegion() string {
	if o == nil || isNil(o.Region) {
		var ret string
		return ret
	}
	return *o.Region
}

// GetRegionOk returns a tuple with the Region field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetRegionOk() (*string, bool) {
	if o == nil || isNil(o.Region) {
    return nil, false
	}
	return o.Region, true
}

// HasRegion returns a boolean if a field has been set.
func (o *KafkaRequest) HasRegion() bool {
	if o != nil && !isNil(o.Region) {
		return true
	}

	return false
}

// SetRegion gets a reference to the given string and assigns it to the Region field.
func (o *KafkaRequest) SetRegion(v string) {
	o.Region = &v
}

// GetOwner returns the Owner field value if set, zero value otherwise.
func (o *KafkaRequest) GetOwner() string {
	if o == nil || isNil(o.Owner) {
		var ret string
		return ret
	}
	return *o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetOwnerOk() (*string, bool) {
	if o == nil || isNil(o.Owner) {
    return nil, false
	}
	return o.Owner, true
}

// HasOwner returns a boolean if a field has been set.
func (o *KafkaRequest) HasOwner() bool {
	if o != nil && !isNil(o.Owner) {
		return true
	}

	return false
}

// SetOwner gets a reference to the given string and assigns it to the Owner field.
func (o *KafkaRequest) SetOwner(v string) {
	o.Owner = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *KafkaRequest) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *KafkaRequest) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *KafkaRequest) SetName(v string) {
	o.Name = &v
}

// GetBootstrapServerHost returns the BootstrapServerHost field value if set, zero value otherwise.
func (o *KafkaRequest) GetBootstrapServerHost() string {
	if o == nil || isNil(o.BootstrapServerHost) {
		var ret string
		return ret
	}
	return *o.BootstrapServerHost
}

// GetBootstrapServerHostOk returns a tuple with the BootstrapServerHost field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBootstrapServerHostOk() (*string, bool) {
	if o == nil || isNil(o.BootstrapServerHost) {
    return nil, false
	}
	return o.BootstrapServerHost, true
}

// HasBootstrapServerHost returns a boolean if a field has been set.
func (o *KafkaRequest) HasBootstrapServerHost() bool {
	if o != nil && !isNil(o.BootstrapServerHost) {
		return true
	}

	return false
}

// SetBootstrapServerHost gets a reference to the given string and assigns it to the BootstrapServerHost field.
func (o *KafkaRequest) SetBootstrapServerHost(v string) {
	o.BootstrapServerHost = &v
}

// GetAdminApiServerUrl returns the AdminApiServerUrl field value if set, zero value otherwise.
func (o *KafkaRequest) GetAdminApiServerUrl() string {
	if o == nil || isNil(o.AdminApiServerUrl) {
		var ret string
		return ret
	}
	return *o.AdminApiServerUrl
}

// GetAdminApiServerUrlOk returns a tuple with the AdminApiServerUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetAdminApiServerUrlOk() (*string, bool) {
	if o == nil || isNil(o.AdminApiServerUrl) {
    return nil, false
	}
	return o.AdminApiServerUrl, true
}

// HasAdminApiServerUrl returns a boolean if a field has been set.
func (o *KafkaRequest) HasAdminApiServerUrl() bool {
	if o != nil && !isNil(o.AdminApiServerUrl) {
		return true
	}

	return false
}

// SetAdminApiServerUrl gets a reference to the given string and assigns it to the AdminApiServerUrl field.
func (o *KafkaRequest) SetAdminApiServerUrl(v string) {
	o.AdminApiServerUrl = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *KafkaRequest) GetCreatedAt() time.Time {
	if o == nil || isNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.CreatedAt) {
    return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *KafkaRequest) HasCreatedAt() bool {
	if o != nil && !isNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *KafkaRequest) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetExpiresAt returns the ExpiresAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *KafkaRequest) GetExpiresAt() time.Time {
	if o == nil || isNil(o.ExpiresAt.Get()) {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt.Get()
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *KafkaRequest) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil {
    return nil, false
	}
	return o.ExpiresAt.Get(), o.ExpiresAt.IsSet()
}

// HasExpiresAt returns a boolean if a field has been set.
func (o *KafkaRequest) HasExpiresAt() bool {
	if o != nil && o.ExpiresAt.IsSet() {
		return true
	}

	return false
}

// SetExpiresAt gets a reference to the given NullableTime and assigns it to the ExpiresAt field.
func (o *KafkaRequest) SetExpiresAt(v time.Time) {
	o.ExpiresAt.Set(&v)
}
// SetExpiresAtNil sets the value for ExpiresAt to be an explicit nil
func (o *KafkaRequest) SetExpiresAtNil() {
	o.ExpiresAt.Set(nil)
}

// UnsetExpiresAt ensures that no value is present for ExpiresAt, not even an explicit nil
func (o *KafkaRequest) UnsetExpiresAt() {
	o.ExpiresAt.Unset()
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *KafkaRequest) GetUpdatedAt() time.Time {
	if o == nil || isNil(o.UpdatedAt) {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.UpdatedAt) {
    return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *KafkaRequest) HasUpdatedAt() bool {
	if o != nil && !isNil(o.UpdatedAt) {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *KafkaRequest) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

// GetFailedReason returns the FailedReason field value if set, zero value otherwise.
func (o *KafkaRequest) GetFailedReason() string {
	if o == nil || isNil(o.FailedReason) {
		var ret string
		return ret
	}
	return *o.FailedReason
}

// GetFailedReasonOk returns a tuple with the FailedReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetFailedReasonOk() (*string, bool) {
	if o == nil || isNil(o.FailedReason) {
    return nil, false
	}
	return o.FailedReason, true
}

// HasFailedReason returns a boolean if a field has been set.
func (o *KafkaRequest) HasFailedReason() bool {
	if o != nil && !isNil(o.FailedReason) {
		return true
	}

	return false
}

// SetFailedReason gets a reference to the given string and assigns it to the FailedReason field.
func (o *KafkaRequest) SetFailedReason(v string) {
	o.FailedReason = &v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *KafkaRequest) GetVersion() string {
	if o == nil || isNil(o.Version) {
		var ret string
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetVersionOk() (*string, bool) {
	if o == nil || isNil(o.Version) {
    return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *KafkaRequest) HasVersion() bool {
	if o != nil && !isNil(o.Version) {
		return true
	}

	return false
}

// SetVersion gets a reference to the given string and assigns it to the Version field.
func (o *KafkaRequest) SetVersion(v string) {
	o.Version = &v
}

// GetInstanceType returns the InstanceType field value if set, zero value otherwise.
func (o *KafkaRequest) GetInstanceType() string {
	if o == nil || isNil(o.InstanceType) {
		var ret string
		return ret
	}
	return *o.InstanceType
}

// GetInstanceTypeOk returns a tuple with the InstanceType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetInstanceTypeOk() (*string, bool) {
	if o == nil || isNil(o.InstanceType) {
    return nil, false
	}
	return o.InstanceType, true
}

// HasInstanceType returns a boolean if a field has been set.
func (o *KafkaRequest) HasInstanceType() bool {
	if o != nil && !isNil(o.InstanceType) {
		return true
	}

	return false
}

// SetInstanceType gets a reference to the given string and assigns it to the InstanceType field.
func (o *KafkaRequest) SetInstanceType(v string) {
	o.InstanceType = &v
}

// GetInstanceTypeName returns the InstanceTypeName field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetInstanceTypeName() string {
	if o == nil || isNil(o.InstanceTypeName) {
		var ret string
		return ret
	}
	return *o.InstanceTypeName
}

// GetInstanceTypeNameOk returns a tuple with the InstanceTypeName field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetInstanceTypeNameOk() (*string, bool) {
	if o == nil || isNil(o.InstanceTypeName) {
    return nil, false
	}
	return o.InstanceTypeName, true
}

// HasInstanceTypeName returns a boolean if a field has been set.
func (o *KafkaRequest) HasInstanceTypeName() bool {
	if o != nil && !isNil(o.InstanceTypeName) {
		return true
	}

	return false
}

// SetInstanceTypeName gets a reference to the given string and assigns it to the InstanceTypeName field.
// Deprecated
func (o *KafkaRequest) SetInstanceTypeName(v string) {
	o.InstanceTypeName = &v
}

// GetReauthenticationEnabled returns the ReauthenticationEnabled field value
func (o *KafkaRequest) GetReauthenticationEnabled() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.ReauthenticationEnabled
}

// GetReauthenticationEnabledOk returns a tuple with the ReauthenticationEnabled field value
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetReauthenticationEnabledOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ReauthenticationEnabled, true
}

// SetReauthenticationEnabled sets field value
func (o *KafkaRequest) SetReauthenticationEnabled(v bool) {
	o.ReauthenticationEnabled = v
}

// GetKafkaStorageSize returns the KafkaStorageSize field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetKafkaStorageSize() string {
	if o == nil || isNil(o.KafkaStorageSize) {
		var ret string
		return ret
	}
	return *o.KafkaStorageSize
}

// GetKafkaStorageSizeOk returns a tuple with the KafkaStorageSize field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetKafkaStorageSizeOk() (*string, bool) {
	if o == nil || isNil(o.KafkaStorageSize) {
    return nil, false
	}
	return o.KafkaStorageSize, true
}

// HasKafkaStorageSize returns a boolean if a field has been set.
func (o *KafkaRequest) HasKafkaStorageSize() bool {
	if o != nil && !isNil(o.KafkaStorageSize) {
		return true
	}

	return false
}

// SetKafkaStorageSize gets a reference to the given string and assigns it to the KafkaStorageSize field.
// Deprecated
func (o *KafkaRequest) SetKafkaStorageSize(v string) {
	o.KafkaStorageSize = &v
}

// GetMaxDataRetentionSize returns the MaxDataRetentionSize field value if set, zero value otherwise.
func (o *KafkaRequest) GetMaxDataRetentionSize() SupportedKafkaSizeBytesValueItem {
	if o == nil || isNil(o.MaxDataRetentionSize) {
		var ret SupportedKafkaSizeBytesValueItem
		return ret
	}
	return *o.MaxDataRetentionSize
}

// GetMaxDataRetentionSizeOk returns a tuple with the MaxDataRetentionSize field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMaxDataRetentionSizeOk() (*SupportedKafkaSizeBytesValueItem, bool) {
	if o == nil || isNil(o.MaxDataRetentionSize) {
    return nil, false
	}
	return o.MaxDataRetentionSize, true
}

// HasMaxDataRetentionSize returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxDataRetentionSize() bool {
	if o != nil && !isNil(o.MaxDataRetentionSize) {
		return true
	}

	return false
}

// SetMaxDataRetentionSize gets a reference to the given SupportedKafkaSizeBytesValueItem and assigns it to the MaxDataRetentionSize field.
func (o *KafkaRequest) SetMaxDataRetentionSize(v SupportedKafkaSizeBytesValueItem) {
	o.MaxDataRetentionSize = &v
}

// GetBrowserUrl returns the BrowserUrl field value if set, zero value otherwise.
func (o *KafkaRequest) GetBrowserUrl() string {
	if o == nil || isNil(o.BrowserUrl) {
		var ret string
		return ret
	}
	return *o.BrowserUrl
}

// GetBrowserUrlOk returns a tuple with the BrowserUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBrowserUrlOk() (*string, bool) {
	if o == nil || isNil(o.BrowserUrl) {
    return nil, false
	}
	return o.BrowserUrl, true
}

// HasBrowserUrl returns a boolean if a field has been set.
func (o *KafkaRequest) HasBrowserUrl() bool {
	if o != nil && !isNil(o.BrowserUrl) {
		return true
	}

	return false
}

// SetBrowserUrl gets a reference to the given string and assigns it to the BrowserUrl field.
func (o *KafkaRequest) SetBrowserUrl(v string) {
	o.BrowserUrl = &v
}

// GetSizeId returns the SizeId field value if set, zero value otherwise.
func (o *KafkaRequest) GetSizeId() string {
	if o == nil || isNil(o.SizeId) {
		var ret string
		return ret
	}
	return *o.SizeId
}

// GetSizeIdOk returns a tuple with the SizeId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetSizeIdOk() (*string, bool) {
	if o == nil || isNil(o.SizeId) {
    return nil, false
	}
	return o.SizeId, true
}

// HasSizeId returns a boolean if a field has been set.
func (o *KafkaRequest) HasSizeId() bool {
	if o != nil && !isNil(o.SizeId) {
		return true
	}

	return false
}

// SetSizeId gets a reference to the given string and assigns it to the SizeId field.
func (o *KafkaRequest) SetSizeId(v string) {
	o.SizeId = &v
}

// GetIngressThroughputPerSec returns the IngressThroughputPerSec field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetIngressThroughputPerSec() string {
	if o == nil || isNil(o.IngressThroughputPerSec) {
		var ret string
		return ret
	}
	return *o.IngressThroughputPerSec
}

// GetIngressThroughputPerSecOk returns a tuple with the IngressThroughputPerSec field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetIngressThroughputPerSecOk() (*string, bool) {
	if o == nil || isNil(o.IngressThroughputPerSec) {
    return nil, false
	}
	return o.IngressThroughputPerSec, true
}

// HasIngressThroughputPerSec returns a boolean if a field has been set.
func (o *KafkaRequest) HasIngressThroughputPerSec() bool {
	if o != nil && !isNil(o.IngressThroughputPerSec) {
		return true
	}

	return false
}

// SetIngressThroughputPerSec gets a reference to the given string and assigns it to the IngressThroughputPerSec field.
// Deprecated
func (o *KafkaRequest) SetIngressThroughputPerSec(v string) {
	o.IngressThroughputPerSec = &v
}

// GetEgressThroughputPerSec returns the EgressThroughputPerSec field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetEgressThroughputPerSec() string {
	if o == nil || isNil(o.EgressThroughputPerSec) {
		var ret string
		return ret
	}
	return *o.EgressThroughputPerSec
}

// GetEgressThroughputPerSecOk returns a tuple with the EgressThroughputPerSec field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetEgressThroughputPerSecOk() (*string, bool) {
	if o == nil || isNil(o.EgressThroughputPerSec) {
    return nil, false
	}
	return o.EgressThroughputPerSec, true
}

// HasEgressThroughputPerSec returns a boolean if a field has been set.
func (o *KafkaRequest) HasEgressThroughputPerSec() bool {
	if o != nil && !isNil(o.EgressThroughputPerSec) {
		return true
	}

	return false
}

// SetEgressThroughputPerSec gets a reference to the given string and assigns it to the EgressThroughputPerSec field.
// Deprecated
func (o *KafkaRequest) SetEgressThroughputPerSec(v string) {
	o.EgressThroughputPerSec = &v
}

// GetTotalMaxConnections returns the TotalMaxConnections field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetTotalMaxConnections() int32 {
	if o == nil || isNil(o.TotalMaxConnections) {
		var ret int32
		return ret
	}
	return *o.TotalMaxConnections
}

// GetTotalMaxConnectionsOk returns a tuple with the TotalMaxConnections field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetTotalMaxConnectionsOk() (*int32, bool) {
	if o == nil || isNil(o.TotalMaxConnections) {
    return nil, false
	}
	return o.TotalMaxConnections, true
}

// HasTotalMaxConnections returns a boolean if a field has been set.
func (o *KafkaRequest) HasTotalMaxConnections() bool {
	if o != nil && !isNil(o.TotalMaxConnections) {
		return true
	}

	return false
}

// SetTotalMaxConnections gets a reference to the given int32 and assigns it to the TotalMaxConnections field.
// Deprecated
func (o *KafkaRequest) SetTotalMaxConnections(v int32) {
	o.TotalMaxConnections = &v
}

// GetMaxPartitions returns the MaxPartitions field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetMaxPartitions() int32 {
	if o == nil || isNil(o.MaxPartitions) {
		var ret int32
		return ret
	}
	return *o.MaxPartitions
}

// GetMaxPartitionsOk returns a tuple with the MaxPartitions field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetMaxPartitionsOk() (*int32, bool) {
	if o == nil || isNil(o.MaxPartitions) {
    return nil, false
	}
	return o.MaxPartitions, true
}

// HasMaxPartitions returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxPartitions() bool {
	if o != nil && !isNil(o.MaxPartitions) {
		return true
	}

	return false
}

// SetMaxPartitions gets a reference to the given int32 and assigns it to the MaxPartitions field.
// Deprecated
func (o *KafkaRequest) SetMaxPartitions(v int32) {
	o.MaxPartitions = &v
}

// GetMaxDataRetentionPeriod returns the MaxDataRetentionPeriod field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetMaxDataRetentionPeriod() string {
	if o == nil || isNil(o.MaxDataRetentionPeriod) {
		var ret string
		return ret
	}
	return *o.MaxDataRetentionPeriod
}

// GetMaxDataRetentionPeriodOk returns a tuple with the MaxDataRetentionPeriod field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetMaxDataRetentionPeriodOk() (*string, bool) {
	if o == nil || isNil(o.MaxDataRetentionPeriod) {
    return nil, false
	}
	return o.MaxDataRetentionPeriod, true
}

// HasMaxDataRetentionPeriod returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxDataRetentionPeriod() bool {
	if o != nil && !isNil(o.MaxDataRetentionPeriod) {
		return true
	}

	return false
}

// SetMaxDataRetentionPeriod gets a reference to the given string and assigns it to the MaxDataRetentionPeriod field.
// Deprecated
func (o *KafkaRequest) SetMaxDataRetentionPeriod(v string) {
	o.MaxDataRetentionPeriod = &v
}

// GetMaxConnectionAttemptsPerSec returns the MaxConnectionAttemptsPerSec field value if set, zero value otherwise.
// Deprecated
func (o *KafkaRequest) GetMaxConnectionAttemptsPerSec() int32 {
	if o == nil || isNil(o.MaxConnectionAttemptsPerSec) {
		var ret int32
		return ret
	}
	return *o.MaxConnectionAttemptsPerSec
}

// GetMaxConnectionAttemptsPerSecOk returns a tuple with the MaxConnectionAttemptsPerSec field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *KafkaRequest) GetMaxConnectionAttemptsPerSecOk() (*int32, bool) {
	if o == nil || isNil(o.MaxConnectionAttemptsPerSec) {
    return nil, false
	}
	return o.MaxConnectionAttemptsPerSec, true
}

// HasMaxConnectionAttemptsPerSec returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxConnectionAttemptsPerSec() bool {
	if o != nil && !isNil(o.MaxConnectionAttemptsPerSec) {
		return true
	}

	return false
}

// SetMaxConnectionAttemptsPerSec gets a reference to the given int32 and assigns it to the MaxConnectionAttemptsPerSec field.
// Deprecated
func (o *KafkaRequest) SetMaxConnectionAttemptsPerSec(v int32) {
	o.MaxConnectionAttemptsPerSec = &v
}

// GetBillingCloudAccountId returns the BillingCloudAccountId field value if set, zero value otherwise.
func (o *KafkaRequest) GetBillingCloudAccountId() string {
	if o == nil || isNil(o.BillingCloudAccountId) {
		var ret string
		return ret
	}
	return *o.BillingCloudAccountId
}

// GetBillingCloudAccountIdOk returns a tuple with the BillingCloudAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBillingCloudAccountIdOk() (*string, bool) {
	if o == nil || isNil(o.BillingCloudAccountId) {
    return nil, false
	}
	return o.BillingCloudAccountId, true
}

// HasBillingCloudAccountId returns a boolean if a field has been set.
func (o *KafkaRequest) HasBillingCloudAccountId() bool {
	if o != nil && !isNil(o.BillingCloudAccountId) {
		return true
	}

	return false
}

// SetBillingCloudAccountId gets a reference to the given string and assigns it to the BillingCloudAccountId field.
func (o *KafkaRequest) SetBillingCloudAccountId(v string) {
	o.BillingCloudAccountId = &v
}

// GetMarketplace returns the Marketplace field value if set, zero value otherwise.
func (o *KafkaRequest) GetMarketplace() string {
	if o == nil || isNil(o.Marketplace) {
		var ret string
		return ret
	}
	return *o.Marketplace
}

// GetMarketplaceOk returns a tuple with the Marketplace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMarketplaceOk() (*string, bool) {
	if o == nil || isNil(o.Marketplace) {
    return nil, false
	}
	return o.Marketplace, true
}

// HasMarketplace returns a boolean if a field has been set.
func (o *KafkaRequest) HasMarketplace() bool {
	if o != nil && !isNil(o.Marketplace) {
		return true
	}

	return false
}

// SetMarketplace gets a reference to the given string and assigns it to the Marketplace field.
func (o *KafkaRequest) SetMarketplace(v string) {
	o.Marketplace = &v
}

// GetBillingModel returns the BillingModel field value if set, zero value otherwise.
func (o *KafkaRequest) GetBillingModel() string {
	if o == nil || isNil(o.BillingModel) {
		var ret string
		return ret
	}
	return *o.BillingModel
}

// GetBillingModelOk returns a tuple with the BillingModel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBillingModelOk() (*string, bool) {
	if o == nil || isNil(o.BillingModel) {
    return nil, false
	}
	return o.BillingModel, true
}

// HasBillingModel returns a boolean if a field has been set.
func (o *KafkaRequest) HasBillingModel() bool {
	if o != nil && !isNil(o.BillingModel) {
		return true
	}

	return false
}

// SetBillingModel gets a reference to the given string and assigns it to the BillingModel field.
func (o *KafkaRequest) SetBillingModel(v string) {
	o.BillingModel = &v
}

func (o KafkaRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["kind"] = o.Kind
	}
	if true {
		toSerialize["href"] = o.Href
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !isNil(o.CloudProvider) {
		toSerialize["cloud_provider"] = o.CloudProvider
	}
	if true {
		toSerialize["multi_az"] = o.MultiAz
	}
	if !isNil(o.Region) {
		toSerialize["region"] = o.Region
	}
	if !isNil(o.Owner) {
		toSerialize["owner"] = o.Owner
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.BootstrapServerHost) {
		toSerialize["bootstrap_server_host"] = o.BootstrapServerHost
	}
	if !isNil(o.AdminApiServerUrl) {
		toSerialize["admin_api_server_url"] = o.AdminApiServerUrl
	}
	if !isNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if o.ExpiresAt.IsSet() {
		toSerialize["expires_at"] = o.ExpiresAt.Get()
	}
	if !isNil(o.UpdatedAt) {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	if !isNil(o.FailedReason) {
		toSerialize["failed_reason"] = o.FailedReason
	}
	if !isNil(o.Version) {
		toSerialize["version"] = o.Version
	}
	if !isNil(o.InstanceType) {
		toSerialize["instance_type"] = o.InstanceType
	}
	if !isNil(o.InstanceTypeName) {
		toSerialize["instance_type_name"] = o.InstanceTypeName
	}
	if true {
		toSerialize["reauthentication_enabled"] = o.ReauthenticationEnabled
	}
	if !isNil(o.KafkaStorageSize) {
		toSerialize["kafka_storage_size"] = o.KafkaStorageSize
	}
	if !isNil(o.MaxDataRetentionSize) {
		toSerialize["max_data_retention_size"] = o.MaxDataRetentionSize
	}
	if !isNil(o.BrowserUrl) {
		toSerialize["browser_url"] = o.BrowserUrl
	}
	if !isNil(o.SizeId) {
		toSerialize["size_id"] = o.SizeId
	}
	if !isNil(o.IngressThroughputPerSec) {
		toSerialize["ingress_throughput_per_sec"] = o.IngressThroughputPerSec
	}
	if !isNil(o.EgressThroughputPerSec) {
		toSerialize["egress_throughput_per_sec"] = o.EgressThroughputPerSec
	}
	if !isNil(o.TotalMaxConnections) {
		toSerialize["total_max_connections"] = o.TotalMaxConnections
	}
	if !isNil(o.MaxPartitions) {
		toSerialize["max_partitions"] = o.MaxPartitions
	}
	if !isNil(o.MaxDataRetentionPeriod) {
		toSerialize["max_data_retention_period"] = o.MaxDataRetentionPeriod
	}
	if !isNil(o.MaxConnectionAttemptsPerSec) {
		toSerialize["max_connection_attempts_per_sec"] = o.MaxConnectionAttemptsPerSec
	}
	if !isNil(o.BillingCloudAccountId) {
		toSerialize["billing_cloud_account_id"] = o.BillingCloudAccountId
	}
	if !isNil(o.Marketplace) {
		toSerialize["marketplace"] = o.Marketplace
	}
	if !isNil(o.BillingModel) {
		toSerialize["billing_model"] = o.BillingModel
	}
	return json.Marshal(toSerialize)
}

type NullableKafkaRequest struct {
	value *KafkaRequest
	isSet bool
}

func (v NullableKafkaRequest) Get() *KafkaRequest {
	return v.value
}

func (v *NullableKafkaRequest) Set(val *KafkaRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableKafkaRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableKafkaRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKafkaRequest(val *KafkaRequest) *NullableKafkaRequest {
	return &NullableKafkaRequest{value: val, isSet: true}
}

func (v NullableKafkaRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKafkaRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


