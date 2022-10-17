package com.example.sfgPetClinic.services;

import java.util.Set;

import com.example.sfgPetClinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	Owner save(Owner owner);
	Owner findByLastName(String lastName);
	Set<Owner> findAll();

}
