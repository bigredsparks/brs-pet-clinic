package guru.springframework.brspetclinic.services.map;

import guru.springframework.brspetclinic.model.Pet;
import guru.springframework.brspetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap
        extends AbstractMapService<Pet, Long>
        implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.finaAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
