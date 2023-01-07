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


import { RangeQuery } from './range-query';

/**
 * 
 * @export
 * @interface MetricsRangeQueryListAllOf
 */
export interface MetricsRangeQueryListAllOf {
    /**
     * 
     * @type {string}
     * @memberof MetricsRangeQueryListAllOf
     */
    'kind'?: string;
    /**
     * 
     * @type {string}
     * @memberof MetricsRangeQueryListAllOf
     */
    'id'?: string;
    /**
     * 
     * @type {Array<RangeQuery>}
     * @memberof MetricsRangeQueryListAllOf
     */
    'items'?: Array<RangeQuery>;
}

