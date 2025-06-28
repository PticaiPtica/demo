package ru.academy.homework.demo.Home_work.ManyToMany.second;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @OneToMany(mappedBy = "student")
    private Set<StudentCourse> studentCourses;
}