"""
    Connector Management API

    Connector Management API is a REST API to manage connectors.  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: rhosak-support@redhat.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_connector_mgmt_sdk
from rhoas_connector_mgmt_sdk.model.channel import Channel
from rhoas_connector_mgmt_sdk.model.connector_desired_state import ConnectorDesiredState
from rhoas_connector_mgmt_sdk.model.connector_resource_annotations import ConnectorResourceAnnotations
globals()['Channel'] = Channel
globals()['ConnectorDesiredState'] = ConnectorDesiredState
globals()['ConnectorResourceAnnotations'] = ConnectorResourceAnnotations
from rhoas_connector_mgmt_sdk.model.connector_request_meta import ConnectorRequestMeta


class TestConnectorRequestMeta(unittest.TestCase):
    """ConnectorRequestMeta unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testConnectorRequestMeta(self):
        """Test ConnectorRequestMeta"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ConnectorRequestMeta()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
