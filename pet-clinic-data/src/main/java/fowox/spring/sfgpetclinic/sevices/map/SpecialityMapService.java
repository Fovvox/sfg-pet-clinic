package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.Speciality;
import fowox.spring.sfgpetclinic.sevices.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"map", "default"})

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
