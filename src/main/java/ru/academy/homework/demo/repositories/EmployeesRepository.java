package ru.academy.homework.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.academy.homework.demo.models.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

}
