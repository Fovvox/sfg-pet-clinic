package fowox.spring.sfgpetclinic.sevices.jpa;

import fowox.spring.sfgpetclinic.model.Vet;
import fowox.spring.sfgpetclinic.repositories.VetRepository;
import fowox.spring.sfgpetclinic.sevices.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class VetJpaService implements VetService {
    private final VetRepository vetRepository;

    public VetJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findByID(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public <S extends Vet> S save(S entity) {
        return vetRepository.save(entity);
    }

    @Override
    public void delete(Vet entity) {
        vetRepository.delete(entity);
    }

    @Override
    public void deleteByID(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
