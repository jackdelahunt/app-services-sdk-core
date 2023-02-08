/* tslint:disable */
/* eslint-disable */
/**
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.13.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


// May contain unused imports in some cases
// @ts-ignore
import { Topic } from './topic';

/**
 * A list of topics.
 * @export
 * @interface TopicsListAllOf
 */
export interface TopicsListAllOf {
    /**
     * 
     * @type {Array<Topic>}
     * @memberof TopicsListAllOf
     */
    'items'?: Array<Topic>;
}

