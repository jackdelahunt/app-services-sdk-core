package com.openshift.cloud.api.serviceaccounts.apis;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.serviceaccounts.apis.beta.BetaRequestBuilder;
import com.openshift.cloud.api.serviceaccounts.apis.organizations.OrganizationsRequestBuilder;
import com.openshift.cloud.api.serviceaccounts.apis.service_accounts.Service_accountsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apis
 */
public class ApisRequestBuilder {
    /** The beta property */
    @javax.annotation.Nonnull
    public BetaRequestBuilder beta() {
        return new BetaRequestBuilder(pathParameters, requestAdapter);
    }
    /** The organizations property */
    @javax.annotation.Nonnull
    public OrganizationsRequestBuilder organizations() {
        return new OrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The service_accounts property */
    @javax.annotation.Nonnull
    public Service_accountsRequestBuilder service_accounts() {
        return new Service_accountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new ApisRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApisRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/apis";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ApisRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApisRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/apis";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}
