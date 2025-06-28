package ru.academy.homework.demo.Home_work.OnetoOne.One;

import jakarta.persistence.*;

@Entity
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "darkMode")
    private boolean darkMode;

    @Column(name = "language")
    private String language;
}
