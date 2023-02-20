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
 * 
 * @export
 * @enum {string}
 */

export const OffsetType = {
    Timestamp: 'timestamp',
    Absolute: 'absolute',
    Latest: 'latest',
    Earliest: 'earliest'
} as const;

export type OffsetType = typeof OffsetType[keyof typeof OffsetType];



