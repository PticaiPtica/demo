package ru.academy.homework.demo.Home_work.ManyToMany.Two;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TeachingAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "hoursPerWeek")
    private Integer hoursPerWeek;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @JoinColumn(name = "classroom_id")
    @ManyToOne
    private Classroom classroom;



}
