package com.escuela.school;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Student {

    @Id
    private String id;

    private String name;
    private int age;
    private double gpa;
    private boolean fullTime;

    public Student(String name, int age, double gpa, boolean fullTime) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.fullTime = fullTime;
    }

    public Student() {
    }
}
