package fowox.spring.sfgpetclinic.sevices.jpa;

import fowox.spring.sfgpetclinic.model.Owner;
import fowox.spring.sfgpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerJpaService ownerJpaService;

    Owner initOwner;

    @BeforeEach
    void setUp() {
        initOwner = Owner.builder().id(1L).lastName("Smith").build();
    }

    @Test
    void findAll() {
        Set<Owner> owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).lastName("Smith").build());
        owners.add(Owner.builder().id(2L).lastName("White").build());
        when(ownerRepository.findAll()).thenReturn(owners);

        Set<Owner> ownerSet = ownerJpaService.findAll();

        assertNotNull(ownerSet);
        assertEquals(2, ownerSet.size());
    }

    @Test
    void findByID() {
        when(ownerRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(initOwner));

        Owner owner = ownerJpaService.findByID(1L);

        assertNotNull(owner);
        assertEquals(initOwner.getId(), owner.getId());
    }

    @Test
    void save() {
        when(ownerRepository.save(any(Owner.class))).thenAnswer(i -> i.getArgument(0));

        Owner savedOwner = ownerJpaService.save(initOwner);

        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
        ownerJpaService.delete(initOwner);

        verify(ownerRepository).delete(any(Owner.class));
    }

    @Test
    void deleteByID() {
        ownerJpaService.deleteByID(1L);

        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName("Smith")).thenReturn(java.util.Optional.ofNullable(initOwner));

        Owner owner = ownerJpaService.findByLastName("Smith");

        assertNotNull(owner);
        assertEquals(initOwner.getLastName(), owner.getLastName());
    }
}