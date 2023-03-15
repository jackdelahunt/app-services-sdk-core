package com.openshift.cloud.api.registry.instance.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LogLevel implements ValuedEnum {
    DEBUG("DEBUG"),
    TRACE("TRACE"),
    WARN("WARN"),
    ERROR("ERROR"),
    SEVERE("SEVERE"),
    WARNING("WARNING"),
    INFO("INFO"),
    CONFIG("CONFIG"),
    FINE("FINE"),
    FINER("FINER"),
    FINEST("FINEST");
    public final String value;
    LogLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LogLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DEBUG": return DEBUG;
            case "TRACE": return TRACE;
            case "WARN": return WARN;
            case "ERROR": return ERROR;
            case "SEVERE": return SEVERE;
            case "WARNING": return WARNING;
            case "INFO": return INFO;
            case "CONFIG": return CONFIG;
            case "FINE": return FINE;
            case "FINER": return FINER;
            case "FINEST": return FINEST;
            default: return null;
        }
    }
}
