# rhoas_smart_events_mgmt_sdk.ProcessorsApi

All URIs are relative to *https://api.stage.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processors_api_create_processor**](ProcessorsApi.md#processors_api_create_processor) | **POST** /api/smartevents_mgmt/v2/bridges/{bridgeId}/processors | Create a Processor of a Bridge instance
[**processors_api_delete_processor**](ProcessorsApi.md#processors_api_delete_processor) | **DELETE** /api/smartevents_mgmt/v2/bridges/{bridgeId}/processors/{processorId} | Delete a Processor of a Bridge instance
[**processors_api_get_processor**](ProcessorsApi.md#processors_api_get_processor) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId}/processors/{processorId} | Get a Processor of a Bridge instance
[**processors_api_get_processors**](ProcessorsApi.md#processors_api_get_processors) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId}/processors | Get the list of Processors of a Bridge instance
[**processors_api_update_processor**](ProcessorsApi.md#processors_api_update_processor) | **PUT** /api/smartevents_mgmt/v2/bridges/{bridgeId}/processors/{processorId} | Update a Processor instance.


# **processors_api_create_processor**
> ProcessorResponse processors_api_create_processor(bridge_id)

Create a Processor of a Bridge instance

Create a Processor of a Bridge instance for the authenticated user.

### Example

* Bearer Authentication (bearer):

```python
import time
import rhoas_smart_events_mgmt_sdk
from rhoas_smart_events_mgmt_sdk.api import processors_api
from rhoas_smart_events_mgmt_sdk.model.errors_list import ErrorsList
from rhoas_smart_events_mgmt_sdk.model.processor_request import ProcessorRequest
from rhoas_smart_events_mgmt_sdk.model.processor_response import ProcessorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.stage.openshift.com
# See configuration.py for a list of all supported configuration parameters.
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    host = "https://api.stage.openshift.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearer
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with rhoas_smart_events_mgmt_sdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = processors_api.ProcessorsApi(api_client)
    bridge_id = "bridgeId_example" # str | 
    processor_request = ProcessorRequest(
        name="processor1",
        flows={},
    ) # ProcessorRequest |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Create a Processor of a Bridge instance
        api_response = api_instance.processors_api_create_processor(bridge_id)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_create_processor: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a Processor of a Bridge instance
        api_response = api_instance.processors_api_create_processor(bridge_id, processor_request=processor_request)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_create_processor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridge_id** | **str**|  |
 **processor_request** | [**ProcessorRequest**](ProcessorRequest.md)|  | [optional]

### Return type

[**ProcessorResponse**](ProcessorResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthorized. |  -  |
**402** | Not enough quota. |  -  |
**403** | Forbidden. |  -  |
**404** | Not found. |  -  |
**500** | Internal error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **processors_api_delete_processor**
> processors_api_delete_processor(bridge_id, processor_id)

Delete a Processor of a Bridge instance

Delete a Processor of a Bridge instance for the authenticated user.

### Example

* Bearer Authentication (bearer):

```python
import time
import rhoas_smart_events_mgmt_sdk
from rhoas_smart_events_mgmt_sdk.api import processors_api
from rhoas_smart_events_mgmt_sdk.model.errors_list import ErrorsList
from pprint import pprint
# Defining the host is optional and defaults to https://api.stage.openshift.com
# See configuration.py for a list of all supported configuration parameters.
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    host = "https://api.stage.openshift.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearer
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with rhoas_smart_events_mgmt_sdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = processors_api.ProcessorsApi(api_client)
    bridge_id = "bridgeId_example" # str | 
    processor_id = "processorId_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Delete a Processor of a Bridge instance
        api_instance.processors_api_delete_processor(bridge_id, processor_id)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_delete_processor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridge_id** | **str**|  |
 **processor_id** | **str**|  |

### Return type

void (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthorized. |  -  |
**403** | Forbidden. |  -  |
**404** | Not found. |  -  |
**500** | Internal error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **processors_api_get_processor**
> ProcessorResponse processors_api_get_processor(bridge_id, processor_id)

Get a Processor of a Bridge instance

Get a Processor of a Bridge instance for the authenticated user.

### Example

* Bearer Authentication (bearer):

```python
import time
import rhoas_smart_events_mgmt_sdk
from rhoas_smart_events_mgmt_sdk.api import processors_api
from rhoas_smart_events_mgmt_sdk.model.errors_list import ErrorsList
from rhoas_smart_events_mgmt_sdk.model.processor_response import ProcessorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.stage.openshift.com
# See configuration.py for a list of all supported configuration parameters.
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    host = "https://api.stage.openshift.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearer
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with rhoas_smart_events_mgmt_sdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = processors_api.ProcessorsApi(api_client)
    bridge_id = "bridgeId_example" # str | 
    processor_id = "processorId_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Get a Processor of a Bridge instance
        api_response = api_instance.processors_api_get_processor(bridge_id, processor_id)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_get_processor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridge_id** | **str**|  |
 **processor_id** | **str**|  |

### Return type

[**ProcessorResponse**](ProcessorResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthorized. |  -  |
**403** | Forbidden. |  -  |
**404** | Not found. |  -  |
**500** | Internal error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **processors_api_get_processors**
> ProcessorListResponse processors_api_get_processors(bridge_id)

Get the list of Processors of a Bridge instance

Get the list of Processors of a Bridge instance for the authenticated user.

### Example

* Bearer Authentication (bearer):

```python
import time
import rhoas_smart_events_mgmt_sdk
from rhoas_smart_events_mgmt_sdk.api import processors_api
from rhoas_smart_events_mgmt_sdk.model.managed_resource_status import ManagedResourceStatus
from rhoas_smart_events_mgmt_sdk.model.processor_list_response import ProcessorListResponse
from rhoas_smart_events_mgmt_sdk.model.errors_list import ErrorsList
from pprint import pprint
# Defining the host is optional and defaults to https://api.stage.openshift.com
# See configuration.py for a list of all supported configuration parameters.
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    host = "https://api.stage.openshift.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearer
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with rhoas_smart_events_mgmt_sdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = processors_api.ProcessorsApi(api_client)
    bridge_id = "bridgeId_example" # str | 
    name = "name_example" # str |  (optional)
    page = 0 # int |  (optional) if omitted the server will use the default value of 0
    size = 100 # int |  (optional) if omitted the server will use the default value of 100
    status = [
        ManagedResourceStatus("accepted"),
    ] # [ManagedResourceStatus] |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Get the list of Processors of a Bridge instance
        api_response = api_instance.processors_api_get_processors(bridge_id)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_get_processors: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get the list of Processors of a Bridge instance
        api_response = api_instance.processors_api_get_processors(bridge_id, name=name, page=page, size=size, status=status)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_get_processors: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridge_id** | **str**|  |
 **name** | **str**|  | [optional]
 **page** | **int**|  | [optional] if omitted the server will use the default value of 0
 **size** | **int**|  | [optional] if omitted the server will use the default value of 100
 **status** | [**[ManagedResourceStatus]**](ManagedResourceStatus.md)|  | [optional]

### Return type

[**ProcessorListResponse**](ProcessorListResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthorized. |  -  |
**403** | Forbidden. |  -  |
**404** | Not found. |  -  |
**500** | Internal error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **processors_api_update_processor**
> ProcessorResponse processors_api_update_processor(bridge_id, processor_id)

Update a Processor instance.

Update a Processor instance for the authenticated user.

### Example

* Bearer Authentication (bearer):

```python
import time
import rhoas_smart_events_mgmt_sdk
from rhoas_smart_events_mgmt_sdk.api import processors_api
from rhoas_smart_events_mgmt_sdk.model.errors_list import ErrorsList
from rhoas_smart_events_mgmt_sdk.model.processor_request import ProcessorRequest
from rhoas_smart_events_mgmt_sdk.model.processor_response import ProcessorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.stage.openshift.com
# See configuration.py for a list of all supported configuration parameters.
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    host = "https://api.stage.openshift.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearer
configuration = rhoas_smart_events_mgmt_sdk.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with rhoas_smart_events_mgmt_sdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = processors_api.ProcessorsApi(api_client)
    bridge_id = "bridgeId_example" # str | 
    processor_id = "processorId_example" # str | 
    processor_request = ProcessorRequest(
        name="processor1",
        flows={},
    ) # ProcessorRequest |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update a Processor instance.
        api_response = api_instance.processors_api_update_processor(bridge_id, processor_id)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_update_processor: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update a Processor instance.
        api_response = api_instance.processors_api_update_processor(bridge_id, processor_id, processor_request=processor_request)
        pprint(api_response)
    except rhoas_smart_events_mgmt_sdk.ApiException as e:
        print("Exception when calling ProcessorsApi->processors_api_update_processor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridge_id** | **str**|  |
 **processor_id** | **str**|  |
 **processor_request** | [**ProcessorRequest**](ProcessorRequest.md)|  | [optional]

### Return type

[**ProcessorResponse**](ProcessorResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthorized. |  -  |
**403** | Forbidden. |  -  |
**404** | Not found. |  -  |
**500** | Internal error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

