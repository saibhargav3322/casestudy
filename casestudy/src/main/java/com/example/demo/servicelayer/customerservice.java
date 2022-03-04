package com.example.demo.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.repo.repo;
import com.example.demo.service.customerproperties;


@Service
public class customerservice {

	@Autowired
	repo repo;
	
	
	public String addcustomers(customerproperties c)
	{
		repo.save(c);
		return "customer details saved"+c.getcId();
	}

	public List<customerproperties> findall()
	{

			return repo.findAll();

	}
	
	public String deletecustomer(int id)
	{
		repo.deleteById(id);
		return "customer details deleted"+id;
	}

	public String updatecustomer(int id,customerproperties c)
	{
		repo.save(c);
		return "updated successfully "+id; 
	}
}
