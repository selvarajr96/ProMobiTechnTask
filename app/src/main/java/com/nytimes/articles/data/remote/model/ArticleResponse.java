package com.nytimes.articles.data.remote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticleResponse {

    @SerializedName("id")
    private long id;

    @SerializedName("title")
    private String title;

    @SerializedName("byline")
    private String authors;

    @SerializedName("published_date")
    private String publishedDate;

    @SerializedName("url")
    private String url;


    @SerializedName("media")
    List<MediaResponse> mediaResponseList;




    private String content;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public List<MediaResponse> getMediaResponseList() {
        return mediaResponseList;
    }

    public void setMediaResponseList(List<MediaResponse> mediaResponseList) {
        this.mediaResponseList = mediaResponseList;
    }


}
