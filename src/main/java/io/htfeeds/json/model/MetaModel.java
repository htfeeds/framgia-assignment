package io.htfeeds.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author HTFeeds
 *
 * Oct 24, 2018
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pagination" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaModel {

    @JsonProperty("pagination")
    private PaginationModel pagination;

    @JsonProperty("pagination")
    public PaginationModel getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(PaginationModel pagination) {
        this.pagination = pagination;
    }

}
