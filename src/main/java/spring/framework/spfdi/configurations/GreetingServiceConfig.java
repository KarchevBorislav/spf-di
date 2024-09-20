package spring.framework.spfdi.configurations;

import org.springframework.context.annotation.*;
import spring.framework.spfdi.repositories.*;
import spring.framework.spfdi.services.*;

@Configuration
public class GreetingServiceConfig {


    @Bean
    BulgarianGreetingRepository bulgarianGreetingRepository() {
        return new BulgarianGreetingRepositoryImpl();
    }

    @Profile("BG")
    @Bean("i18nService")
    I18nBulgarianGreetingService i18nBulgarianGreetingService(BulgarianGreetingRepository bulgarianGreetingRepository) {
        return new I18nBulgarianGreetingService(bulgarianGreetingRepository);
    }


    @Bean
    GermanGreetingRepository germanGreetingRepository() {
        return new GermanGreetingRepositoryImpl();
    }

    @Profile({"DE", "default"})
    @Bean("i18nService")
    I18nGermanGreetingService i18nGermanGreetingServiceService(GermanGreetingRepository germanGreetingRepository) {
        return new I18nGermanGreetingService(germanGreetingRepository);
    }


    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"EN"})
    @Bean("i18nService")
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }


    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }




    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();

    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }


}
