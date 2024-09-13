package spring.framework.spfdi.controllers;

import spring.framework.spfdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }


}
