package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.PetType;
import fowox.spring.sfgpetclinic.sevices.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
