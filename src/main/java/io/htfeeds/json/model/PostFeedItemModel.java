package io.htfeeds.json.model;

import java.util.List;

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
@JsonPropertyOrder({ "data", "meta" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostFeedItemModel {

    @JsonProperty("data")
    private List<TopicModel> topics = null;
    @JsonProperty("meta")
    private MetaModel meta;

    @JsonProperty("data")
    public List<TopicModel> getTopics() {
        return topics;
    }

    @JsonProperty("data")
    public void setTopics(List<TopicModel> topics) {
        this.topics = topics;
    }

    @JsonProperty("meta")
    public MetaModel getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

}
