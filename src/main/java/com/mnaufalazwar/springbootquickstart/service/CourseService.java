package com.mnaufalazwar.springbootquickstart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnaufalazwar.springbootquickstart.model.Course;
import com.mnaufalazwar.springbootquickstart.model.Topic;
import com.mnaufalazwar.springbootquickstart.repository.CourseRepository;
import com.mnaufalazwar.springbootquickstart.repository.TopicRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
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
