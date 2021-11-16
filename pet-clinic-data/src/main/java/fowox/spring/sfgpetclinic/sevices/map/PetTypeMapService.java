package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.PetType;
import fowox.spring.sfgpetclinic.sevices.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
