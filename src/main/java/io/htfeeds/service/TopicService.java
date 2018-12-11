package io.htfeeds.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.htfeeds.entity.Topic;
import io.htfeeds.json.model.TopicModel;
import io.htfeeds.mapper.TopicMapper;
import io.htfeeds.repository.ITopicRepository;
import io.htfeeds.repository.IUserRepository;

/**
 * @author HTFeeds
 *
 * Oct 22, 2018
 */
@Service
public class TopicService implements ITopicService {

    @Autowired
    private ITopicRepository topicRepository;

    @Autowired
    private IUserRepository userRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add);

        return topics;
    }

    public void AddTopics(List<TopicModel> models) {
        List<Topic> topics = TopicMapper.mapJsonModelIntoEntities(models);

        topics.forEach(e -> userRepository.save(e.getUser()));
        topicRepository.saveAll(topics);
    }

}
