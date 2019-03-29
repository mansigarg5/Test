package com.ttn.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorCRUD {

    BookCRUD bookCRUD = new BookCRUD();
    Book book1 = bookCRUD.createBook1();
    Book book2 = bookCRUD.createBook2();
    Book book3 = bookCRUD.createBook3();
    Book book4 = bookCRUD.createBook4();

    public Author createAuthor(){
        Author author = new Author();
        author.setFirstName("Mansi");
        author.setLastName("Garg");
        author.setAge(22);

        AddressCRUD addressCRUD = new AddressCRUD();
        author.setAddress(addressCRUD.createAddress());

        List<String> subjects1= Arrays.asList("hindi","english","maths");
        author.setSubjects(subjects1);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        author.setBooks(bookList);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author);
        book1.setAuthorList(authorList);
        book2.setAuthorList(authorList);

        return author;
    }
    public Author createAuthor1(){
        Author author1 = new Author();
        author1.setFirstName("Ram");
        author1.setLastName("Garg");
        author1.setAge(22);

        AddressCRUD addressCRUD = new AddressCRUD();
        author1.setAddress(addressCRUD.createAddress1());

        List<String> subjects2= Arrays.asList("maths","science","computer");
        author1.setSubjects(subjects2);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        author1.setBooks(bookList);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        book1.setAuthorList(authorList);

        return author1;
    }
    public Author createAuthor2(){
        Author author2 = new Author();
        author2.setFirstName("Pulkit");
        author2.setLastName("Vashistha");
        author2.setAge(22);

        AddressCRUD addressCRUD = new AddressCRUD();
        author2.setAddress(addressCRUD.createAddress());

        List<String> subjects2= Arrays.asList("maths","science","computer");
        author2.setSubjects(subjects2);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book3);
        author2.setBooks(bookList);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author2);
        book3.setAuthorList(authorList);

        return author2;
    }
    public Author createAuthor3(){
        Author author3 = new Author();
        author3.setFirstName("Gaurav");
        author3.setLastName("Pandey");
        author3.setAge(21);
        AddressCRUD addressCRUD = new AddressCRUD();
        author3.setAddress(addressCRUD.createAddress1());
        List<String> subjects1= Arrays.asList("hindi","english","maths");
        author3.setSubjects(subjects1);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book2);
        bookList.add(book4);
        author3.setBooks(bookList);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author3);
        book2.setAuthorList(authorList);
        book4.setAuthorList(authorList);

        return author3;
    }
}
