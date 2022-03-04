package com.example.demo.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.ratings;

@Service
public class ratingservice {

	@Autowired
	com.example.demo.repo.ratingsrepo ratingsrepo;
	
	
	public String addreviews(@RequestBody ratings r)
	{
		ratingsrepo.save(r);
		return "added rating with id "+r.getwname();
 	}
	
	public List<ratings> getallratings()
	{
		return ratingsrepo.findAll();
	}
}
