package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
@Transactional
public class StudentService 
{
 @Autowired
 private StudentRepository repo;
 
 public List<Student> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(Student student) 
 {
 repo.save(student);
 }
 
 public Student get(Long id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Long id) 
 {
 repo.deleteById(id);
 }
}
