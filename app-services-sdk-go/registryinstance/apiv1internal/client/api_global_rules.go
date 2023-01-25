/*
Apicurio Registry API [v2]

Apicurio Registry is a datastore for standard event schemas and API designs. Apicurio Registry enables developers to manage and share the structure of their data using a REST interface. For example, client applications can dynamically push or pull the latest updates to or from the registry without needing to redeploy. Apicurio Registry also enables developers to create rules that govern how registry content can evolve over time. For example, this includes rules for content validation and version compatibility.  The Apicurio Registry REST API enables client applications to manage the artifacts in the registry. This API provides create, read, update, and delete operations for schema and API artifacts, rules, versions, and metadata.   The supported artifact types include: - Apache Avro schema - AsyncAPI specification - Google protocol buffers - GraphQL schema - JSON Schema - Kafka Connect schema - OpenAPI specification - Web Services Description Language - XML Schema Definition   **Important**: The Apicurio Registry REST API is available from `https://MY-REGISTRY-URL/apis/registry/v2` by default. Therefore you must prefix all API operation paths with `../apis/registry/v2` in this case. For example: `../apis/registry/v2/ids/globalIds/{globalId}`. 

API version: 2.2.5.Final
Contact: apicurio@lists.jboss.org
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package registryinstanceclient

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
)


type GlobalRulesApi interface {

	/*
	CreateGlobalRule Create global rule

	Adds a rule to the list of globally configured rules.

This operation can fail for the following reasons:

* The rule type is unknown (HTTP error `400`)
* The rule already exists (HTTP error `409`)
* A server error occurred (HTTP error `500`)


	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return ApiCreateGlobalRuleRequest
	*/
	CreateGlobalRule(ctx context.Context) ApiCreateGlobalRuleRequest

	// CreateGlobalRuleExecute executes the request
	CreateGlobalRuleExecute(r ApiCreateGlobalRuleRequest) (*http.Response, error)

	/*
	DeleteAllGlobalRules Delete all global rules

	Deletes all globally configured rules.

This operation can fail for the following reasons:

* A server error occurred (HTTP error `500`)


	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return ApiDeleteAllGlobalRulesRequest
	*/
	DeleteAllGlobalRules(ctx context.Context) ApiDeleteAllGlobalRulesRequest

	// DeleteAllGlobalRulesExecute executes the request
	DeleteAllGlobalRulesExecute(r ApiDeleteAllGlobalRulesRequest) (*http.Response, error)

	/*
	DeleteGlobalRule Delete global rule

	Deletes a single global rule.  If this is the only rule configured, this is the same
as deleting **all** rules.

This operation can fail for the following reasons:

* Invalid rule name/type (HTTP error `400`)
* No rule with name/type `rule` exists (HTTP error `404`)
* Rule cannot be deleted (HTTP error `409`)
* A server error occurred (HTTP error `500`)


	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@param rule The unique name/type of a rule.
	@return ApiDeleteGlobalRuleRequest
	*/
	DeleteGlobalRule(ctx context.Context, rule RuleType) ApiDeleteGlobalRuleRequest

	// DeleteGlobalRuleExecute executes the request
	DeleteGlobalRuleExecute(r ApiDeleteGlobalRuleRequest) (*http.Response, error)

	/*
	GetGlobalRuleConfig Get global rule configuration

	Returns information about the named globally configured rule.

This operation can fail for the following reasons:

* Invalid rule name/type (HTTP error `400`)
* No rule with name/type `rule` exists (HTTP error `404`)
* A server error occurred (HTTP error `500`)


	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@param rule The unique name/type of a rule.
	@return ApiGetGlobalRuleConfigRequest
	*/
	GetGlobalRuleConfig(ctx context.Context, rule RuleType) ApiGetGlobalRuleConfigRequest

	// GetGlobalRuleConfigExecute executes the request
	//  @return Rule
	GetGlobalRuleConfigExecute(r ApiGetGlobalRuleConfigRequest) (*Rule, *http.Response, error)

	/*
	ListGlobalRules List global rules

	Gets a list of all the currently configured global rules (if any).

This operation can fail for the following reasons:

* A server error occurred (HTTP error `500`)


	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return ApiListGlobalRulesRequest
	*/
	ListGlobalRules(ctx context.Context) ApiListGlobalRulesRequest

	// ListGlobalRulesExecute executes the request
	//  @return []RuleType
	ListGlobalRulesExecute(r ApiListGlobalRulesRequest) ([]RuleType, *http.Response, error)

	/*
	UpdateGlobalRuleConfig Update global rule configuration

	Updates the configuration for a globally configured rule.

This operation can fail for the following reasons:

* Invalid rule name/type (HTTP error `400`)
* No rule with name/type `rule` exists (HTTP error `404`)
* A server error occurred (HTTP error `500`)


	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@param rule The unique name/type of a rule.
	@return ApiUpdateGlobalRuleConfigRequest
	*/
	UpdateGlobalRuleConfig(ctx context.Context, rule RuleType) ApiUpdateGlobalRuleConfigRequest

	// UpdateGlobalRuleConfigExecute executes the request
	//  @return Rule
	UpdateGlobalRuleConfigExecute(r ApiUpdateGlobalRuleConfigRequest) (*Rule, *http.Response, error)
}

