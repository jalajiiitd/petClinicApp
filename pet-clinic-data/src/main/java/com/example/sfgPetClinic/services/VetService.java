package com.example.sfgPetClinic.services;

import java.util.Set;

import com.example.sfgPetClinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
	
}
