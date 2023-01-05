/*
Connector Management API

Connector Management API is a REST API to manage connectors.

API version: 0.1.0
Contact: rhosak-support@redhat.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package connectormgmtclient

import (
	"encoding/json"
)

// ConnectorRequest struct for ConnectorRequest
type ConnectorRequest struct {
	Name string `json:"name"`
	ConnectorTypeId string `json:"connector_type_id"`
	NamespaceId string `json:"namespace_id"`
	Channel *Channel `json:"channel,omitempty"`
	DesiredState ConnectorDesiredState `json:"desired_state"`
	// Name-value string annotations for resource
	Annotations *map[string]string `json:"annotations,omitempty"`
	Kafka KafkaConnectionSettings `json:"kafka"`
	ServiceAccount ServiceAccount `json:"service_account"`
	SchemaRegistry *SchemaRegistryConnectionSettings `json:"schema_registry,omitempty"`
	Connector map[string]interface{} `json:"connector"`
}

// NewConnectorRequest instantiates a new ConnectorRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConnectorRequest(name string, connectorTypeId string, namespaceId string, desiredState ConnectorDesiredState, kafka KafkaConnectionSettings, serviceAccount ServiceAccount, connector map[string]interface{}) *ConnectorRequest {
	this := ConnectorRequest{}
	this.Name = name
	this.ConnectorTypeId = connectorTypeId
	this.NamespaceId = namespaceId
	var channel Channel = CHANNEL_STABLE
	this.Channel = &channel
	this.DesiredState = desiredState
	this.Kafka = kafka
	this.ServiceAccount = serviceAccount
	this.Connector = connector
	return &this
}

// NewConnectorRequestWithDefaults instantiates a new ConnectorRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConnectorRequestWithDefaults() *ConnectorRequest {
	this := ConnectorRequest{}
	var channel Channel = CHANNEL_STABLE
	this.Channel = &channel
	return &this
}

// GetName returns the Name field value
func (o *ConnectorRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ConnectorRequest) SetName(v string) {
	o.Name = v
}

// GetConnectorTypeId returns the ConnectorTypeId field value
func (o *ConnectorRequest) GetConnectorTypeId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ConnectorTypeId
}

// GetConnectorTypeIdOk returns a tuple with the ConnectorTypeId field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetConnectorTypeIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ConnectorTypeId, true
}

// SetConnectorTypeId sets field value
func (o *ConnectorRequest) SetConnectorTypeId(v string) {
	o.ConnectorTypeId = v
}

// GetNamespaceId returns the NamespaceId field value
func (o *ConnectorRequest) GetNamespaceId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NamespaceId
}

// GetNamespaceIdOk returns a tuple with the NamespaceId field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetNamespaceIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NamespaceId, true
}

// SetNamespaceId sets field value
func (o *ConnectorRequest) SetNamespaceId(v string) {
	o.NamespaceId = v
}

// GetChannel returns the Channel field value if set, zero value otherwise.
func (o *ConnectorRequest) GetChannel() Channel {
	if o == nil || isNil(o.Channel) {
		var ret Channel
		return ret
	}
	return *o.Channel
}

// GetChannelOk returns a tuple with the Channel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetChannelOk() (*Channel, bool) {
	if o == nil || isNil(o.Channel) {
    return nil, false
	}
	return o.Channel, true
}

// HasChannel returns a boolean if a field has been set.
func (o *ConnectorRequest) HasChannel() bool {
	if o != nil && !isNil(o.Channel) {
		return true
	}

	return false
}

// SetChannel gets a reference to the given Channel and assigns it to the Channel field.
func (o *ConnectorRequest) SetChannel(v Channel) {
	o.Channel = &v
}

// GetDesiredState returns the DesiredState field value
func (o *ConnectorRequest) GetDesiredState() ConnectorDesiredState {
	if o == nil {
		var ret ConnectorDesiredState
		return ret
	}

	return o.DesiredState
}

// GetDesiredStateOk returns a tuple with the DesiredState field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetDesiredStateOk() (*ConnectorDesiredState, bool) {
	if o == nil {
    return nil, false
	}
	return &o.DesiredState, true
}

// SetDesiredState sets field value
func (o *ConnectorRequest) SetDesiredState(v ConnectorDesiredState) {
	o.DesiredState = v
}

// GetAnnotations returns the Annotations field value if set, zero value otherwise.
func (o *ConnectorRequest) GetAnnotations() map[string]string {
	if o == nil || isNil(o.Annotations) {
		var ret map[string]string
		return ret
	}
	return *o.Annotations
}

// GetAnnotationsOk returns a tuple with the Annotations field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetAnnotationsOk() (*map[string]string, bool) {
	if o == nil || isNil(o.Annotations) {
    return nil, false
	}
	return o.Annotations, true
}

// HasAnnotations returns a boolean if a field has been set.
func (o *ConnectorRequest) HasAnnotations() bool {
	if o != nil && !isNil(o.Annotations) {
		return true
	}

	return false
}

// SetAnnotations gets a reference to the given map[string]string and assigns it to the Annotations field.
func (o *ConnectorRequest) SetAnnotations(v map[string]string) {
	o.Annotations = &v
}

// GetKafka returns the Kafka field value
func (o *ConnectorRequest) GetKafka() KafkaConnectionSettings {
	if o == nil {
		var ret KafkaConnectionSettings
		return ret
	}

	return o.Kafka
}

// GetKafkaOk returns a tuple with the Kafka field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetKafkaOk() (*KafkaConnectionSettings, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Kafka, true
}

// SetKafka sets field value
func (o *ConnectorRequest) SetKafka(v KafkaConnectionSettings) {
	o.Kafka = v
}

// GetServiceAccount returns the ServiceAccount field value
func (o *ConnectorRequest) GetServiceAccount() ServiceAccount {
	if o == nil {
		var ret ServiceAccount
		return ret
	}

	return o.ServiceAccount
}

// GetServiceAccountOk returns a tuple with the ServiceAccount field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetServiceAccountOk() (*ServiceAccount, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ServiceAccount, true
}

// SetServiceAccount sets field value
func (o *ConnectorRequest) SetServiceAccount(v ServiceAccount) {
	o.ServiceAccount = v
}

// GetSchemaRegistry returns the SchemaRegistry field value if set, zero value otherwise.
func (o *ConnectorRequest) GetSchemaRegistry() SchemaRegistryConnectionSettings {
	if o == nil || isNil(o.SchemaRegistry) {
		var ret SchemaRegistryConnectionSettings
		return ret
	}
	return *o.SchemaRegistry
}

// GetSchemaRegistryOk returns a tuple with the SchemaRegistry field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetSchemaRegistryOk() (*SchemaRegistryConnectionSettings, bool) {
	if o == nil || isNil(o.SchemaRegistry) {
    return nil, false
	}
	return o.SchemaRegistry, true
}

// HasSchemaRegistry returns a boolean if a field has been set.
func (o *ConnectorRequest) HasSchemaRegistry() bool {
	if o != nil && !isNil(o.SchemaRegistry) {
		return true
	}

	return false
}

// SetSchemaRegistry gets a reference to the given SchemaRegistryConnectionSettings and assigns it to the SchemaRegistry field.
func (o *ConnectorRequest) SetSchemaRegistry(v SchemaRegistryConnectionSettings) {
	o.SchemaRegistry = &v
}

// GetConnector returns the Connector field value
func (o *ConnectorRequest) GetConnector() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Connector
}

// GetConnectorOk returns a tuple with the Connector field value
// and a boolean to check if the value has been set.
func (o *ConnectorRequest) GetConnectorOk() (map[string]interface{}, bool) {
	if o == nil {
    return map[string]interface{}{}, false
	}
	return o.Connector, true
}

// SetConnector sets field value
func (o *ConnectorRequest) SetConnector(v map[string]interface{}) {
	o.Connector = v
}

func (o ConnectorRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["connector_type_id"] = o.ConnectorTypeId
	}
	if true {
		toSerialize["namespace_id"] = o.NamespaceId
	}
	if !isNil(o.Channel) {
		toSerialize["channel"] = o.Channel
	}
	if true {
		toSerialize["desired_state"] = o.DesiredState
	}
	if !isNil(o.Annotations) {
		toSerialize["annotations"] = o.Annotations
	}
	if true {
		toSerialize["kafka"] = o.Kafka
	}
	if true {
		toSerialize["service_account"] = o.ServiceAccount
	}
	if !isNil(o.SchemaRegistry) {
		toSerialize["schema_registry"] = o.SchemaRegistry
	}
	if true {
		toSerialize["connector"] = o.Connector
	}
	return json.Marshal(toSerialize)
}

type NullableConnectorRequest struct {
	value *ConnectorRequest
	isSet bool
}

func (v NullableConnectorRequest) Get() *ConnectorRequest {
	return v.value
}

func (v *NullableConnectorRequest) Set(val *ConnectorRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableConnectorRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableConnectorRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConnectorRequest(val *ConnectorRequest) *NullableConnectorRequest {
	return &NullableConnectorRequest{value: val, isSet: true}
}

func (v NullableConnectorRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConnectorRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


