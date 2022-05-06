package com.example.demo.service;

import com.example.demo.dao.BookDAO;
import com.example.demo.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class BookService {

    private BookDAO dao;

    public List<Book> findAll(){
        return dao.findAll();
    }

    public Book findById(int id){
        return dao.findById(id);
    }

    public Book save(Book book){
        return dao.save(book);
    }
}
