package fowox.spring.sfgpetclinic.sevices;

import fowox.spring.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    void save (Vet vet);

    Set<Vet> findAll();

    Vet findByLastName(String lastName);
}
