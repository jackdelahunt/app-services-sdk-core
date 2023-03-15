package com.openshift.cloud.api.accountmanagement.api.authorizations.v1;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.access_review.Access_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.capability_review.Capability_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.export_control_review.Export_control_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.feature_review.Feature_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.resource_review.Resource_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.self_access_review.Self_access_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.self_feature_review.Self_feature_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.self_resource_review.Self_resource_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.self_terms_review.Self_terms_reviewRequestBuilder;
import com.openshift.cloud.api.accountmanagement.api.authorizations.v1.terms_review.Terms_reviewRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/authorizations/v1
 */
public class V1RequestBuilder {
    /** The access_review property */
    @javax.annotation.Nonnull
    public Access_reviewRequestBuilder access_review() {
        return new Access_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The capability_review property */
    @javax.annotation.Nonnull
    public Capability_reviewRequestBuilder capability_review() {
        return new Capability_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The export_control_review property */
    @javax.annotation.Nonnull
    public Export_control_reviewRequestBuilder export_control_review() {
        return new Export_control_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The feature_review property */
    @javax.annotation.Nonnull
    public Feature_reviewRequestBuilder feature_review() {
        return new Feature_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The resource_review property */
    @javax.annotation.Nonnull
    public Resource_reviewRequestBuilder resource_review() {
        return new Resource_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The self_access_review property */
    @javax.annotation.Nonnull
    public Self_access_reviewRequestBuilder self_access_review() {
        return new Self_access_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The self_feature_review property */
    @javax.annotation.Nonnull
    public Self_feature_reviewRequestBuilder self_feature_review() {
        return new Self_feature_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The self_resource_review property */
    @javax.annotation.Nonnull
    public Self_resource_reviewRequestBuilder self_resource_review() {
        return new Self_resource_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The self_terms_review property */
    @javax.annotation.Nonnull
    public Self_terms_reviewRequestBuilder self_terms_review() {
        return new Self_terms_reviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The terms_review property */
    @javax.annotation.Nonnull
    public Terms_reviewRequestBuilder terms_review() {
        return new Terms_reviewRequestBuilder(pathParameters, requestAdapter);
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
        this.urlTemplate = "{+baseurl}/api/authorizations/v1";
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
        this.urlTemplate = "{+baseurl}/api/authorizations/v1";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}
