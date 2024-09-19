package spring.framework.spfdi.services.animalsService;


public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
