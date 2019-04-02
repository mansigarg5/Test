package com.example.thymeleafDemo.repositories;

import com.example.thymeleafDemo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee save(Employee employee);

    List<Employee> findAll();

}