/* tslint:disable */
/* eslint-disable */
/**
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.13.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



/**
 * List of errors
 * @export
 * @interface ErrorListAllOf
 */
export interface ErrorListAllOf {
    /**
     * 
     * @type {Array<Error>}
     * @memberof ErrorListAllOf
     */
    'items': Array<Error>;
    /**
     * Total number of errors returned in this request
     * @type {number}
     * @memberof ErrorListAllOf
     */
    'total'?: number;
}

