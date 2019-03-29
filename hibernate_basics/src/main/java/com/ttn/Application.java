package com.ttn;

import com.ttn.entity.Author;
import com.ttn.entity.AuthorCRUD;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        AuthorCRUD authorCRUD = new AuthorCRUD();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author = authorCRUD.createAuthor();
        Author author1 = authorCRUD.createAuthor1();
        Author author2 = authorCRUD.createAuthor2();
        Author author3 = authorCRUD.createAuthor3();
        session.save(author);
        session.save(author1);
        session.save(author2);
        session.save(author3);
        System.out.println(author);
        author.setAge(21);
        session.update(author);
        author1.setDob(new Date("05/11/1996"));
        //session.delete(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
