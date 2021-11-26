package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.Pet;
import fowox.spring.sfgpetclinic.sevices.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"map", "default"})

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public <S extends Pet> S save(S entity) {
        return super.save(entity);
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteByID(aLong);
    }
}
