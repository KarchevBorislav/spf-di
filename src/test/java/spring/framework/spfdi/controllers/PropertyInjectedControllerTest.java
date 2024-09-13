package spring.framework.spfdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.framework.spfdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
         controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}