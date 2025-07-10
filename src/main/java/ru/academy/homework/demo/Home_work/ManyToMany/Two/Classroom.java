package ru.academy.homework.demo.Home_work.ManyToMany.Two;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roomNumber")
    private String roomNumber;

    @Column(name = "building")
    private String building;

    @OneToMany(mappedBy = "classroom")
    private Set<TeachingAssignment> teachingAssignment;

}
