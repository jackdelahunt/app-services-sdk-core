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
	"time"
)

// RecordAllOf An individual record consumed from a topic or produced to a topic
type RecordAllOf struct {
	// The record's partition within the topic
	Partition *int32 `json:"partition,omitempty"`
	// The record's offset within the topic partition
	Offset *int64 `json:"offset,omitempty"`
	// Timestamp associated with the record. The type is indicated by `timestampType`. When producing a record, this value will be used as the record's `CREATE_TIME`.
	Timestamp *time.Time `json:"timestamp,omitempty"`
	// Type of timestamp associated with the record
	TimestampType *string `json:"timestampType,omitempty"`
	// Record headers, key/value pairs
	Headers *map[string]string `json:"headers,omitempty"`
	// Record key
	Key *string `json:"key,omitempty"`
	// Record value
	Value string `json:"value"`
}

// NewRecordAllOf instantiates a new RecordAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRecordAllOf(value string) *RecordAllOf {
	this := RecordAllOf{}
	this.Value = value
	return &this
}

// NewRecordAllOfWithDefaults instantiates a new RecordAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRecordAllOfWithDefaults() *RecordAllOf {
	this := RecordAllOf{}
	return &this
}

// GetPartition returns the Partition field value if set, zero value otherwise.
func (o *RecordAllOf) GetPartition() int32 {
	if o == nil || o.Partition == nil {
		var ret int32
		return ret
	}
	return *o.Partition
}

// GetPartitionOk returns a tuple with the Partition field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetPartitionOk() (*int32, bool) {
	if o == nil || o.Partition == nil {
		return nil, false
	}
	return o.Partition, true
}

// HasPartition returns a boolean if a field has been set.
func (o *RecordAllOf) HasPartition() bool {
	if o != nil && o.Partition != nil {
		return true
	}

	return false
}

// SetPartition gets a reference to the given int32 and assigns it to the Partition field.
func (o *RecordAllOf) SetPartition(v int32) {
	o.Partition = &v
}

// GetOffset returns the Offset field value if set, zero value otherwise.
func (o *RecordAllOf) GetOffset() int64 {
	if o == nil || o.Offset == nil {
		var ret int64
		return ret
	}
	return *o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetOffsetOk() (*int64, bool) {
	if o == nil || o.Offset == nil {
		return nil, false
	}
	return o.Offset, true
}

// HasOffset returns a boolean if a field has been set.
func (o *RecordAllOf) HasOffset() bool {
	if o != nil && o.Offset != nil {
		return true
	}

	return false
}

// SetOffset gets a reference to the given int64 and assigns it to the Offset field.
func (o *RecordAllOf) SetOffset(v int64) {
	o.Offset = &v
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *RecordAllOf) GetTimestamp() time.Time {
	if o == nil || o.Timestamp == nil {
		var ret time.Time
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetTimestampOk() (*time.Time, bool) {
	if o == nil || o.Timestamp == nil {
		return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *RecordAllOf) HasTimestamp() bool {
	if o != nil && o.Timestamp != nil {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given time.Time and assigns it to the Timestamp field.
func (o *RecordAllOf) SetTimestamp(v time.Time) {
	o.Timestamp = &v
}

// GetTimestampType returns the TimestampType field value if set, zero value otherwise.
func (o *RecordAllOf) GetTimestampType() string {
	if o == nil || o.TimestampType == nil {
		var ret string
		return ret
	}
	return *o.TimestampType
}

// GetTimestampTypeOk returns a tuple with the TimestampType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetTimestampTypeOk() (*string, bool) {
	if o == nil || o.TimestampType == nil {
		return nil, false
	}
	return o.TimestampType, true
}

// HasTimestampType returns a boolean if a field has been set.
func (o *RecordAllOf) HasTimestampType() bool {
	if o != nil && o.TimestampType != nil {
		return true
	}

	return false
}

// SetTimestampType gets a reference to the given string and assigns it to the TimestampType field.
func (o *RecordAllOf) SetTimestampType(v string) {
	o.TimestampType = &v
}

// GetHeaders returns the Headers field value if set, zero value otherwise.
func (o *RecordAllOf) GetHeaders() map[string]string {
	if o == nil || o.Headers == nil {
		var ret map[string]string
		return ret
	}
	return *o.Headers
}

// GetHeadersOk returns a tuple with the Headers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetHeadersOk() (*map[string]string, bool) {
	if o == nil || o.Headers == nil {
		return nil, false
	}
	return o.Headers, true
}

// HasHeaders returns a boolean if a field has been set.
func (o *RecordAllOf) HasHeaders() bool {
	if o != nil && o.Headers != nil {
		return true
	}

	return false
}

// SetHeaders gets a reference to the given map[string]string and assigns it to the Headers field.
func (o *RecordAllOf) SetHeaders(v map[string]string) {
	o.Headers = &v
}

// GetKey returns the Key field value if set, zero value otherwise.
func (o *RecordAllOf) GetKey() string {
	if o == nil || o.Key == nil {
		var ret string
		return ret
	}
	return *o.Key
}

// GetKeyOk returns a tuple with the Key field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetKeyOk() (*string, bool) {
	if o == nil || o.Key == nil {
		return nil, false
	}
	return o.Key, true
}

// HasKey returns a boolean if a field has been set.
func (o *RecordAllOf) HasKey() bool {
	if o != nil && o.Key != nil {
		return true
	}

	return false
}

// SetKey gets a reference to the given string and assigns it to the Key field.
func (o *RecordAllOf) SetKey(v string) {
	o.Key = &v
}

// GetValue returns the Value field value
func (o *RecordAllOf) GetValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *RecordAllOf) GetValueOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *RecordAllOf) SetValue(v string) {
	o.Value = v
}

func (o RecordAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Partition != nil {
		toSerialize["partition"] = o.Partition
	}
	if o.Offset != nil {
		toSerialize["offset"] = o.Offset
	}
	if o.Timestamp != nil {
		toSerialize["timestamp"] = o.Timestamp
	}
	if o.TimestampType != nil {
		toSerialize["timestampType"] = o.TimestampType
	}
	if o.Headers != nil {
		toSerialize["headers"] = o.Headers
	}
	if o.Key != nil {
		toSerialize["key"] = o.Key
	}
	if true {
		toSerialize["value"] = o.Value
	}
	return json.Marshal(toSerialize)
}

type NullableRecordAllOf struct {
	value *RecordAllOf
	isSet bool
}

func (v NullableRecordAllOf) Get() *RecordAllOf {
	return v.value
}

func (v *NullableRecordAllOf) Set(val *RecordAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableRecordAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableRecordAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecordAllOf(val *RecordAllOf) *NullableRecordAllOf {
	return &NullableRecordAllOf{value: val, isSet: true}
}

func (v NullableRecordAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecordAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


