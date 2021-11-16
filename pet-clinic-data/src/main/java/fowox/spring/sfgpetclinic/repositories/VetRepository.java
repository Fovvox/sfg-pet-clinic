package fowox.spring.sfgpetclinic.repositories;

import fowox.spring.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
