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

export const AclOperation = {
    All: 'ALL',
    Read: 'READ',
    Write: 'WRITE',
    Create: 'CREATE',
    Delete: 'DELETE',
    Alter: 'ALTER',
    Describe: 'DESCRIBE',
    DescribeConfigs: 'DESCRIBE_CONFIGS',
    AlterConfigs: 'ALTER_CONFIGS'
} as const;

export type AclOperation = typeof AclOperation[keyof typeof AclOperation];



