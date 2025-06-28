package ru.academy.homework.demo.Home_work.ManyToMany.second;

import jakarta.persistence.*;

@Entity
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false, name = "LALALAL")
    private String lalalala = "lala";

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @JoinColumn(name = "course_id")
    @ManyToOne
    private Course course;

}
