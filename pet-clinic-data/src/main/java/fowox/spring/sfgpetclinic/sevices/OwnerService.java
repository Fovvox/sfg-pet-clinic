package fowox.spring.sfgpetclinic.sevices;

import fowox.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends GenericService<Owner, Long>{

    Owner findByLastName(String lastName);


}
