package com.spring.springdto.service;

import com.spring.springdto.model.Student;
import com.spring.springdto.model.StudentDTO;
import com.spring.springdto.model.StudentResponse;
import com.spring.springdto.repo.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


   @Autowired
  private ModelMapper modelMapper;
    @Autowired
    private StudentRepo studentRepo;

    public List<StudentDTO> getStudents(){
        List<Student> students= studentRepo.findAll();
        List<StudentDTO> studentDTOS=new ArrayList<>();
        for (int i=0;i<students.size();i++){
            StudentDTO studentDTO=modelMapper.map(students.get(i), StudentDTO.class);

            //studentDTO.setId(students.get(i).getId());
           // studentDTO.setName(students.get(i).getName());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }
    
    public List<Student> getStudentsAfterR(){
        return studentRepo.findAll();
       
    }

    public StudentResponse getStudent(Long id){
       Student student= studentRepo.findById(id).get();
       StudentResponse studentResponse=new StudentResponse();
       studentResponse.setPhone("01125589989");
       // studentResponse  =modelMapper.map(student, StudentResponse.class);
       modelMapper.map(student,studentResponse);
       return studentResponse;
    }
}
