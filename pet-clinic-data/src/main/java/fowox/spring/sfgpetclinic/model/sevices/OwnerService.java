package fowox.spring.sfgpetclinic.model.sevices;

import fowox.spring.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByID(Long id);

    void save (Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);


}
