package ru.academy.homework.demo.Home_work.ManyToMany.first;

import jakarta.persistence.*;

import java.util.List;


public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String FullName;

    @ManyToMany
    @JoinTable(
            name = "student_course"
            , joinColumns = @JoinColumn(name = "student_id")
            , inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
