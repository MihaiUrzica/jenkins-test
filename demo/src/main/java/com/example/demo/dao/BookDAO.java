package com.example.demo.dao;

import com.example.demo.entity.BookEntity;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class BookDAO {

    private BookRepository repository;

    public Book findById(int id){

        BookEntity entity = repository.findById(id).orElseThrow(NullPointerException::new);
        return fromEntity(entity);

    }

    public List<Book> findAll(){
        return repository.findAll().stream().map(this::fromEntity).collect(Collectors.toList());
    }

    public Book save(Book book){
        BookEntity entity = repository.save(toEntity(book));
        return fromEntity(entity);
    }

    public Book fromEntity(BookEntity entity){
        Book book = new Book();
        book.setId(entity.getId());
        book.setName(entity.getName());
        book.setAuthor(entity.getAuthor());

        return book;
    }

    public BookEntity toEntity(Book book){
        BookEntity entity = new BookEntity();
        entity.setId(book.getId());
        entity.setName(book.getName());
        entity.setAuthor(book.getAuthor());

        return entity;
    }
}
