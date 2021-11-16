package fowox.spring.sfgpetclinic.repositories;

import fowox.spring.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
