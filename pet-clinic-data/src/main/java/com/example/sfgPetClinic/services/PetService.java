package com.example.sfgPetClinic.services;

import java.util.Set;

import com.example.sfgPetClinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
