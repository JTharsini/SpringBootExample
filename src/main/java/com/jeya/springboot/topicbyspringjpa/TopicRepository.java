package com.jeya.springboot.topicbyspringjpa;

import org.springframework.data.repository.CrudRepository;

import com.jeya.springboot.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{// <a, b> a: what class it will work with, b: type of primary key
	
}