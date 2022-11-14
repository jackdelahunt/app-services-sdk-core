/*
 * Red Hat Openshift SmartEvents Fleet Manager
 *
 * The API exposed by the fleet manager of the SmartEvents service.
 *
 * API version: 0.0.1
 * Contact: openbridge-dev@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package smarteventsmgmtclient

import (
	"bytes"
	_context "context"
	_ioutil "io/ioutil"
	_nethttp "net/http"
	_neturl "net/url"
	"strings"
)

// Linger please
var (
	_ _context.Context
)

type CloudProvidersApi interface {

	/*
	 * CloudProviderAPIGetCloudProvider Get Cloud Provider.
	 * Get details of the Cloud Provider specified by id.
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @param id
	 * @return ApiCloudProviderAPIGetCloudProviderRequest
	 */
	CloudProviderAPIGetCloudProvider(ctx _context.Context, id string) ApiCloudProviderAPIGetCloudProviderRequest

	/*
	 * CloudProviderAPIGetCloudProviderExecute executes the request
	 * @return CloudProviderListResponse
	 */
	CloudProviderAPIGetCloudProviderExecute(r ApiCloudProviderAPIGetCloudProviderRequest) (CloudProviderListResponse, *_nethttp.Response, error)

	/*
	 * CloudProviderAPIListCloudProviderRegions List Supported Cloud Regions.
	 * Returns the list of supported Regions of the specified Cloud Provider.
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @param id
	 * @return ApiCloudProviderAPIListCloudProviderRegionsRequest
	 */
	CloudProviderAPIListCloudProviderRegions(ctx _context.Context, id string) ApiCloudProviderAPIListCloudProviderRegionsRequest

	/*
	 * CloudProviderAPIListCloudProviderRegionsExecute executes the request
	 * @return CloudRegionListResponse
	 */
	CloudProviderAPIListCloudProviderRegionsExecute(r ApiCloudProviderAPIListCloudProviderRegionsRequest) (CloudRegionListResponse, *_nethttp.Response, error)

	/*
	 * CloudProviderAPIListCloudProviders List Supported Cloud Providers.
	 * Returns the list of supported Cloud Providers.
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiCloudProviderAPIListCloudProvidersRequest
	 */
	CloudProviderAPIListCloudProviders(ctx _context.Context) ApiCloudProviderAPIListCloudProvidersRequest

	/*
	 * CloudProviderAPIListCloudProvidersExecute executes the request
	 * @return CloudProviderListResponse
	 */
	CloudProviderAPIListCloudProvidersExecute(r ApiCloudProviderAPIListCloudProvidersRequest) (CloudProviderListResponse, *_nethttp.Response, error)
}

// CloudProvidersApiService CloudProvidersApi service
type CloudProvidersApiService service

type ApiCloudProviderAPIGetCloudProviderRequest struct {
	ctx _context.Context
	ApiService CloudProvidersApi
	id string
}


func (r ApiCloudProviderAPIGetCloudProviderRequest) Execute() (CloudProviderListResponse, *_nethttp.Response, error) {
	return r.ApiService.CloudProviderAPIGetCloudProviderExecute(r)
}

/*
 * CloudProviderAPIGetCloudProvider Get Cloud Provider.
 * Get details of the Cloud Provider specified by id.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id
 * @return ApiCloudProviderAPIGetCloudProviderRequest
 */
func (a *CloudProvidersApiService) CloudProviderAPIGetCloudProvider(ctx _context.Context, id string) ApiCloudProviderAPIGetCloudProviderRequest {
	return ApiCloudProviderAPIGetCloudProviderRequest{
		ApiService: a,
		ctx: ctx,
		id: id,
	}
}

/*
 * Execute executes the request
 * @return CloudProviderListResponse
 */
