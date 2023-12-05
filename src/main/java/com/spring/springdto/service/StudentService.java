package com.spring.springdto.service;

import com.spring.springdto.model.Student;
import com.spring.springdto.model.StudentDTO;
import com.spring.springdto.model.StudentResponse;
import com.spring.springdto.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<StudentDTO> getStudents(){
        List<Student> students= studentRepo.findAll();
        List<StudentDTO> studentDTOS=new ArrayList<>();
        for (int i=0;i<students.size();i++){
            StudentDTO studentDTO=new StudentDTO();
            studentDTO.setId(students.get(i).getId());
            studentDTO.setName(students.get(i).getName());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    public StudentResponse getStudent(Long id){
       Student student= studentRepo.findById(id).get();
       StudentResponse studentResponse=new StudentResponse();
       studentResponse.setName(student.getName());

       return studentResponse;
    }
}
