/**
 * Account Management Service API
 * Manage user subscriptions and clusters
 *
 * The version of the OpenAPI document: 0.0.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { ExcessResource } from './excess-resource';
import { ObjectReference } from './object-reference';
/**
 *
 * @export
 * @interface ClusterAuthorizationResponse
 */
export interface ClusterAuthorizationResponse {
    /**
     *
     * @type {boolean}
     * @memberof ClusterAuthorizationResponse
     */
    'allowed': boolean;
    /**
     *
     * @type {Array<ExcessResource>}
     * @memberof ClusterAuthorizationResponse
     */
    'excess_resources': Array<ExcessResource>;
    /**
     *
     * @type {string}
     * @memberof ClusterAuthorizationResponse
     */
    'organization_id'?: string;
    /**
     *
     * @type {ObjectReference}
     * @memberof ClusterAuthorizationResponse
     */
    'subscription'?: ObjectReference;
}
