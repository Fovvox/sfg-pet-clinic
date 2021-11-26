package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.Vet;
import fowox.spring.sfgpetclinic.sevices.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"map", "default"})

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public <S extends Vet> S save(S entity) {
        return super.save(entity);
    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteByID(aLong);
    }
}
