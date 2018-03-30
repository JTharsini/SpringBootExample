package com.jeya.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/topics/{foo}") // if names are same no need to specify it in parenthesis
	public Topic getTopic(@PathVariable("foo") String id)
	{
		return topicService.getTopic(id);
	}
}

/**
Resources here: Topic, Course, Lesson

Topic can have multiple courses and a course can consist of multiple lessons.
*/