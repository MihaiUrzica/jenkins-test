package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("books")
public class BookController {

    private BookService service;

    @GetMapping
    public ResponseEntity<List<BookDTO>> findAll() {

        List<BookDTO> bookDTOS = service.findAll().stream().map(this::toDTO).collect(Collectors.toList());

        return new ResponseEntity<>(bookDTOS, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> findById(@PathVariable int id) {

        Book book = service.findById(id);
        BookDTO bookDTO = new BookDTO(book.getId(), book.getName(), book.getAuthor());

        return new ResponseEntity<>(bookDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BookDTO> save(@RequestBody BookDTO bookDTO) {

        Book book = fromDTO(bookDTO);
        Book savedBook = service.save(book);
        BookDTO savedBookDTO = new BookDTO(savedBook.getId(), savedBook.getName(), savedBook.getAuthor());

        return new ResponseEntity<>(savedBookDTO, HttpStatus.OK);
    }

    private Book fromDTO(BookDTO bookDTO){
        return new Book(bookDTO.getId(), bookDTO.getName(), bookDTO.getAuthor());
    }

    private BookDTO toDTO(Book book){
        return new BookDTO(book.getId(), book.getName(), book.getAuthor());
    }
}
