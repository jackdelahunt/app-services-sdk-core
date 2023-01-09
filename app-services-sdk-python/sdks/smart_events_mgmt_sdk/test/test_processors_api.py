"""
    Red Hat Openshift SmartEvents Fleet Manager V2

    The API exposed by the fleet manager of the SmartEvents service.  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Contact: openbridge-dev@redhat.com
    Generated by: https://openapi-generator.tech
"""


import unittest

import rhoas_smart_events_mgmt_sdk
from rhoas_smart_events_mgmt_sdk.api.processors_api import ProcessorsApi  # noqa: E501


class TestProcessorsApi(unittest.TestCase):
    """ProcessorsApi unit test stubs"""

    def setUp(self):
        self.api = ProcessorsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_processors_api_create_processor(self):
        """Test case for processors_api_create_processor

        Create a Processor of a Bridge instance  # noqa: E501
        """
        pass

    def test_processors_api_delete_processor(self):
        """Test case for processors_api_delete_processor

        Delete a Processor of a Bridge instance  # noqa: E501
        """
        pass

    def test_processors_api_get_processor(self):
        """Test case for processors_api_get_processor

        Get a Processor of a Bridge instance  # noqa: E501
        """
        pass

    def test_processors_api_get_processors(self):
        """Test case for processors_api_get_processors

        Get the list of Processors of a Bridge instance  # noqa: E501
        """
        pass

    def test_processors_api_update_processor(self):
        """Test case for processors_api_update_processor

        Update a Processor instance.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
