"""
    Kafka Instance API

    API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs  # noqa: E501

    The version of the OpenAPI document: 0.13.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import rhoas_kafka_instance_sdk
from rhoas_kafka_instance_sdk.model.config_entry import ConfigEntry
globals()['ConfigEntry'] = ConfigEntry
from rhoas_kafka_instance_sdk.model.topic_settings import TopicSettings


class TestTopicSettings(unittest.TestCase):
    """TopicSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTopicSettings(self):
        """Test TopicSettings"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TopicSettings()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
