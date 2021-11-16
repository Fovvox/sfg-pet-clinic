package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.Speciality;
import fowox.spring.sfgpetclinic.sevices.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
