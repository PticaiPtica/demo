package ru.academy.homework.demo.Home_work.OnetoOne.second;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String password;

    @OneToOne
    @JoinColumn(name = "profile_id",referencedColumnName = "id")
    private Profile profile;
}
