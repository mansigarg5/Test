package com.spring.demo.q5toq12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao2 {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Transactional(propagation = Propagation.SUPPORTS)
    public void insert(){
        String sql = "INSERT INTO user(username,password,name,age,dob) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"shyam@gmail.com","Shyam","shyam",20,"1996/02/05"});

    }
}
