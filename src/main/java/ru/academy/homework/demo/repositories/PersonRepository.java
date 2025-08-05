package ru.academy.homework.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.academy.homework.demo.entities.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}