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
import { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
import { RequestArgs, BaseAPI } from '../base';
import { BridgeError } from '../model';
import { ErrorListResponse } from '../model';
/**
 * ErrorCatalogApi - axios parameter creator
 * @export
 */
export declare const ErrorCatalogApiAxiosParamCreator: (configuration?: Configuration) => {
    /**
     * Get an error from the error catalog.
     * @summary Get an error from the error catalog.
     * @param {number} id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     */
    getError: (id: number, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    /**
     * Get the list of errors from the error catalog.
     * @summary Get the list of errors.
     * @param {number} [page]
     * @param {number} [size]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     */
    getErrors: (page?: number, size?: number, options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
/**
 * ErrorCatalogApi - functional programming interface
 * @export
 */
export declare const ErrorCatalogApiFp: (configuration?: Configuration) => {
    /**
     * Get an error from the error catalog.
     * @summary Get an error from the error catalog.
     * @param {number} id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     */
    getError(id: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<BridgeError>>;
    /**
     * Get the list of errors from the error catalog.
     * @summary Get the list of errors.
     * @param {number} [page]
     * @param {number} [size]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     */
    getErrors(page?: number, size?: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ErrorListResponse>>;
};
/**
 * ErrorCatalogApi - factory interface
 * @export
 */
export declare const ErrorCatalogApiFactory: (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) => {
    /**
     * Get an error from the error catalog.
     * @summary Get an error from the error catalog.
     * @param {number} id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     */
    getError(id: number, options?: any): AxiosPromise<BridgeError>;
    /**
     * Get the list of errors from the error catalog.
     * @summary Get the list of errors.
     * @param {number} [page]
     * @param {number} [size]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     */
    getErrors(page?: number, size?: number, options?: any): AxiosPromise<ErrorListResponse>;
};
/**
 * ErrorCatalogApi - interface
 * @export
 * @interface ErrorCatalogApi
 */
export interface ErrorCatalogApiInterface {
    /**
     * Get an error from the error catalog.
     * @summary Get an error from the error catalog.
     * @param {number} id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ErrorCatalogApiInterface
     */
    getError(id: number, options?: AxiosRequestConfig): AxiosPromise<BridgeError>;
    /**
     * Get the list of errors from the error catalog.
     * @summary Get the list of errors.
     * @param {number} [page]
     * @param {number} [size]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ErrorCatalogApiInterface
     */
    getErrors(page?: number, size?: number, options?: AxiosRequestConfig): AxiosPromise<ErrorListResponse>;
}
/**
 * ErrorCatalogApi - object-oriented interface
 * @export
 * @class ErrorCatalogApi
 * @extends {BaseAPI}
 */
export declare class ErrorCatalogApi extends BaseAPI implements ErrorCatalogApiInterface {
    /**
     * Get an error from the error catalog.
     * @summary Get an error from the error catalog.
     * @param {number} id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ErrorCatalogApi
     */
    getError(id: number, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<BridgeError, any>>;
    /**
     * Get the list of errors from the error catalog.
     * @summary Get the list of errors.
     * @param {number} [page]
     * @param {number} [size]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ErrorCatalogApi
     */
    getErrors(page?: number, size?: number, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<ErrorListResponse, any>>;
}
