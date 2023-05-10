/*
 * Kafka Management API
 *
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * API version: 1.16.0
 * Contact: rhosak-support@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkamgmtclient

import (
	"encoding/json"
	"time"
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
	InstanceTypeName *string `json:"instance_type_name,omitempty"`
	ReauthenticationEnabled bool `json:"reauthentication_enabled"`
	MaxDataRetentionSize *SupportedKafkaSizeBytesValueItem `json:"max_data_retention_size,omitempty"`
	BrowserUrl *string `json:"browser_url,omitempty"`
	SizeId *string `json:"size_id,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	IngressThroughputPerSec *string `json:"ingress_throughput_per_sec,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	EgressThroughputPerSec *string `json:"egress_throughput_per_sec,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	TotalMaxConnections *int32 `json:"total_max_connections,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	MaxPartitions *int32 `json:"max_partitions,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	MaxDataRetentionPeriod *string `json:"max_data_retention_period,omitempty"`
	// This field is now deprecated, please use the /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} endpoint to retrieve the field instead.
	MaxConnectionAttemptsPerSec *int32 `json:"max_connection_attempts_per_sec,omitempty"`
	BillingCloudAccountId *string `json:"billing_cloud_account_id,omitempty"`
	Marketplace *string `json:"marketplace,omitempty"`
	BillingModel *string `json:"billing_model,omitempty"`
	// Status of the Kafka request promotion. Possible values: ['promoting', 'failed']. If unset it means no promotion is in progress.
	PromotionStatus *string `json:"promotion_status,omitempty"`
	// The ID of the data plane where Kafka is deployed on. This information is only returned for kafka whose billing model is enterprise
	ClusterId NullableString `json:"cluster_id,omitempty"`
	// Details of the Kafka request promotion. It can be set when a Kafka request promotion is in progress or has failed
	PromotionDetails *string `json:"promotion_details,omitempty"`
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
	if o == nil  {
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
	if o == nil  {
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
	if o == nil  {
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
	if o == nil || o.Status == nil {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetStatusOk() (*string, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *KafkaRequest) HasStatus() bool {
	if o != nil && o.Status != nil {
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
	if o == nil || o.CloudProvider == nil {
		var ret string
		return ret
	}
	return *o.CloudProvider
}

// GetCloudProviderOk returns a tuple with the CloudProvider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetCloudProviderOk() (*string, bool) {
	if o == nil || o.CloudProvider == nil {
		return nil, false
	}
	return o.CloudProvider, true
}

// HasCloudProvider returns a boolean if a field has been set.
func (o *KafkaRequest) HasCloudProvider() bool {
	if o != nil && o.CloudProvider != nil {
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
	if o == nil  {
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
	if o == nil || o.Region == nil {
		var ret string
		return ret
	}
	return *o.Region
}

// GetRegionOk returns a tuple with the Region field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetRegionOk() (*string, bool) {
	if o == nil || o.Region == nil {
		return nil, false
	}
	return o.Region, true
}

// HasRegion returns a boolean if a field has been set.
func (o *KafkaRequest) HasRegion() bool {
	if o != nil && o.Region != nil {
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
	if o == nil || o.Owner == nil {
		var ret string
		return ret
	}
	return *o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetOwnerOk() (*string, bool) {
	if o == nil || o.Owner == nil {
		return nil, false
	}
	return o.Owner, true
}

// HasOwner returns a boolean if a field has been set.
func (o *KafkaRequest) HasOwner() bool {
	if o != nil && o.Owner != nil {
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
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *KafkaRequest) HasName() bool {
	if o != nil && o.Name != nil {
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
	if o == nil || o.BootstrapServerHost == nil {
		var ret string
		return ret
	}
	return *o.BootstrapServerHost
}

// GetBootstrapServerHostOk returns a tuple with the BootstrapServerHost field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBootstrapServerHostOk() (*string, bool) {
	if o == nil || o.BootstrapServerHost == nil {
		return nil, false
	}
	return o.BootstrapServerHost, true
}

// HasBootstrapServerHost returns a boolean if a field has been set.
func (o *KafkaRequest) HasBootstrapServerHost() bool {
	if o != nil && o.BootstrapServerHost != nil {
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
	if o == nil || o.AdminApiServerUrl == nil {
		var ret string
		return ret
	}
	return *o.AdminApiServerUrl
}

// GetAdminApiServerUrlOk returns a tuple with the AdminApiServerUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetAdminApiServerUrlOk() (*string, bool) {
	if o == nil || o.AdminApiServerUrl == nil {
		return nil, false
	}
	return o.AdminApiServerUrl, true
}

// HasAdminApiServerUrl returns a boolean if a field has been set.
func (o *KafkaRequest) HasAdminApiServerUrl() bool {
	if o != nil && o.AdminApiServerUrl != nil {
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
	if o == nil || o.CreatedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || o.CreatedAt == nil {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *KafkaRequest) HasCreatedAt() bool {
	if o != nil && o.CreatedAt != nil {
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
	if o == nil || o.ExpiresAt.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt.Get()
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *KafkaRequest) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil  {
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
	if o == nil || o.UpdatedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || o.UpdatedAt == nil {
		return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *KafkaRequest) HasUpdatedAt() bool {
	if o != nil && o.UpdatedAt != nil {
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
	if o == nil || o.FailedReason == nil {
		var ret string
		return ret
	}
	return *o.FailedReason
}

// GetFailedReasonOk returns a tuple with the FailedReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetFailedReasonOk() (*string, bool) {
	if o == nil || o.FailedReason == nil {
		return nil, false
	}
	return o.FailedReason, true
}

// HasFailedReason returns a boolean if a field has been set.
func (o *KafkaRequest) HasFailedReason() bool {
	if o != nil && o.FailedReason != nil {
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
	if o == nil || o.Version == nil {
		var ret string
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetVersionOk() (*string, bool) {
	if o == nil || o.Version == nil {
		return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *KafkaRequest) HasVersion() bool {
	if o != nil && o.Version != nil {
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
	if o == nil || o.InstanceType == nil {
		var ret string
		return ret
	}
	return *o.InstanceType
}

// GetInstanceTypeOk returns a tuple with the InstanceType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetInstanceTypeOk() (*string, bool) {
	if o == nil || o.InstanceType == nil {
		return nil, false
	}
	return o.InstanceType, true
}

// HasInstanceType returns a boolean if a field has been set.
func (o *KafkaRequest) HasInstanceType() bool {
	if o != nil && o.InstanceType != nil {
		return true
	}

	return false
}

// SetInstanceType gets a reference to the given string and assigns it to the InstanceType field.
func (o *KafkaRequest) SetInstanceType(v string) {
	o.InstanceType = &v
}

// GetInstanceTypeName returns the InstanceTypeName field value if set, zero value otherwise.
func (o *KafkaRequest) GetInstanceTypeName() string {
	if o == nil || o.InstanceTypeName == nil {
		var ret string
		return ret
	}
	return *o.InstanceTypeName
}

// GetInstanceTypeNameOk returns a tuple with the InstanceTypeName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetInstanceTypeNameOk() (*string, bool) {
	if o == nil || o.InstanceTypeName == nil {
		return nil, false
	}
	return o.InstanceTypeName, true
}

// HasInstanceTypeName returns a boolean if a field has been set.
func (o *KafkaRequest) HasInstanceTypeName() bool {
	if o != nil && o.InstanceTypeName != nil {
		return true
	}

	return false
}

// SetInstanceTypeName gets a reference to the given string and assigns it to the InstanceTypeName field.
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
	if o == nil  {
		return nil, false
	}
	return &o.ReauthenticationEnabled, true
}

// SetReauthenticationEnabled sets field value
func (o *KafkaRequest) SetReauthenticationEnabled(v bool) {
	o.ReauthenticationEnabled = v
}

// GetMaxDataRetentionSize returns the MaxDataRetentionSize field value if set, zero value otherwise.
func (o *KafkaRequest) GetMaxDataRetentionSize() SupportedKafkaSizeBytesValueItem {
	if o == nil || o.MaxDataRetentionSize == nil {
		var ret SupportedKafkaSizeBytesValueItem
		return ret
	}
	return *o.MaxDataRetentionSize
}

// GetMaxDataRetentionSizeOk returns a tuple with the MaxDataRetentionSize field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMaxDataRetentionSizeOk() (*SupportedKafkaSizeBytesValueItem, bool) {
	if o == nil || o.MaxDataRetentionSize == nil {
		return nil, false
	}
	return o.MaxDataRetentionSize, true
}

// HasMaxDataRetentionSize returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxDataRetentionSize() bool {
	if o != nil && o.MaxDataRetentionSize != nil {
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
	if o == nil || o.BrowserUrl == nil {
		var ret string
		return ret
	}
	return *o.BrowserUrl
}

// GetBrowserUrlOk returns a tuple with the BrowserUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBrowserUrlOk() (*string, bool) {
	if o == nil || o.BrowserUrl == nil {
		return nil, false
	}
	return o.BrowserUrl, true
}

// HasBrowserUrl returns a boolean if a field has been set.
func (o *KafkaRequest) HasBrowserUrl() bool {
	if o != nil && o.BrowserUrl != nil {
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
	if o == nil || o.SizeId == nil {
		var ret string
		return ret
	}
	return *o.SizeId
}

// GetSizeIdOk returns a tuple with the SizeId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetSizeIdOk() (*string, bool) {
	if o == nil || o.SizeId == nil {
		return nil, false
	}
	return o.SizeId, true
}

// HasSizeId returns a boolean if a field has been set.
func (o *KafkaRequest) HasSizeId() bool {
	if o != nil && o.SizeId != nil {
		return true
	}

	return false
}

// SetSizeId gets a reference to the given string and assigns it to the SizeId field.
func (o *KafkaRequest) SetSizeId(v string) {
	o.SizeId = &v
}

// GetIngressThroughputPerSec returns the IngressThroughputPerSec field value if set, zero value otherwise.
func (o *KafkaRequest) GetIngressThroughputPerSec() string {
	if o == nil || o.IngressThroughputPerSec == nil {
		var ret string
		return ret
	}
	return *o.IngressThroughputPerSec
}

// GetIngressThroughputPerSecOk returns a tuple with the IngressThroughputPerSec field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetIngressThroughputPerSecOk() (*string, bool) {
	if o == nil || o.IngressThroughputPerSec == nil {
		return nil, false
	}
	return o.IngressThroughputPerSec, true
}

// HasIngressThroughputPerSec returns a boolean if a field has been set.
func (o *KafkaRequest) HasIngressThroughputPerSec() bool {
	if o != nil && o.IngressThroughputPerSec != nil {
		return true
	}

	return false
}

// SetIngressThroughputPerSec gets a reference to the given string and assigns it to the IngressThroughputPerSec field.
func (o *KafkaRequest) SetIngressThroughputPerSec(v string) {
	o.IngressThroughputPerSec = &v
}

// GetEgressThroughputPerSec returns the EgressThroughputPerSec field value if set, zero value otherwise.
func (o *KafkaRequest) GetEgressThroughputPerSec() string {
	if o == nil || o.EgressThroughputPerSec == nil {
		var ret string
		return ret
	}
	return *o.EgressThroughputPerSec
}

// GetEgressThroughputPerSecOk returns a tuple with the EgressThroughputPerSec field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetEgressThroughputPerSecOk() (*string, bool) {
	if o == nil || o.EgressThroughputPerSec == nil {
		return nil, false
	}
	return o.EgressThroughputPerSec, true
}

// HasEgressThroughputPerSec returns a boolean if a field has been set.
func (o *KafkaRequest) HasEgressThroughputPerSec() bool {
	if o != nil && o.EgressThroughputPerSec != nil {
		return true
	}

	return false
}

// SetEgressThroughputPerSec gets a reference to the given string and assigns it to the EgressThroughputPerSec field.
func (o *KafkaRequest) SetEgressThroughputPerSec(v string) {
	o.EgressThroughputPerSec = &v
}

// GetTotalMaxConnections returns the TotalMaxConnections field value if set, zero value otherwise.
func (o *KafkaRequest) GetTotalMaxConnections() int32 {
	if o == nil || o.TotalMaxConnections == nil {
		var ret int32
		return ret
	}
	return *o.TotalMaxConnections
}

// GetTotalMaxConnectionsOk returns a tuple with the TotalMaxConnections field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetTotalMaxConnectionsOk() (*int32, bool) {
	if o == nil || o.TotalMaxConnections == nil {
		return nil, false
	}
	return o.TotalMaxConnections, true
}

// HasTotalMaxConnections returns a boolean if a field has been set.
func (o *KafkaRequest) HasTotalMaxConnections() bool {
	if o != nil && o.TotalMaxConnections != nil {
		return true
	}

	return false
}

// SetTotalMaxConnections gets a reference to the given int32 and assigns it to the TotalMaxConnections field.
func (o *KafkaRequest) SetTotalMaxConnections(v int32) {
	o.TotalMaxConnections = &v
}

// GetMaxPartitions returns the MaxPartitions field value if set, zero value otherwise.
func (o *KafkaRequest) GetMaxPartitions() int32 {
	if o == nil || o.MaxPartitions == nil {
		var ret int32
		return ret
	}
	return *o.MaxPartitions
}

// GetMaxPartitionsOk returns a tuple with the MaxPartitions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMaxPartitionsOk() (*int32, bool) {
	if o == nil || o.MaxPartitions == nil {
		return nil, false
	}
	return o.MaxPartitions, true
}

// HasMaxPartitions returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxPartitions() bool {
	if o != nil && o.MaxPartitions != nil {
		return true
	}

	return false
}

// SetMaxPartitions gets a reference to the given int32 and assigns it to the MaxPartitions field.
func (o *KafkaRequest) SetMaxPartitions(v int32) {
	o.MaxPartitions = &v
}

// GetMaxDataRetentionPeriod returns the MaxDataRetentionPeriod field value if set, zero value otherwise.
func (o *KafkaRequest) GetMaxDataRetentionPeriod() string {
	if o == nil || o.MaxDataRetentionPeriod == nil {
		var ret string
		return ret
	}
	return *o.MaxDataRetentionPeriod
}

// GetMaxDataRetentionPeriodOk returns a tuple with the MaxDataRetentionPeriod field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMaxDataRetentionPeriodOk() (*string, bool) {
	if o == nil || o.MaxDataRetentionPeriod == nil {
		return nil, false
	}
	return o.MaxDataRetentionPeriod, true
}

// HasMaxDataRetentionPeriod returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxDataRetentionPeriod() bool {
	if o != nil && o.MaxDataRetentionPeriod != nil {
		return true
	}

	return false
}

// SetMaxDataRetentionPeriod gets a reference to the given string and assigns it to the MaxDataRetentionPeriod field.
func (o *KafkaRequest) SetMaxDataRetentionPeriod(v string) {
	o.MaxDataRetentionPeriod = &v
}

// GetMaxConnectionAttemptsPerSec returns the MaxConnectionAttemptsPerSec field value if set, zero value otherwise.
func (o *KafkaRequest) GetMaxConnectionAttemptsPerSec() int32 {
	if o == nil || o.MaxConnectionAttemptsPerSec == nil {
		var ret int32
		return ret
	}
	return *o.MaxConnectionAttemptsPerSec
}

// GetMaxConnectionAttemptsPerSecOk returns a tuple with the MaxConnectionAttemptsPerSec field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMaxConnectionAttemptsPerSecOk() (*int32, bool) {
	if o == nil || o.MaxConnectionAttemptsPerSec == nil {
		return nil, false
	}
	return o.MaxConnectionAttemptsPerSec, true
}

// HasMaxConnectionAttemptsPerSec returns a boolean if a field has been set.
func (o *KafkaRequest) HasMaxConnectionAttemptsPerSec() bool {
	if o != nil && o.MaxConnectionAttemptsPerSec != nil {
		return true
	}

	return false
}

// SetMaxConnectionAttemptsPerSec gets a reference to the given int32 and assigns it to the MaxConnectionAttemptsPerSec field.
func (o *KafkaRequest) SetMaxConnectionAttemptsPerSec(v int32) {
	o.MaxConnectionAttemptsPerSec = &v
}

// GetBillingCloudAccountId returns the BillingCloudAccountId field value if set, zero value otherwise.
func (o *KafkaRequest) GetBillingCloudAccountId() string {
	if o == nil || o.BillingCloudAccountId == nil {
		var ret string
		return ret
	}
	return *o.BillingCloudAccountId
}

// GetBillingCloudAccountIdOk returns a tuple with the BillingCloudAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBillingCloudAccountIdOk() (*string, bool) {
	if o == nil || o.BillingCloudAccountId == nil {
		return nil, false
	}
	return o.BillingCloudAccountId, true
}

// HasBillingCloudAccountId returns a boolean if a field has been set.
func (o *KafkaRequest) HasBillingCloudAccountId() bool {
	if o != nil && o.BillingCloudAccountId != nil {
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
	if o == nil || o.Marketplace == nil {
		var ret string
		return ret
	}
	return *o.Marketplace
}

// GetMarketplaceOk returns a tuple with the Marketplace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetMarketplaceOk() (*string, bool) {
	if o == nil || o.Marketplace == nil {
		return nil, false
	}
	return o.Marketplace, true
}

// HasMarketplace returns a boolean if a field has been set.
func (o *KafkaRequest) HasMarketplace() bool {
	if o != nil && o.Marketplace != nil {
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
	if o == nil || o.BillingModel == nil {
		var ret string
		return ret
	}
	return *o.BillingModel
}

// GetBillingModelOk returns a tuple with the BillingModel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetBillingModelOk() (*string, bool) {
	if o == nil || o.BillingModel == nil {
		return nil, false
	}
	return o.BillingModel, true
}

// HasBillingModel returns a boolean if a field has been set.
func (o *KafkaRequest) HasBillingModel() bool {
	if o != nil && o.BillingModel != nil {
		return true
	}

	return false
}

// SetBillingModel gets a reference to the given string and assigns it to the BillingModel field.
func (o *KafkaRequest) SetBillingModel(v string) {
	o.BillingModel = &v
}

// GetPromotionStatus returns the PromotionStatus field value if set, zero value otherwise.
func (o *KafkaRequest) GetPromotionStatus() string {
	if o == nil || o.PromotionStatus == nil {
		var ret string
		return ret
	}
	return *o.PromotionStatus
}

// GetPromotionStatusOk returns a tuple with the PromotionStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetPromotionStatusOk() (*string, bool) {
	if o == nil || o.PromotionStatus == nil {
		return nil, false
	}
	return o.PromotionStatus, true
}

// HasPromotionStatus returns a boolean if a field has been set.
func (o *KafkaRequest) HasPromotionStatus() bool {
	if o != nil && o.PromotionStatus != nil {
		return true
	}

	return false
}

// SetPromotionStatus gets a reference to the given string and assigns it to the PromotionStatus field.
func (o *KafkaRequest) SetPromotionStatus(v string) {
	o.PromotionStatus = &v
}

// GetClusterId returns the ClusterId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *KafkaRequest) GetClusterId() string {
	if o == nil || o.ClusterId.Get() == nil {
		var ret string
		return ret
	}
	return *o.ClusterId.Get()
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *KafkaRequest) GetClusterIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.ClusterId.Get(), o.ClusterId.IsSet()
}

// HasClusterId returns a boolean if a field has been set.
func (o *KafkaRequest) HasClusterId() bool {
	if o != nil && o.ClusterId.IsSet() {
		return true
	}

	return false
}

// SetClusterId gets a reference to the given NullableString and assigns it to the ClusterId field.
func (o *KafkaRequest) SetClusterId(v string) {
	o.ClusterId.Set(&v)
}
// SetClusterIdNil sets the value for ClusterId to be an explicit nil
func (o *KafkaRequest) SetClusterIdNil() {
	o.ClusterId.Set(nil)
}

// UnsetClusterId ensures that no value is present for ClusterId, not even an explicit nil
func (o *KafkaRequest) UnsetClusterId() {
	o.ClusterId.Unset()
}

// GetPromotionDetails returns the PromotionDetails field value if set, zero value otherwise.
func (o *KafkaRequest) GetPromotionDetails() string {
	if o == nil || o.PromotionDetails == nil {
		var ret string
		return ret
	}
	return *o.PromotionDetails
}

// GetPromotionDetailsOk returns a tuple with the PromotionDetails field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KafkaRequest) GetPromotionDetailsOk() (*string, bool) {
	if o == nil || o.PromotionDetails == nil {
		return nil, false
	}
	return o.PromotionDetails, true
}

// HasPromotionDetails returns a boolean if a field has been set.
func (o *KafkaRequest) HasPromotionDetails() bool {
	if o != nil && o.PromotionDetails != nil {
		return true
	}

	return false
}

// SetPromotionDetails gets a reference to the given string and assigns it to the PromotionDetails field.
func (o *KafkaRequest) SetPromotionDetails(v string) {
	o.PromotionDetails = &v
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
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	if o.CloudProvider != nil {
		toSerialize["cloud_provider"] = o.CloudProvider
	}
	if true {
		toSerialize["multi_az"] = o.MultiAz
	}
	if o.Region != nil {
		toSerialize["region"] = o.Region
	}
	if o.Owner != nil {
		toSerialize["owner"] = o.Owner
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.BootstrapServerHost != nil {
		toSerialize["bootstrap_server_host"] = o.BootstrapServerHost
	}
	if o.AdminApiServerUrl != nil {
		toSerialize["admin_api_server_url"] = o.AdminApiServerUrl
	}
	if o.CreatedAt != nil {
		toSerialize["created_at"] = o.CreatedAt
	}
	if o.ExpiresAt.IsSet() {
		toSerialize["expires_at"] = o.ExpiresAt.Get()
	}
	if o.UpdatedAt != nil {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	if o.FailedReason != nil {
		toSerialize["failed_reason"] = o.FailedReason
	}
	if o.Version != nil {
		toSerialize["version"] = o.Version
	}
	if o.InstanceType != nil {
		toSerialize["instance_type"] = o.InstanceType
	}
	if o.InstanceTypeName != nil {
		toSerialize["instance_type_name"] = o.InstanceTypeName
	}
	if true {
		toSerialize["reauthentication_enabled"] = o.ReauthenticationEnabled
	}
	if o.MaxDataRetentionSize != nil {
		toSerialize["max_data_retention_size"] = o.MaxDataRetentionSize
	}
	if o.BrowserUrl != nil {
		toSerialize["browser_url"] = o.BrowserUrl
	}
	if o.SizeId != nil {
		toSerialize["size_id"] = o.SizeId
	}
	if o.IngressThroughputPerSec != nil {
		toSerialize["ingress_throughput_per_sec"] = o.IngressThroughputPerSec
	}
	if o.EgressThroughputPerSec != nil {
		toSerialize["egress_throughput_per_sec"] = o.EgressThroughputPerSec
	}
	if o.TotalMaxConnections != nil {
		toSerialize["total_max_connections"] = o.TotalMaxConnections
	}
	if o.MaxPartitions != nil {
		toSerialize["max_partitions"] = o.MaxPartitions
	}
	if o.MaxDataRetentionPeriod != nil {
		toSerialize["max_data_retention_period"] = o.MaxDataRetentionPeriod
	}
	if o.MaxConnectionAttemptsPerSec != nil {
		toSerialize["max_connection_attempts_per_sec"] = o.MaxConnectionAttemptsPerSec
	}
	if o.BillingCloudAccountId != nil {
		toSerialize["billing_cloud_account_id"] = o.BillingCloudAccountId
	}
	if o.Marketplace != nil {
		toSerialize["marketplace"] = o.Marketplace
	}
	if o.BillingModel != nil {
		toSerialize["billing_model"] = o.BillingModel
	}
	if o.PromotionStatus != nil {
		toSerialize["promotion_status"] = o.PromotionStatus
	}
	if o.ClusterId.IsSet() {
		toSerialize["cluster_id"] = o.ClusterId.Get()
	}
	if o.PromotionDetails != nil {
		toSerialize["promotion_details"] = o.PromotionDetails
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


