package ru.academy.homework.demo.Home_work.OnetoOne.One;

import jakarta.persistence.*;

@Entity
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "darkMode")
    private boolean darkMode;

    @Column(name = "language")
    private String language;

    @OneToOne(mappedBy = "setting")
    private Account account;
}
