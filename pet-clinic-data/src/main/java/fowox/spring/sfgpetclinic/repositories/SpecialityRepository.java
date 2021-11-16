package fowox.spring.sfgpetclinic.repositories;

import fowox.spring.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
