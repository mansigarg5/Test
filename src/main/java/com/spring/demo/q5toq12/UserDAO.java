package com.spring.demo.q5toq12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
@Repository
public class UserDAO {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao1 userDao1;
    @Transactional(propagation = Propagation.REQUIRED, timeout = 9, readOnly = false, rollbackFor = RuntimeException.class)
    public void insert() {

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {

        }

        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"mohan@gmail.com", "Mohan", "mohan", 19, "1997/04/18"});
        try {
            userDao1.insert();
        } catch (Exception ex) {

        }
    }
}
