package ru.academy.homework.demo.Home_work.ManyToMany.One;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @ManyToMany(mappedBy = "hospitals")
    private Set<Doctor> doctors;


}
