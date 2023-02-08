/* tslint:disable */
/* eslint-disable */
/**
 * Red Hat Openshift SmartEvents Fleet Manager V2
 * The API exposed by the fleet manager of the SmartEvents service.
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: openbridge-dev@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


// May contain unused imports in some cases
// @ts-ignore
import { CloudProviderResponse } from './cloud-provider-response';

/**
 * 
 * @export
 * @interface CloudProviderListResponse
 */
export interface CloudProviderListResponse {
    /**
     * 
     * @type {string}
     * @memberof CloudProviderListResponse
     */
    'kind': string;
    /**
     * 
     * @type {Array<CloudProviderResponse>}
     * @memberof CloudProviderListResponse
     */
    'items'?: Array<CloudProviderResponse>;
    /**
     * 
     * @type {number}
     * @memberof CloudProviderListResponse
     */
    'page': number;
    /**
     * 
     * @type {number}
     * @memberof CloudProviderListResponse
     */
    'size': number;
    /**
     * 
     * @type {number}
     * @memberof CloudProviderListResponse
     */
    'total': number;
}

