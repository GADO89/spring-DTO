package com.spring.springdto.service;

import com.spring.springdto.model.Student;
import com.spring.springdto.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}