package ru.academy.homework.demo.Home_work.OnetoMany.first;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullName")
    private String fullName;

    @OneToMany(mappedBy = "author")
    private List<Book> book;

}
