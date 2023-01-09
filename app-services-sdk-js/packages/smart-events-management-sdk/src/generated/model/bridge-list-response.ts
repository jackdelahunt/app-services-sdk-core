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


import { BridgeResponse } from './bridge-response';

/**
 * 
 * @export
 * @interface BridgeListResponse
 */
export interface BridgeListResponse {
    /**
     * 
     * @type {string}
     * @memberof BridgeListResponse
     */
    'kind': string;
    /**
     * 
     * @type {Array<BridgeResponse>}
     * @memberof BridgeListResponse
     */
    'items'?: Array<BridgeResponse>;
    /**
     * 
     * @type {number}
     * @memberof BridgeListResponse
     */
    'page': number;
    /**
     * 
     * @type {number}
     * @memberof BridgeListResponse
     */
    'size': number;
    /**
     * 
     * @type {number}
     * @memberof BridgeListResponse
     */
    'total': number;
}

