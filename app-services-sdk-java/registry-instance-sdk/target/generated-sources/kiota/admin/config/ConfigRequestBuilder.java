package com.openshift.cloud.api.registry.instance.admin.config;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.registry.instance.admin.config.properties.item.WithPropertyNameItemRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.config.properties.PropertiesRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /admin/config
 */
public class ConfigRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Manage configuration properties. */
    @javax.annotation.Nonnull
    public PropertiesRequestBuilder properties() {
        return new PropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/admin/config";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/admin/config";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Manage a single configuration property (by name).
     * @param id Unique identifier of the item
     * @return a WithPropertyNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithPropertyNameItemRequestBuilder properties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("propertyName", id);
        return new WithPropertyNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
