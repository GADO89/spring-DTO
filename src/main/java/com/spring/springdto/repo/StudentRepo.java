package com.spring.springdto.repo;

import com.spring.springdto.model.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<Student, Long> {
	
  
}
