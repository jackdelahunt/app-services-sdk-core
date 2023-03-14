"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.model.object_reference import ObjectReference
from rhoas_kafka_instance_sdk.model.record_all_of import RecordAllOf
globals()['ObjectReference'] = ObjectReference
globals()['RecordAllOf'] = RecordAllOf
from rhoas_kafka_instance_sdk.model.record import Record


class TestRecord(unittest.TestCase):
    """Record unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRecord(self):
        """Test Record"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Record()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
