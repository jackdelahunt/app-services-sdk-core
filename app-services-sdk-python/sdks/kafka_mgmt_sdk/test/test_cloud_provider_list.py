"""
    Kafka Management API

    Kafka Management API is a REST API to manage Kafka instances  # noqa: E501

    The version of the OpenAPI document: 1.14.0
    Contact: rhosak-support@redhat.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_mgmt_sdk
from rhoas_kafka_mgmt_sdk.model.cloud_provider_list_all_of import CloudProviderListAllOf
from rhoas_kafka_mgmt_sdk.model.list import List
globals()['CloudProviderListAllOf'] = CloudProviderListAllOf
globals()['List'] = List
from rhoas_kafka_mgmt_sdk.model.cloud_provider_list import CloudProviderList


class TestCloudProviderList(unittest.TestCase):
    """CloudProviderList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCloudProviderList(self):
        """Test CloudProviderList"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CloudProviderList()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
