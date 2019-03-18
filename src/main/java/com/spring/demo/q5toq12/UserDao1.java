package com.spring.demo.q5toq12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao1 {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserDao2 userDao2;
    @Transactional(propagation = Propagation.NEVER, noRollbackFor = RuntimeException.class)
    public void insert(){
        String sql = "INSERT INTO user(username,password,name,age,dob) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] {"rohan@gmail.com","Rohan","rohan", 21, "1997/06/30"});
        try{
            userDao2.insert();
        }
        catch (Exception ex){

        }
    }
}
