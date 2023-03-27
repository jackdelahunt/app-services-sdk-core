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
/**
 *
 * @export
 * @interface QuotaSummaryAllOf
 */
export interface QuotaSummaryAllOf {
    /**
     *
     * @type {number}
     * @memberof QuotaSummaryAllOf
     */
    'allowed': number;
    /**
     *
     * @type {string}
     * @memberof QuotaSummaryAllOf
     */
    'availability_zone_type': string;
    /**
     *
     * @type {boolean}
     * @memberof QuotaSummaryAllOf
     */
    'byoc': boolean;
    /**
     *
     * @type {string}
     * @memberof QuotaSummaryAllOf
     */
    'organization_id'?: string;
    /**
     *
     * @type {number}
     * @memberof QuotaSummaryAllOf
     */
    'reserved': number;
    /**
     *
     * @type {string}
     * @memberof QuotaSummaryAllOf
     */
    'resource_name': string;
    /**
     *
     * @type {string}
     * @memberof QuotaSummaryAllOf
     */
    'resource_type': string;
}
