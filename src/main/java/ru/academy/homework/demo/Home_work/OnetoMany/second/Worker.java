package ru.academy.homework.demo.Home_work.OnetoMany.second;

import jakarta.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String position;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


}
