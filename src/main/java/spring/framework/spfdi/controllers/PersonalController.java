package spring.framework.spfdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class PersonalController {


    public String helloWorld(){
        System.out.println("Hello World");

        return "Hi people!";


    }

}
