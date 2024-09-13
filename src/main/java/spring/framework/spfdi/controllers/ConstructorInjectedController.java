package spring.framework.spfdi.controllers;

import spring.framework.spfdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
