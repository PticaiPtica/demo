package ru.academy.homework.demo.Home_work.ManyToMany.second;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @OneToMany(mappedBy = "course")
    private Set<StudentCourse> studentsCourse;


}
