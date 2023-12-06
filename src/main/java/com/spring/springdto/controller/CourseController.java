package com.spring.springdto.controller;

import com.spring.springdto.model.Course;
import com.spring.springdto.model.CourseDTO;
import com.spring.springdto.model.Student;
import com.spring.springdto.service.CourseService;
import com.spring.springdto.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService  courseService;

    @GetMapping("/allCourse")
    public List<CourseDTO> getAllCourses(){
        return courseService.getCourses();
    }
    
    @GetMapping("/allCourseR")
    public List<Course> getAllCoursesAfterR(){
        return courseService.getCoursesAfterR();
    }
}
