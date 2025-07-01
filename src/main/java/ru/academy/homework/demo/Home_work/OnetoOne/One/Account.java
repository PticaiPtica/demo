package ru.academy.homework.demo.Home_work.OnetoOne.One;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String Name;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn (name = "setting",referencedColumnName = "id")
    private Setting setting;
}
