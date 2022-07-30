package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.College;
import com.example.demo.service.CollegeService;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
	public class CollegeController {
		
@Autowired
	private CollegeService service;
	
	public List <College>list()
	{
		return service.listAll();
	}   
		    	   
@GetMapping("/college/{id}")
	public ResponseEntity<College> get(@PathVariable Integer id) 
	{
	try
	{
		College colleges = service.get(id);
		return new ResponseEntity<College>(colleges, HttpStatus.OK);
	} 
	catch (NoSuchElementException e) 
	{
		return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
	} 
	} 
		    
@PostMapping("/college")
	public void add(@RequestBody College colleges) 
	{
		service.save(colleges);
	}
		    
@PutMapping("/college/{id}")
	public ResponseEntity<?> update(@RequestBody College colleges, @PathVariable Integer id) 
	{
	try
	{
		service.save(colleges);
		return new ResponseEntity<>(HttpStatus.OK);
	} 
	catch (NoSuchElementException e) 
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} 
	}
		    
@DeleteMapping("/college/{id}")
	public void delete(@PathVariable Integer id) 
	{
		service.delete(id);
	}		    
	
}