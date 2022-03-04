package com.example.demo.servicelayer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.orders;

@Service
public class ordersevice {

	@Autowired
	com.example.demo.repo.repoorders repoorders;
	
	
	
	public String addorders( orders o)
	{
		repoorders.save(o);
		return "order saved successfully with id";
	}
	/*@GetMapping("/findallorders")
	public List<orders> findallorders()
	{
		return repoorders.findAll();
	}*/
	
	
	//Reading Order by id
	
	public Optional<orders> getCustomerById( int id) {
	return repoorders.findById(id);

	}

	// Deleting order by Id

	public String deleteOrder( int id) {
		
		
			repoorders.deleteById(id);
			return "Order deleted with id";
		
}
	
	public String updateorder(int id,orders o)
	{
		repoorders.save(o);
		return "updated successfully "; 
	}
}
