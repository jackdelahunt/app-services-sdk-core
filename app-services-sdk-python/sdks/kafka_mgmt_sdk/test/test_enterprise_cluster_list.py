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
from rhoas_kafka_mgmt_sdk.model.enterprise_cluster_list_all_of import EnterpriseClusterListAllOf
from rhoas_kafka_mgmt_sdk.model.list import List
globals()['EnterpriseClusterListAllOf'] = EnterpriseClusterListAllOf
globals()['List'] = List
from rhoas_kafka_mgmt_sdk.model.enterprise_cluster_list import EnterpriseClusterList


class TestEnterpriseClusterList(unittest.TestCase):
    """EnterpriseClusterList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testEnterpriseClusterList(self):
        """Test EnterpriseClusterList"""
        # FIXME: construct object with mandatory attributes with example values
        # model = EnterpriseClusterList()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
