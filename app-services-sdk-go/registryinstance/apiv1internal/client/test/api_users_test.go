/*
Apicurio Registry API [v2]

Testing UsersApiService

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

func Test_registryinstanceclient_UsersApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test UsersApiService GetCurrentUserInfo", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.UsersApi.GetCurrentUserInfo(context.Background()).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
