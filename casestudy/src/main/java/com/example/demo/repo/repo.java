package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.service.customerproperties;
import com.example.demo.service.orders;

public interface repo extends MongoRepository<customerproperties, Integer> {

}
