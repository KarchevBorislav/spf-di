package spring.framework.spfdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.framework.spfdi.controllers.*;

@SpringBootApplication
public class SpfDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpfDiApplication.class, args);



        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());


        PersonalController personalController = (PersonalController) ctx.getBean("personalController");
        System.out.println("-".repeat(10) + " Primary Bean");
        System.out.println(personalController.sayHello());


        System.out.println("-".repeat(10) + " Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("-".repeat(10) + " Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-".repeat(10) + " Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }

}
