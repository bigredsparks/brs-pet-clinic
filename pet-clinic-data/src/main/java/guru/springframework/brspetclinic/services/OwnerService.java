package guru.springframework.brspetclinic.services;

import guru.springframework.brspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
