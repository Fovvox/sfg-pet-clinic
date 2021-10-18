package fowox.spring.sfgpetclinic.sevices;

import java.util.Set;

public interface GenericService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    <S extends T> S save(S entity);

    void delete(T entity);

    void deleteByID(ID id);
}
