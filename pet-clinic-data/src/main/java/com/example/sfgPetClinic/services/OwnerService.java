package com.example.sfgPetClinic.services;

import com.example.sfgPetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
