package ru.academy.homework.demo.Home_work.OneToMany.Two;

import jakarta.persistence.*;

@Entity
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "condition")
    private String condition;


    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

}
