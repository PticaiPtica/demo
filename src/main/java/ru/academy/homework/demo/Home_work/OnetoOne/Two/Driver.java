package ru.academy.homework.demo.Home_work.OnetoOne.Two;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name= "birthDate")
    private Date birthDate;

    @OneToOne
    @JoinColumn(name = "license",referencedColumnName = "id")
    private License license;

}
