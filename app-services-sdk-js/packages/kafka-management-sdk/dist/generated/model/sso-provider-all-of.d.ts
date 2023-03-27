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
/**
 *
 * @export
 * @interface SsoProviderAllOf
 */
export interface SsoProviderAllOf {
    /**
     * name of the sso provider
     * @type {string}
     * @memberof SsoProviderAllOf
     */
    'name'?: string;
    /**
     * base url
     * @type {string}
     * @memberof SsoProviderAllOf
     */
    'base_url'?: string;
    /**
     *
     * @type {string}
     * @memberof SsoProviderAllOf
     */
    'token_url'?: string;
    /**
     *
     * @type {string}
     * @memberof SsoProviderAllOf
     */
    'jwks'?: string;
    /**
     *
     * @type {string}
     * @memberof SsoProviderAllOf
     */
    'valid_issuer'?: string;
}
