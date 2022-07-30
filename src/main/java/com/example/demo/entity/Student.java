package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Student {

@Id

@GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;

private String studentname;
private String college;
private long roll;
private String qualification;
private String course;
private int year;
private String certificate;
private int hallticketno;
public Student(Long id, String studentname, String college, Long roll,String qualification, String course, int year, String certificate, int hallticketno) {

		this.id = id;
		this.studentname = studentname;
		this.college = college;
		this.roll= roll;
		this.qualification= qualification;
		this.course=course;
		this.year=year;
		this.certificate= certificate;
		this.hallticketno= hallticketno;

}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public int getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(int hallticketno) {
		this.hallticketno = hallticketno;
	}
	
}

