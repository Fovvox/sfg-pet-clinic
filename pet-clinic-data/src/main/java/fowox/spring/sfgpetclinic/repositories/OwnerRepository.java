package fowox.spring.sfgpetclinic.repositories;

import fowox.spring.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
