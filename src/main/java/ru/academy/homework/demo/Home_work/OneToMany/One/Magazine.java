package ru.academy.homework.demo.Home_work.OneToMany.One;

import jakarta.persistence.*;

@Entity
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "issueNumber")
    private Integer issueNumber;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
