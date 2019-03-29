package com.ttn.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;

    //Ques-16(Bidirectional)
//    @ManyToOne
//    Author author;
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    @ManyToMany(mappedBy = "books")
    List<Author> authorList = new ArrayList<>();
    public List<Author> getAuthorList() {
        return authorList;
    }
    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
