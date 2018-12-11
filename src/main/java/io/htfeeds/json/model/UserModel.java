package io.htfeeds.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author HTFeeds
 *
 * Oct 24, 2018
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserModel {

    @JsonProperty("data")
    private UserDetailModel userDetail;

    @JsonProperty("data")
    public UserDetailModel getUserDetail() {
        return userDetail;
    }

    @JsonProperty("data")
    public void setUserDetail(UserDetailModel userDetail) {
        this.userDetail = userDetail;
    }

}
