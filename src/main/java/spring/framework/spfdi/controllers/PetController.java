package spring.framework.spfdi.controllers;


import org.springframework.stereotype.Controller;
import spring.framework.spfdi.services.animalsService.PetService;


@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
