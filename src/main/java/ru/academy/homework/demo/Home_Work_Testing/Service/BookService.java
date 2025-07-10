package ru.academy.homework.demo.Home_Work_Testing.Service;

import ru.academy.homework.demo.Home_Work_Testing.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book save(Book book);

    Optional<Book> findById(long id);

    List<Book> findAll();

    void deleteAll();

    void deleteById(long id);

    Optional<Book> findLastBook();
}
