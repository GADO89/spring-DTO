package com.spring.springdto.controller;

import com.spring.springdto.model.Student;
import com.spring.springdto.repo.StudentRepo;
import com.spring.springdto.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }
}
