package ru.academy.homework.demo.Home_work.ManyToMany.Two;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @OneToMany(mappedBy = "teacher")
    private Set<TeachingAssignment> teachingAssignment;


}
