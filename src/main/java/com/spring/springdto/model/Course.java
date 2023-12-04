package com.spring.springdto.model;

import jakarta.persistence.Id;

public class Course {

    @Id
    private Long id;

    private String name;

    private String cost;

    private String time;


}
