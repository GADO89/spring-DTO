package com.spring.springdto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Course {

    @Id
    private Long id;

    private String name;

    private String cost;

    private String time;


}
