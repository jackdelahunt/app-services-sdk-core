/*
 * Kafka Instance API
 *
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * API version: 0.13.1-SNAPSHOT
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package kafkainstanceclient

import (
	"bytes"
	_context "context"
	_ioutil "io/ioutil"
	_nethttp "net/http"
	_neturl "net/url"
)

// Linger please
var (
	_ _context.Context
)

type AclsApi interface {

	/*
	 * CreateAcl Create ACL binding
	 * Creates a new ACL binding for a Kafka instance.
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiCreateAclRequest
	 */
	CreateAcl(ctx _context.Context) ApiCreateAclRequest

	/*
	 * CreateAclExecute executes the request
	 */
	CreateAclExecute(r ApiCreateAclRequest) (*_nethttp.Response, error)

	/*
	 * DeleteAcls Delete ACL bindings
	 * Deletes ACL bindings that match the query parameters.
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiDeleteAclsRequest
	 */
	DeleteAcls(ctx _context.Context) ApiDeleteAclsRequest

	/*
	 * DeleteAclsExecute executes the request
	 * @return AclBindingListPage
	 */
	DeleteAclsExecute(r ApiDeleteAclsRequest) (AclBindingListPage, *_nethttp.Response, error)

	/*
	 * GetAclResourceOperations Retrieve allowed ACL resources and operations
	 * Retrieve the resources and associated operations that may have ACLs configured.
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiGetAclResourceOperationsRequest
	 */
	GetAclResourceOperations(ctx _context.Context) ApiGetAclResourceOperationsRequest

	/*
	 * GetAclResourceOperationsExecute executes the request
	 * @return map[string][]string
	 */
	GetAclResourceOperationsExecute(r ApiGetAclResourceOperationsRequest) (map[string][]string, *_nethttp.Response, error)

	/*
	 * GetAcls List ACL bindings
	 * Returns a list of all of the available ACL bindings, or the list of bindings that meet the user's URL query parameters. If no parameters are specified, all ACL bindings known to the system will be returned (with paging).
	 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	 * @return ApiGetAclsRequest
	 */
	GetAcls(ctx _context.Context) ApiGetAclsRequest

	/*
	 * GetAclsExecute executes the request
	 * @return AclBindingListPage
	 */
	GetAclsExecute(r ApiGetAclsRequest) (AclBindingListPage, *_nethttp.Response, error)
}

// AclsApiService AclsApi service
type AclsApiService service

type ApiCreateAclRequest struct {
	ctx _context.Context
	ApiService AclsApi
	aclBinding *AclBinding
}

func (r ApiCreateAclRequest) AclBinding(aclBinding AclBinding) ApiCreateAclRequest {
	r.aclBinding = &aclBinding
	return r
}

func (r ApiCreateAclRequest) Execute() (*_nethttp.Response, error) {
	return r.ApiService.CreateAclExecute(r)
}

/*
 * CreateAcl Create ACL binding
 * Creates a new ACL binding for a Kafka instance.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiCreateAclRequest
 */
