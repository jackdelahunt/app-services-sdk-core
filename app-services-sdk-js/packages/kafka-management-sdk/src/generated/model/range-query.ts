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
import { Values } from './values';

/**
 * 
 * @export
 * @interface RangeQuery
 */
export interface RangeQuery {
    /**
     * 
     * @type {{ [key: string]: string; }}
     * @memberof RangeQuery
     */
    'metric'?: { [key: string]: string; };
    /**
     * 
     * @type {Array<Values>}
     * @memberof RangeQuery
     */
    'values'?: Array<Values>;
}

