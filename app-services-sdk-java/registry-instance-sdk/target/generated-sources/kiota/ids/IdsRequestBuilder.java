package com.openshift.cloud.api.registry.instance.ids;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.registry.instance.ids.contenthashes.ContentHashesRequestBuilder;
import com.openshift.cloud.api.registry.instance.ids.contenthashes.item.WithContentHashItemRequestBuilder;
import com.openshift.cloud.api.registry.instance.ids.contentids.ContentIdsRequestBuilder;
import com.openshift.cloud.api.registry.instance.ids.contentids.item.WithContentItemRequestBuilder;
import com.openshift.cloud.api.registry.instance.ids.globalids.GlobalIdsRequestBuilder;
import com.openshift.cloud.api.registry.instance.ids.globalids.item.WithGlobalItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /ids
 */
public class IdsRequestBuilder {
    /** The contentHashes property */
    @javax.annotation.Nonnull
    public ContentHashesRequestBuilder contentHashes() {
        return new ContentHashesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contentIds property */
    @javax.annotation.Nonnull
    public ContentIdsRequestBuilder contentIds() {
        return new ContentIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The globalIds property */
    @javax.annotation.Nonnull
    public GlobalIdsRequestBuilder globalIds() {
        return new GlobalIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new IdsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/ids";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new IdsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/ids";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Access artifact content utilizing the SHA-256 hash of the content.
     * @param id Unique identifier of the item
     * @return a WithContentHashItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithContentHashItemRequestBuilder contentHashes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contentHash", id);
        return new WithContentHashItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Access artifact content utilizing the unique content identifier for that content.
     * @param id Unique identifier of the item
     * @return a WithContentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithContentItemRequestBuilder contentIds(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contentId", id);
        return new WithContentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Access artifact content utilizing an artifact version's globally unique identifier.
     * @param id Unique identifier of the item
     * @return a WithGlobalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithGlobalItemRequestBuilder globalIds(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("globalId", id);
        return new WithGlobalItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
