package com.jeya.springboot.topicbyspringjpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeya.springboot.topic.Topic;
import com.jeya.springboot.topic.TopicRepository;

@Service
public class TopicBySpringJPAService {
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic>topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add); // method reference
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic); // save can update and save
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}