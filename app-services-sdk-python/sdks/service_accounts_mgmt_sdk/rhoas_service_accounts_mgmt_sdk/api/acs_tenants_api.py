"""
    sso.redhat.com API documentation

    This is the API documentation for sso.redhat.com  # noqa: E501

    The version of the OpenAPI document: 5.0.19-SNAPSHOT
    Contact: it-user-team-list@redhat.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from rhoas_service_accounts_mgmt_sdk.api_client import ApiClient, Endpoint as _Endpoint
from rhoas_service_accounts_mgmt_sdk.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from rhoas_service_accounts_mgmt_sdk.model.acs_client_request_data import AcsClientRequestData
from rhoas_service_accounts_mgmt_sdk.model.acs_client_response_data import AcsClientResponseData
from rhoas_service_accounts_mgmt_sdk.model.error import Error
from rhoas_service_accounts_mgmt_sdk.model.red_hat_error_representation import RedHatErrorRepresentation
from rhoas_service_accounts_mgmt_sdk.model.validation_exception_data import ValidationExceptionData


class AcsTenantsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.create_acs_client_endpoint = _Endpoint(
            settings={
                'response_type': (AcsClientResponseData,),
                'auth': [
                    'serviceAccounts'
                ],
                'endpoint_path': '/apis/beta/acs/v1',
                'operation_id': 'create_acs_client',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'acs_client_request_data',
                ],
                'required': [
                    'acs_client_request_data',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'acs_client_request_data':
                        (AcsClientRequestData,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'acs_client_request_data': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client
        )
        self.delete_acs_client_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'serviceAccounts'
                ],
                'endpoint_path': '/apis/beta/acs/v1/{clientId}',
                'operation_id': 'delete_acs_client',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'client_id',
                ],
                'required': [
                    'client_id',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'client_id':
                        (str,),
                },
                'attribute_map': {
                    'client_id': 'clientId',
                },
                'location_map': {
                    'client_id': 'path',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

    def create_acs_client(
        self,
        acs_client_request_data,
        **kwargs
    ):
        """Create ACS managed central client  # noqa: E501

        Create an ACS managed central client. Created ACS managed central clients are associated with the supplied organization id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_acs_client(acs_client_request_data, async_req=True)
        >>> result = thread.get()

        Args:
            acs_client_request_data (AcsClientRequestData): The name, redirect URIs and the organization id of the ACS managed central client

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            AcsClientResponseData
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        kwargs['acs_client_request_data'] = \
            acs_client_request_data
        return self.create_acs_client_endpoint.call_with_http_info(**kwargs)

    def delete_acs_client(
        self,
        client_id,
        **kwargs
    ):
        """Delete ACS managed central client  # noqa: E501

        Delete ACS managed central client by clientId. Throws not found exception if the client is not found  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_acs_client(client_id, async_req=True)
        >>> result = thread.get()

        Args:
            client_id (str):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            None
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        kwargs['client_id'] = \
            client_id
        return self.delete_acs_client_endpoint.call_with_http_info(**kwargs)

