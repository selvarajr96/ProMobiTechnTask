package com.nytimes.articles.data.remote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaResponse {
    @SerializedName("type")
    private String type;
    @SerializedName("media-metadata")
    private List<MetadataResponse> metadataResponseList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MetadataResponse> getMetadataResponseList() {
        return metadataResponseList;
    }

    public void setMetadataResponseList(List<MetadataResponse> metadataResponseList) {
        this.metadataResponseList = metadataResponseList;
    }
}
