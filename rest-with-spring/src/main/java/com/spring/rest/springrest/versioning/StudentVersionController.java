package com.spring.rest.springrest.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentVersionController {

    //URI versioning
//    @GetMapping("/student/V1")
//    StudentV1 getStudentV1(){
//        return new StudentV1("Mansi Garg");
//    }
//    @GetMapping("/student/V2")
//    StudentV2 getStudentV2(){
//        return new StudentV2(new Name("Mansi", "Garg"));
//    }

    //Parameter versioning
//    @GetMapping(value = "/student/param", params = "v1")
//    StudentV1 getStudentV1(){
//        return new StudentV1("Mansi Garg");
//    }
//    @GetMapping(value = "/student/param", params = "v2")
//    StudentV2 getStudentV2(){
//        return new StudentV2(new Name("Mansi", "Garg"));
//    }

    //Header versioning
    @GetMapping(value = "/student/header", headers = "API-V1")
    StudentV1 getStudentV1(){
        return new StudentV1("Mansi Garg");
    }
    @GetMapping(value = "/student/header", headers = "API-V2")
    StudentV2 getStudentV2(){
        return new StudentV2(new Name("Mansi", "Garg"));
    }
}
