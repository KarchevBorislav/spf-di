package spring.framework.spfdi.controllers;

import org.springframework.stereotype.Controller;
import spring.framework.spfdi.services.GreetingService;


@Controller
public class PersonalController {

    private final GreetingService greetingService;

    public PersonalController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){


        return greetingService.sayGreeting();


    }

}
