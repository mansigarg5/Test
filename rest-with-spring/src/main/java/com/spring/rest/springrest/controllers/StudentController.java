package com.spring.rest.springrest.controllers;

import com.spring.rest.springrest.entities.Post;
import com.spring.rest.springrest.entities.Student;
import com.spring.rest.springrest.exceptions.StudentNotFoundException;
import com.spring.rest.springrest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    String display(@RequestHeader(name = "Accept-language", required = false)Locale locale){
        System.out.println("Hello Student");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("good.morning.message", null, locale);
    }
//    @GetMapping("/")
//    String display(){
//        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
//    }
    @GetMapping("/students")
    List<Student> getStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{id}")
    Student getStudentById(@PathVariable Integer id){
        Student student = studentService.getStudent(id);
        if(student==null){
            throw new StudentNotFoundException("Student does not exists...");
        }
        return student;
    }
    @PostMapping("/student")
    Student saveStudent(@Valid @RequestBody Student student,BindingResult bindingResult){


        studentService.saveStudent(student);
        System.out.println(student.getName());
        return student;

    }
//    @PostMapping("/student")
//    Student saveStudent(@RequestBody Student student){
//        studentService.saveStudent(student);
//        return student;
//    }
    @DeleteMapping("/student/{id}")
    Student deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return studentService.getStudent(id);
    }

    // Read single Post
//    @GetMapping("/post")
//    public String getPost(){
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://jsonplaceholder.typicode.com/posts/1";
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
//        System.out.println(responseEntity.getStatusCode().toString());
//        System.out.println(responseEntity.getHeaders().toString());
//        return responseEntity.getBody();
//    }
    // Read list of posts
    @GetMapping("/post")
    public List<Post> getPostObject(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<List<Post>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Post>>() {
        });
        return responseEntity.getBody();
    }

    //Create Post
    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost(){
        String url="https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(
                new Post(10000,10000,"title1","description1"),httpHeaders);
        Post post=restTemplate.postForObject(url,request,Post.class);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }

    //Update post
    @PutMapping("/updatePost")
    public ResponseEntity<Post> updatePost(){
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(
                new Post(1, 1, "title1","description1"),headers);
        return restTemplate.exchange(url, HttpMethod.PUT, request, Post.class);
    }

    //Delete post
    @DeleteMapping("/deletePost")
    public void deletePost(){
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(headers);
        restTemplate.delete(url, HttpMethod.DELETE, request, Post.class);
    }
}
