package com.jeya.springboot.topicbyspringjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeya.springboot.topic.Topic;

@RestController
public class TopicBySpringJPAController {

	@Autowired
	private TopicBySpringJPAService topicService;

	@RequestMapping("/topicsdb")
	public List<Topic> getAllTopics() // return type will be converted to JSON
										// object by framework because of
										// annotation "@RestController"
	{
		return topicService.getAllTopics();
	}

	@RequestMapping("/topicsdb/{foo}") // if names are same no need to specify
										// it in parenthesis
	public Topic getTopic(@PathVariable("foo") String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topicsdb")
	public void addTopic(@RequestBody Topic topic) // topic is extracted from
													// request body
	{
		topicService.addTopic(topic);
	}
}