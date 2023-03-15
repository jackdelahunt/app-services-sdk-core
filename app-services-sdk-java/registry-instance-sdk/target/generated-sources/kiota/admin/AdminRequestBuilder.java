package com.openshift.cloud.api.registry.instance.admin;

import com.microsoft.kiota.RequestAdapter;
import com.openshift.cloud.api.registry.instance.admin.artifacttypes.ArtifactTypesRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.config.ConfigRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.export.ExportRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.importEscaped.ImportRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.loggers.item.WithLoggerItemRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.loggers.LoggersRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.rolemappings.item.WithPrincipalItemRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.rolemappings.RoleMappingsRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.rules.item.WithRuleItemRequestBuilder;
import com.openshift.cloud.api.registry.instance.admin.rules.RulesRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /admin
 */
public class AdminRequestBuilder {
    /** The list of artifact types supported by this instance of Registry. */
    @javax.annotation.Nonnull
    public ArtifactTypesRequestBuilder artifactTypes() {
        return new ArtifactTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The config property */
    @javax.annotation.Nonnull
    public ConfigRequestBuilder config() {
        return new ConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides a way to export registry data. */
    @javax.annotation.Nonnull
    public ExportRequestBuilder export() {
        return new ExportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides a way to import data into the registry. */
    @javax.annotation.Nonnull
    public ImportRequestBuilder importEscaped() {
        return new ImportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Manage logger settings/configurations. */
    @javax.annotation.Nonnull
    public LoggersRequestBuilder loggers() {
        return new LoggersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Collection to manage role mappings for authenticated principals */
    @javax.annotation.Nonnull
    public RoleMappingsRequestBuilder roleMappings() {
        return new RoleMappingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Manage the global rules that apply to all artifacts if not otherwise configured. */
    @javax.annotation.Nonnull
    public RulesRequestBuilder rules() {
        return new RulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new AdminRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/admin";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AdminRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/admin";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Manage logger settings/configurations.
     * @param id Unique identifier of the item
     * @return a WithLoggerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithLoggerItemRequestBuilder loggers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("logger", id);
        return new WithLoggerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Manage the configuration of a single role mapping.
     * @param id Unique identifier of the item
     * @return a WithPrincipalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithPrincipalItemRequestBuilder roleMappings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("principalId", id);
        return new WithPrincipalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Manage the configuration of a single global artifact rule.
     * @param id Unique identifier of the item
     * @return a WithRuleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithRuleItemRequestBuilder rules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("rule", id);
        return new WithRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
