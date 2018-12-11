package io.htfeeds.service;

import java.util.List;

import io.htfeeds.entity.Topic;
import io.htfeeds.json.model.TopicModel;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
public interface ITopicService {

    public List<Topic> getAllTopics();

    public void AddTopics(List<TopicModel> topics);

}
