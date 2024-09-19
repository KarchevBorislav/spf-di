package spring.framework.spfdi.repositories;

public class BulgarianGreetingRepositoryImpl implements BulgarianGreetingRepository {
    @Override
    public String getGreeting() {
        return "Здравей свят - BG";
    }
}
