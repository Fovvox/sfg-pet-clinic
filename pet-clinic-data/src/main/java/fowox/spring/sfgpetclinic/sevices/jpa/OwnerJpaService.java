package fowox.spring.sfgpetclinic.sevices.jpa;

import fowox.spring.sfgpetclinic.model.Owner;
import fowox.spring.sfgpetclinic.repositories.OwnerRepository;
import fowox.spring.sfgpetclinic.sevices.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class OwnerJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> set = new HashSet<>();
        ownerRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Owner findByID(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public <S extends Owner> S save(S entity) {
        return ownerRepository.save(entity);
    }

    @Override
    public void delete(Owner entity) {
        ownerRepository.delete(entity);
    }

    @Override
    public void deleteByID(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName).orElse(null);
    }
}
