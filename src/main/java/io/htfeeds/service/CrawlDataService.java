package io.htfeeds.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.htfeeds.json.model.PostFeedItemModel;
import io.htfeeds.json.model.TopicModel;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
@Service
public class CrawlDataService {

    @Autowired
    private TopicService topicService;

    @PostConstruct
    public void crawlData() {
        Client client = ClientBuilder.newClient();

        // Call api to get data from homepage https://viblo.asia
        WebTarget newestTarget = client.target("https://api.viblo.asia/newest?page={pageNumber}");
        PostFeedItemModel postFeedItem = newestTarget.resolveTemplate("pageNumber", "1").request(MediaType.APPLICATION_JSON)
                .get(PostFeedItemModel.class);

        // Filter out topic has 'java' word
        List<TopicModel> topics = new ArrayList<>();
        for (TopicModel topic : postFeedItem.getTopics()) {
            if (!topic.getTitle().toLowerCase().contains("java") && !topic.getContents().toLowerCase().contains("java")) {
                topics.add(topic);
            }
        }

        // Save to the DB
        if (topics.size() > 0) {
            topicService.AddTopics(topics);
        }
    }

}
