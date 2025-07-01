package ru.academy.homework.demo.Home_work.ManyToMany.One;

import jakarta.persistence.*;
import ru.academy.homework.demo.Home_work.OnetoOne.One.Setting;

import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "speciliazation")
    private String speciliazation;

    @ManyToMany
    @JoinTable(
            name = "doctor_hospital"
            ,joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "hospital_id")
    )
    private List<Hospital> hospitals;


}
