package com.jeya.springboot.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	// filter on a property? needs to specify methods like this: no need
	
	
	public List<Course> findByName(String courseName); 
	// if I write the name in a random manner, I need to write implementation. Instead, if I have name as per convention, spring data JPA knows what to do with that
	// findBy<name> : property to be filtered on
	
	public List<Course> findByDescription(String description); // get all the courses with a description
	
	public List<Course> findByTopicId(String topicId); // topic is not a String. So need to provide the attribute name to be used in it
}