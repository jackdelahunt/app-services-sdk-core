"use strict";
/* tslint:disable */
/* eslint-disable */
/**
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.14.1-SNAPSHOT
 *
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
exports.TopicsApi = exports.TopicsApiFactory = exports.TopicsApiFp = exports.TopicsApiAxiosParamCreator = void 0;
const axios_1 = require("axios");
// Some imports not used depending on template conditions
// @ts-ignore
const common_1 = require("../common");
// @ts-ignore
const base_1 = require("../base");
/**
 * TopicsApi - axios parameter creator
 * @export
 */
const TopicsApiAxiosParamCreator = function (configuration) {
    return {
        /**
         * Creates a new topic for Kafka.
         * @summary Creates a new topic
         * @param {NewTopicInput} newTopicInput Topic to create.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTopic: (newTopicInput, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'newTopicInput' is not null or undefined
            (0, common_1.assertParamExists)('createTopic', 'newTopicInput', newTopicInput);
            const localVarPath = `/api/v1/topics`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication Bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            // authentication OAuth2 required
            // oauth required
            yield (0, common_1.setOAuthToObject)(localVarHeaderParameter, "OAuth2", [], configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = (0, common_1.serializeDataIfNeeded)(newTopicInput, localVarRequestOptions, configuration);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Deletes the topic with the specified name.
         * @summary Deletes a topic
         * @param {string} topicName Name of the topic to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTopic: (topicName, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'topicName' is not null or undefined
            (0, common_1.assertParamExists)('deleteTopic', 'topicName', topicName);
            const localVarPath = `/api/v1/topics/{topicName}`
                .replace(`{${"topicName"}}`, encodeURIComponent(String(topicName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'DELETE' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication Bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            // authentication OAuth2 required
            // oauth required
            yield (0, common_1.setOAuthToObject)(localVarHeaderParameter, "OAuth2", [], configuration);
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Topic
         * @summary Retrieves a single topic
         * @param {string} topicName Name of the topic to describe
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopic: (topicName, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'topicName' is not null or undefined
            (0, common_1.assertParamExists)('getTopic', 'topicName', topicName);
            const localVarPath = `/api/v1/topics/{topicName}`
                .replace(`{${"topicName"}}`, encodeURIComponent(String(topicName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication Bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            // authentication OAuth2 required
            // oauth required
            yield (0, common_1.setOAuthToObject)(localVarHeaderParameter, "OAuth2", [], configuration);
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        /**
         * Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.
         * @summary Retrieves a list of topics
         * @param {number} [offset] Offset of the first record to return, zero-based
         * @param {number} [limit] Maximum number of records to return
         * @param {number} [size] Number of records per page
         * @param {string} [filter] Filter to apply when returning the list of topics
         * @param {number} [page] Page number
         * @param {SortDirection} [order] Order items are sorted
         * @param {TopicOrderKey} [orderKey] Order key to sort the topics by.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopics: (offset, limit, size, filter, page, order, orderKey, options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/v1/topics`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication Bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            // authentication OAuth2 required
            // oauth required
            yield (0, common_1.setOAuthToObject)(localVarHeaderParameter, "OAuth2", [], configuration);
            if (offset !== undefined) {
                localVarQueryParameter['offset'] = offset;
            }
            if (limit !== undefined) {
                localVarQueryParameter['limit'] = limit;
            }
            if (size !== undefined) {
                localVarQueryParameter['size'] = size;
            }
            if (filter !== undefined) {
                localVarQueryParameter['filter'] = filter;
            }
            if (page !== undefined) {
                localVarQueryParameter['page'] = page;
            }
            if (order !== undefined) {
                localVarQueryParameter['order'] = order;
            }
            if (orderKey !== undefined) {
                localVarQueryParameter['orderKey'] = orderKey;
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
         * Update the configuration settings for a topic.
         * @summary Updates a single topic
         * @param {string} topicName Name of the topic to update
         * @param {TopicSettings} topicSettings
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTopic: (topicName, topicSettings, options = {}) => __awaiter(this, void 0, void 0, function* () {
            // verify required parameter 'topicName' is not null or undefined
            (0, common_1.assertParamExists)('updateTopic', 'topicName', topicName);
            // verify required parameter 'topicSettings' is not null or undefined
            (0, common_1.assertParamExists)('updateTopic', 'topicSettings', topicSettings);
            const localVarPath = `/api/v1/topics/{topicName}`
                .replace(`{${"topicName"}}`, encodeURIComponent(String(topicName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'PATCH' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            // authentication Bearer required
            // http bearer authentication required
            yield (0, common_1.setBearerAuthToObject)(localVarHeaderParameter, configuration);
            // authentication OAuth2 required
            // oauth required
            yield (0, common_1.setOAuthToObject)(localVarHeaderParameter, "OAuth2", [], configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            (0, common_1.setSearchParams)(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = (0, common_1.serializeDataIfNeeded)(topicSettings, localVarRequestOptions, configuration);
            return {
                url: (0, common_1.toPathString)(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.TopicsApiAxiosParamCreator = TopicsApiAxiosParamCreator;
/**
 * TopicsApi - functional programming interface
 * @export
 */
const TopicsApiFp = function (configuration) {
    const localVarAxiosParamCreator = (0, exports.TopicsApiAxiosParamCreator)(configuration);
    return {
        /**
         * Creates a new topic for Kafka.
         * @summary Creates a new topic
         * @param {NewTopicInput} newTopicInput Topic to create.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTopic(newTopicInput, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.createTopic(newTopicInput, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Deletes the topic with the specified name.
         * @summary Deletes a topic
         * @param {string} topicName Name of the topic to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTopic(topicName, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.deleteTopic(topicName, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Topic
         * @summary Retrieves a single topic
         * @param {string} topicName Name of the topic to describe
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopic(topicName, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getTopic(topicName, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.
         * @summary Retrieves a list of topics
         * @param {number} [offset] Offset of the first record to return, zero-based
         * @param {number} [limit] Maximum number of records to return
         * @param {number} [size] Number of records per page
         * @param {string} [filter] Filter to apply when returning the list of topics
         * @param {number} [page] Page number
         * @param {SortDirection} [order] Order items are sorted
         * @param {TopicOrderKey} [orderKey] Order key to sort the topics by.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopics(offset, limit, size, filter, page, order, orderKey, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getTopics(offset, limit, size, filter, page, order, orderKey, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        /**
         * Update the configuration settings for a topic.
         * @summary Updates a single topic
         * @param {string} topicName Name of the topic to update
         * @param {TopicSettings} topicSettings
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTopic(topicName, topicSettings, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.updateTopic(topicName, topicSettings, options);
                return (0, common_1.createRequestFunction)(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.TopicsApiFp = TopicsApiFp;
/**
 * TopicsApi - factory interface
 * @export
 */
const TopicsApiFactory = function (configuration, basePath, axios) {
    const localVarFp = (0, exports.TopicsApiFp)(configuration);
    return {
        /**
         * Creates a new topic for Kafka.
         * @summary Creates a new topic
         * @param {NewTopicInput} newTopicInput Topic to create.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTopic(newTopicInput, options) {
            return localVarFp.createTopic(newTopicInput, options).then((request) => request(axios, basePath));
        },
        /**
         * Deletes the topic with the specified name.
         * @summary Deletes a topic
         * @param {string} topicName Name of the topic to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTopic(topicName, options) {
            return localVarFp.deleteTopic(topicName, options).then((request) => request(axios, basePath));
        },
        /**
         * Topic
         * @summary Retrieves a single topic
         * @param {string} topicName Name of the topic to describe
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopic(topicName, options) {
            return localVarFp.getTopic(topicName, options).then((request) => request(axios, basePath));
        },
        /**
         * Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.
         * @summary Retrieves a list of topics
         * @param {number} [offset] Offset of the first record to return, zero-based
         * @param {number} [limit] Maximum number of records to return
         * @param {number} [size] Number of records per page
         * @param {string} [filter] Filter to apply when returning the list of topics
         * @param {number} [page] Page number
         * @param {SortDirection} [order] Order items are sorted
         * @param {TopicOrderKey} [orderKey] Order key to sort the topics by.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopics(offset, limit, size, filter, page, order, orderKey, options) {
            return localVarFp.getTopics(offset, limit, size, filter, page, order, orderKey, options).then((request) => request(axios, basePath));
        },
        /**
         * Update the configuration settings for a topic.
         * @summary Updates a single topic
         * @param {string} topicName Name of the topic to update
         * @param {TopicSettings} topicSettings
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTopic(topicName, topicSettings, options) {
            return localVarFp.updateTopic(topicName, topicSettings, options).then((request) => request(axios, basePath));
        },
    };
};
exports.TopicsApiFactory = TopicsApiFactory;
/**
 * TopicsApi - object-oriented interface
 * @export
 * @class TopicsApi
 * @extends {BaseAPI}
 */
class TopicsApi extends base_1.BaseAPI {
    /**
     * Creates a new topic for Kafka.
     * @summary Creates a new topic
     * @param {NewTopicInput} newTopicInput Topic to create.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    createTopic(newTopicInput, options) {
        return (0, exports.TopicsApiFp)(this.configuration).createTopic(newTopicInput, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Deletes the topic with the specified name.
     * @summary Deletes a topic
     * @param {string} topicName Name of the topic to delete
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    deleteTopic(topicName, options) {
        return (0, exports.TopicsApiFp)(this.configuration).deleteTopic(topicName, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Topic
     * @summary Retrieves a single topic
     * @param {string} topicName Name of the topic to describe
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    getTopic(topicName, options) {
        return (0, exports.TopicsApiFp)(this.configuration).getTopic(topicName, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.
     * @summary Retrieves a list of topics
     * @param {number} [offset] Offset of the first record to return, zero-based
     * @param {number} [limit] Maximum number of records to return
     * @param {number} [size] Number of records per page
     * @param {string} [filter] Filter to apply when returning the list of topics
     * @param {number} [page] Page number
     * @param {SortDirection} [order] Order items are sorted
     * @param {TopicOrderKey} [orderKey] Order key to sort the topics by.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    getTopics(offset, limit, size, filter, page, order, orderKey, options) {
        return (0, exports.TopicsApiFp)(this.configuration).getTopics(offset, limit, size, filter, page, order, orderKey, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Update the configuration settings for a topic.
     * @summary Updates a single topic
     * @param {string} topicName Name of the topic to update
     * @param {TopicSettings} topicSettings
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    updateTopic(topicName, topicSettings, options) {
        return (0, exports.TopicsApiFp)(this.configuration).updateTopic(topicName, topicSettings, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.TopicsApi = TopicsApi;
