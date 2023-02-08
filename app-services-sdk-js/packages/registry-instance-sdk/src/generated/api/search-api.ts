/* tslint:disable */
/* eslint-disable */
/**
 * Apicurio Registry API [v2]
 * Apicurio Registry is a datastore for standard event schemas and API designs. Apicurio Registry enables developers to manage and share the structure of their data using a REST interface. For example, client applications can dynamically push or pull the latest updates to or from the registry without needing to redeploy. Apicurio Registry also enables developers to create rules that govern how registry content can evolve over time. For example, this includes rules for content validation and version compatibility.  The Apicurio Registry REST API enables client applications to manage the artifacts in the registry. This API provides create, read, update, and delete operations for schema and API artifacts, rules, versions, and metadata.   The supported artifact types include: - Apache Avro schema - AsyncAPI specification - Google protocol buffers - GraphQL schema - JSON Schema - Kafka Connect schema - OpenAPI specification - Web Services Description Language - XML Schema Definition   **Important**: The Apicurio Registry REST API is available from `https://MY-REGISTRY-URL/apis/registry/v2` by default. Therefore you must prefix all API operation paths with `../apis/registry/v2` in this case. For example: `../apis/registry/v2/ids/globalIds/{globalId}`. 
 *
 * The version of the OpenAPI document: 2.2.5.Final
 * Contact: apicurio@lists.jboss.org
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
import { ArtifactSearchResults } from '../model';
// @ts-ignore
import { ArtifactType } from '../model';
// @ts-ignore
import { SortBy } from '../model';
// @ts-ignore
import { SortOrder } from '../model';
/**
 * SearchApi - axios parameter creator
 * @export
 */
