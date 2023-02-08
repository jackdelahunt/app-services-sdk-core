/* tslint:disable */
/* eslint-disable */
/**
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.13.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from '../configuration';
import type { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { NewTopicInput } from '../model';
// @ts-ignore
import { SortDirection } from '../model';
// @ts-ignore
import { Topic } from '../model';
// @ts-ignore
import { TopicOrderKey } from '../model';
// @ts-ignore
import { TopicSettings } from '../model';
// @ts-ignore
import { TopicsList } from '../model';
/**
 * TopicsApi - axios parameter creator
 * @export
 */
export const TopicsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Creates a new topic for Kafka.
         * @summary Creates a new topic
         * @param {NewTopicInput} newTopicInput Topic to create.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTopic: async (newTopicInput: NewTopicInput, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'newTopicInput' is not null or undefined
            assertParamExists('createTopic', 'newTopicInput', newTopicInput)
            const localVarPath = `/api/v1/topics`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

            // authentication OAuth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "OAuth2", [], configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(newTopicInput, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Deletes the topic with the specified name.
         * @summary Deletes a topic
         * @param {string} topicName Name of the topic to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTopic: async (topicName: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'topicName' is not null or undefined
            assertParamExists('deleteTopic', 'topicName', topicName)
            const localVarPath = `/api/v1/topics/{topicName}`
                .replace(`{${"topicName"}}`, encodeURIComponent(String(topicName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

            // authentication OAuth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "OAuth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Topic
         * @summary Retrieves a single topic
         * @param {string} topicName Name of the topic to describe
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopic: async (topicName: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'topicName' is not null or undefined
            assertParamExists('getTopic', 'topicName', topicName)
            const localVarPath = `/api/v1/topics/{topicName}`
                .replace(`{${"topicName"}}`, encodeURIComponent(String(topicName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

            // authentication OAuth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "OAuth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
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
        getTopics: async (offset?: number, limit?: number, size?: number, filter?: string, page?: number, order?: SortDirection, orderKey?: TopicOrderKey, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/topics`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

            // authentication OAuth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "OAuth2", [], configuration)

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


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update the configuration settings for a topic.
         * @summary Updates a single topic
         * @param {string} topicName Name of the topic to update
         * @param {TopicSettings} topicSettings 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateTopic: async (topicName: string, topicSettings: TopicSettings, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'topicName' is not null or undefined
            assertParamExists('updateTopic', 'topicName', topicName)
            // verify required parameter 'topicSettings' is not null or undefined
            assertParamExists('updateTopic', 'topicSettings', topicSettings)
            const localVarPath = `/api/v1/topics/{topicName}`
                .replace(`{${"topicName"}}`, encodeURIComponent(String(topicName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'PATCH', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

            // authentication OAuth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "OAuth2", [], configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(topicSettings, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * TopicsApi - functional programming interface
 * @export
 */
export const TopicsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = TopicsApiAxiosParamCreator(configuration)
    return {
        /**
         * Creates a new topic for Kafka.
         * @summary Creates a new topic
         * @param {NewTopicInput} newTopicInput Topic to create.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createTopic(newTopicInput: NewTopicInput, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Topic>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createTopic(newTopicInput, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Deletes the topic with the specified name.
         * @summary Deletes a topic
         * @param {string} topicName Name of the topic to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteTopic(topicName: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.deleteTopic(topicName, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Topic
         * @summary Retrieves a single topic
         * @param {string} topicName Name of the topic to describe
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getTopic(topicName: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Topic>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getTopic(topicName, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
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
        async getTopics(offset?: number, limit?: number, size?: number, filter?: string, page?: number, order?: SortDirection, orderKey?: TopicOrderKey, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<TopicsList>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getTopics(offset, limit, size, filter, page, order, orderKey, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Update the configuration settings for a topic.
         * @summary Updates a single topic
         * @param {string} topicName Name of the topic to update
         * @param {TopicSettings} topicSettings 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async updateTopic(topicName: string, topicSettings: TopicSettings, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Topic>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.updateTopic(topicName, topicSettings, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * TopicsApi - factory interface
 * @export
 */
export const TopicsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = TopicsApiFp(configuration)
    return {
        /**
         * Creates a new topic for Kafka.
         * @summary Creates a new topic
         * @param {NewTopicInput} newTopicInput Topic to create.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createTopic(newTopicInput: NewTopicInput, options?: any): AxiosPromise<Topic> {
            return localVarFp.createTopic(newTopicInput, options).then((request) => request(axios, basePath));
        },
        /**
         * Deletes the topic with the specified name.
         * @summary Deletes a topic
         * @param {string} topicName Name of the topic to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteTopic(topicName: string, options?: any): AxiosPromise<void> {
            return localVarFp.deleteTopic(topicName, options).then((request) => request(axios, basePath));
        },
        /**
         * Topic
         * @summary Retrieves a single topic
         * @param {string} topicName Name of the topic to describe
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTopic(topicName: string, options?: any): AxiosPromise<Topic> {
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
        getTopics(offset?: number, limit?: number, size?: number, filter?: string, page?: number, order?: SortDirection, orderKey?: TopicOrderKey, options?: any): AxiosPromise<TopicsList> {
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
        updateTopic(topicName: string, topicSettings: TopicSettings, options?: any): AxiosPromise<Topic> {
            return localVarFp.updateTopic(topicName, topicSettings, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * TopicsApi - interface
 * @export
 * @interface TopicsApi
 */
export interface TopicsApiInterface {
    /**
     * Creates a new topic for Kafka.
     * @summary Creates a new topic
     * @param {NewTopicInput} newTopicInput Topic to create.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApiInterface
     */
    createTopic(newTopicInput: NewTopicInput, options?: AxiosRequestConfig): AxiosPromise<Topic>;

    /**
     * Deletes the topic with the specified name.
     * @summary Deletes a topic
     * @param {string} topicName Name of the topic to delete
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApiInterface
     */
    deleteTopic(topicName: string, options?: AxiosRequestConfig): AxiosPromise<void>;

    /**
     * Topic
     * @summary Retrieves a single topic
     * @param {string} topicName Name of the topic to describe
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApiInterface
     */
    getTopic(topicName: string, options?: AxiosRequestConfig): AxiosPromise<Topic>;

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
     * @memberof TopicsApiInterface
     */
    getTopics(offset?: number, limit?: number, size?: number, filter?: string, page?: number, order?: SortDirection, orderKey?: TopicOrderKey, options?: AxiosRequestConfig): AxiosPromise<TopicsList>;

    /**
     * Update the configuration settings for a topic.
     * @summary Updates a single topic
     * @param {string} topicName Name of the topic to update
     * @param {TopicSettings} topicSettings 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApiInterface
     */
    updateTopic(topicName: string, topicSettings: TopicSettings, options?: AxiosRequestConfig): AxiosPromise<Topic>;

}

/**
 * TopicsApi - object-oriented interface
 * @export
 * @class TopicsApi
 * @extends {BaseAPI}
 */
export class TopicsApi extends BaseAPI implements TopicsApiInterface {
    /**
     * Creates a new topic for Kafka.
     * @summary Creates a new topic
     * @param {NewTopicInput} newTopicInput Topic to create.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    public createTopic(newTopicInput: NewTopicInput, options?: AxiosRequestConfig) {
        return TopicsApiFp(this.configuration).createTopic(newTopicInput, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Deletes the topic with the specified name.
     * @summary Deletes a topic
     * @param {string} topicName Name of the topic to delete
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    public deleteTopic(topicName: string, options?: AxiosRequestConfig) {
        return TopicsApiFp(this.configuration).deleteTopic(topicName, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Topic
     * @summary Retrieves a single topic
     * @param {string} topicName Name of the topic to describe
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TopicsApi
     */
    public getTopic(topicName: string, options?: AxiosRequestConfig) {
        return TopicsApiFp(this.configuration).getTopic(topicName, options).then((request) => request(this.axios, this.basePath));
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
    public getTopics(offset?: number, limit?: number, size?: number, filter?: string, page?: number, order?: SortDirection, orderKey?: TopicOrderKey, options?: AxiosRequestConfig) {
        return TopicsApiFp(this.configuration).getTopics(offset, limit, size, filter, page, order, orderKey, options).then((request) => request(this.axios, this.basePath));
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
    public updateTopic(topicName: string, topicSettings: TopicSettings, options?: AxiosRequestConfig) {
        return TopicsApiFp(this.configuration).updateTopic(topicName, topicSettings, options).then((request) => request(this.axios, this.basePath));
    }
}
