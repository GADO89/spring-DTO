package com.spring.springdto.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class StudentPositionDto {

   
	
	private Long id;
	
	private String name;
	
	
	
	@OneToMany
	private List<Course> courses=new ArrayList<Course>();

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


	
	
}
