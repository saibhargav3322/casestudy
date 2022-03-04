package com.example.demo.controller;

//Gowtham new
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.repoorders;
import com.example.demo.repo.washerrepo;
import com.example.demo.service.orders;
import com.example.demo.service.ratings;
import com.example.demo.service.washer;

@RestController
@RequestMapping("/washer")
public class washercontroller {

	@Autowired
	private washerrepo washerRepository;
	@Autowired
	private repoorders repoorders;
	@Autowired
	private com.example.demo.repo.ratingsrepo ratingsrepo;
	

    //Creating for Adding Washer	
	
	@PostMapping("/addwasher")
	public washer saveWasher( @RequestBody washer washer) {
		return washerRepository.save(washer);
	}
	
	
		
		//Reading Washer by ID
		@GetMapping("/allwashers/{id}")
		public Optional<washer> getWasherById(@PathVariable int id) 
		{
			return washerRepository.findById(id);
		}		
		
		//Reading Washers
	    @GetMapping("/allwashers")
		 public List<washer> getWasher() 
		 {
			return washerRepository.findAll();
		 }		
				
				
		 //Updating Washer by ID
		 @PutMapping("/update/{id}")		
		 public String UpdaterById(@PathVariable int id,@RequestBody washer w) 
		 {
			washerRepository.save(w);
		    return "updated";
		  }	
		 
		 //Deleting Washer by ID
		 @DeleteMapping("/delete/{id}")
			public ResponseEntity<Object> deleteCustomerbyid (@PathVariable int id)
			{
				washerRepository.deleteById(id);
				return new ResponseEntity<Object>("Washer deleted with id "+id,HttpStatus.OK);
			}
		 
		
		//************************************************************************************************************************

			//Reading Order by id
			@GetMapping("/order/{id}")
			public Optional<orders> getCustomerById(@PathVariable int id) {
			return repoorders.findById(id);

			}

			// Reading all washer
			@GetMapping("/allorders")
			public List<orders> getOrder() {
				return repoorders.findAll();
			}
			
			//***************************************************************************
			
			 //Creating and adding ratings
		    @PostMapping("/addrating")
		    public String saveRating(@RequestBody ratings rating)
		    {
		    	ratingsrepo.save(rating);
		    return " Thanks for Your Valuable feedback. " + rating;
		    }


		    //Reading all ratings
		    @GetMapping("/allratings")
		    public List<ratings> getAllRating()
		    {
		    return ratingsrepo.findAll();
		    		}


		    //Read Rating By washerId
		    @GetMapping("/ratings/{id}")
		    public Optional<ratings> getRatingById(@PathVariable int id)
		    {
		    return ratingsrepo.findById(id);
		    		
		    }

}
