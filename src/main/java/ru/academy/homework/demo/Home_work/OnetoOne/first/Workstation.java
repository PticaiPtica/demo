package ru.academy.homework.demo.Home_work.OnetoOne.first;

import jakarta.persistence.*;

@Entity
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    @OneToOne(mappedBy = "workstation")
    private Employee employee;
}
