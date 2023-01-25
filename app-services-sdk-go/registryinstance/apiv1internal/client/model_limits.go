/*
Apicurio Registry API [v2]

Apicurio Registry is a datastore for standard event schemas and API designs. Apicurio Registry enables developers to manage and share the structure of their data using a REST interface. For example, client applications can dynamically push or pull the latest updates to or from the registry without needing to redeploy. Apicurio Registry also enables developers to create rules that govern how registry content can evolve over time. For example, this includes rules for content validation and version compatibility.  The Apicurio Registry REST API enables client applications to manage the artifacts in the registry. This API provides create, read, update, and delete operations for schema and API artifacts, rules, versions, and metadata.   The supported artifact types include: - Apache Avro schema - AsyncAPI specification - Google protocol buffers - GraphQL schema - JSON Schema - Kafka Connect schema - OpenAPI specification - Web Services Description Language - XML Schema Definition   **Important**: The Apicurio Registry REST API is available from `https://MY-REGISTRY-URL/apis/registry/v2` by default. Therefore you must prefix all API operation paths with `../apis/registry/v2` in this case. For example: `../apis/registry/v2/ids/globalIds/{globalId}`. 

API version: 2.2.5.Final
Contact: apicurio@lists.jboss.org
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package registryinstanceclient

import (
	"encoding/json"
)

// Limits List of limitations on used resources, that are applied on the current instance of Registry. Keys represent the resource type and are suffixed by the corresponding unit. Values are integers. Only non-negative values are allowed, with the exception of -1, which means that the limit is not applied.
type Limits struct {
	MaxTotalSchemasCount *int64 `json:"maxTotalSchemasCount,omitempty"`
	MaxSchemaSizeBytes *int64 `json:"maxSchemaSizeBytes,omitempty"`
	MaxArtifactsCount *int64 `json:"maxArtifactsCount,omitempty"`
	MaxVersionsPerArtifactCount *int64 `json:"maxVersionsPerArtifactCount,omitempty"`
	MaxArtifactPropertiesCount *int64 `json:"maxArtifactPropertiesCount,omitempty"`
	MaxPropertyKeySizeBytes *int64 `json:"maxPropertyKeySizeBytes,omitempty"`
	MaxPropertyValueSizeBytes *int64 `json:"maxPropertyValueSizeBytes,omitempty"`
	MaxArtifactLabelsCount *int64 `json:"maxArtifactLabelsCount,omitempty"`
	MaxLabelSizeBytes *int64 `json:"maxLabelSizeBytes,omitempty"`
	MaxArtifactNameLengthChars *int64 `json:"maxArtifactNameLengthChars,omitempty"`
	MaxArtifactDescriptionLengthChars *int64 `json:"maxArtifactDescriptionLengthChars,omitempty"`
	MaxRequestsPerSecondCount *int64 `json:"maxRequestsPerSecondCount,omitempty"`
}

// NewLimits instantiates a new Limits object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLimits() *Limits {
	this := Limits{}
	return &this
}

// NewLimitsWithDefaults instantiates a new Limits object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLimitsWithDefaults() *Limits {
	this := Limits{}
	return &this
}

// GetMaxTotalSchemasCount returns the MaxTotalSchemasCount field value if set, zero value otherwise.
func (o *Limits) GetMaxTotalSchemasCount() int64 {
	if o == nil || isNil(o.MaxTotalSchemasCount) {
		var ret int64
		return ret
	}
	return *o.MaxTotalSchemasCount
}

// GetMaxTotalSchemasCountOk returns a tuple with the MaxTotalSchemasCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxTotalSchemasCountOk() (*int64, bool) {
	if o == nil || isNil(o.MaxTotalSchemasCount) {
    return nil, false
	}
	return o.MaxTotalSchemasCount, true
}

// HasMaxTotalSchemasCount returns a boolean if a field has been set.
func (o *Limits) HasMaxTotalSchemasCount() bool {
	if o != nil && !isNil(o.MaxTotalSchemasCount) {
		return true
	}

	return false
}

// SetMaxTotalSchemasCount gets a reference to the given int64 and assigns it to the MaxTotalSchemasCount field.
func (o *Limits) SetMaxTotalSchemasCount(v int64) {
	o.MaxTotalSchemasCount = &v
}

// GetMaxSchemaSizeBytes returns the MaxSchemaSizeBytes field value if set, zero value otherwise.
func (o *Limits) GetMaxSchemaSizeBytes() int64 {
	if o == nil || isNil(o.MaxSchemaSizeBytes) {
		var ret int64
		return ret
	}
	return *o.MaxSchemaSizeBytes
}

// GetMaxSchemaSizeBytesOk returns a tuple with the MaxSchemaSizeBytes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxSchemaSizeBytesOk() (*int64, bool) {
	if o == nil || isNil(o.MaxSchemaSizeBytes) {
    return nil, false
	}
	return o.MaxSchemaSizeBytes, true
}

// HasMaxSchemaSizeBytes returns a boolean if a field has been set.
func (o *Limits) HasMaxSchemaSizeBytes() bool {
	if o != nil && !isNil(o.MaxSchemaSizeBytes) {
		return true
	}

	return false
}

// SetMaxSchemaSizeBytes gets a reference to the given int64 and assigns it to the MaxSchemaSizeBytes field.
func (o *Limits) SetMaxSchemaSizeBytes(v int64) {
	o.MaxSchemaSizeBytes = &v
}

// GetMaxArtifactsCount returns the MaxArtifactsCount field value if set, zero value otherwise.
func (o *Limits) GetMaxArtifactsCount() int64 {
	if o == nil || isNil(o.MaxArtifactsCount) {
		var ret int64
		return ret
	}
	return *o.MaxArtifactsCount
}

// GetMaxArtifactsCountOk returns a tuple with the MaxArtifactsCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxArtifactsCountOk() (*int64, bool) {
	if o == nil || isNil(o.MaxArtifactsCount) {
    return nil, false
	}
	return o.MaxArtifactsCount, true
}

// HasMaxArtifactsCount returns a boolean if a field has been set.
func (o *Limits) HasMaxArtifactsCount() bool {
	if o != nil && !isNil(o.MaxArtifactsCount) {
		return true
	}

	return false
}

// SetMaxArtifactsCount gets a reference to the given int64 and assigns it to the MaxArtifactsCount field.
func (o *Limits) SetMaxArtifactsCount(v int64) {
	o.MaxArtifactsCount = &v
}

// GetMaxVersionsPerArtifactCount returns the MaxVersionsPerArtifactCount field value if set, zero value otherwise.
func (o *Limits) GetMaxVersionsPerArtifactCount() int64 {
	if o == nil || isNil(o.MaxVersionsPerArtifactCount) {
		var ret int64
		return ret
	}
	return *o.MaxVersionsPerArtifactCount
}

// GetMaxVersionsPerArtifactCountOk returns a tuple with the MaxVersionsPerArtifactCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxVersionsPerArtifactCountOk() (*int64, bool) {
	if o == nil || isNil(o.MaxVersionsPerArtifactCount) {
    return nil, false
	}
	return o.MaxVersionsPerArtifactCount, true
}

// HasMaxVersionsPerArtifactCount returns a boolean if a field has been set.
func (o *Limits) HasMaxVersionsPerArtifactCount() bool {
	if o != nil && !isNil(o.MaxVersionsPerArtifactCount) {
		return true
	}

	return false
}

// SetMaxVersionsPerArtifactCount gets a reference to the given int64 and assigns it to the MaxVersionsPerArtifactCount field.
func (o *Limits) SetMaxVersionsPerArtifactCount(v int64) {
	o.MaxVersionsPerArtifactCount = &v
}

// GetMaxArtifactPropertiesCount returns the MaxArtifactPropertiesCount field value if set, zero value otherwise.
func (o *Limits) GetMaxArtifactPropertiesCount() int64 {
	if o == nil || isNil(o.MaxArtifactPropertiesCount) {
		var ret int64
		return ret
	}
	return *o.MaxArtifactPropertiesCount
}

// GetMaxArtifactPropertiesCountOk returns a tuple with the MaxArtifactPropertiesCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxArtifactPropertiesCountOk() (*int64, bool) {
	if o == nil || isNil(o.MaxArtifactPropertiesCount) {
    return nil, false
	}
	return o.MaxArtifactPropertiesCount, true
}

// HasMaxArtifactPropertiesCount returns a boolean if a field has been set.
func (o *Limits) HasMaxArtifactPropertiesCount() bool {
	if o != nil && !isNil(o.MaxArtifactPropertiesCount) {
		return true
	}

	return false
}

// SetMaxArtifactPropertiesCount gets a reference to the given int64 and assigns it to the MaxArtifactPropertiesCount field.
func (o *Limits) SetMaxArtifactPropertiesCount(v int64) {
	o.MaxArtifactPropertiesCount = &v
}

// GetMaxPropertyKeySizeBytes returns the MaxPropertyKeySizeBytes field value if set, zero value otherwise.
func (o *Limits) GetMaxPropertyKeySizeBytes() int64 {
	if o == nil || isNil(o.MaxPropertyKeySizeBytes) {
		var ret int64
		return ret
	}
	return *o.MaxPropertyKeySizeBytes
}

// GetMaxPropertyKeySizeBytesOk returns a tuple with the MaxPropertyKeySizeBytes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxPropertyKeySizeBytesOk() (*int64, bool) {
	if o == nil || isNil(o.MaxPropertyKeySizeBytes) {
    return nil, false
	}
	return o.MaxPropertyKeySizeBytes, true
}

// HasMaxPropertyKeySizeBytes returns a boolean if a field has been set.
func (o *Limits) HasMaxPropertyKeySizeBytes() bool {
	if o != nil && !isNil(o.MaxPropertyKeySizeBytes) {
		return true
	}

	return false
}

// SetMaxPropertyKeySizeBytes gets a reference to the given int64 and assigns it to the MaxPropertyKeySizeBytes field.
func (o *Limits) SetMaxPropertyKeySizeBytes(v int64) {
	o.MaxPropertyKeySizeBytes = &v
}

// GetMaxPropertyValueSizeBytes returns the MaxPropertyValueSizeBytes field value if set, zero value otherwise.
func (o *Limits) GetMaxPropertyValueSizeBytes() int64 {
	if o == nil || isNil(o.MaxPropertyValueSizeBytes) {
		var ret int64
		return ret
	}
	return *o.MaxPropertyValueSizeBytes
}

// GetMaxPropertyValueSizeBytesOk returns a tuple with the MaxPropertyValueSizeBytes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxPropertyValueSizeBytesOk() (*int64, bool) {
	if o == nil || isNil(o.MaxPropertyValueSizeBytes) {
    return nil, false
	}
	return o.MaxPropertyValueSizeBytes, true
}

// HasMaxPropertyValueSizeBytes returns a boolean if a field has been set.
func (o *Limits) HasMaxPropertyValueSizeBytes() bool {
	if o != nil && !isNil(o.MaxPropertyValueSizeBytes) {
		return true
	}

	return false
}

// SetMaxPropertyValueSizeBytes gets a reference to the given int64 and assigns it to the MaxPropertyValueSizeBytes field.
func (o *Limits) SetMaxPropertyValueSizeBytes(v int64) {
	o.MaxPropertyValueSizeBytes = &v
}

// GetMaxArtifactLabelsCount returns the MaxArtifactLabelsCount field value if set, zero value otherwise.
func (o *Limits) GetMaxArtifactLabelsCount() int64 {
	if o == nil || isNil(o.MaxArtifactLabelsCount) {
		var ret int64
		return ret
	}
	return *o.MaxArtifactLabelsCount
}

// GetMaxArtifactLabelsCountOk returns a tuple with the MaxArtifactLabelsCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxArtifactLabelsCountOk() (*int64, bool) {
	if o == nil || isNil(o.MaxArtifactLabelsCount) {
    return nil, false
	}
	return o.MaxArtifactLabelsCount, true
}

// HasMaxArtifactLabelsCount returns a boolean if a field has been set.
func (o *Limits) HasMaxArtifactLabelsCount() bool {
	if o != nil && !isNil(o.MaxArtifactLabelsCount) {
		return true
	}

	return false
}

// SetMaxArtifactLabelsCount gets a reference to the given int64 and assigns it to the MaxArtifactLabelsCount field.
func (o *Limits) SetMaxArtifactLabelsCount(v int64) {
	o.MaxArtifactLabelsCount = &v
}

// GetMaxLabelSizeBytes returns the MaxLabelSizeBytes field value if set, zero value otherwise.
func (o *Limits) GetMaxLabelSizeBytes() int64 {
	if o == nil || isNil(o.MaxLabelSizeBytes) {
		var ret int64
		return ret
	}
	return *o.MaxLabelSizeBytes
}

// GetMaxLabelSizeBytesOk returns a tuple with the MaxLabelSizeBytes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxLabelSizeBytesOk() (*int64, bool) {
	if o == nil || isNil(o.MaxLabelSizeBytes) {
    return nil, false
	}
	return o.MaxLabelSizeBytes, true
}

// HasMaxLabelSizeBytes returns a boolean if a field has been set.
func (o *Limits) HasMaxLabelSizeBytes() bool {
	if o != nil && !isNil(o.MaxLabelSizeBytes) {
		return true
	}

	return false
}

// SetMaxLabelSizeBytes gets a reference to the given int64 and assigns it to the MaxLabelSizeBytes field.
func (o *Limits) SetMaxLabelSizeBytes(v int64) {
	o.MaxLabelSizeBytes = &v
}

// GetMaxArtifactNameLengthChars returns the MaxArtifactNameLengthChars field value if set, zero value otherwise.
func (o *Limits) GetMaxArtifactNameLengthChars() int64 {
	if o == nil || isNil(o.MaxArtifactNameLengthChars) {
		var ret int64
		return ret
	}
	return *o.MaxArtifactNameLengthChars
}

// GetMaxArtifactNameLengthCharsOk returns a tuple with the MaxArtifactNameLengthChars field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxArtifactNameLengthCharsOk() (*int64, bool) {
	if o == nil || isNil(o.MaxArtifactNameLengthChars) {
    return nil, false
	}
	return o.MaxArtifactNameLengthChars, true
}

// HasMaxArtifactNameLengthChars returns a boolean if a field has been set.
func (o *Limits) HasMaxArtifactNameLengthChars() bool {
	if o != nil && !isNil(o.MaxArtifactNameLengthChars) {
		return true
	}

	return false
}

// SetMaxArtifactNameLengthChars gets a reference to the given int64 and assigns it to the MaxArtifactNameLengthChars field.
func (o *Limits) SetMaxArtifactNameLengthChars(v int64) {
	o.MaxArtifactNameLengthChars = &v
}

// GetMaxArtifactDescriptionLengthChars returns the MaxArtifactDescriptionLengthChars field value if set, zero value otherwise.
func (o *Limits) GetMaxArtifactDescriptionLengthChars() int64 {
	if o == nil || isNil(o.MaxArtifactDescriptionLengthChars) {
		var ret int64
		return ret
	}
	return *o.MaxArtifactDescriptionLengthChars
}

// GetMaxArtifactDescriptionLengthCharsOk returns a tuple with the MaxArtifactDescriptionLengthChars field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxArtifactDescriptionLengthCharsOk() (*int64, bool) {
	if o == nil || isNil(o.MaxArtifactDescriptionLengthChars) {
    return nil, false
	}
	return o.MaxArtifactDescriptionLengthChars, true
}

// HasMaxArtifactDescriptionLengthChars returns a boolean if a field has been set.
func (o *Limits) HasMaxArtifactDescriptionLengthChars() bool {
	if o != nil && !isNil(o.MaxArtifactDescriptionLengthChars) {
		return true
	}

	return false
}

// SetMaxArtifactDescriptionLengthChars gets a reference to the given int64 and assigns it to the MaxArtifactDescriptionLengthChars field.
func (o *Limits) SetMaxArtifactDescriptionLengthChars(v int64) {
	o.MaxArtifactDescriptionLengthChars = &v
}

// GetMaxRequestsPerSecondCount returns the MaxRequestsPerSecondCount field value if set, zero value otherwise.
func (o *Limits) GetMaxRequestsPerSecondCount() int64 {
	if o == nil || isNil(o.MaxRequestsPerSecondCount) {
		var ret int64
		return ret
	}
	return *o.MaxRequestsPerSecondCount
}

// GetMaxRequestsPerSecondCountOk returns a tuple with the MaxRequestsPerSecondCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Limits) GetMaxRequestsPerSecondCountOk() (*int64, bool) {
	if o == nil || isNil(o.MaxRequestsPerSecondCount) {
    return nil, false
	}
	return o.MaxRequestsPerSecondCount, true
}

// HasMaxRequestsPerSecondCount returns a boolean if a field has been set.
func (o *Limits) HasMaxRequestsPerSecondCount() bool {
	if o != nil && !isNil(o.MaxRequestsPerSecondCount) {
		return true
	}

	return false
}

// SetMaxRequestsPerSecondCount gets a reference to the given int64 and assigns it to the MaxRequestsPerSecondCount field.
func (o *Limits) SetMaxRequestsPerSecondCount(v int64) {
	o.MaxRequestsPerSecondCount = &v
}

func (o Limits) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.MaxTotalSchemasCount) {
		toSerialize["maxTotalSchemasCount"] = o.MaxTotalSchemasCount
	}
	if !isNil(o.MaxSchemaSizeBytes) {
		toSerialize["maxSchemaSizeBytes"] = o.MaxSchemaSizeBytes
	}
	if !isNil(o.MaxArtifactsCount) {
		toSerialize["maxArtifactsCount"] = o.MaxArtifactsCount
	}
	if !isNil(o.MaxVersionsPerArtifactCount) {
		toSerialize["maxVersionsPerArtifactCount"] = o.MaxVersionsPerArtifactCount
	}
	if !isNil(o.MaxArtifactPropertiesCount) {
		toSerialize["maxArtifactPropertiesCount"] = o.MaxArtifactPropertiesCount
	}
	if !isNil(o.MaxPropertyKeySizeBytes) {
		toSerialize["maxPropertyKeySizeBytes"] = o.MaxPropertyKeySizeBytes
	}
	if !isNil(o.MaxPropertyValueSizeBytes) {
		toSerialize["maxPropertyValueSizeBytes"] = o.MaxPropertyValueSizeBytes
	}
	if !isNil(o.MaxArtifactLabelsCount) {
		toSerialize["maxArtifactLabelsCount"] = o.MaxArtifactLabelsCount
	}
	if !isNil(o.MaxLabelSizeBytes) {
		toSerialize["maxLabelSizeBytes"] = o.MaxLabelSizeBytes
	}
	if !isNil(o.MaxArtifactNameLengthChars) {
		toSerialize["maxArtifactNameLengthChars"] = o.MaxArtifactNameLengthChars
	}
	if !isNil(o.MaxArtifactDescriptionLengthChars) {
		toSerialize["maxArtifactDescriptionLengthChars"] = o.MaxArtifactDescriptionLengthChars
	}
	if !isNil(o.MaxRequestsPerSecondCount) {
		toSerialize["maxRequestsPerSecondCount"] = o.MaxRequestsPerSecondCount
	}
	return json.Marshal(toSerialize)
}

type NullableLimits struct {
	value *Limits
	isSet bool
}

func (v NullableLimits) Get() *Limits {
	return v.value
}

func (v *NullableLimits) Set(val *Limits) {
	v.value = val
	v.isSet = true
}

func (v NullableLimits) IsSet() bool {
	return v.isSet
}

func (v *NullableLimits) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLimits(val *Limits) *NullableLimits {
	return &NullableLimits{value: val, isSet: true}
}

func (v NullableLimits) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLimits) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


