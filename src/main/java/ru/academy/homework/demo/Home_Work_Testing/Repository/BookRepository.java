package ru.academy.homework.demo.Home_Work_Testing.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.academy.homework.demo.Home_Work_Testing.entity.Book;


public interface BookRepository extends CrudRepository<Book, Long> {

}
