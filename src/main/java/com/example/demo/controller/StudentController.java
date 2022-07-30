package com.example.demo.controller;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
@Autowired
 private StudentService service;

 @GetMapping("/student")
 public List<Student> list() 
 	{	
	 	return service.listAll();
 	}
 @GetMapping("/student/{id}")
 public ResponseEntity<Student> get(@PathVariable Long id) 
{
try
	 {
		 Student students = service.get(id);
		 return new ResponseEntity<Student>(students, HttpStatus.OK);
	 } 
catch (NoSuchElementException e) 
	{
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	} 
} 
 // RESTful API method for Create operation
 @PostMapping("/student")
 public void add(@RequestBody Student students) 
 	{
	 	service.save(students);
 	}
 // RESTful API method for Update operation
 @PutMapping("/student/{id}")
public ResponseEntity<?> update(@RequestBody Student students, @PathVariable Long id) 
{
try
 	{
		
		service.save(students);
		return new ResponseEntity<>(HttpStatus.OK);
 	} 
catch (NoSuchElementException e) 
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} 
}
 // RESTful API method for Update operation
@DeleteMapping("/student/{id}")
public void delete(@PathVariable Long id) 
{
service.delete(id);
}

}