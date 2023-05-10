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
)

// EnterpriseOsdClusterPayload Schema for the request body sent to /clusters POST
type EnterpriseOsdClusterPayload struct {
	// Sets whether Kafkas created on this data plane cluster have to be accessed via private network
	AccessKafkasViaPrivateNetwork bool `json:"access_kafkas_via_private_network"`
	// The data plane cluster ID. This is the ID of the cluster obtained from OpenShift Cluster Manager (OCM) API
	ClusterId string `json:"cluster_id"`
	// dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/<cluster_id>/ingresses (dns_name)
	ClusterIngressDnsName string `json:"cluster_ingress_dns_name"`
	// The node count given to the created kafka machine pool.  The machine pool must be created via /api/clusters_mgmt/v1/clusters/<cluster_id>/machine_pools prior to passing this value. The created machine pool must have a `bf2.org/kafkaInstanceProfileType=standard` label and a `bf2.org/kafkaInstanceProfileType=standard:NoExecute` taint. The name of the machine pool must be `kafka-standard`  The node count value has to be a multiple of 3 with a minimum of 3 nodes.
	KafkaMachinePoolNodeCount int32 `json:"kafka_machine_pool_node_count"`
}

// NewEnterpriseOsdClusterPayload instantiates a new EnterpriseOsdClusterPayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnterpriseOsdClusterPayload(accessKafkasViaPrivateNetwork bool, clusterId string, clusterIngressDnsName string, kafkaMachinePoolNodeCount int32) *EnterpriseOsdClusterPayload {
	this := EnterpriseOsdClusterPayload{}
	this.AccessKafkasViaPrivateNetwork = accessKafkasViaPrivateNetwork
	this.ClusterId = clusterId
	this.ClusterIngressDnsName = clusterIngressDnsName
	this.KafkaMachinePoolNodeCount = kafkaMachinePoolNodeCount
	return &this
}

// NewEnterpriseOsdClusterPayloadWithDefaults instantiates a new EnterpriseOsdClusterPayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnterpriseOsdClusterPayloadWithDefaults() *EnterpriseOsdClusterPayload {
	this := EnterpriseOsdClusterPayload{}
	return &this
}

// GetAccessKafkasViaPrivateNetwork returns the AccessKafkasViaPrivateNetwork field value
func (o *EnterpriseOsdClusterPayload) GetAccessKafkasViaPrivateNetwork() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.AccessKafkasViaPrivateNetwork
}

// GetAccessKafkasViaPrivateNetworkOk returns a tuple with the AccessKafkasViaPrivateNetwork field value
// and a boolean to check if the value has been set.
func (o *EnterpriseOsdClusterPayload) GetAccessKafkasViaPrivateNetworkOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.AccessKafkasViaPrivateNetwork, true
}

// SetAccessKafkasViaPrivateNetwork sets field value
func (o *EnterpriseOsdClusterPayload) SetAccessKafkasViaPrivateNetwork(v bool) {
	o.AccessKafkasViaPrivateNetwork = v
}

// GetClusterId returns the ClusterId field value
func (o *EnterpriseOsdClusterPayload) GetClusterId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value
// and a boolean to check if the value has been set.
func (o *EnterpriseOsdClusterPayload) GetClusterIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.ClusterId, true
}

// SetClusterId sets field value
func (o *EnterpriseOsdClusterPayload) SetClusterId(v string) {
	o.ClusterId = v
}

// GetClusterIngressDnsName returns the ClusterIngressDnsName field value
func (o *EnterpriseOsdClusterPayload) GetClusterIngressDnsName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ClusterIngressDnsName
}

// GetClusterIngressDnsNameOk returns a tuple with the ClusterIngressDnsName field value
// and a boolean to check if the value has been set.
func (o *EnterpriseOsdClusterPayload) GetClusterIngressDnsNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.ClusterIngressDnsName, true
}

// SetClusterIngressDnsName sets field value
func (o *EnterpriseOsdClusterPayload) SetClusterIngressDnsName(v string) {
	o.ClusterIngressDnsName = v
}

// GetKafkaMachinePoolNodeCount returns the KafkaMachinePoolNodeCount field value
func (o *EnterpriseOsdClusterPayload) GetKafkaMachinePoolNodeCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.KafkaMachinePoolNodeCount
}

// GetKafkaMachinePoolNodeCountOk returns a tuple with the KafkaMachinePoolNodeCount field value
// and a boolean to check if the value has been set.
func (o *EnterpriseOsdClusterPayload) GetKafkaMachinePoolNodeCountOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.KafkaMachinePoolNodeCount, true
}

// SetKafkaMachinePoolNodeCount sets field value
func (o *EnterpriseOsdClusterPayload) SetKafkaMachinePoolNodeCount(v int32) {
	o.KafkaMachinePoolNodeCount = v
}

func (o EnterpriseOsdClusterPayload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["access_kafkas_via_private_network"] = o.AccessKafkasViaPrivateNetwork
	}
	if true {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if true {
		toSerialize["cluster_ingress_dns_name"] = o.ClusterIngressDnsName
	}
	if true {
		toSerialize["kafka_machine_pool_node_count"] = o.KafkaMachinePoolNodeCount
	}
	return json.Marshal(toSerialize)
}

type NullableEnterpriseOsdClusterPayload struct {
	value *EnterpriseOsdClusterPayload
	isSet bool
}

func (v NullableEnterpriseOsdClusterPayload) Get() *EnterpriseOsdClusterPayload {
	return v.value
}

func (v *NullableEnterpriseOsdClusterPayload) Set(val *EnterpriseOsdClusterPayload) {
	v.value = val
	v.isSet = true
}

func (v NullableEnterpriseOsdClusterPayload) IsSet() bool {
	return v.isSet
}

func (v *NullableEnterpriseOsdClusterPayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnterpriseOsdClusterPayload(val *EnterpriseOsdClusterPayload) *NullableEnterpriseOsdClusterPayload {
	return &NullableEnterpriseOsdClusterPayload{value: val, isSet: true}
}

func (v NullableEnterpriseOsdClusterPayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnterpriseOsdClusterPayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


