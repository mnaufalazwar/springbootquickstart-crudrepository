package com.mnaufalazwar.springbootquickstart.repository;

import org.springframework.data.repository.CrudRepository;

import com.mnaufalazwar.springbootquickstart.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
