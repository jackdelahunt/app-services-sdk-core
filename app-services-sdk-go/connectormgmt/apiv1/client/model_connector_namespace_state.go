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
	"fmt"
)

// ConnectorNamespaceState the model 'ConnectorNamespaceState'
type ConnectorNamespaceState string

// List of ConnectorNamespaceState
const (
	CONNECTORNAMESPACESTATE_DISCONNECTED ConnectorNamespaceState = "disconnected"
	CONNECTORNAMESPACESTATE_READY ConnectorNamespaceState = "ready"
	CONNECTORNAMESPACESTATE_DELETING ConnectorNamespaceState = "deleting"
	CONNECTORNAMESPACESTATE_DELETED ConnectorNamespaceState = "deleted"
)

// All allowed values of ConnectorNamespaceState enum
var AllowedConnectorNamespaceStateEnumValues = []ConnectorNamespaceState{
	"disconnected",
	"ready",
	"deleting",
	"deleted",
}

func (v *ConnectorNamespaceState) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := ConnectorNamespaceState(value)
	for _, existing := range AllowedConnectorNamespaceStateEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid ConnectorNamespaceState", value)
}

// NewConnectorNamespaceStateFromValue returns a pointer to a valid ConnectorNamespaceState
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewConnectorNamespaceStateFromValue(v string) (*ConnectorNamespaceState, error) {
	ev := ConnectorNamespaceState(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for ConnectorNamespaceState: valid values are %v", v, AllowedConnectorNamespaceStateEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v ConnectorNamespaceState) IsValid() bool {
	for _, existing := range AllowedConnectorNamespaceStateEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to ConnectorNamespaceState value
func (v ConnectorNamespaceState) Ptr() *ConnectorNamespaceState {
	return &v
}

type NullableConnectorNamespaceState struct {
	value *ConnectorNamespaceState
	isSet bool
}

func (v NullableConnectorNamespaceState) Get() *ConnectorNamespaceState {
	return v.value
}

func (v *NullableConnectorNamespaceState) Set(val *ConnectorNamespaceState) {
	v.value = val
	v.isSet = true
}

func (v NullableConnectorNamespaceState) IsSet() bool {
	return v.isSet
}

func (v *NullableConnectorNamespaceState) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConnectorNamespaceState(val *ConnectorNamespaceState) *NullableConnectorNamespaceState {
	return &NullableConnectorNamespaceState{value: val, isSet: true}
}

func (v NullableConnectorNamespaceState) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConnectorNamespaceState) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

