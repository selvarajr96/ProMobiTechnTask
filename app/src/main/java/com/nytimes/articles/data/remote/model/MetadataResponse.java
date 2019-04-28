package com.nytimes.articles.data.remote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetadataResponse {

    @SerializedName("url")
    private String url;
    @SerializedName("format")
    private String format;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
