"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.0-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from rhoas_kafka_instance_sdk.api_client import ApiClient, Endpoint as _Endpoint
from rhoas_kafka_instance_sdk.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from rhoas_kafka_instance_sdk.model.consumer_group import ConsumerGroup
from rhoas_kafka_instance_sdk.model.consumer_group_list import ConsumerGroupList
from rhoas_kafka_instance_sdk.model.consumer_group_reset_offset_parameters import ConsumerGroupResetOffsetParameters
from rhoas_kafka_instance_sdk.model.consumer_group_reset_offset_result import ConsumerGroupResetOffsetResult
from rhoas_kafka_instance_sdk.model.error import Error
from rhoas_kafka_instance_sdk.model.sort_direction import SortDirection


class GroupsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.delete_consumer_group_by_id_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/consumer-groups/{consumerGroupId}',
                'operation_id': 'delete_consumer_group_by_id',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'consumer_group_id',
                ],
                'required': [
                    'consumer_group_id',
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
                    'consumer_group_id':
                        (str,),
                },
                'attribute_map': {
                    'consumer_group_id': 'consumerGroupId',
                },
                'location_map': {
                    'consumer_group_id': 'path',
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
        self.get_consumer_group_by_id_endpoint = _Endpoint(
            settings={
                'response_type': (ConsumerGroup,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/consumer-groups/{consumerGroupId}',
                'operation_id': 'get_consumer_group_by_id',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'consumer_group_id',
                    'order',
                    'order_key',
                    'partition_filter',
                    'topic',
                ],
                'required': [
                    'consumer_group_id',
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
                    'consumer_group_id':
                        (str,),
                    'order':
                        (SortDirection,),
                    'order_key':
                        (bool, date, datetime, dict, float, int, list, str, none_type,),
                    'partition_filter':
                        (int,),
                    'topic':
                        (str,),
                },
                'attribute_map': {
                    'consumer_group_id': 'consumerGroupId',
                    'order': 'order',
                    'order_key': 'orderKey',
                    'partition_filter': 'partitionFilter',
                    'topic': 'topic',
                },
                'location_map': {
                    'consumer_group_id': 'path',
                    'order': 'query',
                    'order_key': 'query',
                    'partition_filter': 'query',
                    'topic': 'query',
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
        self.get_consumer_groups_endpoint = _Endpoint(
            settings={
                'response_type': (ConsumerGroupList,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/consumer-groups',
                'operation_id': 'get_consumer_groups',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'offset',
                    'limit',
                    'size',
                    'page',
                    'topic',
                    'group_id_filter',
                    'order',
                    'order_key',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'offset',
                    'limit',
                    'size',
                    'page',
                ]
            },
            root_map={
                'validations': {
                    ('offset',): {

                        'inclusive_minimum': 0,
                    },
                    ('limit',): {

                        'inclusive_minimum': 1,
                    },
                    ('size',): {

                        'inclusive_minimum': 1,
                    },
                    ('page',): {

                        'inclusive_minimum': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'offset':
                        (int,),
                    'limit':
                        (int,),
                    'size':
                        (int,),
                    'page':
                        (int,),
                    'topic':
                        (str,),
                    'group_id_filter':
                        (str,),
                    'order':
                        (SortDirection,),
                    'order_key':
                        (bool, date, datetime, dict, float, int, list, str, none_type,),
                },
                'attribute_map': {
                    'offset': 'offset',
                    'limit': 'limit',
                    'size': 'size',
                    'page': 'page',
                    'topic': 'topic',
                    'group_id_filter': 'group-id-filter',
                    'order': 'order',
                    'order_key': 'orderKey',
                },
                'location_map': {
                    'offset': 'query',
                    'limit': 'query',
                    'size': 'query',
                    'page': 'query',
                    'topic': 'query',
                    'group_id_filter': 'query',
                    'order': 'query',
                    'order_key': 'query',
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
        self.reset_consumer_group_offset_endpoint = _Endpoint(
            settings={
                'response_type': (ConsumerGroupResetOffsetResult,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/consumer-groups/{consumerGroupId}/reset-offset',
                'operation_id': 'reset_consumer_group_offset',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'consumer_group_id',
                    'consumer_group_reset_offset_parameters',
                ],
                'required': [
                    'consumer_group_id',
                    'consumer_group_reset_offset_parameters',
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
                    'consumer_group_id':
                        (str,),
                    'consumer_group_reset_offset_parameters':
                        (ConsumerGroupResetOffsetParameters,),
                },
                'attribute_map': {
                    'consumer_group_id': 'consumerGroupId',
                },
                'location_map': {
                    'consumer_group_id': 'path',
                    'consumer_group_reset_offset_parameters': 'body',
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

    def delete_consumer_group_by_id(
        self,
        consumer_group_id,
        **kwargs
    ):
        """Delete a consumer group.  # noqa: E501

        Delete a consumer group, along with its consumers.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_consumer_group_by_id(consumer_group_id, async_req=True)
        >>> result = thread.get()

        Args:
            consumer_group_id (str): Consumer group identifier

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
        kwargs['consumer_group_id'] = \
            consumer_group_id
        return self.delete_consumer_group_by_id_endpoint.call_with_http_info(**kwargs)

    def get_consumer_group_by_id(
        self,
        consumer_group_id,
        **kwargs
    ):
        """Get a single consumer group by its unique ID.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_consumer_group_by_id(consumer_group_id, async_req=True)
        >>> result = thread.get()

        Args:
            consumer_group_id (str): Consumer group identifier

        Keyword Args:
            order (SortDirection): Order items are sorted. [optional]
            order_key (bool, date, datetime, dict, float, int, list, str, none_type): [optional]
            partition_filter (int): Value of partition to include. Value -1 means filter is not active.. [optional]
            topic (str): Filter consumer groups for a specific topic. [optional]
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
            ConsumerGroup
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
        kwargs['consumer_group_id'] = \
            consumer_group_id
        return self.get_consumer_group_by_id_endpoint.call_with_http_info(**kwargs)

    def get_consumer_groups(
        self,
        **kwargs
    ):
        """List of consumer groups in the Kafka instance.  # noqa: E501

        Returns a list of all consumer groups for a particular Kafka instance. The consumer groups returned are limited to those records the requestor is authorized to view.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_consumer_groups(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            offset (int): Offset of the first record to return, zero-based. [optional]
            limit (int): Maximum number of records to return. [optional]
            size (int): Number of records per page. [optional]
            page (int): Page number. [optional]
            topic (str): Return consumer groups where the topic name contains this value. [optional]
            group_id_filter (str): Return the consumer groups where the ID contains this value. [optional]
            order (SortDirection): Order items are sorted. [optional]
            order_key (bool, date, datetime, dict, float, int, list, str, none_type): [optional]
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
            ConsumerGroupList
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
        return self.get_consumer_groups_endpoint.call_with_http_info(**kwargs)

    def reset_consumer_group_offset(
        self,
        consumer_group_id,
        consumer_group_reset_offset_parameters,
        **kwargs
    ):
        """Reset the offset for a consumer group.  # noqa: E501

        Reset the offset for a particular consumer group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.reset_consumer_group_offset(consumer_group_id, consumer_group_reset_offset_parameters, async_req=True)
        >>> result = thread.get()

        Args:
            consumer_group_id (str): Consumer group identifier
            consumer_group_reset_offset_parameters (ConsumerGroupResetOffsetParameters):

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
            ConsumerGroupResetOffsetResult
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
        kwargs['consumer_group_id'] = \
            consumer_group_id
        kwargs['consumer_group_reset_offset_parameters'] = \
            consumer_group_reset_offset_parameters
        return self.reset_consumer_group_offset_endpoint.call_with_http_info(**kwargs)

