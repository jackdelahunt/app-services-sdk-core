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
 * General error response
 * @export
 * @interface ErrorAllOf
 */
export interface ErrorAllOf {
    /**
     * General reason for the error. Does not change between specific occurrences.
     * @type {string}
     * @memberof ErrorAllOf
     */
    'reason'?: string;
    /**
     * Detail specific to an error occurrence. May be different depending on the condition(s) that trigger the error.
     * @type {string}
     * @memberof ErrorAllOf
     */
    'detail'?: string;
    /**
     * 
     * @type {number}
     * @memberof ErrorAllOf
     */
    'code'?: number;
    /**
     * 
     * @type {string}
     * @memberof ErrorAllOf
     * @deprecated
     */
    'error_message'?: string;
    /**
     * 
     * @type {string}
     * @memberof ErrorAllOf
     * @deprecated
     */
    'class'?: string;
}

