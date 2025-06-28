package ru.academy.homework.demo.Home_work.OnetoOne.first;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "workstation",referencedColumnName = "id")
    private Workstation workstation;

}
