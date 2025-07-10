package ru.academy.homework.demo.Home_Work_Testing.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.academy.homework.demo.Home_Work_Testing.entity.Book;
import ru.academy.homework.demo.Home_Work_Testing.Service.BookService;

@RestController
@RequestMapping("api/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        if (bookService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(bookService.findById(id));    }

    @PostMapping("/add")
    public ResponseEntity<?> save(@RequestBody Book book) {

        return ResponseEntity.ok(bookService.save(book));


    }

    @GetMapping("/getAll")
    public ResponseEntity<?> findAll() {


        return ResponseEntity.ok(bookService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        if (bookService.findById(id).isEmpty()) {
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else if(bookService.findById(id).isPresent())
            bookService.deleteById(id);
        return ResponseEntity.ok().build();

    }
    @DeleteMapping("/")
    public ResponseEntity<?> deleteAll() {
        bookService.deleteAll();
        return ResponseEntity.noContent().build();
    }


}
