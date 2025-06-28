package ru.academy.homework.demo.Home_work.OnetoOne.second;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String avatarUrl;

    @OneToOne(mappedBy = "profile")

    private Person person;
}

