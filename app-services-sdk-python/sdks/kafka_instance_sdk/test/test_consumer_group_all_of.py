"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.0-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.model.consumer import Consumer
from rhoas_kafka_instance_sdk.model.consumer_group_metrics import ConsumerGroupMetrics
from rhoas_kafka_instance_sdk.model.consumer_group_state import ConsumerGroupState
globals()['Consumer'] = Consumer
globals()['ConsumerGroupMetrics'] = ConsumerGroupMetrics
globals()['ConsumerGroupState'] = ConsumerGroupState
from rhoas_kafka_instance_sdk.model.consumer_group_all_of import ConsumerGroupAllOf


class TestConsumerGroupAllOf(unittest.TestCase):
    """ConsumerGroupAllOf unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testConsumerGroupAllOf(self):
        """Test ConsumerGroupAllOf"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ConsumerGroupAllOf()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
