package com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.item.metrics;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.item.metrics.federate.FederateRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.item.metrics.query_range.Query_rangeRequestBuilder;
import com.openshift.cloud.api.kas.api.kafkas_mgmt.v1.kafkas.item.metrics.query.QueryRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /api/kafkas_mgmt/v1/kafkas/{id}/metrics
 */
public class MetricsRequestBuilder {
    /** The federate property */
    @javax.annotation.Nonnull
    public FederateRequestBuilder federate() {
        return new FederateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The query property */
    @javax.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The query_range property */
    @javax.annotation.Nonnull
    public Query_rangeRequestBuilder query_range() {
        return new Query_rangeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new MetricsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MetricsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/api/kafkas_mgmt/v1/kafkas/{id}/metrics";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new MetricsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MetricsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/api/kafkas_mgmt/v1/kafkas/{id}/metrics";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}
