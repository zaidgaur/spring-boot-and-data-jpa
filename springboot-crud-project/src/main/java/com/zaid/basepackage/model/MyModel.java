package com.zaid.basepackage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String rollNumber;
	private String name;
	private String course;
	private String branch;
	private String marksInPercentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String studentName) {
		this.name = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMarksInPercentage() {
		return marksInPercentage;
	}
	public void setMarksInPercentage(String marksInPercentage) {
		this.marksInPercentage = marksInPercentage;
	}
	@Override
	public String toString() {
		return "MyModel [id=" + id + ", rollNumber=" + rollNumber + ", name=" + name + ", course=" + course
				+ ", branch=" + branch + ", marksInPercentage=" + marksInPercentage + "]";
	}
	
	
	

}