func (a *AclsApiService) CreateAcl(ctx _context.Context) ApiCreateAclRequest {
	return ApiCreateAclRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 */
func (a *AclsApiService) CreateAclExecute(r ApiCreateAclRequest) (*_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPost
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AclsApiService.CreateAcl")
	if err != nil {
		return nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/acls"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if r.aclBinding == nil {
		return nil, reportError("aclBinding is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

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
	// body params
	localVarPostBody = r.aclBinding
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 401 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 503 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiDeleteAclsRequest struct {
	ctx _context.Context
	ApiService AclsApi
	resourceType *AclResourceTypeFilter
	resourceName *string
	patternType *AclPatternTypeFilter
	principal *string
	operation *AclOperationFilter
	permission *AclPermissionTypeFilter
}

func (r ApiDeleteAclsRequest) ResourceType(resourceType AclResourceTypeFilter) ApiDeleteAclsRequest {
	r.resourceType = &resourceType
	return r
}
func (r ApiDeleteAclsRequest) ResourceName(resourceName string) ApiDeleteAclsRequest {
	r.resourceName = &resourceName
	return r
}
func (r ApiDeleteAclsRequest) PatternType(patternType AclPatternTypeFilter) ApiDeleteAclsRequest {
	r.patternType = &patternType
	return r
}
func (r ApiDeleteAclsRequest) Principal(principal string) ApiDeleteAclsRequest {
	r.principal = &principal
	return r
}
func (r ApiDeleteAclsRequest) Operation(operation AclOperationFilter) ApiDeleteAclsRequest {
	r.operation = &operation
	return r
}
func (r ApiDeleteAclsRequest) Permission(permission AclPermissionTypeFilter) ApiDeleteAclsRequest {
	r.permission = &permission
	return r
}

func (r ApiDeleteAclsRequest) Execute() (AclBindingListPage, *_nethttp.Response, error) {
	return r.ApiService.DeleteAclsExecute(r)
}

/*
 * DeleteAcls Delete ACL bindings
 * Deletes ACL bindings that match the query parameters.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiDeleteAclsRequest
 */
func (a *AclsApiService) DeleteAcls(ctx _context.Context) ApiDeleteAclsRequest {
	return ApiDeleteAclsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return AclBindingListPage
 */
func (a *AclsApiService) DeleteAclsExecute(r ApiDeleteAclsRequest) (AclBindingListPage, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodDelete
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  AclBindingListPage
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AclsApiService.DeleteAcls")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/acls"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if r.resourceType != nil {
		localVarQueryParams.Add("resourceType", parameterToString(*r.resourceType, ""))
	}
	if r.resourceName != nil {
		localVarQueryParams.Add("resourceName", parameterToString(*r.resourceName, ""))
	}
	if r.patternType != nil {
		localVarQueryParams.Add("patternType", parameterToString(*r.patternType, ""))
	}
	if r.principal != nil {
		localVarQueryParams.Add("principal", parameterToString(*r.principal, ""))
	}
	if r.operation != nil {
		localVarQueryParams.Add("operation", parameterToString(*r.operation, ""))
	}
	if r.permission != nil {
		localVarQueryParams.Add("permission", parameterToString(*r.permission, ""))
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
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
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
		if localVarHTTPResponse.StatusCode == 403 {
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
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 503 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
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

type ApiGetAclResourceOperationsRequest struct {
	ctx _context.Context
	ApiService AclsApi
}


func (r ApiGetAclResourceOperationsRequest) Execute() (map[string][]string, *_nethttp.Response, error) {
	return r.ApiService.GetAclResourceOperationsExecute(r)
}

/*
 * GetAclResourceOperations Retrieve allowed ACL resources and operations
 * Retrieve the resources and associated operations that may have ACLs configured.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiGetAclResourceOperationsRequest
 */
func (a *AclsApiService) GetAclResourceOperations(ctx _context.Context) ApiGetAclResourceOperationsRequest {
	return ApiGetAclResourceOperationsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return map[string][]string
 */
func (a *AclsApiService) GetAclResourceOperationsExecute(r ApiGetAclResourceOperationsRequest) (map[string][]string, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  map[string][]string
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AclsApiService.GetAclResourceOperations")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/acls/resource-operations"

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

type ApiGetAclsRequest struct {
	ctx _context.Context
	ApiService AclsApi
	resourceType *AclResourceTypeFilter
	resourceName *string
	patternType *AclPatternTypeFilter
	principal *string
	operation *AclOperationFilter
	permission *AclPermissionTypeFilter
	page *int32
	size *int32
	order *SortDirection
	orderKey *AclBindingOrderKey
}

func (r ApiGetAclsRequest) ResourceType(resourceType AclResourceTypeFilter) ApiGetAclsRequest {
	r.resourceType = &resourceType
	return r
}
func (r ApiGetAclsRequest) ResourceName(resourceName string) ApiGetAclsRequest {
	r.resourceName = &resourceName
	return r
}
func (r ApiGetAclsRequest) PatternType(patternType AclPatternTypeFilter) ApiGetAclsRequest {
	r.patternType = &patternType
	return r
}
func (r ApiGetAclsRequest) Principal(principal string) ApiGetAclsRequest {
	r.principal = &principal
	return r
}
func (r ApiGetAclsRequest) Operation(operation AclOperationFilter) ApiGetAclsRequest {
	r.operation = &operation
	return r
}
func (r ApiGetAclsRequest) Permission(permission AclPermissionTypeFilter) ApiGetAclsRequest {
	r.permission = &permission
	return r
}
func (r ApiGetAclsRequest) Page(page int32) ApiGetAclsRequest {
	r.page = &page
	return r
}
func (r ApiGetAclsRequest) Size(size int32) ApiGetAclsRequest {
	r.size = &size
	return r
}
func (r ApiGetAclsRequest) Order(order SortDirection) ApiGetAclsRequest {
	r.order = &order
	return r
}
func (r ApiGetAclsRequest) OrderKey(orderKey AclBindingOrderKey) ApiGetAclsRequest {
	r.orderKey = &orderKey
	return r
}

func (r ApiGetAclsRequest) Execute() (AclBindingListPage, *_nethttp.Response, error) {
	return r.ApiService.GetAclsExecute(r)
}

/*
 * GetAcls List ACL bindings
 * Returns a list of all of the available ACL bindings, or the list of bindings that meet the user's URL query parameters. If no parameters are specified, all ACL bindings known to the system will be returned (with paging).
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiGetAclsRequest
 */
func (a *AclsApiService) GetAcls(ctx _context.Context) ApiGetAclsRequest {
	return ApiGetAclsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return AclBindingListPage
 */
func (a *AclsApiService) GetAclsExecute(r ApiGetAclsRequest) (AclBindingListPage, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  AclBindingListPage
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AclsApiService.GetAcls")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/acls"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if r.resourceType != nil {
		localVarQueryParams.Add("resourceType", parameterToString(*r.resourceType, ""))
	}
	if r.resourceName != nil {
		localVarQueryParams.Add("resourceName", parameterToString(*r.resourceName, ""))
	}
	if r.patternType != nil {
		localVarQueryParams.Add("patternType", parameterToString(*r.patternType, ""))
	}
	if r.principal != nil {
		localVarQueryParams.Add("principal", parameterToString(*r.principal, ""))
	}
	if r.operation != nil {
		localVarQueryParams.Add("operation", parameterToString(*r.operation, ""))
	}
	if r.permission != nil {
		localVarQueryParams.Add("permission", parameterToString(*r.permission, ""))
	}
	if r.page != nil {
		localVarQueryParams.Add("page", parameterToString(*r.page, ""))
	}
	if r.size != nil {
		localVarQueryParams.Add("size", parameterToString(*r.size, ""))
	}
	if r.order != nil {
		localVarQueryParams.Add("order", parameterToString(*r.order, ""))
	}
	if r.orderKey != nil {
		localVarQueryParams.Add("orderKey", parameterToString(*r.orderKey, ""))
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
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
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
		if localVarHTTPResponse.StatusCode == 403 {
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
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 503 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
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
