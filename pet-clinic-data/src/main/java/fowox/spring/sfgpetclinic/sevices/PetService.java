package fowox.spring.sfgpetclinic.sevices;

import fowox.spring.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    void save (Pet pet);

    Set<Pet> findAll();

    Pet findByLastName(String lastName);
}
