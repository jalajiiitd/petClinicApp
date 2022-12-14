package com.example.sfgPetClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.sfgPetClinic.model.Owner;
import com.example.sfgPetClinic.model.PetType;
import com.example.sfgPetClinic.model.Vet;
import com.example.sfgPetClinic.services.OwnerService;
import com.example.sfgPetClinic.services.PetTypeService;
import com.example.sfgPetClinic.services.VetService;
import com.example.sfgPetClinic.services.map.OwnerServiceMap;
import com.example.sfgPetClinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	
	private final OwnerService ownerService ;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		PetType dog = new PetType();
		dog.setName("Charlie");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Perri");
		PetType savedCatPetType = petTypeService.save(cat);
		
		
		Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mike");
        owner2.setLastName("Austin");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kate");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
	}

}
