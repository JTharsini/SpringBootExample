package com.jeya.springboot.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{// <a, b> a: what class it will work with, b: type of primary key
	
}