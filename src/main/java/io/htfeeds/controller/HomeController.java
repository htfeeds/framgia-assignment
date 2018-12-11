package io.htfeeds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.htfeeds.entity.Topic;
import io.htfeeds.service.ITopicService;

/**
 * @author HTFeeds
 *
 * Oct 22, 2018
 */
@RestController
public class HomeController {

    @Autowired
    private ITopicService topicService;

    @GetMapping({ "", "/home" })
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

}
