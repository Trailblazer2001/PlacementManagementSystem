package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@Service
	public class CollegeService {

@Autowired
    private CollegeRepository repo;
	
	public List<College> listAll() {
        return repo.findAll();
    }
     
    public void save(College std) {
        repo.save(std);
    }
     
    public College get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	
}