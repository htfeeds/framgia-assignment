package io.htfeeds.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
@Entity
public class Topic {
    @Id
    private Integer id;
    private String title;
    private String url;
    private String transliterated;
    @Column(length = 10000)
    private String contentsShort;
    @Column(length = 100000)
    private String contents;
    private Date publishedAt;
    private Boolean isPublished;
    private Date updatedAt;

    @ManyToOne
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTransliterated() {
        return transliterated;
    }

    public void setTransliterated(String transliterated) {
        this.transliterated = transliterated;
    }

    public String getContentsShort() {
        return contentsShort;
    }

    public void setContentsShort(String contentsShort) {
        this.contentsShort = contentsShort;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
