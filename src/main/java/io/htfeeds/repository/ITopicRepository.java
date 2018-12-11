package io.htfeeds.repository;

import org.springframework.data.repository.CrudRepository;

import io.htfeeds.entity.Topic;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
public interface ITopicRepository extends CrudRepository<Topic, Integer> {

}
