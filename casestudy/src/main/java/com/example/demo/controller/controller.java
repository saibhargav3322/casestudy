package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.customerproperties;
import com.example.demo.service.orders;
import com.example.demo.service.ratings;
import com.example.demo.servicelayer.customerservice;
import com.example.demo.servicelayer.ordersevice;

@RestController
@RequestMapping("/consumer")
public class controller {


	@Autowired
	customerservice service;
	@Autowired
	ordersevice orderservice;
	@Autowired
	com.example.demo.servicelayer.ratingservice ratingservice;
	
	@PostMapping("/addcustomer")
	public String addcustomers(@RequestBody customerproperties c)
	{
		service.addcustomers(c);
		return "customer details saved"+c.getcId();
	}
	@GetMapping("/findallcustomers")
	public List<customerproperties> findall()
	{
		return service.findall();
	}
	@DeleteMapping("/deletecustomer/{id}")
	public String deletecustomer(@PathVariable int id)
	{
		service.deletecustomer(id);
		return "customer details deleted"+id;
	}
	@PutMapping("/updatecustomer/{id}")
	public String updatecustomer(@PathVariable int id,@RequestBody customerproperties c)
	{
		service.updatecustomer(id,c);
		return "updated successfully "+id; 
	}
	
	
	
	//*****************************************************************************************************************
	
	@PostMapping("/addorders")
	public String addorders(@RequestBody orders o)
	{
		orderservice.addorders(o);
		return "order saved successfully with id " + o.getOid();
	}
	/*@GetMapping("/findallorders")
	public List<orders> findallorders()
	{
		return repoorders.findAll();
	}*/
	
	
	//Reading Order by id
	@GetMapping("/getorder/{id}")
	public Optional<orders> getCustomerById(@PathVariable int id) {
	return orderservice.getCustomerById(id);

	}

	// Deleting order by Id
	@DeleteMapping("/deleteorder/{id}")
	public String deleteOrder(@PathVariable int id) {
		
		
			orderservice.deleteOrder(id);
			return "Order deleted with id" + id;
		
}
	@PutMapping("/updateorder/{id}")
	public String updateorder(@PathVariable int id,@RequestBody orders o)
	{
		orderservice.updateorder(id,o);
		return "updated successfully "+id; 
	}
	
	
	//************************************************************************************************************************
	@PostMapping("/addreviews")
	public String addreviews(@RequestBody ratings r)
	{
		ratingservice.addreviews(r);
		return "added rating with id "+r.getwname();
 	}
	@GetMapping("/getallratings")
	public List<ratings> getallratings()
	{
		return ratingservice.getallratings();
	}
}
