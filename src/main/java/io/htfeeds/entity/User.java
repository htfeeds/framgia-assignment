package io.htfeeds.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
@Entity
public class User {
    @Id
    private Integer id;
    private String url;
    private String name;
    private String username;
    private String smallAvatar;
    private String bigAvatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSmallAvatar() {
        return smallAvatar;
    }

    public void setSmallAvatar(String smallAvatar) {
        this.smallAvatar = smallAvatar;
    }

    public String getBigAvatar() {
        return bigAvatar;
    }

    public void setBigAvatar(String bigAvatar) {
        this.bigAvatar = bigAvatar;
    }

}
