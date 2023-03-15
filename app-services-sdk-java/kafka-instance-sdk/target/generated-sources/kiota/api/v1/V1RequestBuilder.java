package com.openshift.cloud.api.kas.auth.api.v1;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.kas.auth.api.v1.acls.AclsRequestBuilder;
import com.openshift.cloud.api.kas.auth.api.v1.consumergroups.ConsumerGroupsRequestBuilder;
import com.openshift.cloud.api.kas.auth.api.v1.consumergroups.item.WithConsumerGroupItemRequestBuilder;
import com.openshift.cloud.api.kas.auth.api.v1.errors.ErrorsRequestBuilder;
import com.openshift.cloud.api.kas.auth.api.v1.errors.item.WithErrorItemRequestBuilder;
import com.openshift.cloud.api.kas.auth.api.v1.topics.item.WithTopicNameItemRequestBuilder;
import com.openshift.cloud.api.kas.auth.api.v1.topics.TopicsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/v1
 */
public class V1RequestBuilder {
    /** The acls property */
    @javax.annotation.Nonnull
    public AclsRequestBuilder acls() {
        return new AclsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The consumerGroups property */
    @javax.annotation.Nonnull
    public ConsumerGroupsRequestBuilder consumerGroups() {
        return new ConsumerGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The errors property */
    @javax.annotation.Nonnull
    public ErrorsRequestBuilder errors() {
        return new ErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The topics property */
    @javax.annotation.Nonnull
    public TopicsRequestBuilder topics() {
        return new TopicsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new V1RequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public V1RequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new V1RequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public V1RequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.openshift.cloud.api.kas.auth.api.v1.consumerGroups.item collection
     * @param id Unique identifier of the item
     * @return a WithConsumerGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithConsumerGroupItemRequestBuilder consumerGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("consumerGroupId", id);
        return new WithConsumerGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.kas.auth.api.v1.errors.item collection
     * @param id Unique identifier of the item
     * @return a WithErrorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithErrorItemRequestBuilder errors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("errorId", id);
        return new WithErrorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.openshift.cloud.api.kas.auth.api.v1.topics.item collection
     * @param id Unique identifier of the item
     * @return a WithTopicNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithTopicNameItemRequestBuilder topics(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("topicName", id);
        return new WithTopicNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
