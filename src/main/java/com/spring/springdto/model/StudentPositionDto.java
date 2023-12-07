package com.spring.springdto.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

public class StudentPositionDto {

   
	
	private Long id;
	
	private String name;
	
	
	
	private List<CourseResponse> courses=new ArrayList<CourseResponse>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CourseResponse> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseResponse> courses) {
		this.courses = courses;
	}

   
	
	
}
