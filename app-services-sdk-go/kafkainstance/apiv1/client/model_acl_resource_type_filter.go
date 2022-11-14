/*
 * Kafka Instance API
 *
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * API version: 0.13.0-SNAPSHOT
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkainstanceclient

import (
	"encoding/json"
	"fmt"
)

// AclResourceTypeFilter the model 'AclResourceTypeFilter'
type AclResourceTypeFilter string

// List of AclResourceTypeFilter
const (
	ACLRESOURCETYPEFILTER_ANY AclResourceTypeFilter = "ANY"
	ACLRESOURCETYPEFILTER_GROUP AclResourceTypeFilter = "GROUP"
	ACLRESOURCETYPEFILTER_TOPIC AclResourceTypeFilter = "TOPIC"
	ACLRESOURCETYPEFILTER_CLUSTER AclResourceTypeFilter = "CLUSTER"
	ACLRESOURCETYPEFILTER_TRANSACTIONAL_ID AclResourceTypeFilter = "TRANSACTIONAL_ID"
)

var allowedAclResourceTypeFilterEnumValues = []AclResourceTypeFilter{
	"ANY",
	"GROUP",
	"TOPIC",
	"CLUSTER",
	"TRANSACTIONAL_ID",
}

func (v *AclResourceTypeFilter) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AclResourceTypeFilter(value)
	for _, existing := range allowedAclResourceTypeFilterEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AclResourceTypeFilter", value)
}

// NewAclResourceTypeFilterFromValue returns a pointer to a valid AclResourceTypeFilter
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAclResourceTypeFilterFromValue(v string) (*AclResourceTypeFilter, error) {
	ev := AclResourceTypeFilter(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AclResourceTypeFilter: valid values are %v", v, allowedAclResourceTypeFilterEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AclResourceTypeFilter) IsValid() bool {
	for _, existing := range allowedAclResourceTypeFilterEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AclResourceTypeFilter value
func (v AclResourceTypeFilter) Ptr() *AclResourceTypeFilter {
	return &v
}

type NullableAclResourceTypeFilter struct {
	value *AclResourceTypeFilter
	isSet bool
}

func (v NullableAclResourceTypeFilter) Get() *AclResourceTypeFilter {
	return v.value
}

func (v *NullableAclResourceTypeFilter) Set(val *AclResourceTypeFilter) {
	v.value = val
	v.isSet = true
}

func (v NullableAclResourceTypeFilter) IsSet() bool {
	return v.isSet
}

func (v *NullableAclResourceTypeFilter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAclResourceTypeFilter(val *AclResourceTypeFilter) *NullableAclResourceTypeFilter {
	return &NullableAclResourceTypeFilter{value: val, isSet: true}
}

func (v NullableAclResourceTypeFilter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAclResourceTypeFilter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

