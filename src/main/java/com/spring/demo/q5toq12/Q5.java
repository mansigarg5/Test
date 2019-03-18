package com.spring.demo.q5toq12;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class Q5 {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SessionFactory sessionFactoryBean;

    void userCount(){
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println("Count: "+jdbcTemplate.queryForObject(sql, Integer.class));
    }
     void getUserName(){
        String name = "SELECT name FROM user WHERE username = ?";
        System.out.println("Name: "+jdbcTemplate.queryForObject(name, new Object[]{"mansi@gmail.com"}, String.class));
    }
     void insertRecord(){
        String record = "INSERT into user(username,password,name,age,dob) values (?,?,?,?,?)";
        jdbcTemplate.update(record,new Object[]{"ram@gmail.com","ram","Ram",25,"1994/05/26"});
    }
     void queryForMap() {
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"mansi@gmail.com"}));
    }
    void queryForList() {
        String sql = "SELECT * FROM user";
        System.out.println(jdbcTemplate.queryForList(sql));
    }
    User getUser() {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"mansi@gmail.com"}, new UserMapper());
    }
    void sessionFactory() {
        String sql = "SELECT COUNT(*) FROM User";
        Query query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }

}
