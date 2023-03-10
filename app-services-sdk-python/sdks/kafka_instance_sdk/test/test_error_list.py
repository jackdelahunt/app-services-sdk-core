"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.model.error import Error
from rhoas_kafka_instance_sdk.model.error_list_all_of import ErrorListAllOf
from rhoas_kafka_instance_sdk.model.list import List
globals()['Error'] = Error
globals()['ErrorListAllOf'] = ErrorListAllOf
globals()['List'] = List
from rhoas_kafka_instance_sdk.model.error_list import ErrorList


class TestErrorList(unittest.TestCase):
    """ErrorList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testErrorList(self):
        """Test ErrorList"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ErrorList()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
