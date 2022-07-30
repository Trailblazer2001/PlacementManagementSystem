package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Certificate {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private int year;
private String college;

public Certificate() {
	 
}
public Certificate(int id, int year, String college) {

	this.id = id;
	this.year = year;
	this.college = college;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}

}
