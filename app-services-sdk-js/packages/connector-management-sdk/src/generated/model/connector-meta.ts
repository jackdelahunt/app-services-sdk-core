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
import { Channel } from './channel';
// May contain unused imports in some cases
// @ts-ignore
import { ConnectorDesiredState } from './connector-desired-state';
// May contain unused imports in some cases
// @ts-ignore
import { ConnectorMetaAllOf } from './connector-meta-all-of';
// May contain unused imports in some cases
// @ts-ignore
import { ConnectorRequestMeta } from './connector-request-meta';
// May contain unused imports in some cases
// @ts-ignore
import { ObjectMeta } from './object-meta';

/**
 * @type ConnectorMeta
 * @export
 */
export type ConnectorMeta = ConnectorMetaAllOf & ConnectorRequestMeta & ObjectMeta;


