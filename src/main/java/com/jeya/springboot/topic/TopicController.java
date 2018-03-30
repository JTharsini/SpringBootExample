package com.jeya.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() // return type will be converted to JSON
										// object by framework because of
										// annotation "@RestController"
	{
		return Arrays.asList(new Topic("topicId1", "Topic 1", "Topic 1 description"),
				new Topic("topicId2", "Topic 2", "Topic 2 description"),
				new Topic("topicId3", "Topic 3", "Topic 3 description"));
	}
}