export const SearchApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Returns a paginated list of all artifacts that match the provided filter criteria. 
         * @summary Search for artifacts
         * @param {string} [name] Filter by artifact name.
         * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
         * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
         * @param {SortOrder} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
         * @param {SortBy} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
         * @param {Array<string>} [labels] Filter by label.  Include one or more label to only return artifacts containing all of the specified labels.
         * @param {Array<string>} [properties] Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;.
         * @param {string} [description] Filter by description.
         * @param {string} [group] Filter by artifact group.
         * @param {number} [globalId] Filter by globalId.
         * @param {number} [contentId] Filter by contentId.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        searchArtifacts: async (name?: string, offset?: number, limit?: number, order?: SortOrder, orderby?: SortBy, labels?: Array<string>, properties?: Array<string>, description?: string, group?: string, globalId?: number, contentId?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/search/artifacts`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (name !== undefined) {
                localVarQueryParameter['name'] = name;
            }

            if (offset !== undefined) {
                localVarQueryParameter['offset'] = offset;
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = limit;
            }

            if (order !== undefined) {
                localVarQueryParameter['order'] = order;
            }

            if (orderby !== undefined) {
                localVarQueryParameter['orderby'] = orderby;
            }

            if (labels) {
                localVarQueryParameter['labels'] = labels;
            }

            if (properties) {
                localVarQueryParameter['properties'] = properties;
            }

            if (description !== undefined) {
                localVarQueryParameter['description'] = description;
            }

            if (group !== undefined) {
                localVarQueryParameter['group'] = group;
            }

            if (globalId !== undefined) {
                localVarQueryParameter['globalId'] = globalId;
            }

            if (contentId !== undefined) {
                localVarQueryParameter['contentId'] = contentId;
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
         * Returns a paginated list of all artifacts with at least one version that matches the posted content. 
         * @summary Search for artifacts by content
         * @param {File} body The content to search for.
         * @param {boolean} [canonical] Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter.
         * @param {ArtifactType} [artifactType] Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts.
         * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
         * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
         * @param {'asc' | 'desc'} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
         * @param {'name' | 'createdOn'} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        searchArtifactsByContent: async (body: File, canonical?: boolean, artifactType?: ArtifactType, offset?: number, limit?: number, order?: 'asc' | 'desc', orderby?: 'name' | 'createdOn', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'body' is not null or undefined
            assertParamExists('searchArtifactsByContent', 'body', body)
            const localVarPath = `/search/artifacts`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (canonical !== undefined) {
                localVarQueryParameter['canonical'] = canonical;
            }

            if (artifactType !== undefined) {
                localVarQueryParameter['artifactType'] = artifactType;
            }

            if (offset !== undefined) {
                localVarQueryParameter['offset'] = offset;
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = limit;
            }

            if (order !== undefined) {
                localVarQueryParameter['order'] = order;
            }

            if (orderby !== undefined) {
                localVarQueryParameter['orderby'] = orderby;
            }


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(body, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * SearchApi - functional programming interface
 * @export
 */
export const SearchApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = SearchApiAxiosParamCreator(configuration)
    return {
        /**
         * Returns a paginated list of all artifacts that match the provided filter criteria. 
         * @summary Search for artifacts
         * @param {string} [name] Filter by artifact name.
         * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
         * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
         * @param {SortOrder} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
         * @param {SortBy} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
         * @param {Array<string>} [labels] Filter by label.  Include one or more label to only return artifacts containing all of the specified labels.
         * @param {Array<string>} [properties] Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;.
         * @param {string} [description] Filter by description.
         * @param {string} [group] Filter by artifact group.
         * @param {number} [globalId] Filter by globalId.
         * @param {number} [contentId] Filter by contentId.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async searchArtifacts(name?: string, offset?: number, limit?: number, order?: SortOrder, orderby?: SortBy, labels?: Array<string>, properties?: Array<string>, description?: string, group?: string, globalId?: number, contentId?: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ArtifactSearchResults>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.searchArtifacts(name, offset, limit, order, orderby, labels, properties, description, group, globalId, contentId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Returns a paginated list of all artifacts with at least one version that matches the posted content. 
         * @summary Search for artifacts by content
         * @param {File} body The content to search for.
         * @param {boolean} [canonical] Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter.
         * @param {ArtifactType} [artifactType] Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts.
         * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
         * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
         * @param {'asc' | 'desc'} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
         * @param {'name' | 'createdOn'} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async searchArtifactsByContent(body: File, canonical?: boolean, artifactType?: ArtifactType, offset?: number, limit?: number, order?: 'asc' | 'desc', orderby?: 'name' | 'createdOn', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ArtifactSearchResults>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.searchArtifactsByContent(body, canonical, artifactType, offset, limit, order, orderby, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * SearchApi - factory interface
 * @export
 */
export const SearchApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = SearchApiFp(configuration)
    return {
        /**
         * Returns a paginated list of all artifacts that match the provided filter criteria. 
         * @summary Search for artifacts
         * @param {string} [name] Filter by artifact name.
         * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
         * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
         * @param {SortOrder} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
         * @param {SortBy} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
         * @param {Array<string>} [labels] Filter by label.  Include one or more label to only return artifacts containing all of the specified labels.
         * @param {Array<string>} [properties] Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;.
         * @param {string} [description] Filter by description.
         * @param {string} [group] Filter by artifact group.
         * @param {number} [globalId] Filter by globalId.
         * @param {number} [contentId] Filter by contentId.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        searchArtifacts(name?: string, offset?: number, limit?: number, order?: SortOrder, orderby?: SortBy, labels?: Array<string>, properties?: Array<string>, description?: string, group?: string, globalId?: number, contentId?: number, options?: any): AxiosPromise<ArtifactSearchResults> {
            return localVarFp.searchArtifacts(name, offset, limit, order, orderby, labels, properties, description, group, globalId, contentId, options).then((request) => request(axios, basePath));
        },
        /**
         * Returns a paginated list of all artifacts with at least one version that matches the posted content. 
         * @summary Search for artifacts by content
         * @param {File} body The content to search for.
         * @param {boolean} [canonical] Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter.
         * @param {ArtifactType} [artifactType] Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts.
         * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
         * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
         * @param {'asc' | 'desc'} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
         * @param {'name' | 'createdOn'} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        searchArtifactsByContent(body: File, canonical?: boolean, artifactType?: ArtifactType, offset?: number, limit?: number, order?: 'asc' | 'desc', orderby?: 'name' | 'createdOn', options?: any): AxiosPromise<ArtifactSearchResults> {
            return localVarFp.searchArtifactsByContent(body, canonical, artifactType, offset, limit, order, orderby, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * SearchApi - interface
 * @export
 * @interface SearchApi
 */
export interface SearchApiInterface {
    /**
     * Returns a paginated list of all artifacts that match the provided filter criteria. 
     * @summary Search for artifacts
     * @param {string} [name] Filter by artifact name.
     * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
     * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
     * @param {SortOrder} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
     * @param {SortBy} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
     * @param {Array<string>} [labels] Filter by label.  Include one or more label to only return artifacts containing all of the specified labels.
     * @param {Array<string>} [properties] Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;.
     * @param {string} [description] Filter by description.
     * @param {string} [group] Filter by artifact group.
     * @param {number} [globalId] Filter by globalId.
     * @param {number} [contentId] Filter by contentId.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SearchApiInterface
     */
    searchArtifacts(name?: string, offset?: number, limit?: number, order?: SortOrder, orderby?: SortBy, labels?: Array<string>, properties?: Array<string>, description?: string, group?: string, globalId?: number, contentId?: number, options?: AxiosRequestConfig): AxiosPromise<ArtifactSearchResults>;

    /**
     * Returns a paginated list of all artifacts with at least one version that matches the posted content. 
     * @summary Search for artifacts by content
     * @param {File} body The content to search for.
     * @param {boolean} [canonical] Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter.
     * @param {ArtifactType} [artifactType] Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts.
     * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
     * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
     * @param {'asc' | 'desc'} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
     * @param {'name' | 'createdOn'} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SearchApiInterface
     */
    searchArtifactsByContent(body: File, canonical?: boolean, artifactType?: ArtifactType, offset?: number, limit?: number, order?: 'asc' | 'desc', orderby?: 'name' | 'createdOn', options?: AxiosRequestConfig): AxiosPromise<ArtifactSearchResults>;

}

/**
 * SearchApi - object-oriented interface
 * @export
 * @class SearchApi
 * @extends {BaseAPI}
 */
export class SearchApi extends BaseAPI implements SearchApiInterface {
    /**
     * Returns a paginated list of all artifacts that match the provided filter criteria. 
     * @summary Search for artifacts
     * @param {string} [name] Filter by artifact name.
     * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
     * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
     * @param {SortOrder} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
     * @param {SortBy} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
     * @param {Array<string>} [labels] Filter by label.  Include one or more label to only return artifacts containing all of the specified labels.
     * @param {Array<string>} [properties] Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;.
     * @param {string} [description] Filter by description.
     * @param {string} [group] Filter by artifact group.
     * @param {number} [globalId] Filter by globalId.
     * @param {number} [contentId] Filter by contentId.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SearchApi
     */
    public searchArtifacts(name?: string, offset?: number, limit?: number, order?: SortOrder, orderby?: SortBy, labels?: Array<string>, properties?: Array<string>, description?: string, group?: string, globalId?: number, contentId?: number, options?: AxiosRequestConfig) {
        return SearchApiFp(this.configuration).searchArtifacts(name, offset, limit, order, orderby, labels, properties, description, group, globalId, contentId, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Returns a paginated list of all artifacts with at least one version that matches the posted content. 
     * @summary Search for artifacts by content
     * @param {File} body The content to search for.
     * @param {boolean} [canonical] Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter.
     * @param {ArtifactType} [artifactType] Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts.
     * @param {number} [offset] The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
     * @param {number} [limit] The number of artifacts to return.  Defaults to 20.
     * @param {'asc' | 'desc'} [order] Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;).
     * @param {'name' | 'createdOn'} [orderby] The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60; 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SearchApi
     */
    public searchArtifactsByContent(body: File, canonical?: boolean, artifactType?: ArtifactType, offset?: number, limit?: number, order?: 'asc' | 'desc', orderby?: 'name' | 'createdOn', options?: AxiosRequestConfig) {
        return SearchApiFp(this.configuration).searchArtifactsByContent(body, canonical, artifactType, offset, limit, order, orderby, options).then((request) => request(this.axios, this.basePath));
    }
}
