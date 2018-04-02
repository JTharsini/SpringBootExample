package com.jeya.springboot.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeya.springboot.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/topicsdb/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.findByTopicId(topicId);
	}

	@RequestMapping("/topicsdb/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable("courseId") String cId) {
		return courseService.getCourse(cId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topicsdb/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topicsdb/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topicsdb/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}