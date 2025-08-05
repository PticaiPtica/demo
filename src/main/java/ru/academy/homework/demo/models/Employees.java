package ru.academy.homework.demo.models;

import jakarta.persistence.*;

import java.util.List;

import ru.academy.homework.demo.entities.Person;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "employees")
    private List<Person> listPerson;

    public Employees(String name) {
        this.name = name;
    }

    public Employees() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
