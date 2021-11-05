package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.PetType;
import fowox.spring.sfgpetclinic.sevices.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findByID(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public <S extends PetType> S save(S entity) {
        return super.save(entity);
    }

    @Override
    public void delete(PetType entity) {
        super.delete(entity);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteByID(aLong);
    }
}
