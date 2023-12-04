package com.spring.springdto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Long id;

    private String name;

    private String age;


}
