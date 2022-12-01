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
from rhoas_kafka_instance_sdk.model.error import Error
from rhoas_kafka_instance_sdk.model.new_topic_input import NewTopicInput
from rhoas_kafka_instance_sdk.model.sort_direction import SortDirection
from rhoas_kafka_instance_sdk.model.topic import Topic
from rhoas_kafka_instance_sdk.model.topic_settings import TopicSettings
from rhoas_kafka_instance_sdk.model.topics_list import TopicsList


class TopicsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.create_topic_endpoint = _Endpoint(
            settings={
                'response_type': (Topic,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/topics',
                'operation_id': 'create_topic',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'new_topic_input',
                ],
                'required': [
                    'new_topic_input',
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
                    'new_topic_input':
                        (NewTopicInput,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'new_topic_input': 'body',
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
        self.delete_topic_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/topics/{topicName}',
                'operation_id': 'delete_topic',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'topic_name',
                ],
                'required': [
                    'topic_name',
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
                    'topic_name':
                        (str,),
                },
                'attribute_map': {
                    'topic_name': 'topicName',
                },
                'location_map': {
                    'topic_name': 'path',
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
        self.get_topic_endpoint = _Endpoint(
            settings={
                'response_type': (Topic,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/topics/{topicName}',
                'operation_id': 'get_topic',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'topic_name',
                ],
                'required': [
                    'topic_name',
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
                    'topic_name':
                        (str,),
                },
                'attribute_map': {
                    'topic_name': 'topicName',
                },
                'location_map': {
                    'topic_name': 'path',
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
        self.get_topics_endpoint = _Endpoint(
            settings={
                'response_type': (TopicsList,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/topics',
                'operation_id': 'get_topics',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'offset',
                    'limit',
                    'size',
                    'filter',
                    'page',
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
                    'filter':
                        (str,),
                    'page':
                        (int,),
                    'order':
                        (SortDirection,),
                    'order_key':
                        (bool, date, datetime, dict, float, int, list, str, none_type,),
                },
                'attribute_map': {
                    'offset': 'offset',
                    'limit': 'limit',
                    'size': 'size',
                    'filter': 'filter',
                    'page': 'page',
                    'order': 'order',
                    'order_key': 'orderKey',
                },
                'location_map': {
                    'offset': 'query',
                    'limit': 'query',
                    'size': 'query',
                    'filter': 'query',
                    'page': 'query',
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
        self.update_topic_endpoint = _Endpoint(
            settings={
                'response_type': (Topic,),
                'auth': [
                    'Bearer',
                    'OAuth2'
                ],
                'endpoint_path': '/api/v1/topics/{topicName}',
                'operation_id': 'update_topic',
                'http_method': 'PATCH',
                'servers': None,
            },
            params_map={
                'all': [
                    'topic_name',
                    'topic_settings',
                ],
                'required': [
                    'topic_name',
                    'topic_settings',
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
                    'topic_name':
                        (str,),
                    'topic_settings':
                        (TopicSettings,),
                },
                'attribute_map': {
                    'topic_name': 'topicName',
                },
                'location_map': {
                    'topic_name': 'path',
                    'topic_settings': 'body',
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

    def create_topic(
        self,
        new_topic_input,
        **kwargs
    ):
        """Creates a new topic  # noqa: E501

        Creates a new topic for Kafka.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_topic(new_topic_input, async_req=True)
        >>> result = thread.get()

        Args:
            new_topic_input (NewTopicInput): Topic to create.

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
            Topic
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
        kwargs['new_topic_input'] = \
            new_topic_input
        return self.create_topic_endpoint.call_with_http_info(**kwargs)

    def delete_topic(
        self,
        topic_name,
        **kwargs
    ):
        """Deletes a topic  # noqa: E501

        Deletes the topic with the specified name.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_topic(topic_name, async_req=True)
        >>> result = thread.get()

        Args:
            topic_name (str): Name of the topic to delete

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
        kwargs['topic_name'] = \
            topic_name
        return self.delete_topic_endpoint.call_with_http_info(**kwargs)

    def get_topic(
        self,
        topic_name,
        **kwargs
    ):
        """Retrieves a single topic  # noqa: E501

        Topic  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_topic(topic_name, async_req=True)
        >>> result = thread.get()

        Args:
            topic_name (str): Name of the topic to describe

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
            Topic
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
        kwargs['topic_name'] = \
            topic_name
        return self.get_topic_endpoint.call_with_http_info(**kwargs)

    def get_topics(
        self,
        **kwargs
    ):
        """Retrieves a list of topics  # noqa: E501

        Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_topics(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            offset (int): Offset of the first record to return, zero-based. [optional]
            limit (int): Maximum number of records to return. [optional]
            size (int): Number of records per page. [optional]
            filter (str): Filter to apply when returning the list of topics. [optional]
            page (int): Page number. [optional]
            order (SortDirection): Order items are sorted. [optional]
            order_key (bool, date, datetime, dict, float, int, list, str, none_type): Order key to sort the topics by.. [optional]
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
            TopicsList
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
        return self.get_topics_endpoint.call_with_http_info(**kwargs)

    def update_topic(
        self,
        topic_name,
        topic_settings,
        **kwargs
    ):
        """Updates a single topic  # noqa: E501

        Update the configuration settings for a topic.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_topic(topic_name, topic_settings, async_req=True)
        >>> result = thread.get()

        Args:
            topic_name (str): Name of the topic to update
            topic_settings (TopicSettings):

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
            Topic
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
        kwargs['topic_name'] = \
            topic_name
        kwargs['topic_settings'] = \
            topic_settings
        return self.update_topic_endpoint.call_with_http_info(**kwargs)

