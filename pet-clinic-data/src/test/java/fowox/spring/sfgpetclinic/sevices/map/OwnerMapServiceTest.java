package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    Long ownerId = 1L;
    String lastName = "Smith";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService();
        ownerMapService.save(Owner.builder().id(ownerId).build());
        ownerMapService.save(Owner.builder().id(2L).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();

        assertEquals(2, owners.size());
    }

    @Test
    void findByID() {
        Owner owner = ownerMapService.findByID(ownerId);

        assertNotNull(owner);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void save() {
        Long testId = 3L;
        ownerMapService.save(Owner.builder().id(testId).build());

        Set<Owner> owners = ownerMapService.findAll();
        Owner owner = ownerMapService.findByID(testId);

        assertEquals(3, owners.size());
        assertNotNull(owner);
        assertEquals(testId, owner.getId());
    }

    @Test
    void save_generateNewId() {
        Owner savedOwner =  ownerMapService.save(new Owner());

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findByID(ownerId));

        assertEquals(1, ownerMapService.findAll().size());
    }

    @Test
    void deleteByID() {
        ownerMapService.deleteByID(ownerId);

        assertEquals(1, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerMapService.findByLastName(lastName);

        assertNotNull(owner);
    }
}