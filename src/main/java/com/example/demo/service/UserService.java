package com.example.demo.service;



import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
@Service
@Transactional
public class UserService 
{
 @Autowired
 private UserRepository repo;
 
 public List<User> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(User users) 
 {
 repo.save(users);
 }
 
 public User get(Integer id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 }
}