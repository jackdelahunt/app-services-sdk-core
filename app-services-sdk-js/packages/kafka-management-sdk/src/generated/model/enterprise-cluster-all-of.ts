/* tslint:disable */
/* eslint-disable */
/**
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.15.0
 * Contact: rhosak-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


// May contain unused imports in some cases
// @ts-ignore
import { EnterpriseClusterAllOfCapacityInformation } from './enterprise-cluster-all-of-capacity-information';
// May contain unused imports in some cases
// @ts-ignore
import { SupportedKafkaInstanceTypesList } from './supported-kafka-instance-types-list';

/**
 * 
 * @export
 * @interface EnterpriseClusterAllOf
 */
export interface EnterpriseClusterAllOf {
    /**
     * 
     * @type {SupportedKafkaInstanceTypesList}
     * @memberof EnterpriseClusterAllOf
     */
    'supported_instance_types'?: SupportedKafkaInstanceTypesList;
    /**
     * 
     * @type {EnterpriseClusterAllOfCapacityInformation}
     * @memberof EnterpriseClusterAllOf
     */
    'capacity_information'?: EnterpriseClusterAllOfCapacityInformation;
}

