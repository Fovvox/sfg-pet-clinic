package fowox.spring.sfgpetclinic.sevices.map;

import fowox.spring.sfgpetclinic.DataLayerException;
import fowox.spring.sfgpetclinic.model.BaseEntity;
import fowox.spring.sfgpetclinic.sevices.GenericService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements GenericService<T, ID> {
    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findByID(ID id) {
        return map.get(id);
    }


    @Override
    public <S extends T> S save(S entity) {
        if(entity == null) {
            throw new DataLayerException("Object cannot be null");
        }

        if(entity.getId() == null){
            entity.setId(getNextId());
        }
        map.put(entity.getId(), entity);

        return entity;
    }


    @Override
    public void delete(T entity) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(entity));
    }

    @Override
    public void deleteByID(ID id) {
        map.remove(id);
    }
    private Long getNextId() {
        long nextId;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
