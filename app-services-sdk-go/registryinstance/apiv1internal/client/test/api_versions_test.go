/*
Apicurio Registry API [v2]

Testing VersionsApiService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package registryinstanceclient

import (
    "context"
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    openapiclient "./openapi"
)

func Test_registryinstanceclient_VersionsApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test VersionsApiService CreateArtifactVersion", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var groupId string
        var artifactId string

        resp, httpRes, err := apiClient.VersionsApi.CreateArtifactVersion(context.Background(), groupId, artifactId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test VersionsApiService GetArtifactVersion", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var groupId string
        var artifactId string
        var version string

        resp, httpRes, err := apiClient.VersionsApi.GetArtifactVersion(context.Background(), groupId, artifactId, version).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test VersionsApiService GetArtifactVersionReferences", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var groupId string
        var artifactId string
        var version string

        resp, httpRes, err := apiClient.VersionsApi.GetArtifactVersionReferences(context.Background(), groupId, artifactId, version).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test VersionsApiService ListArtifactVersions", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var groupId string
        var artifactId string

        resp, httpRes, err := apiClient.VersionsApi.ListArtifactVersions(context.Background(), groupId, artifactId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test VersionsApiService UpdateArtifactVersionState", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var groupId string
        var artifactId string
        var version string

        resp, httpRes, err := apiClient.VersionsApi.UpdateArtifactVersionState(context.Background(), groupId, artifactId, version).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
