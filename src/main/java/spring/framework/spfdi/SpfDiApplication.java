package spring.framework.spfdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.framework.spfdi.controllers.PersonalController;

@SpringBootApplication
public class SpfDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =  SpringApplication.run(SpfDiApplication.class, args);

        PersonalController personalController = (PersonalController) ctx.getBean("personalController");
        String greeting = personalController.helloWorld();
        System.out.println(greeting);
    }

}
