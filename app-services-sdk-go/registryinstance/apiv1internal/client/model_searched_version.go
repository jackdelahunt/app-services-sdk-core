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

// SearchedVersion Models a single artifact from the result set returned when searching for artifacts.
type SearchedVersion struct {
	// 
	Name *string `json:"name,omitempty"`
	// 
	Description *string `json:"description,omitempty"`
	// 
	CreatedOn string `json:"createdOn"`
	// 
	CreatedBy string `json:"createdBy"`
	Type ArtifactType `json:"type"`
	// 
	Labels []string `json:"labels,omitempty"`
	State ArtifactState `json:"state"`
	// 
	GlobalId int64 `json:"globalId"`
	// 
	Version string `json:"version"`
	// User-defined name-value pairs. Name and value must be strings.
	Properties *map[string]string `json:"properties,omitempty"`
	// 
	ContentId int64 `json:"contentId"`
	// 
	References []ArtifactReference `json:"references"`
}

// NewSearchedVersion instantiates a new SearchedVersion object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSearchedVersion(createdOn string, createdBy string, type_ ArtifactType, state ArtifactState, globalId int64, version string, contentId int64, references []ArtifactReference) *SearchedVersion {
	this := SearchedVersion{}
	this.CreatedOn = createdOn
	this.CreatedBy = createdBy
	this.Type = type_
	this.State = state
	this.GlobalId = globalId
	this.Version = version
	this.ContentId = contentId
	this.References = references
	return &this
}

// NewSearchedVersionWithDefaults instantiates a new SearchedVersion object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSearchedVersionWithDefaults() *SearchedVersion {
	this := SearchedVersion{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SearchedVersion) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SearchedVersion) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SearchedVersion) SetName(v string) {
	o.Name = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *SearchedVersion) GetDescription() string {
	if o == nil || isNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetDescriptionOk() (*string, bool) {
	if o == nil || isNil(o.Description) {
    return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *SearchedVersion) HasDescription() bool {
	if o != nil && !isNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *SearchedVersion) SetDescription(v string) {
	o.Description = &v
}

// GetCreatedOn returns the CreatedOn field value
func (o *SearchedVersion) GetCreatedOn() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CreatedOn
}

// GetCreatedOnOk returns a tuple with the CreatedOn field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetCreatedOnOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CreatedOn, true
}

// SetCreatedOn sets field value
func (o *SearchedVersion) SetCreatedOn(v string) {
	o.CreatedOn = v
}

// GetCreatedBy returns the CreatedBy field value
func (o *SearchedVersion) GetCreatedBy() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CreatedBy
}

// GetCreatedByOk returns a tuple with the CreatedBy field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetCreatedByOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CreatedBy, true
}

// SetCreatedBy sets field value
func (o *SearchedVersion) SetCreatedBy(v string) {
	o.CreatedBy = v
}

// GetType returns the Type field value
func (o *SearchedVersion) GetType() ArtifactType {
	if o == nil {
		var ret ArtifactType
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetTypeOk() (*ArtifactType, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *SearchedVersion) SetType(v ArtifactType) {
	o.Type = v
}

// GetLabels returns the Labels field value if set, zero value otherwise.
func (o *SearchedVersion) GetLabels() []string {
	if o == nil || isNil(o.Labels) {
		var ret []string
		return ret
	}
	return o.Labels
}

// GetLabelsOk returns a tuple with the Labels field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetLabelsOk() ([]string, bool) {
	if o == nil || isNil(o.Labels) {
    return nil, false
	}
	return o.Labels, true
}

// HasLabels returns a boolean if a field has been set.
func (o *SearchedVersion) HasLabels() bool {
	if o != nil && !isNil(o.Labels) {
		return true
	}

	return false
}

// SetLabels gets a reference to the given []string and assigns it to the Labels field.
func (o *SearchedVersion) SetLabels(v []string) {
	o.Labels = v
}

// GetState returns the State field value
func (o *SearchedVersion) GetState() ArtifactState {
	if o == nil {
		var ret ArtifactState
		return ret
	}

	return o.State
}

// GetStateOk returns a tuple with the State field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetStateOk() (*ArtifactState, bool) {
	if o == nil {
    return nil, false
	}
	return &o.State, true
}

