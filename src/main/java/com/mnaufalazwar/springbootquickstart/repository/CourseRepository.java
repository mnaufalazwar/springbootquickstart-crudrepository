package com.mnaufalazwar.springbootquickstart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mnaufalazwar.springbootquickstart.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
}
