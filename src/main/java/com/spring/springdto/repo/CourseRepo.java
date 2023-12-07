package com.spring.springdto.repo;

import com.spring.springdto.model.Course;
import com.spring.springdto.model.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
	
	     @Bean("select c.stuent from Course c where c.id=?1")
		public Student findStudentByCourdeID(Long id);
}
