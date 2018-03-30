package com.jeya.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired // tell Spring it needs dependency injection
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() // return type will be converted to JSON
										// object by framework because of
										// annotation "@RestController"
	{
		return topicService.getAllTopics();
	}
}

/**
Resources here: Topic, Course, Lesson

Topic can have multiple courses and a course can consist of multiple lessons.
*/