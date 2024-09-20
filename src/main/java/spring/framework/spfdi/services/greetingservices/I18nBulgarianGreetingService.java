package spring.framework.spfdi.services;


import spring.framework.spfdi.repositories.BulgarianGreetingRepository;

public class I18nBulgarianGreetingService implements GreetingService {

    private final BulgarianGreetingRepository repository;

    public I18nBulgarianGreetingService(BulgarianGreetingRepository repository) {
        this.repository = repository;
    }


    @Override
    public String sayGreeting() {
        return "Здравей свят - BG";
    }
}
