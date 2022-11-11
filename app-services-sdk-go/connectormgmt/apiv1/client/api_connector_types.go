/*
 * Connector Management API
 *
 * Connector Management API is a REST API to manage connectors.
 *
 * API version: 0.1.0
 * Contact: rhosak-support@redhat.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package connectormgmtclient

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

type ConnectorTypesApi interface {

	/*
	 * GetConnectorTypeByID Get a connector type by id
	 * Get a connector type by id
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @param connectorTypeId The id of the connector type
	 * @return ApiGetConnectorTypeByIDRequest
	 */
	GetConnectorTypeByID(ctx _context.Context, connectorTypeId string) ApiGetConnectorTypeByIDRequest

	/*
	 * GetConnectorTypeByIDExecute executes the request
	 * @return ConnectorType
	 */
	GetConnectorTypeByIDExecute(r ApiGetConnectorTypeByIDRequest) (ConnectorType, *_nethttp.Response, error)

	/*
	 * GetConnectorTypeLabels Returns a list of connector type labels
	 * Returns a list of connector type labels
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiGetConnectorTypeLabelsRequest
	 */
	GetConnectorTypeLabels(ctx _context.Context) ApiGetConnectorTypeLabelsRequest

	/*
	 * GetConnectorTypeLabelsExecute executes the request
	 * @return ConnectorTypeLabelCountList
	 */
	GetConnectorTypeLabelsExecute(r ApiGetConnectorTypeLabelsRequest) (ConnectorTypeLabelCountList, *_nethttp.Response, error)

	/*
	 * GetConnectorTypes Returns a list of connector types
	 * Returns a list of connector types
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiGetConnectorTypesRequest
	 */
	GetConnectorTypes(ctx _context.Context) ApiGetConnectorTypesRequest

	/*
	 * GetConnectorTypesExecute executes the request
	 * @return ConnectorTypeList
	 */
	GetConnectorTypesExecute(r ApiGetConnectorTypesRequest) (ConnectorTypeList, *_nethttp.Response, error)
}

// ConnectorTypesApiService ConnectorTypesApi service
type ConnectorTypesApiService service

type ApiGetConnectorTypeByIDRequest struct {
	ctx _context.Context
	ApiService ConnectorTypesApi
	connectorTypeId string
}


func (r ApiGetConnectorTypeByIDRequest) Execute() (ConnectorType, *_nethttp.Response, error) {
	return r.ApiService.GetConnectorTypeByIDExecute(r)
}

/*
 * GetConnectorTypeByID Get a connector type by id
 * Get a connector type by id
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param connectorTypeId The id of the connector type
 * @return ApiGetConnectorTypeByIDRequest
 */
func (a *ConnectorTypesApiService) GetConnectorTypeByID(ctx _context.Context, connectorTypeId string) ApiGetConnectorTypeByIDRequest {
	return ApiGetConnectorTypeByIDRequest{
		ApiService: a,
		ctx: ctx,
		connectorTypeId: connectorTypeId,
	}
}

/*
 * Execute executes the request
 * @return ConnectorType
 */
func (a *ConnectorTypesApiService) GetConnectorTypeByIDExecute(r ApiGetConnectorTypeByIDRequest) (ConnectorType, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  ConnectorType
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ConnectorTypesApiService.GetConnectorTypeByID")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/connector_mgmt/v1/kafka_connector_types/{connector_type_id}"
	localVarPath = strings.Replace(localVarPath, "{"+"connector_type_id"+"}", _neturl.PathEscape(parameterToString(r.connectorTypeId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

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
		if localVarHTTPResponse.StatusCode == 401 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 410 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v Error
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

type ApiGetConnectorTypeLabelsRequest struct {
	ctx _context.Context
	ApiService ConnectorTypesApi
	orderBy *string
	search *string
}

func (r ApiGetConnectorTypeLabelsRequest) OrderBy(orderBy string) ApiGetConnectorTypeLabelsRequest {
	r.orderBy = &orderBy
	return r
}
func (r ApiGetConnectorTypeLabelsRequest) Search(search string) ApiGetConnectorTypeLabelsRequest {
	r.search = &search
	return r
}

func (r ApiGetConnectorTypeLabelsRequest) Execute() (ConnectorTypeLabelCountList, *_nethttp.Response, error) {
	return r.ApiService.GetConnectorTypeLabelsExecute(r)
}

/*
 * GetConnectorTypeLabels Returns a list of connector type labels
 * Returns a list of connector type labels
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiGetConnectorTypeLabelsRequest
 */
func (a *ConnectorTypesApiService) GetConnectorTypeLabels(ctx _context.Context) ApiGetConnectorTypeLabelsRequest {
	return ApiGetConnectorTypeLabelsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return ConnectorTypeLabelCountList
 */
func (a *ConnectorTypesApiService) GetConnectorTypeLabelsExecute(r ApiGetConnectorTypeLabelsRequest) (ConnectorTypeLabelCountList, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  ConnectorTypeLabelCountList
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ConnectorTypesApiService.GetConnectorTypeLabels")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/connector_mgmt/v1/kafka_connector_types/labels"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if r.orderBy != nil {
		localVarQueryParams.Add("orderBy", parameterToString(*r.orderBy, ""))
	}
	if r.search != nil {
		localVarQueryParams.Add("search", parameterToString(*r.search, ""))
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
		if localVarHTTPResponse.StatusCode == 401 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v Error
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

type ApiGetConnectorTypesRequest struct {
	ctx _context.Context
	ApiService ConnectorTypesApi
	page *string
	size *string
	orderBy *string
	search *string
}

func (r ApiGetConnectorTypesRequest) Page(page string) ApiGetConnectorTypesRequest {
	r.page = &page
	return r
}
func (r ApiGetConnectorTypesRequest) Size(size string) ApiGetConnectorTypesRequest {
	r.size = &size
	return r
}
func (r ApiGetConnectorTypesRequest) OrderBy(orderBy string) ApiGetConnectorTypesRequest {
	r.orderBy = &orderBy
	return r
}
func (r ApiGetConnectorTypesRequest) Search(search string) ApiGetConnectorTypesRequest {
	r.search = &search
	return r
}

func (r ApiGetConnectorTypesRequest) Execute() (ConnectorTypeList, *_nethttp.Response, error) {
	return r.ApiService.GetConnectorTypesExecute(r)
}

/*
 * GetConnectorTypes Returns a list of connector types
 * Returns a list of connector types
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiGetConnectorTypesRequest
 */
func (a *ConnectorTypesApiService) GetConnectorTypes(ctx _context.Context) ApiGetConnectorTypesRequest {
	return ApiGetConnectorTypesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return ConnectorTypeList
 */
func (a *ConnectorTypesApiService) GetConnectorTypesExecute(r ApiGetConnectorTypesRequest) (ConnectorTypeList, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  ConnectorTypeList
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ConnectorTypesApiService.GetConnectorTypes")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/connector_mgmt/v1/kafka_connector_types"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if r.page != nil {
		localVarQueryParams.Add("page", parameterToString(*r.page, ""))
	}
	if r.size != nil {
		localVarQueryParams.Add("size", parameterToString(*r.size, ""))
	}
	if r.orderBy != nil {
		localVarQueryParams.Add("orderBy", parameterToString(*r.orderBy, ""))
	}
	if r.search != nil {
		localVarQueryParams.Add("search", parameterToString(*r.search, ""))
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
		if localVarHTTPResponse.StatusCode == 401 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v Error
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
