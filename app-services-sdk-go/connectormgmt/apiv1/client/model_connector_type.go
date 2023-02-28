/*
 * Connector Management API
 *
 * Connector Management API is a REST API to manage connectors.
 *
 * API version: 0.1.0
 * Contact: rhosak-support@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package connectormgmtclient

import (
	"encoding/json"
)

// ConnectorType Represents a connector type supported by the API
type ConnectorType struct {
	Id *string `json:"id,omitempty"`
	Kind *string `json:"kind,omitempty"`
	Href *string `json:"href,omitempty"`
	// Name of the connector type.
	Name string `json:"name"`
	// Version of the connector type.
	Version string `json:"version"`
	// Channels of the connector type.
	Channels *[]Channel `json:"channels,omitempty"`
	// A description of the connector.
	Description *string `json:"description,omitempty"`
	// Connector type is deprecated and removed from the catalog.
	Deprecated *bool `json:"deprecated,omitempty"`
	// URL to an icon of the connector.
	IconHref *string `json:"icon_href,omitempty"`
	// Labels used to categorize the connector
	Labels *[]string `json:"labels,omitempty"`
	// Name-value string annotations for resource
	Annotations *map[string]string `json:"annotations,omitempty"`
	// Ranking for featured connectors
	FeaturedRank *int32 `json:"featured_rank,omitempty"`
	// The capabilities supported by the connector
	Capabilities *[]string `json:"capabilities,omitempty"`
	// A json schema that can be used to validate a ConnectorRequest connector field.
	Schema map[string]interface{} `json:"schema"`
}

// NewConnectorType instantiates a new ConnectorType object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConnectorType(name string, version string, schema map[string]interface{}) *ConnectorType {
	this := ConnectorType{}
	this.Name = name
	this.Version = version
	this.Schema = schema
	return &this
}

// NewConnectorTypeWithDefaults instantiates a new ConnectorType object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConnectorTypeWithDefaults() *ConnectorType {
	this := ConnectorType{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ConnectorType) GetId() string {
	if o == nil || o.Id == nil {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetIdOk() (*string, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ConnectorType) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *ConnectorType) SetId(v string) {
	o.Id = &v
}

// GetKind returns the Kind field value if set, zero value otherwise.
func (o *ConnectorType) GetKind() string {
	if o == nil || o.Kind == nil {
		var ret string
		return ret
	}
	return *o.Kind
}

// GetKindOk returns a tuple with the Kind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetKindOk() (*string, bool) {
	if o == nil || o.Kind == nil {
		return nil, false
	}
	return o.Kind, true
}

// HasKind returns a boolean if a field has been set.
func (o *ConnectorType) HasKind() bool {
	if o != nil && o.Kind != nil {
		return true
	}

	return false
}

// SetKind gets a reference to the given string and assigns it to the Kind field.
func (o *ConnectorType) SetKind(v string) {
	o.Kind = &v
}

// GetHref returns the Href field value if set, zero value otherwise.
func (o *ConnectorType) GetHref() string {
	if o == nil || o.Href == nil {
		var ret string
		return ret
	}
	return *o.Href
}

// GetHrefOk returns a tuple with the Href field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetHrefOk() (*string, bool) {
	if o == nil || o.Href == nil {
		return nil, false
	}
	return o.Href, true
}

// HasHref returns a boolean if a field has been set.
func (o *ConnectorType) HasHref() bool {
	if o != nil && o.Href != nil {
		return true
	}

	return false
}

// SetHref gets a reference to the given string and assigns it to the Href field.
func (o *ConnectorType) SetHref(v string) {
	o.Href = &v
}

// GetName returns the Name field value
func (o *ConnectorType) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ConnectorType) SetName(v string) {
	o.Name = v
}

// GetVersion returns the Version field value
func (o *ConnectorType) GetVersion() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetVersionOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *ConnectorType) SetVersion(v string) {
	o.Version = v
}

// GetChannels returns the Channels field value if set, zero value otherwise.
func (o *ConnectorType) GetChannels() []Channel {
	if o == nil || o.Channels == nil {
		var ret []Channel
		return ret
	}
	return *o.Channels
}

// GetChannelsOk returns a tuple with the Channels field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetChannelsOk() (*[]Channel, bool) {
	if o == nil || o.Channels == nil {
		return nil, false
	}
	return o.Channels, true
}

// HasChannels returns a boolean if a field has been set.
func (o *ConnectorType) HasChannels() bool {
	if o != nil && o.Channels != nil {
		return true
	}

	return false
}

// SetChannels gets a reference to the given []Channel and assigns it to the Channels field.
func (o *ConnectorType) SetChannels(v []Channel) {
	o.Channels = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *ConnectorType) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *ConnectorType) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *ConnectorType) SetDescription(v string) {
	o.Description = &v
}

// GetDeprecated returns the Deprecated field value if set, zero value otherwise.
func (o *ConnectorType) GetDeprecated() bool {
	if o == nil || o.Deprecated == nil {
		var ret bool
		return ret
	}
	return *o.Deprecated
}

// GetDeprecatedOk returns a tuple with the Deprecated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetDeprecatedOk() (*bool, bool) {
	if o == nil || o.Deprecated == nil {
		return nil, false
	}
	return o.Deprecated, true
}

// HasDeprecated returns a boolean if a field has been set.
func (o *ConnectorType) HasDeprecated() bool {
	if o != nil && o.Deprecated != nil {
		return true
	}

	return false
}

// SetDeprecated gets a reference to the given bool and assigns it to the Deprecated field.
func (o *ConnectorType) SetDeprecated(v bool) {
	o.Deprecated = &v
}

// GetIconHref returns the IconHref field value if set, zero value otherwise.
func (o *ConnectorType) GetIconHref() string {
	if o == nil || o.IconHref == nil {
		var ret string
		return ret
	}
	return *o.IconHref
}

// GetIconHrefOk returns a tuple with the IconHref field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetIconHrefOk() (*string, bool) {
	if o == nil || o.IconHref == nil {
		return nil, false
	}
	return o.IconHref, true
}

// HasIconHref returns a boolean if a field has been set.
func (o *ConnectorType) HasIconHref() bool {
	if o != nil && o.IconHref != nil {
		return true
	}

	return false
}

// SetIconHref gets a reference to the given string and assigns it to the IconHref field.
func (o *ConnectorType) SetIconHref(v string) {
	o.IconHref = &v
}

// GetLabels returns the Labels field value if set, zero value otherwise.
func (o *ConnectorType) GetLabels() []string {
	if o == nil || o.Labels == nil {
		var ret []string
		return ret
	}
	return *o.Labels
}

// GetLabelsOk returns a tuple with the Labels field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetLabelsOk() (*[]string, bool) {
	if o == nil || o.Labels == nil {
		return nil, false
	}
	return o.Labels, true
}

// HasLabels returns a boolean if a field has been set.
func (o *ConnectorType) HasLabels() bool {
	if o != nil && o.Labels != nil {
		return true
	}

	return false
}

// SetLabels gets a reference to the given []string and assigns it to the Labels field.
func (o *ConnectorType) SetLabels(v []string) {
	o.Labels = &v
}

// GetAnnotations returns the Annotations field value if set, zero value otherwise.
func (o *ConnectorType) GetAnnotations() map[string]string {
	if o == nil || o.Annotations == nil {
		var ret map[string]string
		return ret
	}
	return *o.Annotations
}

// GetAnnotationsOk returns a tuple with the Annotations field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetAnnotationsOk() (*map[string]string, bool) {
	if o == nil || o.Annotations == nil {
		return nil, false
	}
	return o.Annotations, true
}

// HasAnnotations returns a boolean if a field has been set.
func (o *ConnectorType) HasAnnotations() bool {
	if o != nil && o.Annotations != nil {
		return true
	}

	return false
}

// SetAnnotations gets a reference to the given map[string]string and assigns it to the Annotations field.
func (o *ConnectorType) SetAnnotations(v map[string]string) {
	o.Annotations = &v
}

// GetFeaturedRank returns the FeaturedRank field value if set, zero value otherwise.
func (o *ConnectorType) GetFeaturedRank() int32 {
	if o == nil || o.FeaturedRank == nil {
		var ret int32
		return ret
	}
	return *o.FeaturedRank
}

// GetFeaturedRankOk returns a tuple with the FeaturedRank field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetFeaturedRankOk() (*int32, bool) {
	if o == nil || o.FeaturedRank == nil {
		return nil, false
	}
	return o.FeaturedRank, true
}

// HasFeaturedRank returns a boolean if a field has been set.
func (o *ConnectorType) HasFeaturedRank() bool {
	if o != nil && o.FeaturedRank != nil {
		return true
	}

	return false
}

// SetFeaturedRank gets a reference to the given int32 and assigns it to the FeaturedRank field.
func (o *ConnectorType) SetFeaturedRank(v int32) {
	o.FeaturedRank = &v
}

// GetCapabilities returns the Capabilities field value if set, zero value otherwise.
func (o *ConnectorType) GetCapabilities() []string {
	if o == nil || o.Capabilities == nil {
		var ret []string
		return ret
	}
	return *o.Capabilities
}

// GetCapabilitiesOk returns a tuple with the Capabilities field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetCapabilitiesOk() (*[]string, bool) {
	if o == nil || o.Capabilities == nil {
		return nil, false
	}
	return o.Capabilities, true
}

// HasCapabilities returns a boolean if a field has been set.
func (o *ConnectorType) HasCapabilities() bool {
	if o != nil && o.Capabilities != nil {
		return true
	}

	return false
}

// SetCapabilities gets a reference to the given []string and assigns it to the Capabilities field.
func (o *ConnectorType) SetCapabilities(v []string) {
	o.Capabilities = &v
}

// GetSchema returns the Schema field value
func (o *ConnectorType) GetSchema() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Schema
}

// GetSchemaOk returns a tuple with the Schema field value
// and a boolean to check if the value has been set.
func (o *ConnectorType) GetSchemaOk() (*map[string]interface{}, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Schema, true
}

// SetSchema sets field value
func (o *ConnectorType) SetSchema(v map[string]interface{}) {
	o.Schema = v
}

func (o ConnectorType) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Kind != nil {
		toSerialize["kind"] = o.Kind
	}
	if o.Href != nil {
		toSerialize["href"] = o.Href
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["version"] = o.Version
	}
	if o.Channels != nil {
		toSerialize["channels"] = o.Channels
	}
	if o.Description != nil {
		toSerialize["description"] = o.Description
	}
	if o.Deprecated != nil {
		toSerialize["deprecated"] = o.Deprecated
	}
	if o.IconHref != nil {
		toSerialize["icon_href"] = o.IconHref
	}
	if o.Labels != nil {
		toSerialize["labels"] = o.Labels
	}
	if o.Annotations != nil {
		toSerialize["annotations"] = o.Annotations
	}
	if o.FeaturedRank != nil {
		toSerialize["featured_rank"] = o.FeaturedRank
	}
	if o.Capabilities != nil {
		toSerialize["capabilities"] = o.Capabilities
	}
	if true {
		toSerialize["schema"] = o.Schema
	}
	return json.Marshal(toSerialize)
}

type NullableConnectorType struct {
	value *ConnectorType
	isSet bool
}

func (v NullableConnectorType) Get() *ConnectorType {
	return v.value
}

func (v *NullableConnectorType) Set(val *ConnectorType) {
	v.value = val
	v.isSet = true
}

func (v NullableConnectorType) IsSet() bool {
	return v.isSet
}

func (v *NullableConnectorType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConnectorType(val *ConnectorType) *NullableConnectorType {
	return &NullableConnectorType{value: val, isSet: true}
}

func (v NullableConnectorType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConnectorType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


