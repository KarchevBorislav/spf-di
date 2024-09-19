package spring.framework.spfdi.services;


import spring.framework.spfdi.repositories.GermanGreetingRepository;

public class I18nGermanGreetingService implements GreetingService {



    private final GermanGreetingRepository germanGreetingRepository;

    public I18nGermanGreetingService(GermanGreetingRepository germanGreetingRepository) {
        this.germanGreetingRepository = germanGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hallo Welt - DE";
    }
}
