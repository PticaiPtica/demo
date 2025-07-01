package ru.academy.homework.demo.Home_work.OneToMany.One;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name= "country")
    private String country;

    @OneToMany(mappedBy = "publisher")
    private List<Magazine> magazines;


}
