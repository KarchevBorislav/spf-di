package spring.framework.spfdi.controllers;

import spring.framework.spfdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
