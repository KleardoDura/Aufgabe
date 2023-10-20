package com.example.demo.services;

import com.example.demo.controllers.PersonController;
import com.example.demo.models.Person;
import com.example.demo.repos.AddressRepo;
import com.example.demo.repos.PersonRepo;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonService {
    //You should have the option to filter people by year of birth.
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private AddressRepo addressRepo;
    public List<Person> filterPeopleByYearOfBirth(Integer yearOfBirth){
        return personRepo.findPeopleByYearOfBirth(yearOfBirth);
    }

    //You should be able to search for people by city
    public List<Person> findPeopleByCity(String city){
        Integer addressId= addressRepo.findAddressIdByCity(city);
        return personRepo.findPeopleByAddressId(addressId);
    }
}
