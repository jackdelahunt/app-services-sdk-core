"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.14.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.model.consumer_group_reset_offset_result_all_of import ConsumerGroupResetOffsetResultAllOf
from rhoas_kafka_instance_sdk.model.consumer_group_reset_offset_result_item import ConsumerGroupResetOffsetResultItem
from rhoas_kafka_instance_sdk.model.list import List
globals()['ConsumerGroupResetOffsetResultAllOf'] = ConsumerGroupResetOffsetResultAllOf
globals()['ConsumerGroupResetOffsetResultItem'] = ConsumerGroupResetOffsetResultItem
globals()['List'] = List
from rhoas_kafka_instance_sdk.model.consumer_group_reset_offset_result import ConsumerGroupResetOffsetResult


class TestConsumerGroupResetOffsetResult(unittest.TestCase):
    """ConsumerGroupResetOffsetResult unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testConsumerGroupResetOffsetResult(self):
        """Test ConsumerGroupResetOffsetResult"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ConsumerGroupResetOffsetResult()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
