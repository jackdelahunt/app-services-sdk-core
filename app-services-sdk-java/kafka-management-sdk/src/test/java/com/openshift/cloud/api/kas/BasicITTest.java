package com.openshift.cloud.api.kas;

import com.redhat.cloud.kiota.auth.RHAccessTokenProvider;
import com.openshift.cloud.api.kas.ApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class BasicITTest {

    static final String OFFLINE_TOKEN = System.getenv("OFFLINE_TOKEN");

    @Test
    void retrieveCloudProviders() throws Exception {
        // Arrange
        OkHttpRequestAdapter adapter = new OkHttpRequestAdapter(
                new BaseBearerTokenAuthenticationProvider(
                        new RHAccessTokenProvider(OFFLINE_TOKEN)));

        adapter.setBaseUrl("https://api.openshift.com");
        var client = new ApiClient(adapter);

        // Act
        var cloudProviders = client
                .api()
                .kafkas_mgmt()
                .v1()
                .cloud_providers()
                .get()
                .get(3, TimeUnit.SECONDS);

        // Assert
        Assertions.assertEquals(8, cloudProviders.getItems().size());
        Assertions.assertEquals("aws", cloudProviders.getItems().get(0).getName());
    }

}
