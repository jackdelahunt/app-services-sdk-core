/* tslint:disable */
/* eslint-disable */
/**
 * Connector Management API
 * Connector Management API is a REST API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: rhosak-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


// May contain unused imports in some cases
// @ts-ignore
import { ConnectorNamespaceTenantKind } from './connector-namespace-tenant-kind';

/**
 * 
 * @export
 * @interface ConnectorNamespaceTenant
 */
export interface ConnectorNamespaceTenant {
    /**
     * 
     * @type {ConnectorNamespaceTenantKind}
     * @memberof ConnectorNamespaceTenant
     */
    'kind': ConnectorNamespaceTenantKind;
    /**
     * Either user or organisation id depending on the value of kind
     * @type {string}
     * @memberof ConnectorNamespaceTenant
     */
    'id': string;
}



