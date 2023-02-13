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
)

// Consumer A Kafka consumer is responsible for reading records from one or more topics and one or more partitions of a topic.
type Consumer struct {
	// Unique identifier for the consumer group to which this consumer belongs.
	GroupId string `json:"groupId"`
	// The unique topic name to which this consumer belongs
	Topic string `json:"topic"`
	// The partition number to which this consumer group is assigned to.
	Partition int32 `json:"partition"`
	// Offset denotes the position of the consumer in a partition.
	Offset int64 `json:"offset"`
	// The log end offset is the offset of the last message written to a log.
	LogEndOffset *int64 `json:"logEndOffset,omitempty"`
	// Offset Lag is the delta between the last produced message and the last consumer's committed offset.
	Lag int64 `json:"lag"`
	// The member ID is a unique identifier given to a consumer by the coordinator upon initially joining the group.
	MemberId *string `json:"memberId,omitempty"`
}

// NewConsumer instantiates a new Consumer object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConsumer(groupId string, topic string, partition int32, offset int64, lag int64) *Consumer {
	this := Consumer{}
	this.GroupId = groupId
	this.Topic = topic
	this.Partition = partition
	this.Offset = offset
	this.Lag = lag
	return &this
}

// NewConsumerWithDefaults instantiates a new Consumer object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConsumerWithDefaults() *Consumer {
	this := Consumer{}
	return &this
}

// GetGroupId returns the GroupId field value
func (o *Consumer) GetGroupId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.GroupId
}

// GetGroupIdOk returns a tuple with the GroupId field value
// and a boolean to check if the value has been set.
func (o *Consumer) GetGroupIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.GroupId, true
}

// SetGroupId sets field value
func (o *Consumer) SetGroupId(v string) {
	o.GroupId = v
}

// GetTopic returns the Topic field value
func (o *Consumer) GetTopic() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Topic
}

// GetTopicOk returns a tuple with the Topic field value
// and a boolean to check if the value has been set.
func (o *Consumer) GetTopicOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Topic, true
}

// SetTopic sets field value
func (o *Consumer) SetTopic(v string) {
	o.Topic = v
}

// GetPartition returns the Partition field value
func (o *Consumer) GetPartition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Partition
}

// GetPartitionOk returns a tuple with the Partition field value
// and a boolean to check if the value has been set.
func (o *Consumer) GetPartitionOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Partition, true
}

// SetPartition sets field value
func (o *Consumer) SetPartition(v int32) {
	o.Partition = v
}

// GetOffset returns the Offset field value
func (o *Consumer) GetOffset() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value
// and a boolean to check if the value has been set.
func (o *Consumer) GetOffsetOk() (*int64, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Offset, true
}

// SetOffset sets field value
func (o *Consumer) SetOffset(v int64) {
	o.Offset = v
}

// GetLogEndOffset returns the LogEndOffset field value if set, zero value otherwise.
func (o *Consumer) GetLogEndOffset() int64 {
	if o == nil || o.LogEndOffset == nil {
		var ret int64
		return ret
	}
	return *o.LogEndOffset
}

// GetLogEndOffsetOk returns a tuple with the LogEndOffset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Consumer) GetLogEndOffsetOk() (*int64, bool) {
	if o == nil || o.LogEndOffset == nil {
		return nil, false
	}
	return o.LogEndOffset, true
}

// HasLogEndOffset returns a boolean if a field has been set.
func (o *Consumer) HasLogEndOffset() bool {
	if o != nil && o.LogEndOffset != nil {
		return true
	}

	return false
}

// SetLogEndOffset gets a reference to the given int64 and assigns it to the LogEndOffset field.
func (o *Consumer) SetLogEndOffset(v int64) {
	o.LogEndOffset = &v
}

// GetLag returns the Lag field value
func (o *Consumer) GetLag() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.Lag
}

// GetLagOk returns a tuple with the Lag field value
// and a boolean to check if the value has been set.
func (o *Consumer) GetLagOk() (*int64, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Lag, true
}

// SetLag sets field value
func (o *Consumer) SetLag(v int64) {
	o.Lag = v
}

// GetMemberId returns the MemberId field value if set, zero value otherwise.
func (o *Consumer) GetMemberId() string {
	if o == nil || o.MemberId == nil {
		var ret string
		return ret
	}
	return *o.MemberId
}

// GetMemberIdOk returns a tuple with the MemberId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Consumer) GetMemberIdOk() (*string, bool) {
	if o == nil || o.MemberId == nil {
		return nil, false
	}
	return o.MemberId, true
}

// HasMemberId returns a boolean if a field has been set.
func (o *Consumer) HasMemberId() bool {
	if o != nil && o.MemberId != nil {
		return true
	}

	return false
}

// SetMemberId gets a reference to the given string and assigns it to the MemberId field.
func (o *Consumer) SetMemberId(v string) {
	o.MemberId = &v
}

func (o Consumer) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["groupId"] = o.GroupId
	}
	if true {
		toSerialize["topic"] = o.Topic
	}
	if true {
		toSerialize["partition"] = o.Partition
	}
	if true {
		toSerialize["offset"] = o.Offset
	}
	if o.LogEndOffset != nil {
		toSerialize["logEndOffset"] = o.LogEndOffset
	}
	if true {
		toSerialize["lag"] = o.Lag
	}
	if o.MemberId != nil {
		toSerialize["memberId"] = o.MemberId
	}
	return json.Marshal(toSerialize)
}

type NullableConsumer struct {
	value *Consumer
	isSet bool
}

func (v NullableConsumer) Get() *Consumer {
	return v.value
}

func (v *NullableConsumer) Set(val *Consumer) {
	v.value = val
	v.isSet = true
}

func (v NullableConsumer) IsSet() bool {
	return v.isSet
}

func (v *NullableConsumer) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConsumer(val *Consumer) *NullableConsumer {
	return &NullableConsumer{value: val, isSet: true}
}

func (v NullableConsumer) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConsumer) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


