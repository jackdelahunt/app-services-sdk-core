"use strict";
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
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.SourceConnectorsApi = exports.SourceConnectorsApiFactory = exports.SourceConnectorsApiFp = exports.SourceConnectorsApiAxiosParamCreator = void 0;
const axios_1 = require("axios");
// Some imports not used depending on template conditions
// @ts-ignore
const common_1 = require("../common");
// @ts-ignore
const base_1 = require("../base");
/**
 * SourceConnectorsApi - axios parameter creator
 * @export
 */
const SourceConnectorsApiAxiosParamCreator = function (configuration) {
    return {
        /**
         * Create a Source Connector of a Bridge instance for the authenticated user.
         * @summary Create a Source Connector for a Bridge instance
         * @param {string} bridgeId
         * @param {ConnectorRequest} [connectorRequest]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createSourceConnector: (bridgeId, connectorRequest, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'bridgeId' is not null or undefined
            (0, common_1.assertParamExists)('createSourceConnector', 'bridgeId', bridgeId);
            const localVarPath = `/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources`
                .replace(`{${"bridgeId"}}`, encodeURIComponent(String(bridgeId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = (0, common_1.serializeDataIfNeeded)(connectorRequest, localVarRequestOptions, configuration);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Delete a Source Connector of a Bridge instance for the authenticated user.
         * @summary Delete a Source Connector of a Bridge instance
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteSourceConnector: (bridgeId, sourceId, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'bridgeId' is not null or undefined
            (0, common_1.assertParamExists)('deleteSourceConnector', 'bridgeId', bridgeId);
            // verify required parameter 'sourceId' is not null or undefined
            (0, common_1.assertParamExists)('deleteSourceConnector', 'sourceId', sourceId);
            const localVarPath = `/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId}`
                .replace(`{${"bridgeId"}}`, encodeURIComponent(String(bridgeId)))
                .replace(`{${"sourceId"}}`, encodeURIComponent(String(sourceId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'DELETE' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Get a Source Connector of a Bridge instance for the authenticated user.
         * @summary Get a Source Connector of a Bridge instance
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSourceConnector: (bridgeId, sourceId, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'bridgeId' is not null or undefined
            (0, common_1.assertParamExists)('getSourceConnector', 'bridgeId', bridgeId);
            // verify required parameter 'sourceId' is not null or undefined
            (0, common_1.assertParamExists)('getSourceConnector', 'sourceId', sourceId);
            const localVarPath = `/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId}`
                .replace(`{${"bridgeId"}}`, encodeURIComponent(String(bridgeId)))
                .replace(`{${"sourceId"}}`, encodeURIComponent(String(sourceId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Get the list of Source Connector instances of a Bridge instance instance for the authenticated user.
         * @summary Get the list of Sink Connectors for a Bridge
         * @param {string} bridgeId
         * @param {string} [name]
         * @param {number} [page]
         * @param {number} [size]
         * @param {Set<ManagedResourceStatus>} [status]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSourceConnectors: (bridgeId, name, page, size, status, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'bridgeId' is not null or undefined
            (0, common_1.assertParamExists)('getSourceConnectors', 'bridgeId', bridgeId);
            const localVarPath = `/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources`
                .replace(`{${"bridgeId"}}`, encodeURIComponent(String(bridgeId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            if (name !== undefined) {
                localVarQueryParameter['name'] = name;
            }
            if (page !== undefined) {
                localVarQueryParameter['page'] = page;
            }
            if (size !== undefined) {
                localVarQueryParameter['size'] = size;
            }
            if (status) {
                localVarQueryParameter['status'] = Array.from(status);
            }
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Update a Source Connector instance for the authenticated user.
         * @summary Update a Source Connector instance.
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {ConnectorRequest} [connectorRequest]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateSourceConnector: (bridgeId, sourceId, connectorRequest, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'bridgeId' is not null or undefined
            (0, common_1.assertParamExists)('updateSourceConnector', 'bridgeId', bridgeId);
            // verify required parameter 'sourceId' is not null or undefined
            (0, common_1.assertParamExists)('updateSourceConnector', 'sourceId', sourceId);
            const localVarPath = `/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId}`
                .replace(`{${"bridgeId"}}`, encodeURIComponent(String(bridgeId)))
                .replace(`{${"sourceId"}}`, encodeURIComponent(String(sourceId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'PUT' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = (0, common_1.serializeDataIfNeeded)(connectorRequest, localVarRequestOptions, configuration);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.SourceConnectorsApiAxiosParamCreator = SourceConnectorsApiAxiosParamCreator;
/**
 * SourceConnectorsApi - functional programming interface
 * @export
 */
const SourceConnectorsApiFp = function (configuration) {
    const localVarAxiosParamCreator = (0, exports.SourceConnectorsApiAxiosParamCreator)(configuration);
    return {
        /**
         * Create a Source Connector of a Bridge instance for the authenticated user.
         * @summary Create a Source Connector for a Bridge instance
         * @param {string} bridgeId
         * @param {ConnectorRequest} [connectorRequest]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createSourceConnector(bridgeId, connectorRequest, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.createSourceConnector(bridgeId, connectorRequest, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Delete a Source Connector of a Bridge instance for the authenticated user.
         * @summary Delete a Source Connector of a Bridge instance
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteSourceConnector(bridgeId, sourceId, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.deleteSourceConnector(bridgeId, sourceId, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Get a Source Connector of a Bridge instance for the authenticated user.
         * @summary Get a Source Connector of a Bridge instance
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSourceConnector(bridgeId, sourceId, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getSourceConnector(bridgeId, sourceId, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Get the list of Source Connector instances of a Bridge instance instance for the authenticated user.
         * @summary Get the list of Sink Connectors for a Bridge
         * @param {string} bridgeId
         * @param {string} [name]
         * @param {number} [page]
         * @param {number} [size]
         * @param {Set<ManagedResourceStatus>} [status]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSourceConnectors(bridgeId, name, page, size, status, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getSourceConnectors(bridgeId, name, page, size, status, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Update a Source Connector instance for the authenticated user.
         * @summary Update a Source Connector instance.
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {ConnectorRequest} [connectorRequest]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateSourceConnector(bridgeId, sourceId, connectorRequest, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.updateSourceConnector(bridgeId, sourceId, connectorRequest, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.SourceConnectorsApiFp = SourceConnectorsApiFp;
/**
 * SourceConnectorsApi - factory interface
 * @export
 */
const SourceConnectorsApiFactory = function (configuration, basePath, axios) {
    const localVarFp = (0, exports.SourceConnectorsApiFp)(configuration);
    return {
        /**
         * Create a Source Connector of a Bridge instance for the authenticated user.
         * @summary Create a Source Connector for a Bridge instance
         * @param {string} bridgeId
         * @param {ConnectorRequest} [connectorRequest]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createSourceConnector(bridgeId, connectorRequest, options) {
            return localVarFp.createSourceConnector(bridgeId, connectorRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a Source Connector of a Bridge instance for the authenticated user.
         * @summary Delete a Source Connector of a Bridge instance
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteSourceConnector(bridgeId, sourceId, options) {
            return localVarFp.deleteSourceConnector(bridgeId, sourceId, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a Source Connector of a Bridge instance for the authenticated user.
         * @summary Get a Source Connector of a Bridge instance
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSourceConnector(bridgeId, sourceId, options) {
            return localVarFp.getSourceConnector(bridgeId, sourceId, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the list of Source Connector instances of a Bridge instance instance for the authenticated user.
         * @summary Get the list of Sink Connectors for a Bridge
         * @param {string} bridgeId
         * @param {string} [name]
         * @param {number} [page]
         * @param {number} [size]
         * @param {Set<ManagedResourceStatus>} [status]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSourceConnectors(bridgeId, name, page, size, status, options) {
            return localVarFp.getSourceConnectors(bridgeId, name, page, size, status, options).then((request) => request(axios, basePath));
        },
        /**
         * Update a Source Connector instance for the authenticated user.
         * @summary Update a Source Connector instance.
         * @param {string} bridgeId
         * @param {string} sourceId
         * @param {ConnectorRequest} [connectorRequest]
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateSourceConnector(bridgeId, sourceId, connectorRequest, options) {
            return localVarFp.updateSourceConnector(bridgeId, sourceId, connectorRequest, options).then((request) => request(axios, basePath));
        },
    };
};
exports.SourceConnectorsApiFactory = SourceConnectorsApiFactory;
/**
 * SourceConnectorsApi - object-oriented interface
 * @export
 * @class SourceConnectorsApi
 * @extends {BaseAPI}
 */
class SourceConnectorsApi extends base_1.BaseAPI {
    /**
     * Create a Source Connector of a Bridge instance for the authenticated user.
     * @summary Create a Source Connector for a Bridge instance
     * @param {string} bridgeId
     * @param {ConnectorRequest} [connectorRequest]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SourceConnectorsApi
     */
    createSourceConnector(bridgeId, connectorRequest, options) {
        return (0, exports.SourceConnectorsApiFp)(this.configuration).createSourceConnector(bridgeId, connectorRequest, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Delete a Source Connector of a Bridge instance for the authenticated user.
     * @summary Delete a Source Connector of a Bridge instance
     * @param {string} bridgeId
     * @param {string} sourceId
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SourceConnectorsApi
     */
    deleteSourceConnector(bridgeId, sourceId, options) {
        return (0, exports.SourceConnectorsApiFp)(this.configuration).deleteSourceConnector(bridgeId, sourceId, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Get a Source Connector of a Bridge instance for the authenticated user.
     * @summary Get a Source Connector of a Bridge instance
     * @param {string} bridgeId
     * @param {string} sourceId
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SourceConnectorsApi
     */
    getSourceConnector(bridgeId, sourceId, options) {
        return (0, exports.SourceConnectorsApiFp)(this.configuration).getSourceConnector(bridgeId, sourceId, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Get the list of Source Connector instances of a Bridge instance instance for the authenticated user.
     * @summary Get the list of Sink Connectors for a Bridge
     * @param {string} bridgeId
     * @param {string} [name]
     * @param {number} [page]
     * @param {number} [size]
     * @param {Set<ManagedResourceStatus>} [status]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SourceConnectorsApi
     */
    getSourceConnectors(bridgeId, name, page, size, status, options) {
        return (0, exports.SourceConnectorsApiFp)(this.configuration).getSourceConnectors(bridgeId, name, page, size, status, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Update a Source Connector instance for the authenticated user.
     * @summary Update a Source Connector instance.
     * @param {string} bridgeId
     * @param {string} sourceId
     * @param {ConnectorRequest} [connectorRequest]
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SourceConnectorsApi
     */
    updateSourceConnector(bridgeId, sourceId, connectorRequest, options) {
        return (0, exports.SourceConnectorsApiFp)(this.configuration).updateSourceConnector(bridgeId, sourceId, connectorRequest, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.SourceConnectorsApi = SourceConnectorsApi;
