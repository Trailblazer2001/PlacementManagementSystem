package com.example.demo.service;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;


@Service
@Transactional
	public class AdminService 
	{
@Autowired
	 private AdminRepository repo;
	 
	 public java.util.List<Admin> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Admin admin) 
	 {
	 repo.save(admin);
	 }
	 
	 public Admin get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
		
	
	}
	
