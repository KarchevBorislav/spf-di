package spring.framework.spfdi.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import spring.framework.spfdi.services.animalsService.DogPetService;
import spring.framework.spfdi.services.animalsService.PetService;
import spring.framework.spfdi.services.animalsService.PetServiceFactory;

@Configuration
public class PetServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory (){
        return new PetServiceFactory();
    }

    @Profile("dog")
    @Bean
    PetService dogPetService (PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");

    }

    @Profile("cat")
    @Bean
    PetService catPetService (PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }



}
