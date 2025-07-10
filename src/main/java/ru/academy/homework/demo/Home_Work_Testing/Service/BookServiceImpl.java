package ru.academy.homework.demo.Home_Work_Testing.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.homework.demo.Home_Work_Testing.Repository.BookRepository;
import ru.academy.homework.demo.Home_Work_Testing.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        bookRepository.save(book);
        return (book);
    }

    @Override
    public Optional<Book> findById(long id) {
        if (bookRepository.existsById(id)) {
            return bookRepository.findById(id);
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findAll() {
        ArrayList<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public void deleteAll() {
        bookRepository.deleteAll();

    }

    @Override
    public void deleteById(long id) {
        bookRepository.deleteById(id);

    }

    @Override
    public Optional<Book> findLastBook() {
        List<Book> books = (List<Book>) bookRepository.findAll();
         long id = books.size() - 1;
        return bookRepository.findById(id);
    }
}
