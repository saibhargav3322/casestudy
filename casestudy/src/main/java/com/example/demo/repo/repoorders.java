package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.service.orders;

public interface repoorders extends MongoRepository<orders, Integer> {

}
