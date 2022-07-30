package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {

private int id;
private String name;
private String type;
private String password;

public User() {
	 
}
public User(int id, String name, String type, String password) {

	this.id = id;
	this.name = name;
	this.type = type;
	this.password= password;
	}
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}