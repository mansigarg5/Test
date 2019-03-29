package com.example.service;

import com.example.entity.Student;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        Student student = new Student();
        student.setName("Mansi");
        student.setMarks(100);
        student.setId(1);

        Student student1 = new Student();
        student1.setName("Ram");
        student1.setMarks(90);
        student1.setId(2);
        return Arrays.asList(student, student1);
    }
}
