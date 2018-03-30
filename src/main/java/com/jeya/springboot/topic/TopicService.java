package com.jeya.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = Arrays.asList(new Topic("topicId1", "Topic 1", "Topic 1 description"),
			new Topic("topicId2", "Topic 2", "Topic 2 description"),
			new Topic("topicId3", "Topic 3", "Topic 3 description"));

	public List<Topic> getAllTopics() {
		return topics;
	}
}