// GlobalRulesApiService GlobalRulesApi service
type GlobalRulesApiService service

type ApiCreateGlobalRuleRequest struct {
	ctx context.Context
	ApiService GlobalRulesApi
	rule *Rule
}

func (r ApiCreateGlobalRuleRequest) Rule(rule Rule) ApiCreateGlobalRuleRequest {
	r.rule = &rule
	return r
}

func (r ApiCreateGlobalRuleRequest) Execute() (*http.Response, error) {
	return r.ApiService.CreateGlobalRuleExecute(r)
}

/*
CreateGlobalRule Create global rule

Adds a rule to the list of globally configured rules.

This operation can fail for the following reasons:

* The rule type is unknown (HTTP error `400`)
* The rule already exists (HTTP error `409`)
* A server error occurred (HTTP error `500`)


 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateGlobalRuleRequest
*/
func (a *GlobalRulesApiService) CreateGlobalRule(ctx context.Context) ApiCreateGlobalRuleRequest {
	return ApiCreateGlobalRuleRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *GlobalRulesApiService) CreateGlobalRuleExecute(r ApiCreateGlobalRuleRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalRulesApiService.CreateGlobalRule")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/rules"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.rule == nil {
		return nil, reportError("rule is required and must be specified")
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
	localVarPostBody = r.rule
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
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
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 409 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
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
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiDeleteAllGlobalRulesRequest struct {
	ctx context.Context
	ApiService GlobalRulesApi
}

func (r ApiDeleteAllGlobalRulesRequest) Execute() (*http.Response, error) {
	return r.ApiService.DeleteAllGlobalRulesExecute(r)
}

/*
DeleteAllGlobalRules Delete all global rules

Deletes all globally configured rules.

This operation can fail for the following reasons:

* A server error occurred (HTTP error `500`)


 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDeleteAllGlobalRulesRequest
*/
func (a *GlobalRulesApiService) DeleteAllGlobalRules(ctx context.Context) ApiDeleteAllGlobalRulesRequest {
	return ApiDeleteAllGlobalRulesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *GlobalRulesApiService) DeleteAllGlobalRulesExecute(r ApiDeleteAllGlobalRulesRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodDelete
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalRulesApiService.DeleteAllGlobalRules")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/rules"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

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
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiDeleteGlobalRuleRequest struct {
	ctx context.Context
	ApiService GlobalRulesApi
	rule RuleType
}

func (r ApiDeleteGlobalRuleRequest) Execute() (*http.Response, error) {
	return r.ApiService.DeleteGlobalRuleExecute(r)
}

/*
DeleteGlobalRule Delete global rule

Deletes a single global rule.  If this is the only rule configured, this is the same
as deleting **all** rules.

This operation can fail for the following reasons:

* Invalid rule name/type (HTTP error `400`)
* No rule with name/type `rule` exists (HTTP error `404`)
* Rule cannot be deleted (HTTP error `409`)
* A server error occurred (HTTP error `500`)


 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param rule The unique name/type of a rule.
 @return ApiDeleteGlobalRuleRequest
*/
func (a *GlobalRulesApiService) DeleteGlobalRule(ctx context.Context, rule RuleType) ApiDeleteGlobalRuleRequest {
	return ApiDeleteGlobalRuleRequest{
		ApiService: a,
		ctx: ctx,
		rule: rule,
	}
}

// Execute executes the request
func (a *GlobalRulesApiService) DeleteGlobalRuleExecute(r ApiDeleteGlobalRuleRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodDelete
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalRulesApiService.DeleteGlobalRule")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/rules/{rule}"
	localVarPath = strings.Replace(localVarPath, "{"+"rule"+"}", url.PathEscape(parameterToString(r.rule, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

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
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
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
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiGetGlobalRuleConfigRequest struct {
	ctx context.Context
	ApiService GlobalRulesApi
	rule RuleType
}

func (r ApiGetGlobalRuleConfigRequest) Execute() (*Rule, *http.Response, error) {
	return r.ApiService.GetGlobalRuleConfigExecute(r)
}

/*
GetGlobalRuleConfig Get global rule configuration

Returns information about the named globally configured rule.

This operation can fail for the following reasons:

* Invalid rule name/type (HTTP error `400`)
* No rule with name/type `rule` exists (HTTP error `404`)
* A server error occurred (HTTP error `500`)


 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param rule The unique name/type of a rule.
 @return ApiGetGlobalRuleConfigRequest
*/
func (a *GlobalRulesApiService) GetGlobalRuleConfig(ctx context.Context, rule RuleType) ApiGetGlobalRuleConfigRequest {
	return ApiGetGlobalRuleConfigRequest{
		ApiService: a,
		ctx: ctx,
		rule: rule,
	}
}

// Execute executes the request
//  @return Rule
func (a *GlobalRulesApiService) GetGlobalRuleConfigExecute(r ApiGetGlobalRuleConfigRequest) (*Rule, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *Rule
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalRulesApiService.GetGlobalRuleConfig")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/rules/{rule}"
	localVarPath = strings.Replace(localVarPath, "{"+"rule"+"}", url.PathEscape(parameterToString(r.rule, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

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
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
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
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListGlobalRulesRequest struct {
	ctx context.Context
	ApiService GlobalRulesApi
}

func (r ApiListGlobalRulesRequest) Execute() ([]RuleType, *http.Response, error) {
	return r.ApiService.ListGlobalRulesExecute(r)
}

/*
ListGlobalRules List global rules

Gets a list of all the currently configured global rules (if any).

This operation can fail for the following reasons:

* A server error occurred (HTTP error `500`)


 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiListGlobalRulesRequest
*/
func (a *GlobalRulesApiService) ListGlobalRules(ctx context.Context) ApiListGlobalRulesRequest {
	return ApiListGlobalRulesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []RuleType
func (a *GlobalRulesApiService) ListGlobalRulesExecute(r ApiListGlobalRulesRequest) ([]RuleType, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []RuleType
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalRulesApiService.ListGlobalRules")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/rules"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

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
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiUpdateGlobalRuleConfigRequest struct {
	ctx context.Context
	ApiService GlobalRulesApi
	rule RuleType
	rule2 *Rule
}

func (r ApiUpdateGlobalRuleConfigRequest) Rule2(rule2 Rule) ApiUpdateGlobalRuleConfigRequest {
	r.rule2 = &rule2
	return r
}

func (r ApiUpdateGlobalRuleConfigRequest) Execute() (*Rule, *http.Response, error) {
	return r.ApiService.UpdateGlobalRuleConfigExecute(r)
}

/*
UpdateGlobalRuleConfig Update global rule configuration

Updates the configuration for a globally configured rule.

This operation can fail for the following reasons:

* Invalid rule name/type (HTTP error `400`)
* No rule with name/type `rule` exists (HTTP error `404`)
* A server error occurred (HTTP error `500`)


 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param rule The unique name/type of a rule.
 @return ApiUpdateGlobalRuleConfigRequest
*/
func (a *GlobalRulesApiService) UpdateGlobalRuleConfig(ctx context.Context, rule RuleType) ApiUpdateGlobalRuleConfigRequest {
	return ApiUpdateGlobalRuleConfigRequest{
		ApiService: a,
		ctx: ctx,
		rule: rule,
	}
}

// Execute executes the request
//  @return Rule
func (a *GlobalRulesApiService) UpdateGlobalRuleConfigExecute(r ApiUpdateGlobalRuleConfigRequest) (*Rule, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPut
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *Rule
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalRulesApiService.UpdateGlobalRuleConfig")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/rules/{rule}"
	localVarPath = strings.Replace(localVarPath, "{"+"rule"+"}", url.PathEscape(parameterToString(r.rule, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.rule2 == nil {
		return localVarReturnValue, nil, reportError("rule2 is required and must be specified")
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
	localVarPostBody = r.rule2
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
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
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
