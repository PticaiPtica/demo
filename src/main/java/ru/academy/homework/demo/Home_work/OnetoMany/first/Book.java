package ru.academy.homework.demo.Home_work.OnetoMany.first;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

   @ManyToOne
   @JoinColumn(name = "author_id")
    private Author author;

}