// SetState sets field value
func (o *SearchedVersion) SetState(v ArtifactState) {
	o.State = v
}

// GetGlobalId returns the GlobalId field value
func (o *SearchedVersion) GetGlobalId() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.GlobalId
}

// GetGlobalIdOk returns a tuple with the GlobalId field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetGlobalIdOk() (*int64, bool) {
	if o == nil {
    return nil, false
	}
	return &o.GlobalId, true
}

// SetGlobalId sets field value
func (o *SearchedVersion) SetGlobalId(v int64) {
	o.GlobalId = v
}

// GetVersion returns the Version field value
func (o *SearchedVersion) GetVersion() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetVersionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *SearchedVersion) SetVersion(v string) {
	o.Version = v
}

// GetProperties returns the Properties field value if set, zero value otherwise.
func (o *SearchedVersion) GetProperties() map[string]string {
	if o == nil || isNil(o.Properties) {
		var ret map[string]string
		return ret
	}
	return *o.Properties
}

// GetPropertiesOk returns a tuple with the Properties field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetPropertiesOk() (*map[string]string, bool) {
	if o == nil || isNil(o.Properties) {
    return nil, false
	}
	return o.Properties, true
}

// HasProperties returns a boolean if a field has been set.
func (o *SearchedVersion) HasProperties() bool {
	if o != nil && !isNil(o.Properties) {
		return true
	}

	return false
}

// SetProperties gets a reference to the given map[string]string and assigns it to the Properties field.
func (o *SearchedVersion) SetProperties(v map[string]string) {
	o.Properties = &v
}

// GetContentId returns the ContentId field value
func (o *SearchedVersion) GetContentId() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.ContentId
}

// GetContentIdOk returns a tuple with the ContentId field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetContentIdOk() (*int64, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ContentId, true
}

// SetContentId sets field value
func (o *SearchedVersion) SetContentId(v int64) {
	o.ContentId = v
}

// GetReferences returns the References field value
func (o *SearchedVersion) GetReferences() []ArtifactReference {
	if o == nil {
		var ret []ArtifactReference
		return ret
	}

	return o.References
}

// GetReferencesOk returns a tuple with the References field value
// and a boolean to check if the value has been set.
func (o *SearchedVersion) GetReferencesOk() ([]ArtifactReference, bool) {
	if o == nil {
    return nil, false
	}
	return o.References, true
}

// SetReferences sets field value
func (o *SearchedVersion) SetReferences(v []ArtifactReference) {
	o.References = v
}

func (o SearchedVersion) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if true {
		toSerialize["createdOn"] = o.CreatedOn
	}
	if true {
		toSerialize["createdBy"] = o.CreatedBy
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if !isNil(o.Labels) {
		toSerialize["labels"] = o.Labels
	}
	if true {
		toSerialize["state"] = o.State
	}
	if true {
		toSerialize["globalId"] = o.GlobalId
	}
	if true {
		toSerialize["version"] = o.Version
	}
	if !isNil(o.Properties) {
		toSerialize["properties"] = o.Properties
	}
	if true {
		toSerialize["contentId"] = o.ContentId
	}
	if true {
		toSerialize["references"] = o.References
	}
	return json.Marshal(toSerialize)
}

type NullableSearchedVersion struct {
	value *SearchedVersion
	isSet bool
}

func (v NullableSearchedVersion) Get() *SearchedVersion {
	return v.value
}

func (v *NullableSearchedVersion) Set(val *SearchedVersion) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchedVersion) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchedVersion) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchedVersion(val *SearchedVersion) *NullableSearchedVersion {
	return &NullableSearchedVersion{value: val, isSet: true}
}

func (v NullableSearchedVersion) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchedVersion) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


