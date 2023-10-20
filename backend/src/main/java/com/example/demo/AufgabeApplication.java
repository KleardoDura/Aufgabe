package com.example.demo;

import com.example.demo.models.Address;
import com.example.demo.models.Person;
import com.example.demo.repos.AddressRepo;
import com.example.demo.repos.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AufgabeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AufgabeApplication.class, args);
	}
	@Bean
	CommandLineRunner run(AddressRepo addressRepo , PersonRepo personRepo){
		return args ->{
			Person person1=new Person();
			person1.setFirstname("John");
			person1.setLastname("john");
			person1.setAddressId(1);
			person1.setYearOfBirth(2001);
			personRepo.save(person1);

			Person person2=new Person();
			person2.setFirstname("Alex");
			person2.setLastname("alex");
			person2.setAddressId(2);
			person2.setYearOfBirth(2002);
			personRepo.save(person2);


			Address address1 =new Address();
			address1.setCity("Paris");
			address1.setStreet(" Rue de la Lune");
			addressRepo.save(address1);

			Address address2=new Address();
			address2.setCity("London");
			address2.setStreet("Great Turnstile");
			addressRepo.save(address2);

			Address address3=new Address();
			address3.setCity("Sydney");
			address3.setStreet(" Dalley Street");
			addressRepo.save(address3);
		};
	}


}
