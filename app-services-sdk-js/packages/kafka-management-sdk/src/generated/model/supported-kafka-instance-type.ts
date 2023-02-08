/* tslint:disable */
/* eslint-disable */
/**
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.14.0
 * Contact: rhosak-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


// May contain unused imports in some cases
// @ts-ignore
import { SupportedKafkaBillingModel } from './supported-kafka-billing-model';
// May contain unused imports in some cases
// @ts-ignore
import { SupportedKafkaInstanceTypeSizesInner } from './supported-kafka-instance-type-sizes-inner';

/**
 * Supported Kafka instance type
 * @export
 * @interface SupportedKafkaInstanceType
 */
export interface SupportedKafkaInstanceType {
    /**
     * Unique identifier of the Kafka instance type.
     * @type {string}
     * @memberof SupportedKafkaInstanceType
     */
    'id'?: string;
    /**
     * Human readable name of the supported Kafka instance type
     * @type {string}
     * @memberof SupportedKafkaInstanceType
     */
    'display_name'?: string;
    /**
     * A list of available kafka billing models for the instance type. Each kafka billing model item has a unique \'id\'
     * @type {Array<SupportedKafkaBillingModel>}
     * @memberof SupportedKafkaInstanceType
     */
    'supported_billing_models': Array<SupportedKafkaBillingModel>;
    /**
     * A list of Kafka instance sizes available for this instance type
     * @type {Array<SupportedKafkaInstanceTypeSizesInner>}
     * @memberof SupportedKafkaInstanceType
     */
    'sizes'?: Array<SupportedKafkaInstanceTypeSizesInner>;
}

