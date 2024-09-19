package spring.framework.spfdi.repositories;

public class GermanGreetingRepositoryImpl implements GermanGreetingRepository {


    @Override
    public String getGreeting() {
        return "Hallo Welt - DE";
    }
}
