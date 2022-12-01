"""
    Service Registry API

    Service Registry Instance API  NOTE: This API cannot be called directly from the portal.  # noqa: E501

    The version of the OpenAPI document: 2.2.5.Final
    Contact: apicurio@lists.jboss.org
    Generated by: https://openapi-generator.tech
"""


import unittest

import rhoas_registry_instance_sdk
from rhoas_registry_instance_sdk.api.metadata_api import MetadataApi  # noqa: E501


class TestMetadataApi(unittest.TestCase):
    """MetadataApi unit test stubs"""

    def setUp(self):
        self.api = MetadataApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_delete_artifact_version_meta_data(self):
        """Test case for delete_artifact_version_meta_data

        Delete artifact version metadata  # noqa: E501
        """
        pass

    def test_get_artifact_meta_data(self):
        """Test case for get_artifact_meta_data

        Get artifact metadata  # noqa: E501
        """
        pass

    def test_get_artifact_owner(self):
        """Test case for get_artifact_owner

        Get artifact owner  # noqa: E501
        """
        pass

    def test_get_artifact_version_meta_data(self):
        """Test case for get_artifact_version_meta_data

        Get artifact version metadata  # noqa: E501
        """
        pass

    def test_get_artifact_version_meta_data_by_content(self):
        """Test case for get_artifact_version_meta_data_by_content

        Get artifact version metadata by content  # noqa: E501
        """
        pass

    def test_update_artifact_meta_data(self):
        """Test case for update_artifact_meta_data

        Update artifact metadata  # noqa: E501
        """
        pass

    def test_update_artifact_owner(self):
        """Test case for update_artifact_owner

        Update artifact owner  # noqa: E501
        """
        pass

    def test_update_artifact_version_meta_data(self):
        """Test case for update_artifact_version_meta_data

        Update artifact version metadata  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
