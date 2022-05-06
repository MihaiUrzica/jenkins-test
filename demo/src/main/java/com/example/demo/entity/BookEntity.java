package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    @Column
    private String name;

    @Column
    private String author;

    public BookEntity(final String name, final String author) {
        this.name = name;
        this.author = author;
    }
}
