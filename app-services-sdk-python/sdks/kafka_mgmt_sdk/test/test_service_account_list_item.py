"""
    Kafka Management API

    Kafka Management API is a REST API to manage Kafka instances  # noqa: E501

    The version of the OpenAPI document: 1.15.0
    Contact: rhosak-support@redhat.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_mgmt_sdk
from rhoas_kafka_mgmt_sdk.model.object_reference import ObjectReference
from rhoas_kafka_mgmt_sdk.model.service_account_list_item_all_of import ServiceAccountListItemAllOf
globals()['ObjectReference'] = ObjectReference
globals()['ServiceAccountListItemAllOf'] = ServiceAccountListItemAllOf
from rhoas_kafka_mgmt_sdk.model.service_account_list_item import ServiceAccountListItem


class TestServiceAccountListItem(unittest.TestCase):
    """ServiceAccountListItem unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testServiceAccountListItem(self):
        """Test ServiceAccountListItem"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ServiceAccountListItem()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
