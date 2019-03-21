package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class AnnotatedStudentController {
    //Q3- Use annotation in StudentController to define a default action index which renders a jsp page.
    @RequestMapping("/hii")
    ModelAndView hii() {
        ModelAndView modelAndView = new ModelAndView("Hii");
        return modelAndView;
    }
    //Q4- Create one more annotation based action hello inside the StudentController which and
    // use @ResponseBody annotation from it to display Hello world.
    @RequestMapping("/hello1")
    @ResponseBody
    String hello1() {
        return "Hello World.";
    }
    //Q5- Create one more action which sends Model HelloWorld to the jsp file.
    @RequestMapping("/hello2")
    ModelAndView hello2() {
        ModelAndView modelAndView = new ModelAndView("Hello2");
        modelAndView.addObject("msg", "Hello World.");
        return modelAndView;
    }
    //Q6- Use @PathVariable annotation to access firstname and lastname in an action inside StudentController
    // place both the parameters in different arguments and access them.
    @RequestMapping("/name/{first}/{last}")
    @ResponseBody
    String returnFirstAndLastName(@PathVariable String first, @PathVariable String last) {
        return "First name is " + first + " and Last name is " + last;
    }
    //Q7- Now place both the arguments inside a Map and access the Map instead.
    // (Hint : check the slide for @PathVariable action returnCountryAndState  shows how to do it with map)
    @RequestMapping("/yourname/{FirstName}/{LastName}")
    @ResponseBody
    String returnYourFirstAndLastName(@PathVariable Map<String, String> requestMap) {
        return "First name is " + requestMap.get("FirstName") + " and Last name is " + requestMap.get("LastName");
    }
    //Q8- Use @RequestParam annotation to access the firstname and lastname in formData action of StudentController.
    @RequestMapping(value = "/index1.html", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index1");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("firstName") String firstName,
                      @RequestParam("lastName") String lastName) {
        return "FirstName: " + firstName + " and LastName: " + lastName;
    }
    //Q9- Create a StudentCO and bind firstname and lastname with instance variable of StudentCO.
    @RequestMapping(value = "/submitForm1", method = RequestMethod.POST)
    @ResponseBody
    String submitForm1(StudentCO student) {
        return "FirstName is " + student.getFirstName() + " and LastName is " + student.getLastName();
    }
    //Q10- Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }
}
