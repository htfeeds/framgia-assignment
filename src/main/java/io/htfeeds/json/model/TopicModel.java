package io.htfeeds.json.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "url",
    "user_id",
    "transliterated",
    "contents_short",
    "contents",
    "published_at",
    "is_published",
    "updated_at",
    "user"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopicModel {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("transliterated")
    private String transliterated;
    @JsonProperty("contents_short")
    private String contentsShort;
    @JsonProperty("contents")
    private String contents;
    @JsonProperty("published_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date publishedAt;
    @JsonProperty("is_published")
    private Boolean isPublished;
    @JsonProperty("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    @JsonProperty("user")
    private UserModel user;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("transliterated")
    public String getTransliterated() {
        return transliterated;
    }

    @JsonProperty("transliterated")
    public void setTransliterated(String transliterated) {
        this.transliterated = transliterated;
    }

    @JsonProperty("contents_short")
    public String getContentsShort() {
        return contentsShort;
    }

    @JsonProperty("contents_short")
    public void setContentsShort(String contentsShort) {
        this.contentsShort = contentsShort;
    }

    @JsonProperty("contents")
    public String getContents() {
        return contents;
    }

    @JsonProperty("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    @JsonProperty("published_at")
    public Date getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonProperty("is_published")
    public Boolean getIsPublished() {
        return isPublished;
    }

    @JsonProperty("is_published")
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("user")
    public UserModel getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(UserModel user) {
        this.user = user;
    }

}
