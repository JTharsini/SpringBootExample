package com.jeya.springboot.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> findByTopicId(String topicId) {
		return courseRepository.findByTopicId(topicId);
	}

	public Course getCourse(String cId) {
		return courseRepository.findById(cId).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}