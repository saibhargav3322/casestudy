package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.service.ratings;

public interface ratingsrepo  extends MongoRepository<ratings, Integer>{

}
