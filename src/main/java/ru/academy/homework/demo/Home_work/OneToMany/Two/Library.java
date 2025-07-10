package ru.academy.homework.demo.Home_work.OneToMany.Two;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.List;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @OneToMany
    @JoinColumn(name = "library_id")
    private List<BookCopy> bookCoopy;
}
