package com.ttn.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Transient
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Embedded
    Address address;
    @ElementCollection
    List<String> subjects = new ArrayList<>();
//    @OneToOne
//    @JoinColumn(name = "book_id")
//    private Book book;
//
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

//    @OneToMany(cascade = CascadeType.PERSIST)
//    @JoinTable(joinColumns=@JoinColumn(name = "author_id"),inverseJoinColumns=@JoinColumn(name = "book_id"))
//    Collection<Book> books= new ArrayList<>();

    //(WITHOUT ADDITIONAL TABLE)
//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
//    Collection<Book> books = new ArrayList<Book>();

//    Solution 17(many to many)
    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Author_Book",
//            joinColumns = { @JoinColumn(name = "Author_id") },
//            inverseJoinColumns = { @JoinColumn(name = "Book_id") }
//    )
    List<Book> books= new ArrayList<>();
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address.toString() +
                '}';
    }
}
