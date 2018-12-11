package io.htfeeds.mapper;

import java.util.ArrayList;
import java.util.List;

import io.htfeeds.entity.Topic;
import io.htfeeds.json.model.TopicModel;

/**
 * @author HTFeeds
 *
 * Oct 24, 2018
 */
final public class TopicMapper {

    public static List<Topic> mapJsonModelIntoEntities(Iterable<TopicModel> src) {
        List<Topic> topics = new ArrayList<>();

        src.forEach(e -> topics.add(TopicMapper.mapJsonModelIntoEntity(e)));

        return topics;
    }

    public static Topic mapJsonModelIntoEntity(TopicModel src) {
        Topic topic = new Topic();

        topic.setId(src.getId());
        topic.setTitle(src.getTitle());
        topic.setUrl(src.getUrl());
        topic.setTransliterated(src.getTransliterated());
        topic.setContentsShort(src.getContentsShort());
        topic.setContents(src.getContents());
        topic.setPublishedAt(src.getPublishedAt());
        topic.setIsPublished(src.getIsPublished());
        topic.setUpdatedAt(src.getUpdatedAt());
        topic.setUser(UserMapper.mapJsonModelIntoEntity(src.getUser().getUserDetail()));

        return topic;
    }

}
