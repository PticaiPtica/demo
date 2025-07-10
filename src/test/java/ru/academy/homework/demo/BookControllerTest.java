package ru.academy.homework.demo;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;


import ru.academy.homework.demo.Home_Work_Testing.Controller.BookController;
import ru.academy.homework.demo.Home_Work_Testing.Repository.BookRepository;
import ru.academy.homework.demo.Home_Work_Testing.Service.BookService;
import ru.academy.homework.demo.Home_Work_Testing.Service.BookServiceImpl;
import ru.academy.homework.demo.Home_Work_Testing.entity.Book;

import java.util.BitSet;
import java.util.List;
import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper objectMapper;

    private final String title = "test title";
    private final String author = "test author";
    private final Integer year = 2018;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookController bookController;
    @Autowired
    private BookServiceImpl bookServiceImpl;


    @Test
    public void test_save_Book_valid_Data_return_book() throws Exception {
        final Book book = new Book(title, author, year);

        mvc.perform(post("/api/book/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(book)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value(title)
                ).andExpect(jsonPath("$.author").value(author))
                .andExpect(jsonPath("$.year").value(year));


    }


    @Test
    public void test_findById_valid_Data_return_book() throws Exception {
        Book book = bookRepository.save(new Book(title, author, year));

        mvc.perform(get("/api/book/{id}",book.getId()))
                .andExpect(status().isOk()).andExpect(jsonPath("$.title").value(title))
                .andExpect(jsonPath("$.author").value(author))
        ;

    }

    @Test
    public void test_findById_valid_Data_return_NotFound() throws Exception {
        bookRepository.save(new Book(title, author, year));

        mvc.perform(get("/api/book/{id}", 123123))
                .andExpect(status().isNotFound());


    }

    @Test
    public void test_delete_Book_valid_Data_return_httpStatus() throws Exception {

        Book book = bookRepository.save(new Book(title, author, year));

        mvc.perform(delete("/api/book/{id}", book.getId()))
                .andExpect(status().isOk());


    }
    @Test
    public void test_deleteAllBook_valid_Data_return_NoContent() throws Exception {
        mvc.perform(delete("/api/book/")).andExpect(status().isNoContent());
    }


}
