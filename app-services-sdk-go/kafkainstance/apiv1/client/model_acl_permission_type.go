/*
 * Kafka Instance API
 *
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * API version: 0.13.1-SNAPSHOT
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkainstanceclient

import (
	"encoding/json"
	"fmt"
)

// AclPermissionType the model 'AclPermissionType'
type AclPermissionType string

// List of AclPermissionType
const (
	ACLPERMISSIONTYPE_ALLOW AclPermissionType = "ALLOW"
	ACLPERMISSIONTYPE_DENY AclPermissionType = "DENY"
)

var allowedAclPermissionTypeEnumValues = []AclPermissionType{
	"ALLOW",
	"DENY",
}

func (v *AclPermissionType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AclPermissionType(value)
	for _, existing := range allowedAclPermissionTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AclPermissionType", value)
}

// NewAclPermissionTypeFromValue returns a pointer to a valid AclPermissionType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAclPermissionTypeFromValue(v string) (*AclPermissionType, error) {
	ev := AclPermissionType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AclPermissionType: valid values are %v", v, allowedAclPermissionTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AclPermissionType) IsValid() bool {
	for _, existing := range allowedAclPermissionTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AclPermissionType value
func (v AclPermissionType) Ptr() *AclPermissionType {
	return &v
}

type NullableAclPermissionType struct {
	value *AclPermissionType
	isSet bool
}

func (v NullableAclPermissionType) Get() *AclPermissionType {
	return v.value
}

func (v *NullableAclPermissionType) Set(val *AclPermissionType) {
	v.value = val
	v.isSet = true
}

func (v NullableAclPermissionType) IsSet() bool {
	return v.isSet
}

func (v *NullableAclPermissionType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAclPermissionType(val *AclPermissionType) *NullableAclPermissionType {
	return &NullableAclPermissionType{value: val, isSet: true}
}

func (v NullableAclPermissionType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAclPermissionType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

