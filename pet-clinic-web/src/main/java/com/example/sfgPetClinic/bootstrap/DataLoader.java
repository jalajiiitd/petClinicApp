package com.example.sfgPetClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.sfgPetClinic.model.Owner;
import com.example.sfgPetClinic.model.Vet;
import com.example.sfgPetClinic.services.OwnerService;
import com.example.sfgPetClinic.services.VetService;
import com.example.sfgPetClinic.services.map.OwnerServiceMap;
import com.example.sfgPetClinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	
	private final OwnerService ownerService ;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mike");
        owner2.setLastName("Austin");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Kate");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
	}

}