func (a *CloudProvidersApiService) CloudProviderAPIGetCloudProviderExecute(r ApiCloudProviderAPIGetCloudProviderRequest) (CloudProviderListResponse, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  CloudProviderListResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CloudProvidersApiService.CloudProviderAPIGetCloudProvider")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/smartevents_mgmt/v1/cloud_providers/{id}"
	localVarPath = strings.Replace(localVarPath, "{"+"id"+"}", _neturl.PathEscape(parameterToString(r.id, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if strlen(r.id) < 1 {
		return localVarReturnValue, nil, reportError("id must have at least 1 elements")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiCloudProviderAPIListCloudProviderRegionsRequest struct {
	ctx _context.Context
	ApiService CloudProvidersApi
	id string
	page *int32
	size *int32
}

func (r ApiCloudProviderAPIListCloudProviderRegionsRequest) Page(page int32) ApiCloudProviderAPIListCloudProviderRegionsRequest {
	r.page = &page
	return r
}
func (r ApiCloudProviderAPIListCloudProviderRegionsRequest) Size(size int32) ApiCloudProviderAPIListCloudProviderRegionsRequest {
	r.size = &size
	return r
}

func (r ApiCloudProviderAPIListCloudProviderRegionsRequest) Execute() (CloudRegionListResponse, *_nethttp.Response, error) {
	return r.ApiService.CloudProviderAPIListCloudProviderRegionsExecute(r)
}

/*
 * CloudProviderAPIListCloudProviderRegions List Supported Cloud Regions.
 * Returns the list of supported Regions of the specified Cloud Provider.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id
 * @return ApiCloudProviderAPIListCloudProviderRegionsRequest
 */
func (a *CloudProvidersApiService) CloudProviderAPIListCloudProviderRegions(ctx _context.Context, id string) ApiCloudProviderAPIListCloudProviderRegionsRequest {
	return ApiCloudProviderAPIListCloudProviderRegionsRequest{
		ApiService: a,
		ctx: ctx,
		id: id,
	}
}

/*
 * Execute executes the request
 * @return CloudRegionListResponse
 */
func (a *CloudProvidersApiService) CloudProviderAPIListCloudProviderRegionsExecute(r ApiCloudProviderAPIListCloudProviderRegionsRequest) (CloudRegionListResponse, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  CloudRegionListResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CloudProvidersApiService.CloudProviderAPIListCloudProviderRegions")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/smartevents_mgmt/v1/cloud_providers/{id}/regions"
	localVarPath = strings.Replace(localVarPath, "{"+"id"+"}", _neturl.PathEscape(parameterToString(r.id, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if strlen(r.id) < 1 {
		return localVarReturnValue, nil, reportError("id must have at least 1 elements")
	}

	if r.page != nil {
		localVarQueryParams.Add("page", parameterToString(*r.page, ""))
	}
	if r.size != nil {
		localVarQueryParams.Add("size", parameterToString(*r.size, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiCloudProviderAPIListCloudProvidersRequest struct {
	ctx _context.Context
	ApiService CloudProvidersApi
	page *int32
	size *int32
}

func (r ApiCloudProviderAPIListCloudProvidersRequest) Page(page int32) ApiCloudProviderAPIListCloudProvidersRequest {
	r.page = &page
	return r
}
func (r ApiCloudProviderAPIListCloudProvidersRequest) Size(size int32) ApiCloudProviderAPIListCloudProvidersRequest {
	r.size = &size
	return r
}

func (r ApiCloudProviderAPIListCloudProvidersRequest) Execute() (CloudProviderListResponse, *_nethttp.Response, error) {
	return r.ApiService.CloudProviderAPIListCloudProvidersExecute(r)
}

/*
 * CloudProviderAPIListCloudProviders List Supported Cloud Providers.
 * Returns the list of supported Cloud Providers.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiCloudProviderAPIListCloudProvidersRequest
 */
func (a *CloudProvidersApiService) CloudProviderAPIListCloudProviders(ctx _context.Context) ApiCloudProviderAPIListCloudProvidersRequest {
	return ApiCloudProviderAPIListCloudProvidersRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return CloudProviderListResponse
 */
func (a *CloudProvidersApiService) CloudProviderAPIListCloudProvidersExecute(r ApiCloudProviderAPIListCloudProvidersRequest) (CloudProviderListResponse, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  CloudProviderListResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CloudProvidersApiService.CloudProviderAPIListCloudProviders")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/smartevents_mgmt/v1/cloud_providers"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if r.page != nil {
		localVarQueryParams.Add("page", parameterToString(*r.page, ""))
	}
	if r.size != nil {
		localVarQueryParams.Add("size", parameterToString(*r.size, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v ErrorsList
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
