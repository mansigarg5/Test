package com.example.demo;

import com.example.config.PersistenceContext;
import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
        Person person = new Person();
        person.setFirstName("Mansi");
        person.setLastName("Garg");
        person.setAge(22);
        person.setSalary(15000);
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        //personRepository.save(person);
        System.out.println(person);
        System.out.println("Find by id: "+personRepository.findById(1));
        System.out.println("Find by first name: "+personRepository.findByFirstName("Mansi"));
        System.out.println("Find by last name: "+personRepository.findByLastName("Garg"));
        System.out.println("Find first name by age: "+personRepository.findByAge(22));

        for (Object[] result : personRepository.findFirstNameAndLastNameByAge(22)) {
            String firstName = (String)result[0];
            String lastName = (String)result[1];
            System.out.println("FirstName: "+firstName+", LastName: "+lastName);
        }
        System.out.println("Find person by age: "+personRepository.findPersonByAge(22));
        System.out.println("Count by first name: "+personRepository.countByFirstName("Mansi"));
        System.out.println("Count by id: "+personRepository.countById(1));
        System.out.println("Find distinct by first name: "+personRepository.findDistinctByFirstName("Mansi"));
        System.out.println("Find by first name or last name: "+personRepository.findByFirstNameOrLastName("Mansi","Gupta"));
        System.out.println("Find by first name and last name: "+personRepository.findByFirstNameAndLastName("Mansi","Gupta"));
        System.out.println("Find by age between: "+personRepository.findByAgeBetween(22,25));
        System.out.println("Find by age less than: "+personRepository.findByAgeLessThan(24));
        System.out.println("Find by age less than: "+personRepository.findByAgeGreaterThan(22));
        System.out.println("Find by name like: "+personRepository.findByFirstNameLike("M%"));
        System.out.println("Find by first name not in: "+personRepository.findByFirstNameNot("Mansi"));
        List<Integer> list = new ArrayList();
        list.add(22);
        list.add(25);
        System.out.println("Find by age in: "+personRepository.findByAgeIn(list));
        System.out.println("Find by name ignore case: "+personRepository.findByFirstNameIgnoreCase("mansi"));
        System.out.println("Find by age and sort: "+personRepository.findByAgeGreaterThanOrderByIdDesc(21));
        List<Person> list1 = personRepository.findByAgeGreaterThan(22, new Sort(Sort.Direction.DESC,"id"));
        System.out.println("Find by age and sort using sort class: "+list1);
        Page<Person> personPage = personRepository.findAll(
                new PageRequest(0,3,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList = personPage.getContent();
        System.out.println("Person list via page: "+personList);





    }

}
