package com.nytimes.articles.data.local.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.SerializedName;
import com.nytimes.articles.data.remote.model.ArticleResponse;

/**
 * File Description
 * <p>
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 27-apr-2019
 * Modified: 27-apr-2019
 */
@Entity(tableName = "articles")
public class ArticleEntity {

    @PrimaryKey
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

    private String content;
    private String imageUrl;

    public ArticleEntity() {

    }

    public ArticleEntity(ArticleResponse articleResponse) {
        this.id = articleResponse.getId();
        this.title = articleResponse.getTitle();
        this.authors = articleResponse.getAuthors();
        this.publishedDate = articleResponse.getPublishedDate();
        this.url = articleResponse.getUrl();
        if (articleResponse.getMediaResponseList() != null && articleResponse.getMediaResponseList().size() > 0) {
            if (articleResponse.getMediaResponseList().get(0).getMetadataResponseList() != null && articleResponse.getMediaResponseList().get(0).getMetadataResponseList().size() > 0) {
                try {
                    this.imageUrl = articleResponse.getMediaResponseList().get(0).getMetadataResponseList().get(0).getUrl();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

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

    /*

        public List<MediaResponse> getMediaResponseList() {
            return mediaEntityList;
        }

        public void setMediaResponseList(List<MediaResponse> mediaEntityList) {
            this.mediaEntityList = mediaEntityList;
        }
    */
    @BindingAdapter("profileImage")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl).apply(new RequestOptions().circleCrop())
                .into(view);
    }
}
