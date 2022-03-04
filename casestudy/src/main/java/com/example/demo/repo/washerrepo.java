package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.service.washer;

public interface washerrepo extends MongoRepository<washer, Integer>{

	washer findBywEmail(String wEmail);
}
